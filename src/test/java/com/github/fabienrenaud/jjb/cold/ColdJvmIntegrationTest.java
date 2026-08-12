package com.github.fabienrenaud.jjb.cold;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.jar.JarFile;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ColdJvmIntegrationTest {

    private static final List<String> LIBRARIES = List.of("kotlinx", "jackson", "gson", "fory");
    private static final List<String> OPERATIONS = List.of("serialize", "deserialize");
    private static final List<Integer> COUNTS = List.of(1, 10);

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void generatedClasspathsContainOnlyTheSelectedJsonLibrary() throws Exception {
        Map<String, List<Path>> catalog = readCatalog();
        Set<Path> harnesses = new HashSet<>();

        for (String library : LIBRARIES) {
            List<Path> entries = catalog.get(library);
            assertFalse(library + " classpath is empty", entries.isEmpty());
            assertTrue(entries.stream().allMatch(Files::isRegularFile));

            Path harness = entries.getFirst();
            assertEquals("cold-benchmark-harness.jar", harness.getFileName().toString());
            harnesses.add(harness);

            List<String> names = entries.stream()
                .map(path -> path.getFileName().toString().toLowerCase())
                .toList();
            assertContainsTargetLibrary(library, names);
            for (String other : LIBRARIES) {
                if (!other.equals(library)) {
                    assertFalse(
                        library + " child unexpectedly contains " + other + ": " + names,
                        names.stream().anyMatch(name -> isLibraryJar(other, name))
                    );
                }
            }
        }

        assertEquals("all child classpaths must share one harness jar", 1, harnesses.size());
        try (JarFile harness = new JarFile(harnesses.iterator().next().toFile())) {
            assertNotNull(harness.getEntry(
                "com/github/fabienrenaud/jjb/cold/ColdJvmChild.class"
            ));
            assertNotNull(harness.getEntry(
                "com/github/fabienrenaud/jjb/cold/ColdBenchmarkMain.class"
            ));
            assertTrue(harness.stream().noneMatch(entry ->
                entry.getName().startsWith("com/github/fabienrenaud/jjb/provider/")
                    || entry.getName().endsWith("/JsonBench.class")
                    || entry.getName().endsWith("/JsonSource.class")
            ));
        }
    }

    @Test(timeout = 180_000L)
    public void coordinatorRunsEveryCellInAFreshJvmAndWritesValidReports() throws Exception {
        Path output = temporaryFolder.getRoot().toPath().resolve("cold-output");
        Path catalog = catalogPath();
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs(
            "--samples", "1",
            "--counts", "1", "10",
            "--libraries", "kotlinx", "jackson", "gson", "fory",
            "--operations", "serialize", "deserialize",
            "--seed", "314159",
            "--pause-ms", "0",
            "--timeout-seconds", "30",
            "--output", output.toString(),
            "--classpath-file", catalog.toString()
        );

        // Validation is intentionally enabled: this launches an unrecorded fresh
        // child for every codec before running the measured matrix.
        assertTrue(config.validate());
        ColdBenchmarkMain.run(config);

        List<Map<String, Object>> samples = Files.readAllLines(
                output.resolve("samples.jsonl"),
                StandardCharsets.UTF_8
            ).stream()
            .filter(line -> !line.isBlank())
            .map(ColdBenchmarkMain.Json::parseObject)
            .toList();

        assertEquals(16, samples.size());
        assertEquals(16, Files.readAllLines(output.resolve("samples.csv")).size() - 1);

        Set<Long> pids = new HashSet<>();
        Set<String> cells = new HashSet<>();
        Set<Long> planIndexes = new HashSet<>();
        Long fixtureBytes = null;
        Long fixtureHash = null;
        Map<String, String> childJvmIdentity = null;
        long coordinatorPid = ProcessHandle.current().pid();

        for (Map<String, Object> sample : samples) {
            assertEquals(1L, longValue(sample, "schemaVersion"));
            String library = stringValue(sample, "library");
            String operation = stringValue(sample, "operation");
            int count = Math.toIntExact(longValue(sample, "operationCount"));
            assertTrue(LIBRARIES.contains(library));
            assertTrue(OPERATIONS.contains(operation));
            assertTrue(COUNTS.contains(count));
            cells.add(library + "/" + operation + "/" + count);

            long pid = longValue(sample, "pid");
            assertTrue(pid > 0);
            assertNotEquals(coordinatorPid, pid);
            pids.add(pid);
            Map<String, String> currentJvmIdentity = jvmIdentity(sample);
            childJvmIdentity = childJvmIdentity == null ? currentJvmIdentity : childJvmIdentity;
            assertEquals(childJvmIdentity, currentJvmIdentity);

            long currentFixtureBytes = longValue(sample, "fixtureBytes");
            long currentFixtureHash = longValue(sample, "fixtureHash");
            assertTrue(currentFixtureBytes > 0);
            fixtureBytes = fixtureBytes == null ? currentFixtureBytes : fixtureBytes;
            fixtureHash = fixtureHash == null ? currentFixtureHash : fixtureHash;
            assertEquals(fixtureBytes.longValue(), currentFixtureBytes);
            assertEquals(fixtureHash.longValue(), currentFixtureHash);
            assertTrue(sample.get("checksum") instanceof Number);

            verifyTimings(sample, count);
            verifyAllocations(sample, count);
            verifyClassAndHeapMetrics(sample, count);
            verifySampleMetadata(sample, planIndexes);
            verifyDerivedMetrics(sample, count);
        }

        assertEquals(16, cells.size());
        assertEquals("each recorded sample must use a distinct child JVM", 16, pids.size());
        assertEquals(16, planIndexes.size());

        verifyMetadata(output.resolve("metadata.json"), childJvmIdentity);
        verifySummary(output.resolve("summary.csv"));
    }

    @Test(timeout = 30_000L)
    public void coordinatorWithoutPreflightRecordsMeasuredChildJvmIdentity() throws Exception {
        Path output = temporaryFolder.getRoot().toPath().resolve("cold-output-no-preflight");
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs(
            "--samples", "1",
            "--counts", "1",
            "--libraries", "kotlinx",
            "--operations", "serialize",
            "--pause-ms", "0",
            "--timeout-seconds", "20",
            "--output", output.toString(),
            "--classpath-file", catalogPath().toString(),
            "--no-validate"
        );

        ColdBenchmarkMain.run(config);

        Map<String, Object> sample = ColdBenchmarkMain.Json.parseObject(
            Files.readString(output.resolve("samples.jsonl"))
        );
        Map<String, Object> metadata = ColdBenchmarkMain.Json.parseObject(
            Files.readString(output.resolve("metadata.json"))
        );
        assertEquals(jvmIdentity(sample), objectValue(metadata, "childJvmIdentity"));
    }

    private static void verifyTimings(Map<String, Object> sample, int count) {
        Map<String, Object> timing = objectValue(sample, "timingNs");
        for (String key : List.of(
            "mainEntryToFixtureStart",
            "fixturePreparation",
            "libraryInitialization",
            "firstOperation",
            "remainingOperations",
            "operationsTotal",
            "initializationPlusOperations"
        )) {
            assertTrue(key, longValue(timing, key) >= 0);
        }

        long first = longValue(timing, "firstOperation");
        long remaining = longValue(timing, "remainingOperations");
        long operations = longValue(timing, "operationsTotal");
        long initialization = longValue(timing, "libraryInitialization");
        assertEquals(first + remaining, operations);
        assertEquals(initialization + operations, longValue(timing, "initializationPlusOperations"));
        if (count == 1) {
            assertEquals(0L, remaining);
        }

        Map<String, Object> external = objectValue(sample, "external");
        assertTrue(longValue(external, "processWallNs") >= initialization + operations);
    }

    private static void verifyAllocations(Map<String, Object> sample, int count) {
        Map<String, Object> allocations = objectValue(sample, "threadAllocatedBytes");
        assertTrue(allocations.get("supported") instanceof Boolean);
        boolean supported = (boolean) allocations.get("supported");
        for (String key : List.of(
            "fixturePreparation", "libraryInitialization", "firstOperation"
        )) {
            if (supported) {
                assertTrue(key, longValue(allocations, key) >= 0);
            } else {
                assertEquals(key, null, allocations.get(key));
            }
        }
        if (count == 1 || !supported) {
            assertEquals(null, allocations.get("remainingOperations"));
        } else {
            assertTrue(longValue(allocations, "remainingOperations") >= 0);
        }
    }

    private static void verifyClassAndHeapMetrics(Map<String, Object> sample, int count) {
        Map<String, Object> classDelta = objectValue(sample, "loadedClassDelta");
        for (String key : List.of(
            "fixturePreparation", "libraryInitialization", "firstOperation"
        )) {
            assertTrue(key, longValue(classDelta, key) >= 0);
        }
        if (count == 1) {
            assertEquals(null, classDelta.get("remainingOperations"));
        } else {
            assertTrue(longValue(classDelta, "remainingOperations") >= 0);
        }

        Map<String, Object> heap = objectValue(sample, "heapUsedBytes");
        for (String key : List.of(
            "beforeFixture", "afterFixture", "afterInitialization",
            "afterFirstOperation", "afterAllOperations"
        )) {
            assertTrue(key, longValue(heap, key) >= 0);
        }

        Map<String, Object> classes = objectValue(sample, "loadedClassesAfter");
        for (String key : List.of("fixture", "initialization", "firstOperation", "allOperations")) {
            assertTrue(key, longValue(classes, key) > 0);
        }
    }

    private static void verifySampleMetadata(
        Map<String, Object> sample,
        Set<Long> planIndexes
    ) {
        Map<String, Object> metadata = objectValue(sample, "sample");
        long index = longValue(metadata, "planIndex");
        assertTrue(index >= 0 && index < 16);
        planIndexes.add(index);
        assertEquals(0L, longValue(metadata, "repetition"));
        assertEquals(314159L, longValue(metadata, "randomizationSeed"));
    }

    private static void verifyDerivedMetrics(Map<String, Object> sample, int count) {
        Map<String, Object> timing = objectValue(sample, "timingNs");
        Map<String, Object> derived = objectValue(sample, "derivedNs");
        double amortized = numberValue(
            derived,
            "amortizedInitializationPlusOperationsPerOp"
        ).doubleValue();
        assertEquals(
            (double) longValue(timing, "initializationPlusOperations") / count,
            amortized,
            0.0
        );
        if (count == 1) {
            assertEquals(null, derived.get("remainingPerOperation"));
        } else {
            assertEquals(
                (double) longValue(timing, "remainingOperations") / (count - 1),
                numberValue(derived, "remainingPerOperation").doubleValue(),
                0.0
            );
        }
    }

    private static void verifyMetadata(
        Path path,
        Map<String, String> expectedChildJvmIdentity
    ) throws Exception {
        Map<String, Object> metadata = ColdBenchmarkMain.Json.parseObject(Files.readString(path));
        assertEquals(Boolean.TRUE, metadata.get("freshJvmPerSample"));
        assertEquals(1L, longValue(metadata, "samplesPerCell"));
        assertEquals(16L, longValue(metadata, "totalSamples"));
        assertEquals(314159L, longValue(metadata, "randomizationSeed"));
        assertEquals(LIBRARIES, metadata.get("libraries"));
        assertEquals(OPERATIONS, metadata.get("operations"));
        assertEquals(List.of(1L, 10L), metadata.get("counts"));
        assertEquals("ProcessBuilder.start through child process exit", metadata.get("externalWallDefinition"));
        assertEquals(expectedChildJvmIdentity, objectValue(metadata, "childJvmIdentity"));

        Map<String, List<Path>> expectedClasspaths = readCatalog();
        Map<String, Object> artifacts = objectValue(metadata, "childClasspathArtifacts");
        for (String library : LIBRARIES) {
            Object rawArtifacts = artifacts.get(library);
            assertTrue(rawArtifacts instanceof List<?>);
            List<?> libraryArtifacts = (List<?>) rawArtifacts;
            List<Path> expectedFiles = expectedClasspaths.get(library);
            assertEquals(expectedFiles.size(), libraryArtifacts.size());
            for (int index = 0; index < expectedFiles.size(); index++) {
                Object rawArtifact = libraryArtifacts.get(index);
                assertTrue(rawArtifact instanceof Map<?, ?>);
                @SuppressWarnings("unchecked")
                Map<String, Object> artifact = (Map<String, Object>) rawArtifact;
                Path expectedFile = expectedFiles.get(index);
                assertEquals(expectedFile.getFileName().toString(), artifact.get("file"));
                assertEquals(sha256(expectedFile), artifact.get("sha256"));
            }
        }
    }

    private static Map<String, String> jvmIdentity(Map<String, Object> sample) {
        Map<String, String> result = new LinkedHashMap<>();
        for (String field : List.of("jvmVersion", "javaVendor", "javaVmName", "javaHome")) {
            String value = stringValue(sample, field);
            assertFalse(field + " is blank", value.isBlank());
            result.put(field, value);
        }
        return result;
    }

    private static String sha256(Path path) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (InputStream input = Files.newInputStream(path)) {
            byte[] buffer = new byte[16 * 1_024];
            int read;
            while ((read = input.read(buffer)) != -1) {
                digest.update(buffer, 0, read);
            }
        }
        return HexFormat.of().formatHex(digest.digest());
    }

    private static void verifySummary(Path path) throws Exception {
        List<List<String>> lines = Files.readAllLines(path, StandardCharsets.UTF_8).stream()
            .map(ColdJvmIntegrationTest::parseCsvLine)
            .toList();
        assertEquals(17, lines.size());

        List<String> header = lines.getFirst();
        Set<String> groups = new HashSet<>();
        for (List<String> values : lines.subList(1, lines.size())) {
            Map<String, String> row = zip(header, values);
            groups.add(
                row.get("library") + "/" + row.get("operation") + "/" + row.get("operationCount")
            );
            assertEquals("1", row.get("samples"));

            for (Map.Entry<String, String> entry : row.entrySet()) {
                if (!entry.getKey().endsWith(".p50") || entry.getValue().isEmpty()) {
                    continue;
                }
                String metric = entry.getKey().substring(0, entry.getKey().length() - 4);
                assertEquals(entry.getValue(), row.get(metric + ".p90"));
                assertEquals(entry.getValue(), row.get(metric + ".min"));
                assertEquals(entry.getValue(), row.get(metric + ".max"));
            }
        }
        assertEquals(16, groups.size());
    }

    private static Map<String, List<Path>> readCatalog() throws Exception {
        Path path = catalogPath();
        Properties properties = new Properties();
        try (InputStream input = Files.newInputStream(path)) {
            properties.load(input);
        }

        Map<String, List<Path>> result = new LinkedHashMap<>();
        for (String library : LIBRARIES) {
            String encoded = properties.getProperty(library);
            assertNotNull("missing classpath for " + library, encoded);
            List<Path> entries = List.of(encoded.split(",")).stream()
                .map(String::trim)
                .filter(name -> !name.isEmpty())
                .map(name -> path.getParent().resolve(name).toAbsolutePath().normalize())
                .toList();
            result.put(library, entries);
        }
        return result;
    }

    private static Path catalogPath() {
        String configured = System.getProperty("jjb.cold.classpathFile");
        assertNotNull("Gradle must provide jjb.cold.classpathFile", configured);
        Path path = Path.of(configured).toAbsolutePath().normalize();
        assertTrue("missing classpath catalog: " + path, Files.isRegularFile(path));
        return path;
    }

    private static void assertContainsTargetLibrary(String library, List<String> names) {
        assertTrue(
            library + " classpath does not contain its implementation: " + names,
            names.stream().anyMatch(name -> isLibraryJar(library, name))
        );
    }

    private static boolean isLibraryJar(String library, String name) {
        return switch (library) {
            case "kotlinx" -> name.startsWith("kotlinx-serialization-json-");
            case "jackson" -> name.startsWith("jackson-databind-");
            case "gson" -> name.startsWith("gson-");
            case "fory" -> name.startsWith("fory-json-");
            default -> throw new IllegalArgumentException(library);
        };
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Object> objectValue(Map<String, Object> object, String key) {
        Object value = object.get(key);
        assertTrue("expected object at " + key + ", got " + value, value instanceof Map<?, ?>);
        return (Map<String, Object>) value;
    }

    private static Number numberValue(Map<String, Object> object, String key) {
        Object value = object.get(key);
        assertTrue("expected number at " + key + ", got " + value, value instanceof Number);
        return (Number) value;
    }

    private static long longValue(Map<String, Object> object, String key) {
        return numberValue(object, key).longValue();
    }

    private static String stringValue(Map<String, Object> object, String key) {
        Object value = object.get(key);
        assertTrue("expected string at " + key + ", got " + value, value instanceof String);
        return (String) value;
    }

    private static Map<String, String> zip(List<String> header, List<String> values) {
        assertEquals(header.size(), values.size());
        Map<String, String> row = new LinkedHashMap<>();
        for (int index = 0; index < header.size(); index++) {
            row.put(header.get(index), values.get(index));
        }
        return row;
    }

    private static List<String> parseCsvLine(String line) {
        List<String> values = new ArrayList<>();
        StringBuilder value = new StringBuilder();
        boolean quoted = false;
        for (int index = 0; index < line.length(); index++) {
            char character = line.charAt(index);
            if (character == '"') {
                if (quoted && index + 1 < line.length() && line.charAt(index + 1) == '"') {
                    value.append('"');
                    index++;
                } else {
                    quoted = !quoted;
                }
            } else if (character == ',' && !quoted) {
                values.add(value.toString());
                value.setLength(0);
            } else {
                value.append(character);
            }
        }
        assertFalse("unterminated CSV quote", quoted);
        values.add(value.toString());
        return values;
    }
}
