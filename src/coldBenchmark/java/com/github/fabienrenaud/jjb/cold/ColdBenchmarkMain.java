package com.github.fabienrenaud.jjb.cold;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.URISyntaxException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Coordinates cold-JVM samples without loading any JSON library in this JVM.
 *
 * <p>Every recorded row comes from a new {@code java} process. The child writes
 * one JSON object; this coordinator validates it, adds process-wall and sample
 * metadata, and writes JSONL, flat CSV, and p50/p90 summaries.</p>
 */
public final class ColdBenchmarkMain {

    static final String CHILD_MAIN = "com.github.fabienrenaud.jjb.cold.ColdJvmChild";
    static final List<String> SUPPORTED_LIBRARIES = List.of("kotlinx", "jackson", "gson", "fory");
    static final List<String> SUPPORTED_OPERATIONS = List.of("serialize", "deserialize");
    static final List<Integer> SUPPORTED_COUNTS = List.of(1, 10, 100);
    static final List<String> DEFAULT_JVM_ARGS = List.of(
        "-Xms64m",
        "-Xmx64m",
        "-XX:+UseSerialGC",
        "-Dfile.encoding=UTF-8",
        "-Duser.language=en",
        "-Duser.country=US"
    );

    private static final List<String> SUMMARY_METRICS = List.of(
        "external.processWallNs",
        "timingNs.libraryInitialization",
        "timingNs.firstOperation",
        "timingNs.remainingOperations",
        "timingNs.operationsTotal",
        "timingNs.initializationPlusOperations",
        "derivedNs.amortizedInitializationPlusOperationsPerOp",
        "derivedNs.remainingPerOperation",
        "threadAllocatedBytes.libraryInitialization",
        "threadAllocatedBytes.firstOperation",
        "threadAllocatedBytes.remainingOperations",
        "loadedClassDelta.libraryInitialization",
        "loadedClassDelta.firstOperation",
        "loadedClassDelta.remainingOperations"
    );

    private ColdBenchmarkMain() {
    }

    public static void main(String[] args) {
        try {
            Config config = parseArgs(args);
            if (config.help()) {
                System.out.print(usage());
                return;
            }
            run(config);
        } catch (UsageException error) {
            System.err.println("error: " + error.getMessage());
            System.err.println();
            System.err.print(usage());
            System.exit(2);
        } catch (InterruptedException error) {
            Thread.currentThread().interrupt();
            System.err.println("Cold benchmark interrupted");
            System.exit(130);
        } catch (Exception error) {
            System.err.println("Cold benchmark failed: " + error.getMessage());
            error.printStackTrace(System.err);
            System.exit(1);
        }
    }

    static void run(Config config) throws Exception {
        Path workingDirectory = Path.of("").toAbsolutePath().normalize();
        ClasspathCatalog classpaths = ClasspathCatalog.load(config.classpathFile(), workingDirectory);
        Map<String, String> childJvmIdentity = null;

        if (config.validate()) {
            for (String library : config.libraries()) {
                ProcessResult result = runChild(
                    config,
                    classpaths.forLibrary(library),
                    new PlanEntry(0, library, "serialize", 1),
                    true,
                    workingDirectory
                );
                Map<String, Object> validation = Json.parseObject(result.stdoutLine());
                requireEquals(validation.get("schemaVersion"), 1L, "validation schemaVersion");
                requireEquals(validation.get("validation"), Boolean.TRUE, "validation flag");
                requireEquals(validation.get("library"), library, "validation library");
                Map<String, String> validationJvmIdentity = jvmIdentity(validation);
                if (childJvmIdentity == null) {
                    childJvmIdentity = validationJvmIdentity;
                } else {
                    requireEquals(
                        validationJvmIdentity,
                        childJvmIdentity,
                        "validation child JVM identity"
                    );
                }
            }
        }

        List<PlanEntry> plan = createPlan(config);
        Path outputDirectory = outputDirectory(config, workingDirectory);
        Files.createDirectories(outputDirectory.getParent());
        Files.createDirectory(outputDirectory);

        boolean metadataWritten = false;
        if (childJvmIdentity != null) {
            writeMetadata(
                outputDirectory.resolve("metadata.json"),
                config,
                classpaths,
                plan.size(),
                childJvmIdentity
            );
            metadataWritten = true;
        }

        List<Map<String, Object>> records = new ArrayList<>(plan.size());
        Path jsonlPath = outputDirectory.resolve("samples.jsonl");
        Path partialJsonlPath = outputDirectory.resolve("samples.jsonl.partial");
        try (BufferedWriter jsonl = Files.newBufferedWriter(partialJsonlPath, StandardCharsets.UTF_8)) {
            for (int planIndex = 0; planIndex < plan.size(); planIndex++) {
                PlanEntry entry = plan.get(planIndex);
                ProcessResult child = runChild(
                    config,
                    classpaths.forLibrary(entry.library()),
                    entry,
                    false,
                    workingDirectory
                );
                Map<String, Object> record = Json.parseObject(child.stdoutLine());
                validateSample(record, entry);
                Map<String, String> sampleJvmIdentity = jvmIdentity(record);
                if (childJvmIdentity == null) {
                    childJvmIdentity = sampleJvmIdentity;
                } else {
                    requireEquals(sampleJvmIdentity, childJvmIdentity, "child JVM identity");
                }
                if (!metadataWritten) {
                    writeMetadata(
                        outputDirectory.resolve("metadata.json"),
                        config,
                        classpaths,
                        plan.size(),
                        childJvmIdentity
                    );
                    metadataWritten = true;
                }

                Map<String, Object> sample = new LinkedHashMap<>();
                sample.put("planIndex", planIndex);
                sample.put("repetition", entry.repetition());
                sample.put("randomizationSeed", config.seed());
                record.put("sample", sample);

                Map<String, Object> external = new LinkedHashMap<>();
                external.put("processWallNs", child.processWallNs());
                record.put("external", external);

                Map<String, Object> timing = objectValue(record, "timingNs");
                long initializationPlusOperations = longValue(
                    timing,
                    "initializationPlusOperations"
                );
                long remainingOperations = longValue(timing, "remainingOperations");
                Map<String, Object> derived = new LinkedHashMap<>();
                derived.put(
                    "amortizedInitializationPlusOperationsPerOp",
                    (double) initializationPlusOperations / entry.count()
                );
                derived.put(
                    "remainingPerOperation",
                    entry.count() == 1
                        ? null
                        : (double) remainingOperations / (entry.count() - 1)
                );
                record.put("derivedNs", derived);

                records.add(record);
                jsonl.write(Json.stringify(record));
                jsonl.newLine();
                jsonl.flush();

                System.err.printf(
                    Locale.ROOT,
                    "[%d/%d] %s %s n=%d%n",
                    planIndex + 1,
                    plan.size(),
                    entry.library(),
                    entry.operation(),
                    entry.count()
                );

                if (config.pauseMillis() > 0 && planIndex + 1 < plan.size()) {
                    Thread.sleep(config.pauseMillis());
                }
            }
        }
        moveAtomically(partialJsonlPath, jsonlPath);

        validateGroupSizes(records, config.samples());
        writeCsv(outputDirectory.resolve("samples.csv"), flattenRecords(records));
        writeSummary(outputDirectory.resolve("summary.csv"), records);

        Map<String, Object> completion = new LinkedHashMap<>();
        completion.put("output", outputDirectory.toString());
        completion.put("samples", records.size());
        System.out.println(Json.stringify(completion));
    }

