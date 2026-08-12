# Cold-JVM benchmark

The cold-JVM harness measures a small batch in a brand-new JVM. It complements
the JMH throughput suite; it does not replace it.

## Run

The project already uses Gradle's `application` plugin. `run` continues to use
`com.github.fabienrenaud.jjb.Cli`. The cold harness adds a second application
entry point named `cold-benchmark`.

Build a portable application distribution and run a one-sample smoke test:

```sh
./gradlew installDist
build/install/java-json-benchmark/bin/cold-benchmark \
    --samples 1 \
    --counts 1 \
    --output build/reports/cold-jvm/smoke
```

The equivalent Gradle task accepts arguments through `coldArgs`:

```sh
./gradlew coldBenchmark \
    -PcoldArgs='--samples 1 --counts 1 --output build/reports/cold-jvm/smoke'
```

With no arguments, the coordinator runs 30 fresh JVMs for every combination of:

- `kotlinx`, `jackson`, `gson`, and `fory`;
- serialization and deserialization; and
- batches of 1, 10, and 100 operations.

That is 720 measured child processes. Use `--help` for filters, the shuffle
seed, child JVM arguments, timeouts, and output location.

By default, every child uses the reproducible built-in JVM profile
`-Xms64m -Xmx64m -XX:+UseSerialGC` plus fixed UTF-8/en-US system properties.
`--jvm-arg` appends an argument to that profile. To measure a production JVM
configuration without inheriting those defaults, disable the profile and supply
the complete replacement explicitly:

```sh
build/install/java-json-benchmark/bin/cold-benchmark \
    --no-default-jvm-args \
    --jvm-arg -Xms256m \
    --jvm-arg -Xmx256m \
    --jvm-arg -XX:+UseG1GC
```

## What is measured

One child process executes exactly one
`library × serialize|deserialize × 1|10|100` tuple. It records these phases
separately:

- common fixture construction;
- selected-library loading and mapper/`Json` construction;
- the first operation, including type discovery and generated serializer load;
- the remaining 0, 9, or 99 operations;
- bytes allocated by the main thread in each phase;
- loaded-class deltas and heap-used snapshots; and
- external wall time from starting `java` until that process exits.

The coordinator randomizes the complete cell matrix inside each repetition so
every time block contains one sample from every cell. It writes:

- `metadata.json`, including coordinator and child JVM identity, effective JVM
  arguments, whether the built-in profile was enabled, classpath JAR SHA-256
  hashes, and the randomization seed;
- `samples.jsonl`, one append-safe raw result per fresh JVM;
- `samples.csv`, the flattened raw samples; and
- `summary.csv`, p50, p90, minimum, and maximum by cell.

Each operation contributes to a checksum and a volatile sink. Before measured
samples, an unrecorded fresh process validates canonical-input parsing and a
full round trip for each selected library.

## Isolation and fairness

The regular JMH setup is intentionally not reused: `JsonBench`, `JsonSource`,
and the providers eagerly initialize multiple libraries and prepare both
Jackson and kotlinx forms. That is correct for steady-state throughput but
would prewarm a cold-start experiment.

The cold harness is a separate source set and creates a minimal child classpath
for the selected library. For example, a Jackson child has no Gson, Fory, or
`kotlinx-serialization-json` JAR.

This first-phase scenario is a **common application model**, not the repository's
existing optimized adapters: all four libraries use
the same mutable, generated-serializer-capable Kotlin DTO and the same fixed
2-KiB Users-like object graph. This removes the Java-bean versus Kotlin-DTO
asymmetry and makes internal initialization/first-call comparisons useful.
Because the shared DTO is `@Serializable`, every child includes Kotlin stdlib
and `kotlinx-serialization-core`. Consequently, external process wall time is
not the minimal deployment footprint for Jackson, Gson, or Fory. A future
library-native-model track should report that question separately, never merge
its samples with this track.

It currently uses one fixed Users-like DTO. It does not yet cover the main
benchmark's `Clients` graph or its UUID, BigDecimal, and date/time adapters.
Accordingly, these results answer “cold overhead for one common Kotlin model,”
not “cold overhead of every production adapter in this repository.”

## Interpretation

- “Cold” means a fresh JVM, not a cold host, container image, or filesystem
  cache. Validation deliberately warms artifact pages for all libraries.
- Internal phases do not sum to external wall time. JVM launch, argument
  parsing, metrics setup, report formatting, stdout, and process teardown are
  visible only in the external metric.
