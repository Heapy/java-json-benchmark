package com.github.fabienrenaud.jjb.cold;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ColdBenchmarkMainTest {

    @Test
    public void defaultsCoverAllColdCells() {
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs();

        assertEquals(30, config.samples());
        assertEquals(List.of(1, 10, 100), config.counts());
        assertEquals(List.of("kotlinx", "jackson", "gson", "fory"), config.libraries());
        assertEquals(List.of("serialize", "deserialize"), config.operations());
        assertEquals(720, ColdBenchmarkMain.createPlan(config).size());
        assertEquals(ColdBenchmarkMain.DEFAULT_JVM_ARGS, config.jvmArgs());
        assertTrue(config.defaultJvmArgsEnabled());
        assertTrue(config.validate());
    }

    @Test
    public void defaultJvmArgsCanBeDisabledAndReplaced() {
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs(
            "--no-default-jvm-args",
            "--jvm-arg", "-Xms96m",
            "--jvm-arg", "-Xmx96m",
            "--jvm-arg", "-XX:+UseG1GC"
        );

        assertFalse(config.defaultJvmArgsEnabled());
        assertEquals(
            List.of("-Xms96m", "-Xmx96m", "-XX:+UseG1GC"),
            config.jvmArgs()
        );
    }

    @Test
    public void listOptionsAcceptSpacesAndCommasAndRemoveDuplicates() {
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs(
            "--samples", "2",
            "--counts", "1,10", "100", "10",
            "--libraries", "gson,kotlinx", "gson",
            "--operations", "deserialize",
            "--pause-ms", "0",
            "--no-validate"
        );

        assertEquals(List.of(1, 10, 100), config.counts());
        assertEquals(List.of("gson", "kotlinx"), config.libraries());
        assertEquals(List.of("deserialize"), config.operations());
        assertEquals(12, ColdBenchmarkMain.createPlan(config).size());
        assertEquals(0, config.pauseMillis());
        assertFalse(config.validate());
    }

    @Test
    public void shuffleIsDeterministicForASeed() {
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs(
            "--samples", "3",
            "--seed", "42"
        );

        assertEquals(
            ColdBenchmarkMain.createPlan(config),
            ColdBenchmarkMain.createPlan(config)
        );

        ColdBenchmarkMain.Config anotherSeed = ColdBenchmarkMain.parseArgs(
            "--samples", "3",
            "--seed", "43"
        );
        assertFalse(
            ColdBenchmarkMain.createPlan(config).equals(
                ColdBenchmarkMain.createPlan(anotherSeed)
            )
        );
    }

    @Test
    public void planIsBalancedByCellAndRepetition() {
        ColdBenchmarkMain.Config config = ColdBenchmarkMain.parseArgs(
            "--samples", "3",
            "--counts", "1", "10",
            "--libraries", "kotlinx", "gson",
            "--operations", "serialize", "deserialize",
            "--seed", "17"
        );

        List<ColdBenchmarkMain.PlanEntry> plan = ColdBenchmarkMain.createPlan(config);
        assertEquals(24, plan.size());

        Map<String, Long> cellSizes = plan.stream().collect(Collectors.groupingBy(
            entry -> entry.library() + "/" + entry.operation() + "/" + entry.count(),
            Collectors.counting()
        ));
        assertEquals(8, cellSizes.size());
        assertTrue(cellSizes.values().stream().allMatch(size -> size == 3));

        Set<String> expectedCells = Set.of(
            "kotlinx/serialize/1",
            "kotlinx/serialize/10",
            "kotlinx/deserialize/1",
            "kotlinx/deserialize/10",
            "gson/serialize/1",
            "gson/serialize/10",
            "gson/deserialize/1",
            "gson/deserialize/10"
        );
        for (int repetition = 0; repetition < config.samples(); repetition++) {
            List<ColdBenchmarkMain.PlanEntry> block = plan.subList(
                repetition * expectedCells.size(),
                (repetition + 1) * expectedCells.size()
            );
            assertEquals(
                Set.of(repetition),
                block.stream().map(ColdBenchmarkMain.PlanEntry::repetition).collect(Collectors.toSet())
            );
            assertEquals(
                expectedCells,
                block.stream().map(entry ->
                    entry.library() + "/" + entry.operation() + "/" + entry.count()
                ).collect(Collectors.toSet())
            );
        }

        Set<Integer> repetitions = plan.stream()
            .map(ColdBenchmarkMain.PlanEntry::repetition)
            .collect(Collectors.toSet());
        assertEquals(Set.of(0, 1, 2), repetitions);
    }

    @Test
    public void rejectsUnsupportedCountsAndEmptyLists() {
        assertThrows(
            IllegalArgumentException.class,
            () -> ColdBenchmarkMain.parseArgs("--counts", "2")
        );
        assertThrows(
            IllegalArgumentException.class,
            () -> ColdBenchmarkMain.parseArgs("--libraries", "--samples", "1")
        );
    }

    @Test
    public void jsonRoundTripPreservesNestedValuesAndEscapes() {
        Map<String, Object> original = new LinkedHashMap<>();
        original.put("message", "comma, quote \" and newline\n");
        original.put("nested", Map.of("count", 7L, "enabled", true));
        original.put("nullable", null);

        String encoded = ColdBenchmarkMain.Json.stringify(original);
        Map<String, Object> decoded = ColdBenchmarkMain.Json.parseObject(encoded);

        assertEquals(original, decoded);
    }

    @Test
    public void childJvmIdentityRequiresEveryFieldToBeNonBlank() {
        Map<String, Object> identity = new LinkedHashMap<>();
        identity.put("jvmVersion", "25.0.4+9-LTS");
        identity.put("javaVendor", "BellSoft");
        identity.put("javaVmName", "OpenJDK 64-Bit Server VM");
        identity.put("javaHome", "/opt/java");

        assertEquals(identity, ColdBenchmarkMain.jvmIdentity(identity));

        Map<String, Object> blankVmName = new LinkedHashMap<>(identity);
        blankVmName.put("javaVmName", " ");
        assertThrows(
            IllegalStateException.class,
            () -> ColdBenchmarkMain.jvmIdentity(blankVmName)
        );

        Map<String, Object> missingVendor = new LinkedHashMap<>(identity);
        missingVendor.remove("javaVendor");
        assertThrows(
            IllegalStateException.class,
            () -> ColdBenchmarkMain.jvmIdentity(missingVendor)
        );
    }

    @Test
    public void percentilesUseMedianAndNearestRank() {
        List<Double> values = List.of(9.0, 1.0, 5.0, 3.0);

        assertEquals(4.0, ColdBenchmarkMain.p50(values), 0.0);
        assertEquals(9.0, ColdBenchmarkMain.p90(values), 0.0);
        assertEquals(5.0, ColdBenchmarkMain.p50(List.of(9.0, 1.0, 5.0)), 0.0);
        assertThrows(IllegalArgumentException.class, () -> ColdBenchmarkMain.p50(List.of()));
        assertThrows(IllegalArgumentException.class, () -> ColdBenchmarkMain.p90(List.of()));
    }

}
