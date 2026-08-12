# Apache Fory was 9.7× slower than kotlinx.serialization on a cold JVM—and up to 8.25× faster after warmup

Most JSON benchmarks answer a useful but specific question: how fast is a library after initialization and JIT warmup?

I wanted to measure a different workload: a CLI, job, function, or short-lived process that performs only 1–100 JSON operations.

I added a fresh-JVM benchmark track to `java-json-benchmark`, alongside its existing warmed JMH suite.

The short version: there is no universal winner. In this experiment, kotlinx.serialization had the lowest cold cost, while Apache Fory delivered much higher warmed throughput.

## Fresh-JVM results

Each sample launches a new JVM. These are median initialization-plus-first-operation times; complete process wall time is in parentheses.

| Library | Serialize | Deserialize |
|---|---:|---:|
| kotlinx.serialization | 13.37 ms (77.91 ms) | 12.92 ms (77.05 ms) |
| Gson | 39.54 ms (105.77 ms) | 38.73 ms (104.72 ms) |
| Jackson | 114.17 ms (178.83 ms) | 134.03 ms (198.16 ms) |
| Apache Fory JSON | 122.97 ms (857.80 ms) | 125.39 ms (858.67 ms) |

Fory's roughly 850 ms process lifetime is reproducible, while its measured initialization and operation phases take roughly 123–147 ms. The benchmark locates the extra time outside those phases, but does not yet explain it.

## Warmed JMH results

For nominal 1000 KB payloads, aggregate throughput across 15 threads was:

| Workload | Fory | kotlinx | Ratio |
|---|---:|---:|---:|
| Users serialization | 22,304 ops/s | 3,885 ops/s | 5.74× |
| Users deserialization | 8,228 ops/s | 3,032 ops/s | 2.71× |
| Clients serialization | 21,356 ops/s | 3,110 ops/s | 6.87× |
| Clients deserialization | 9,929 ops/s | 1,204 ops/s | 8.25× |

Generated serializers therefore appear especially attractive for short-lived Kotlin applications, but Fory is considerably faster once the JVM is warm.

## Methodology

Cold run:

- 30 fresh JVMs per cell
- 4 libraries × 2 operations × 3 batch sizes
- 720 JVM processes total
- batches of 1, 10, and 100 operations
- seeded blocked randomization
- common 2,142-byte Users-like Kotlin object graph
- `-Xms64m -Xmx64m -XX:+UseSerialGC`

Warmed run:

- JMH 1.35
- 15 threads
- 2 forks
- one 5-second warmup iteration
- three 1-second measurement iterations
- nominal payloads from 1 to 1000 KB

Both ran on Liberica JDK 25.0.4, Debian 13/KVM, and an AMD Ryzen 7 7700X.

## Important limitations

The cold track uses one common mutable `@Serializable` Kotlin DTO. Consequently, even Jackson, Gson, and Fory children include Kotlin stdlib and `kotlinx-serialization-core`. This is a common-application-model comparison, not minimal Java-only startup footprint.

It currently covers only a Users-like 2 KiB graph. It does not yet include the Clients model with UUID, BigDecimal, and date/time adapters. "Fresh JVM" also does not mean cold filesystem or artifact caches.

Everything published here:

- [Pull request and implementation](https://github.com/Heapy/java-json-benchmark/pull/1)
- [Cold-JVM methodology](https://github.com/Heapy/java-json-benchmark/blob/c7fc2ca7a46b86ef698d8bcbafed581f7d76582c/docs/cold-jvm-benchmark.md)
- [720 cold samples](https://github.com/Heapy/java-json-benchmark/blob/c7fc2ca7a46b86ef698d8bcbafed581f7d76582c/archive/cold-jvm/2026-08-12/samples.jsonl)
- [Processed JMH tables](https://github.com/Heapy/java-json-benchmark/blob/c7fc2ca7a46b86ef698d8bcbafed581f7d76582c/archive/raw-results-2026-08-12.md)
- [Charts](https://github.com/Heapy/java-json-benchmark/tree/c7fc2ca7a46b86ef698d8bcbafed581f7d76582c/archive/charts/2026-08-12)

I would especially appreciate feedback on:

1. Should cold benchmarks prioritize internal initialization time, full process wall time, or both?
2. Which library should be added next: DSL-JSON, Fastjson2, Avaje JSONB, Moshi, or something else?
3. Has anyone profiled a similar Fory gap between completed work and JVM exit?
4. Which JVM profiles would be most useful next: G1, ZGC, CDS/AppCDS, or native image?