    static Config parseArgs(String... args) {
        int samples = 30;
        List<Integer> counts = new ArrayList<>(SUPPORTED_COUNTS);
        List<String> libraries = new ArrayList<>(SUPPORTED_LIBRARIES);
        List<String> operations = new ArrayList<>(SUPPORTED_OPERATIONS);
        long seed = 20_260_812L;
        long pauseMillis = 25L;
        long timeoutSeconds = 60L;
        Path javaExecutable = defaultJavaExecutable();
        List<String> additionalJvmArgs = new ArrayList<>();
        Path output = null;
        Path classpathFile = null;
        boolean defaultJvmArgsEnabled = true;
        boolean validate = true;
        boolean help = false;

        for (int index = 0; index < args.length; index++) {
            String argument = args[index];
            switch (argument) {
                case "--samples" -> samples = positiveInt(value(args, ++index, argument), argument);
                case "--counts" -> {
                    List<String> values = listValues(args, index + 1, argument);
                    counts = values.stream().map(value -> positiveInt(value, argument)).toList();
                    index += consumedListArguments(args, index + 1);
                }
                case "--libraries" -> {
                    libraries = listValues(args, index + 1, argument);
                    index += consumedListArguments(args, index + 1);
                }
                case "--operations" -> {
                    operations = listValues(args, index + 1, argument);
                    index += consumedListArguments(args, index + 1);
                }
                case "--seed" -> seed = longArgument(value(args, ++index, argument), argument);
                case "--pause-ms" -> pauseMillis = nonNegativeLong(value(args, ++index, argument), argument);
                case "--timeout-seconds" ->
                    timeoutSeconds = positiveLong(value(args, ++index, argument), argument);
                case "--java" -> javaExecutable = Path.of(value(args, ++index, argument));
                case "--no-default-jvm-args" -> defaultJvmArgsEnabled = false;
                case "--jvm-arg" -> additionalJvmArgs.add(value(args, ++index, argument));
                case "--output" -> output = Path.of(value(args, ++index, argument));
                case "--classpath-file" -> classpathFile = Path.of(value(args, ++index, argument));
                case "--no-validate" -> validate = false;
                case "--help", "-h" -> help = true;
                default -> throw new UsageException("Unknown argument: " + argument);
            }
        }

        counts = distinct(counts);
        libraries = distinct(libraries);
        operations = distinct(operations);
        requireSupported(counts, SUPPORTED_COUNTS, "count");
        requireSupported(libraries, SUPPORTED_LIBRARIES, "library");
        requireSupported(operations, SUPPORTED_OPERATIONS, "operation");

        List<String> jvmArgs = new ArrayList<>();
        if (defaultJvmArgsEnabled) {
            jvmArgs.addAll(DEFAULT_JVM_ARGS);
        }
        jvmArgs.addAll(additionalJvmArgs);
        return new Config(
            samples,
            List.copyOf(counts),
            List.copyOf(libraries),
            List.copyOf(operations),
            seed,
            pauseMillis,
            timeoutSeconds,
            javaExecutable.toAbsolutePath().normalize(),
            List.copyOf(jvmArgs),
            defaultJvmArgsEnabled,
            output,
            classpathFile,
            validate,
            help
        );
    }