- The operation timers include the common volatile sink and checksum used to
  make every result observable. Serialization children also construct the
  canonical fixture JSON before the selected-library phases; this common setup
  is outside the internal initialization/operation metrics but remains visible
  in external process wall time.
- Thread allocation excludes background threads. Heap-used snapshots are not a
  retained-heap measurement, and class deltas are process-wide.
- Batches up to 100 intentionally include interpreter, tiered compilation, and
  GC scheduling effects. Use at least the default 30 samples and compare p50
  and p90; do not infer production steady-state throughput from this harness.
- Keep the machine otherwise idle and repeat with production JVM arguments
  before making a deployment decision.

## August 12, 2026 results

The first-phase run used a dedicated VM (AMD Ryzen 7 7700X, Debian 13), BellSoft
Liberica 25.0.4+9-LTS, the built-in 64-MiB Serial GC profile, seed `20260812`,
and 30 fresh JVMs per cell. The fixed canonical fixture is 2,142 UTF-8 bytes.
Host and user names were removed from the published artifacts; `$SDKMAN_DIR`
replaces only the user-specific Java-home prefix.

Median internal initialization plus all requested operations:

| Operation | Library | 1 op | 10 ops | 100 ops |
|-----------|---------|-----:|-------:|--------:|
| Serialize | kotlinx.serialization | 13.37 ms | 14.40 ms | 19.35 ms |
| Serialize | Gson | 39.54 ms | 41.53 ms | 50.29 ms |
| Serialize | Jackson | 114.17 ms | 116.28 ms | 126.87 ms |
| Serialize | Fory JSON | 122.97 ms | 123.23 ms | 137.32 ms |
| Deserialize | kotlinx.serialization | 12.92 ms | 14.48 ms | 21.26 ms |
| Deserialize | Gson | 38.73 ms | 41.71 ms | 55.56 ms |
| Deserialize | Jackson | 134.03 ms | 134.77 ms | 150.93 ms |
| Deserialize | Fory JSON | 125.39 ms | 129.92 ms | 147.27 ms |

Median external process wall, which includes JVM startup and teardown as well
as all common harness work:

| Operation | Library | 1 op | 10 ops | 100 ops |
|-----------|---------|-----:|-------:|--------:|
| Serialize | kotlinx.serialization | 77.91 ms | 78.12 ms | 84.82 ms |
| Serialize | Gson | 105.77 ms | 107.24 ms | 114.59 ms |
| Serialize | Jackson | 178.83 ms | 180.70 ms | 193.14 ms |
| Serialize | Fory JSON | 857.80 ms | 848.39 ms | 865.67 ms |
| Deserialize | kotlinx.serialization | 77.05 ms | 78.42 ms | 86.36 ms |
| Deserialize | Gson | 104.72 ms | 106.32 ms | 120.11 ms |
| Deserialize | Jackson | 198.16 ms | 200.20 ms | 218.31 ms |
| Deserialize | Fory JSON | 858.67 ms | 867.37 ms | 861.62 ms |

For a single operation, median main-thread bytes allocated during library
initialization plus that operation were 1.26/1.09 MiB for kotlinx serialization/
deserialization, 2.98/2.96 MiB for Gson, 13.40/16.71 MiB for Jackson, and
12.43/12.97 MiB for Fory.

Within this common-model track, kotlinx.serialization has the lowest median cold
cost at every tested batch size. This does not establish the minimal deployment
startup cost of each library, for the classpath reasons above. Fory also shows a
large gap between its internal time (about 123–147 ms) and external process wall
(about 848–867 ms); the harness proves that the extra time occurs outside the
selected operation phases but does not attribute its cause.

The checked-in [metadata](../archive/cold-jvm/2026-08-12/metadata.json),
[720 raw samples](../archive/cold-jvm/2026-08-12/samples.jsonl),
[flattened samples](../archive/cold-jvm/2026-08-12/samples.csv), and
[complete summary](../archive/cold-jvm/2026-08-12/summary.csv) preserve the
evidence; [SHA256SUMS](../archive/cold-jvm/2026-08-12/SHA256SUMS) covers all
four generated files. Validate them, including the exact seeded block order and
classpath hashes, with:

```sh
uv run tools/validate_cold_results.py \
    archive/cold-jvm/2026-08-12 \
    --classpath-dir build/cold-benchmark/lib
```