    static List<PlanEntry> createPlan(Config config) {
        List<PlanEntry> plan = new ArrayList<>();
        Random random = new Random(config.seed());
        for (int repetition = 0; repetition < config.samples(); repetition++) {
            List<PlanEntry> block = new ArrayList<>();
            for (String library : config.libraries()) {
                for (String operation : config.operations()) {
                    for (int count : config.counts()) {
                        block.add(new PlanEntry(repetition, library, operation, count));
                    }
                }
            }
            Collections.shuffle(block, random);
            plan.addAll(block);
        }
        return List.copyOf(plan);
    }

    static double p50(List<Double> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("values must not be empty");
        }
        List<Double> ordered = values.stream().sorted().toList();
        int middle = ordered.size() / 2;
        if ((ordered.size() & 1) == 1) {
            return ordered.get(middle);
        }
        return (ordered.get(middle - 1) + ordered.get(middle)) / 2.0;
    }

    static double p90(List<Double> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("values must not be empty");
        }
        List<Double> ordered = values.stream().sorted().toList();
        int index = Math.max(0, (int) Math.ceil(0.90 * ordered.size()) - 1);
        return ordered.get(index);
    }

    private static ProcessResult runChild(
        Config config,
        String classpath,
        PlanEntry entry,
        boolean validateOnly,
        Path workingDirectory
    ) throws Exception {
        List<String> command = new ArrayList<>();
        command.add(config.javaExecutable().toString());
        command.addAll(config.jvmArgs());
        command.add("-cp");
        command.add(classpath);
        command.add(CHILD_MAIN);
        command.add("--library");
        command.add(entry.library());
        if (validateOnly) {
            command.add("--validate-only");
        } else {
            command.add("--operation");
            command.add(entry.operation());
            command.add("--count");
            command.add(Integer.toString(entry.count()));
        }

        ProcessBuilder builder = new ProcessBuilder(command);
        builder.directory(workingDirectory.toFile());

        long startedNs = System.nanoTime();
        Process process = builder.start();
        ExecutorService readers = Executors.newFixedThreadPool(2, runnable -> {
            Thread thread = new Thread(runnable, "cold-benchmark-child-output");
            thread.setDaemon(true);
            return thread;
        });
        Future<String> stdout = readers.submit(() -> readUtf8(process.getInputStream()));
        Future<String> stderr = readers.submit(() -> readUtf8(process.getErrorStream()));

        boolean finished;
        try {
            finished = process.waitFor(config.timeoutSeconds(), TimeUnit.SECONDS);
        } catch (InterruptedException error) {
            terminate(process);
            throw error;
        }
        long finishedNs = System.nanoTime();

        if (!finished) {
            terminate(process);
        }

        String stdoutText;
        String stderrText;
        try {
            stdoutText = futureValue(stdout);
            stderrText = futureValue(stderr);
        } finally {
            readers.shutdownNow();
        }

        if (!finished) {
            throw new TimeoutException(
                "Cold child exceeded " + config.timeoutSeconds() + " seconds: " + command
            );
        }
        if (process.exitValue() != 0) {
            throw new IllegalStateException(
                "Cold child failed with exit code " + process.exitValue()
                    + "\ncommand: " + command
                    + "\nstdout:\n" + stdoutText
                    + "\nstderr:\n" + stderrText
            );
        }

        List<String> lines = stdoutText.lines().filter(line -> !line.isBlank()).toList();
        if (lines.size() != 1) {
            throw new IllegalStateException(
                "Expected exactly one non-blank JSON line from child, got " + lines.size()
                    + "\nstdout:\n" + stdoutText
                    + "\nstderr:\n" + stderrText
            );
        }
        Json.parseObject(lines.getFirst());
        return new ProcessResult(lines.getFirst(), finishedNs - startedNs);
    }

    private static String readUtf8(java.io.InputStream input) {
        try (input) {
            return new String(input.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException error) {
            throw new UncheckedIOException(error);
        }
    }

    private static String futureValue(Future<String> future) throws Exception {
        try {
            return future.get(10, TimeUnit.SECONDS);
        } catch (ExecutionException error) {
            if (error.getCause() instanceof Exception exception) {
                throw exception;
            }
            throw new IllegalStateException(error.getCause());
        }
    }

    private static void terminate(Process process) throws InterruptedException {
        process.destroy();
        if (!process.waitFor(500, TimeUnit.MILLISECONDS)) {
            process.destroyForcibly();
            process.waitFor(5, TimeUnit.SECONDS);
        }
    }

    private static void validateSample(Map<String, Object> record, PlanEntry entry) {
        requireEquals(record.get("schemaVersion"), 1L, "schemaVersion");
        requireEquals(record.get("library"), entry.library(), "library");
        requireEquals(record.get("operation"), entry.operation(), "operation");
        requireEquals(record.get("operationCount"), (long) entry.count(), "operationCount");
        jvmIdentity(record);
        if (longValue(record, "pid") <= 0) {
            throw new IllegalStateException("Child returned a non-positive pid");
        }
        Map<String, Object> timing = objectValue(record, "timingNs");
        for (String field : List.of(
            "mainEntryToFixtureStart",
            "fixturePreparation",
            "libraryInitialization",
            "firstOperation",
            "remainingOperations",
            "operationsTotal",
            "initializationPlusOperations"
        )) {
            if (longValue(timing, field) < 0) {
                throw new IllegalStateException("Negative child timing: " + field);
            }
        }
        long expectedOperationsTotal = longValue(timing, "firstOperation")
            + longValue(timing, "remainingOperations");
        requireEquals(
            timing.get("operationsTotal"),
            expectedOperationsTotal,
            "timingNs.operationsTotal"
        );
    }

    private static void validateGroupSizes(List<Map<String, Object>> records, int expected) {
        Map<GroupKey, Integer> sizes = new TreeMap<>(GroupKey.ORDER);
        for (Map<String, Object> record : records) {
            GroupKey key = new GroupKey(
                stringValue(record, "library"),
                stringValue(record, "operation"),
                Math.toIntExact(longValue(record, "operationCount"))
            );
            sizes.merge(key, 1, Integer::sum);
        }
        for (Map.Entry<GroupKey, Integer> entry : sizes.entrySet()) {
            if (entry.getValue() != expected) {
                throw new IllegalStateException(
                    "Cell " + entry.getKey() + " has " + entry.getValue()
                        + " samples; expected " + expected
                );
            }
        }
    }

    private static void writeMetadata(
        Path path,
        Config config,
        ClasspathCatalog classpaths,
        int totalSamples,
        Map<String, String> childJvmIdentity
    ) throws IOException {
        Map<String, Object> metadata = new LinkedHashMap<>();
        metadata.put("schemaVersion", 1);
        metadata.put("createdAtUtc", Instant.now().toString());
        metadata.put("coordinator", ColdBenchmarkMain.class.getName());
        metadata.put("childMain", CHILD_MAIN);
        metadata.put("freshJvmPerSample", true);
        metadata.put("javaExecutable", config.javaExecutable().toString());
        metadata.put("coordinatorJavaVersion", Runtime.version().toString());
        metadata.put("javaVendor", System.getProperty("java.vendor"));
        metadata.put("coordinatorVmName", System.getProperty("java.vm.name"));
        metadata.put("coordinatorJavaHome", System.getProperty("java.home"));
        if (childJvmIdentity != null) {
            metadata.put("childJvmIdentity", childJvmIdentity);
        }
        metadata.put("osName", System.getProperty("os.name"));
        metadata.put("osVersion", System.getProperty("os.version"));
        metadata.put("osArch", System.getProperty("os.arch"));
        metadata.put("jvmArgs", config.jvmArgs());
        metadata.put("defaultJvmArgsEnabled", config.defaultJvmArgsEnabled());
        metadata.put("samplesPerCell", config.samples());
        metadata.put("totalSamples", totalSamples);
        metadata.put("counts", config.counts());
        metadata.put("libraries", config.libraries());
        metadata.put("operations", config.operations());
        metadata.put("randomizationSeed", config.seed());
        metadata.put("pauseMs", config.pauseMillis());
        metadata.put("childTimeoutSeconds", config.timeoutSeconds());
        metadata.put("externalWallDefinition", "ProcessBuilder.start through child process exit");
        metadata.put("summaryPercentiles", "p50=median; p90=nearest rank");
        metadata.put("childClasspathFiles", classpaths.fileNames(config.libraries()));
        metadata.put("childClasspathArtifacts", classpaths.artifacts(config.libraries()));
        atomicWrite(path, output -> {
            output.write(Json.stringify(metadata));
            output.newLine();
        });
    }

    private static List<Map<String, Object>> flattenRecords(List<Map<String, Object>> records) {
        List<Map<String, Object>> flattened = new ArrayList<>(records.size());
        for (Map<String, Object> record : records) {
            Map<String, Object> row = new LinkedHashMap<>();
            flatten("", record, row);
            flattened.add(row);
        }
        return flattened;
    }

    private static void flatten(String prefix, Object value, Map<String, Object> target) {
        if (value instanceof Map<?, ?> map) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String key = prefix.isEmpty()
                    ? entry.getKey().toString()
                    : prefix + "." + entry.getKey();
                flatten(key, entry.getValue(), target);
            }
        } else if (value instanceof List<?>) {
            target.put(prefix, Json.stringify(value));
        } else {
            target.put(prefix, value);
        }
    }

    private static void writeSummary(Path path, List<Map<String, Object>> records) throws IOException {
        Map<GroupKey, List<Map<String, Object>>> groups = new TreeMap<>(GroupKey.ORDER);
        for (Map<String, Object> record : records) {
            GroupKey key = new GroupKey(
                stringValue(record, "library"),
                stringValue(record, "operation"),
                Math.toIntExact(longValue(record, "operationCount"))
            );
            Map<String, Object> flattened = new LinkedHashMap<>();
            flatten("", record, flattened);
            groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(flattened);
        }

        List<Map<String, Object>> rows = new ArrayList<>();
        for (Map.Entry<GroupKey, List<Map<String, Object>>> group : groups.entrySet()) {
            Map<String, Object> row = new LinkedHashMap<>();
            row.put("library", group.getKey().library());
            row.put("operation", group.getKey().operation());
            row.put("operationCount", group.getKey().count());
            row.put("samples", group.getValue().size());
            for (String metric : SUMMARY_METRICS) {
                List<Double> values = new ArrayList<>();
                for (Map<String, Object> sample : group.getValue()) {
                    Object value = sample.get(metric);
                    if (value instanceof Number number) {
                        values.add(number.doubleValue());
                    }
                }
                if (!values.isEmpty()) {
                    row.put(metric + ".p50", p50(values));
                    row.put(metric + ".p90", p90(values));
                    row.put(metric + ".min", values.stream().min(Double::compareTo).orElseThrow());
                    row.put(metric + ".max", values.stream().max(Double::compareTo).orElseThrow());
                }
            }
            rows.add(row);
        }
        writeCsv(path, rows);
    }

    private static void writeCsv(Path path, List<Map<String, Object>> rows) throws IOException {
        Set<String> headers = new TreeSet<>();
        for (Map<String, Object> row : rows) {
            headers.addAll(row.keySet());
        }
        List<String> headerList = List.copyOf(headers);
        atomicWrite(path, output -> {
            writeCsvLine(output, headerList);
            for (Map<String, Object> row : rows) {
                List<String> values = new ArrayList<>(headerList.size());
                for (String header : headerList) {
                    Object value = row.get(header);
                    values.add(value == null ? "" : value.toString());
                }
                writeCsvLine(output, values);
            }
        });
    }

    private static void atomicWrite(Path path, WriterAction action) throws IOException {
        Path temporary = path.resolveSibling(path.getFileName() + ".tmp");
        try {
            try (BufferedWriter output = Files.newBufferedWriter(temporary, StandardCharsets.UTF_8)) {
                action.write(output);
            }
            moveAtomically(temporary, path);
        } catch (IOException | RuntimeException error) {
            try {
                Files.deleteIfExists(temporary);
            } catch (IOException cleanupError) {
                error.addSuppressed(cleanupError);
            }
            throw error;
        }
    }

    private static void moveAtomically(Path source, Path target) throws IOException {
        try {
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        } catch (AtomicMoveNotSupportedException error) {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private static void writeCsvLine(BufferedWriter output, List<String> values) throws IOException {
        for (int index = 0; index < values.size(); index++) {
            if (index > 0) {
                output.write(',');
            }
            String value = values.get(index);
            if (value.indexOf(',') >= 0 || value.indexOf('"') >= 0
                || value.indexOf('\n') >= 0 || value.indexOf('\r') >= 0) {
                output.write('"');
                output.write(value.replace("\"", "\"\""));
                output.write('"');
            } else {
                output.write(value);
            }
        }
        output.newLine();
    }

    private static Path outputDirectory(Config config, Path workingDirectory) {
        if (config.output() != null) {
            return config.output().isAbsolute()
                ? config.output().normalize()
                : workingDirectory.resolve(config.output()).normalize();
        }
        String timestamp = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'", Locale.ROOT)
            .withZone(ZoneOffset.UTC)
            .format(Instant.now());
        return workingDirectory.resolve("build/reports/cold-jvm").resolve(timestamp);
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> objectValue(Map<String, Object> object, String key) {
        Object value = object.get(key);
        if (!(value instanceof Map<?, ?>)) {
            throw new IllegalStateException("Expected JSON object at " + key + ", got " + value);
        }
        return (Map<String, Object>) value;
    }

    private static long longValue(Map<String, Object> object, String key) {
        Object value = object.get(key);
        if (!(value instanceof Number number)) {
            throw new IllegalStateException("Expected JSON number at " + key + ", got " + value);
        }
        return number.longValue();
    }

    private static String stringValue(Map<String, Object> object, String key) {
        Object value = object.get(key);
        if (!(value instanceof String string)) {
            throw new IllegalStateException("Expected JSON string at " + key + ", got " + value);
        }
        return string;
    }

    static Map<String, String> jvmIdentity(Map<String, Object> record) {
        Map<String, String> identity = new LinkedHashMap<>();
        for (String field : List.of("jvmVersion", "javaVendor", "javaVmName", "javaHome")) {
            String value = stringValue(record, field);
            if (value.isBlank()) {
                throw new IllegalStateException("Child returned a blank " + field);
            }
            identity.put(field, value);
        }
        return Collections.unmodifiableMap(identity);
    }

    private static void requireEquals(Object actual, Object expected, String field) {
        if (!Objects.equals(actual, expected)) {
            throw new IllegalStateException(
                "Unexpected " + field + ": expected " + expected + ", got " + actual
            );
        }
    }

    private static String value(String[] args, int index, String option) {
        if (index >= args.length) {
            throw new UsageException("Missing value for " + option);
        }
        return args[index];
    }

    private static List<String> listValues(String[] args, int start, String option) {
        int consumed = consumedListArguments(args, start);
        if (consumed == 0) {
            throw new UsageException("Missing value for " + option);
        }
        List<String> values = new ArrayList<>();
        for (int index = start; index < start + consumed; index++) {
            for (String part : args[index].split(",")) {
                if (!part.isBlank()) {
                    values.add(part.trim());
                }
            }
        }
        if (values.isEmpty()) {
            throw new UsageException("Missing value for " + option);
        }
        return values;
    }

    private static int consumedListArguments(String[] args, int start) {
        int index = start;
        while (index < args.length && !args[index].startsWith("--")) {
            index++;
        }
        return index - start;
    }

    private static int positiveInt(String value, String option) {
        long parsed = positiveLong(value, option);
        if (parsed > Integer.MAX_VALUE) {
            throw new UsageException(option + " is too large: " + value);
        }
        return (int) parsed;
    }

    private static long positiveLong(String value, String option) {
        long parsed = longArgument(value, option);
        if (parsed <= 0) {
            throw new UsageException(option + " must be positive");
        }
        return parsed;
    }

    private static long nonNegativeLong(String value, String option) {
        long parsed = longArgument(value, option);
        if (parsed < 0) {
            throw new UsageException(option + " must be non-negative");
        }
        return parsed;
    }

    private static long longArgument(String value, String option) {
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException error) {
            throw new UsageException(option + " requires an integer, got: " + value);
        }
    }

    private static <T> List<T> distinct(List<T> values) {
        return List.copyOf(new LinkedHashSet<>(values));
    }

    private static <T> void requireSupported(List<T> values, List<T> supported, String label) {
        if (values.isEmpty()) {
            throw new UsageException("At least one " + label + " is required");
        }
        for (T value : values) {
            if (!supported.contains(value)) {
                throw new UsageException(
                    "Unsupported " + label + " " + value + "; choose from " + supported
                );
            }
        }
    }

    private static Path defaultJavaExecutable() {
        String executable = System.getProperty("os.name", "").toLowerCase(Locale.ROOT)
            .contains("windows") ? "java.exe" : "java";
        return Path.of(System.getProperty("java.home"), "bin", executable);
    }

    private static String usage() {
        return """
            Usage: cold-benchmark [options]

            Every sample runs in a fresh JVM. Defaults: 30 samples per cell,
            libraries kotlinx/jackson/gson/fory, operations serialize/deserialize,
            and batches 1/10/100 (720 child JVMs total).

              --samples N                 fresh JVMs per cell (default: 30)
              --counts LIST               1,10,100; comma- or space-separated
              --libraries LIST            kotlinx,jackson,gson,fory
              --operations LIST           serialize,deserialize
              --seed N                    plan shuffle seed (default: 20260812)
              --pause-ms N                pause between samples (default: 25)
              --timeout-seconds N          timeout for one child (default: 60)
              --java PATH                 child Java executable
              --no-default-jvm-args       omit the built-in child JVM profile
              --jvm-arg ARG               append a child JVM argument; repeatable
              --output DIR                new output directory
              --classpath-file FILE       cold-classpaths.properties override
              --no-validate               skip unrecorded per-library preflight
              --help                      show this help
            """;
    }

    record Config(
        int samples,
        List<Integer> counts,
        List<String> libraries,
        List<String> operations,
        long seed,
        long pauseMillis,
        long timeoutSeconds,
        Path javaExecutable,
        List<String> jvmArgs,
        boolean defaultJvmArgsEnabled,
        Path output,
        Path classpathFile,
        boolean validate,
        boolean help
    ) {
    }

    record PlanEntry(int repetition, String library, String operation, int count) {
    }

    private record ProcessResult(String stdoutLine, long processWallNs) {
    }

    private record GroupKey(String library, String operation, int count) {
        private static final Comparator<GroupKey> ORDER = Comparator
            .comparing(GroupKey::library)
            .thenComparing(GroupKey::operation)
            .thenComparingInt(GroupKey::count);
    }

    private static final class ClasspathCatalog {
        private final Map<String, String> classpaths;
        private final Map<String, List<String>> fileNames;
        private final Map<String, List<ClasspathArtifact>> artifacts;

        private ClasspathCatalog(
            Map<String, String> classpaths,
            Map<String, List<String>> fileNames,
            Map<String, List<ClasspathArtifact>> artifacts
        ) {
            this.classpaths = Map.copyOf(classpaths);
            this.fileNames = Map.copyOf(fileNames);
            this.artifacts = Map.copyOf(artifacts);
        }

        static ClasspathCatalog load(Path explicitFile, Path workingDirectory) throws IOException {
            Path catalog;
            if (explicitFile != null) {
                catalog = explicitFile.isAbsolute()
                    ? explicitFile
                    : workingDirectory.resolve(explicitFile);
                catalog = catalog.normalize();
            } else {
                String configuredLibDir = System.getProperty("coldBenchmark.libDir");
                Path libDirectory = configuredLibDir == null || configuredLibDir.isBlank()
                    ? coordinatorJarDirectory()
                    : Path.of(configuredLibDir).toAbsolutePath().normalize();
                catalog = libDirectory.resolve("cold-classpaths.properties");
            }
            return read(catalog);
        }

        private static Path coordinatorJarDirectory() throws IOException {
            try {
                Path codeSource = Path.of(
                    ColdBenchmarkMain.class.getProtectionDomain().getCodeSource().getLocation().toURI()
                );
                Path directory = Files.isDirectory(codeSource) ? codeSource : codeSource.getParent();
                if (directory == null) {
                    throw new IOException("Cannot determine coordinator JAR directory");
                }
                return directory.toAbsolutePath().normalize();
            } catch (URISyntaxException | NullPointerException error) {
                throw new IOException("Cannot determine coordinator JAR directory", error);
            }
        }

        private static ClasspathCatalog read(Path file) throws IOException {
            if (!Files.isRegularFile(file)) {
                throw new IOException(
                    "Classpath catalog does not exist: " + file
                        + ". Set -DcoldBenchmark.libDir to the directory containing "
                        + "cold-classpaths.properties or pass --classpath-file."
                );
            }
            Properties properties = new Properties();
            try (InputStream input = Files.newInputStream(file)) {
                properties.load(input);
            }
            Path base = file.getParent();

            Map<String, String> classpaths = new LinkedHashMap<>();
            Map<String, List<String>> names = new LinkedHashMap<>();
            Map<String, List<ClasspathArtifact>> artifacts = new LinkedHashMap<>();
            for (String library : SUPPORTED_LIBRARIES) {
                String configured = properties.getProperty(library);
                if (configured == null || configured.isBlank()) {
                    throw new IOException("Missing classpath for " + library + " in " + file);
                }
                List<Path> entries = new ArrayList<>();
                for (String encodedName : configured.split(",")) {
                    String name = encodedName.trim();
                    if (name.isEmpty()) {
                        continue;
                    }
                    Path relative = Path.of(name);
                    if (relative.isAbsolute() || relative.getNameCount() != 1
                        || !relative.equals(relative.getFileName())) {
                        throw new IOException(
                            "Classpath entries must be jar basenames; got " + name + " for " + library
                        );
                    }
                    entries.add(base.resolve(relative));
                }
                if (entries.isEmpty()) {
                    throw new IOException("Empty classpath for " + library + " in " + file);
                }
                List<String> normalizedEntries = new ArrayList<>();
                List<String> entryNames = new ArrayList<>();
                List<ClasspathArtifact> entryArtifacts = new ArrayList<>();
                for (Path entry : entries) {
                    Path normalized = entry.toAbsolutePath().normalize();
                    if (!Files.isRegularFile(normalized) && !Files.isDirectory(normalized)) {
                        throw new IOException(
                            "Missing " + library + " classpath entry: " + normalized
                        );
                    }
                    normalizedEntries.add(normalized.toString());
                    String fileName = normalized.getFileName().toString();
                    entryNames.add(fileName);
                    entryArtifacts.add(new ClasspathArtifact(
                        fileName,
                        Files.isRegularFile(normalized) ? sha256(normalized) : null
                    ));
                }
                classpaths.put(library, String.join(File.pathSeparator, normalizedEntries));
                names.put(library, List.copyOf(entryNames));
                artifacts.put(library, List.copyOf(entryArtifacts));
            }
            return new ClasspathCatalog(classpaths, names, artifacts);
        }

        String forLibrary(String library) {
            String classpath = classpaths.get(library);
            if (classpath == null) {
                throw new IllegalArgumentException("No classpath for " + library);
            }
            return classpath;
        }

        Map<String, Object> fileNames(List<String> libraries) {
            Map<String, Object> result = new LinkedHashMap<>();
            for (String library : libraries) {
                result.put(library, fileNames.get(library));
            }
            return result;
        }

        Map<String, Object> artifacts(List<String> libraries) {
            Map<String, Object> result = new LinkedHashMap<>();
            for (String library : libraries) {
                List<Map<String, Object>> libraryArtifacts = new ArrayList<>();
                for (ClasspathArtifact artifact : artifacts.get(library)) {
                    Map<String, Object> value = new LinkedHashMap<>();
                    value.put("file", artifact.file());
                    value.put("sha256", artifact.sha256());
                    libraryArtifacts.add(value);
                }
                result.put(library, libraryArtifacts);
            }
            return result;
        }

        private static String sha256(Path file) throws IOException {
            MessageDigest digest;
            try {
                digest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException error) {
                throw new IllegalStateException("SHA-256 is unavailable", error);
            }
            try (InputStream input = Files.newInputStream(file)) {
                byte[] buffer = new byte[16 * 1_024];
                int read;
                while ((read = input.read(buffer)) != -1) {
                    digest.update(buffer, 0, read);
                }
            }
            return HexFormat.of().formatHex(digest.digest());
        }
    }

    private record ClasspathArtifact(String file, String sha256) {
    }

    static final class Json {
        private Json() {
        }

        static Map<String, Object> parseObject(String source) {
            Object value = new Parser(source).parse();
            if (!(value instanceof Map<?, ?> map)) {
                throw new IllegalArgumentException("Expected a JSON object");
            }
            Map<String, Object> result = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                result.put(entry.getKey().toString(), entry.getValue());
            }
            return result;
        }

        static String stringify(Object value) {
            StringBuilder output = new StringBuilder(512);
            write(value, output);
            return output.toString();
        }

        private static void write(Object value, StringBuilder output) {
            if (value == null) {
                output.append("null");
            } else if (value instanceof String string) {
                quote(string, output);
            } else if (value instanceof Number || value instanceof Boolean) {
                output.append(value);
            } else if (value instanceof Map<?, ?> map) {
                output.append('{');
                boolean first = true;
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    if (!first) {
                        output.append(',');
                    }
                    first = false;
                    quote(entry.getKey().toString(), output);
                    output.append(':');
                    write(entry.getValue(), output);
                }
                output.append('}');
            } else if (value instanceof Iterable<?> values) {
                output.append('[');
                boolean first = true;
                for (Object item : values) {
                    if (!first) {
                        output.append(',');
                    }
                    first = false;
                    write(item, output);
                }
                output.append(']');
            } else {
                throw new IllegalArgumentException(
                    "Cannot encode JSON value of type " + value.getClass().getName()
                );
            }
        }

        private static void quote(String value, StringBuilder output) {
            output.append('"');
            for (int index = 0; index < value.length(); index++) {
                char character = value.charAt(index);
                switch (character) {
                    case '"' -> output.append("\\\"");
                    case '\\' -> output.append("\\\\");
                    case '\b' -> output.append("\\b");
                    case '\f' -> output.append("\\f");
                    case '\n' -> output.append("\\n");
                    case '\r' -> output.append("\\r");
                    case '\t' -> output.append("\\t");
                    default -> {
                        if (character < 0x20) {
                            output.append(String.format(Locale.ROOT, "\\u%04x", (int) character));
                        } else {
                            output.append(character);
                        }
                    }
                }
            }
            output.append('"');
        }

        private static final class Parser {
            private final String source;
            private int index;

            private Parser(String source) {
                this.source = Objects.requireNonNull(source);
            }

            private Object parse() {
                skipWhitespace();
                Object value = value();
                skipWhitespace();
                if (index != source.length()) {
                    throw error("Trailing content");
                }
                return value;
            }

            private Object value() {
                if (index >= source.length()) {
                    throw error("Unexpected end of input");
                }
                return switch (source.charAt(index)) {
                    case '{' -> object();
                    case '[' -> array();
                    case '"' -> string();
                    case 't' -> literal("true", Boolean.TRUE);
                    case 'f' -> literal("false", Boolean.FALSE);
                    case 'n' -> literal("null", null);
                    default -> number();
                };
            }

            private Map<String, Object> object() {
                expect('{');
                Map<String, Object> result = new LinkedHashMap<>();
                skipWhitespace();
                if (take('}')) {
                    return result;
                }
                while (true) {
                    skipWhitespace();
                    if (index >= source.length() || source.charAt(index) != '"') {
                        throw error("Expected object key");
                    }
                    String key = string();
                    skipWhitespace();
                    expect(':');
                    skipWhitespace();
                    result.put(key, value());
                    skipWhitespace();
                    if (take('}')) {
                        return result;
                    }
                    expect(',');
                    skipWhitespace();
                }
            }

            private List<Object> array() {
                expect('[');
                List<Object> result = new ArrayList<>();
                skipWhitespace();
                if (take(']')) {
                    return result;
                }
                while (true) {
                    skipWhitespace();
                    result.add(value());
                    skipWhitespace();
                    if (take(']')) {
                        return result;
                    }
                    expect(',');
                    skipWhitespace();
                }
            }

            private String string() {
                expect('"');
                StringBuilder result = new StringBuilder();
                while (index < source.length()) {
                    char character = source.charAt(index++);
                    if (character == '"') {
                        return result.toString();
                    }
                    if (character != '\\') {
                        if (character < 0x20) {
                            throw error("Unescaped control character");
                        }
                        result.append(character);
                        continue;
                    }
                    if (index >= source.length()) {
                        throw error("Incomplete string escape");
                    }
                    char escaped = source.charAt(index++);
                    switch (escaped) {
                        case '"', '\\', '/' -> result.append(escaped);
                        case 'b' -> result.append('\b');
                        case 'f' -> result.append('\f');
                        case 'n' -> result.append('\n');
                        case 'r' -> result.append('\r');
                        case 't' -> result.append('\t');
                        case 'u' -> result.append(unicodeEscape());
                        default -> throw error("Unsupported string escape: \\" + escaped);
                    }
                }
                throw error("Unterminated string");
            }

            private char unicodeEscape() {
                if (index + 4 > source.length()) {
                    throw error("Incomplete unicode escape");
                }
                String digits = source.substring(index, index + 4);
                index += 4;
                try {
                    return (char) Integer.parseInt(digits, 16);
                } catch (NumberFormatException error) {
                    throw error("Invalid unicode escape: " + digits);
                }
            }

            private Object number() {
                int start = index;
                if (take('-') && index >= source.length()) {
                    throw error("Incomplete number");
                }
                if (take('0')) {
                    // A single leading zero is valid; further digits are not.
                } else {
                    digits();
                }
                boolean floatingPoint = false;
                if (take('.')) {
                    floatingPoint = true;
                    digits();
                }
                if (index < source.length()
                    && (source.charAt(index) == 'e' || source.charAt(index) == 'E')) {
                    floatingPoint = true;
                    index++;
                    if (index < source.length()
                        && (source.charAt(index) == '+' || source.charAt(index) == '-')) {
                        index++;
                    }
                    digits();
                }
                if (start == index) {
                    throw error("Expected JSON value");
                }
                String encoded = source.substring(start, index);
                try {
                    if (floatingPoint) {
                        return Double.parseDouble(encoded);
                    }
                    return Long.parseLong(encoded);
                } catch (NumberFormatException error) {
                    throw error("Invalid number: " + encoded);
                }
            }

            private void digits() {
                int start = index;
                while (index < source.length() && Character.isDigit(source.charAt(index))) {
                    index++;
                }
                if (start == index) {
                    throw error("Expected digit");
                }
            }

            private Object literal(String expected, Object value) {
                if (!source.startsWith(expected, index)) {
                    throw error("Expected " + expected);
                }
                index += expected.length();
                return value;
            }

            private boolean take(char expected) {
                if (index < source.length() && source.charAt(index) == expected) {
                    index++;
                    return true;
                }
                return false;
            }

            private void expect(char expected) {
                if (!take(expected)) {
                    throw error("Expected '" + expected + "'");
                }
            }

            private void skipWhitespace() {
                while (index < source.length()) {
                    char character = source.charAt(index);
                    if (character != ' ' && character != '\n'
                        && character != '\r' && character != '\t') {
                        return;
                    }
                    index++;
                }
            }

            private IllegalArgumentException error(String message) {
                return new IllegalArgumentException(message + " at JSON offset " + index);
            }
        }
    }

    private static final class UsageException extends IllegalArgumentException {
        private UsageException(String message) {
            super(message);
        }
    }

    @FunctionalInterface
    private interface WriterAction {
        void write(BufferedWriter output) throws IOException;
    }
}
