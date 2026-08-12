[![Java CI](https://github.com/fabienrenaud/java-json-benchmark/actions/workflows/gradle.yml/badge.svg)](https://github.com/fabienrenaud/java-json-benchmark/actions/workflows/gradle.yml)

# Benchmark of Java JSON libraries

## Purpose

This project benchmarks the throughput performance of a variety of Java Json libraries
using [JMH](http://openjdk.java.net/projects/code-tools/jmh/).
It covers the following libraries:

* [antons](https://github.com/antonsjava/json)
* [avaje-jsonb](https://github.com/avaje/avaje-jsonb)
* [boon](https://github.com/boonproject/boon)
* [djomo](https://github.com/alexvigdor/djomo-core)
* [dsl-json](https://github.com/ngs-doo/dsl-json)
* [fastjson](https://github.com/alibaba/fastjson)
* [flexjson](http://flexjson.sourceforge.net/)
* [fory-json](https://fory.apache.org/docs/json/)
* [genson](https://owlike.github.io/genson/)
* [gson](https://github.com/google/gson)
* [jackson](https://github.com/FasterXML/jackson)
* [jakarta-json](https://jakarta.ee/specifications/jsonp/)
* [jodd-json](https://github.com/oblac/jodd)
* [johnzon](http://johnzon.apache.org/)
* [json-io](https://github.com/jdereg/json-io)
* [json-simple](https://code.google.com/archive/p/json-simple/)
* [json-smart](http://netplex.github.io/json-smart/)
* [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization)
* [logansquare](https://github.com/bluelinelabs/LoganSquare)
* [minimal-json](https://github.com/ralfstx/minimal-json)
* [mjson](https://github.com/bolerio/mjson)
* [moshi](https://github.com/square/moshi)
* [nanojson](https://github.com/mmastrac/nanojson)
* [org.json](https://github.com/stleary/JSON-java)
* [purejson](https://senthilganeshs.github.io/jsonp/)
* [qson](https://github.com/quarkusio/qson)
* [Quickbuf JSON](https://github.com/HebiRobotics/QuickBuffers)
* [tapestry](https://tapestry.apache.org/json.html)
* [underscore-java](https://github.com/javadev/underscore-java)
* [wast](https://github.com/wycst)
* [yasson](https://github.com/eclipse-ee4j/yasson)

When available, both databinding and 'stream' (custom packing and unpacking) implementations are tested.
Two different kinds of [models](/src/main/java/com/github/fabienrenaud/jjb/model/) are evaluated with payloads of 1, 10,
100 and 1000 KB size:

* [`Users`](/src/main/java/com/github/fabienrenaud/jjb/model/Users.java): uses primitive types, String, List and simple
  POJOs; and
* [`Clients`](/src/main/java/com/github/fabienrenaud/jjb/model/Clients.java): adds arrays, enum, UUID, LocalDate

Because kotlinx.serialization generates serializers for Kotlin classes rather than the benchmark's Java beans, its
adapter uses structurally equivalent `@Serializable` Kotlin DTOs. Fixture conversion happens during JMH setup,
outside the measured serialization and deserialization methods.

This benchmark is written to:

* randomly generate payloads upon static loading of the JVM/benchmark; the *seed* is also shared across runs
* read data from RAM
* write data to reusable output streams (when possible); this reduces allocation pressure
* consume all output streams; to avoid dead code elimination optimization

Not evaluated are: RAM utilization, compression, payloads > 1 MB.

## Results

The benchmarks are written with [JMH](http://openjdk.java.net/projects/code-tools/jmh/) and for Java 25.

The results below were computed on August 12, 2026 with the following libraries and versions:

| Library              | Version    |
|----------------------|------------|
| antons               | 1.17       |
| avaje-jsonb          | 1.11       |
| boon                 | 0.34       |
| djomo                | 0.9.4      |
| dsl-json             | 2.0.2      |
| fastjson             | 2.0.57     |
| flexjson             | 3.3        |
| Fory JSON            | 1.6.0      |
| genson               | 1.6        |
| gson                 | 2.11.0     |
| jackson              | 2.17.1     |
| jodd                 | 6.0.3      |
| johnzon              | 2.0.1      |
| jakarta-json         | 2.1.3      |
| json-io              | 4.102.0    |
| json-simple          | 1.1.1      |
| json-smart           | 2.5.1      |
| Kotlin               | 2.4.10     |
| kotlinx.serialization | 1.11.0    |
| logansquare          | 1.3.7      |
| minimal-json         | 0.9.5      |
| mjson                | 1.4.1      |
| moshi                | 1.15.1     |
| nanojson             | 1.9        |
| org.json             | 20240303   |
| purejson             | 1.0.1      |
| qson                 | 1.1.1      |
| Quickbuf JSON        | 1.4        |
| tapestry             | 5.8.6      |
| underscore           | 1.101      |
| wast                 | 0.0.29.1   |
| yasson               | 3.0.3      |

The charts show normalized throughput in nominal MiB/s and rank the top 20 entries by the 1000 KB result,
while always retaining kotlinx.serialization. The complete data is available in the checked-in
[Users deserialization][csv-users-deser], [Users serialization][csv-users-ser],
[Clients deserialization][csv-clients-deser], and [Clients serialization][csv-clients-ser] CSV files,
as well as the [JMH summary tables and captured failure output][jmh-results].
[Previous runs are archived here](/archive/all-runs.md).

Boon 0.34 produced no scores on JDK 25: its `FastStringUtils` initialization fails with a
`ClassCastException`. It remains in the version table because it is part of the benchmark suite, but it is omitted
from the charts and CSV data. The archived JMH output preserves the failure details.

kotlinx.serialization's `Clients` output is semantically equivalent but not always byte-for-byte identical to
Jackson's: `OffsetDateTime.toString()` can pad fractional seconds. Reported MiB/s uses the nominal fixture size,
not the emitted byte count; for the seeded fixtures, the kotlinx output is at most about 0.06% longer.

### `Users` model

Uses: primitive types, String, List and simple POJOs

**Deserialization performance**
![json deserialization performance for primitive types, String, List and simple POJOs][graph-users-deser]

**Serialization performance**
![json serialization performance for primitive types, String, List and simple POJOs][graph-users-ser]

### `Clients` model

Uses: primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate

Note: fewer libraries are tested with this model due to lack of support for some of the evaluated types.

**Deserialization performance**
![json deserialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][graph-clients-deser]

**Serialization performance**
![json serialization performance for primitive types, String, List and simple POJOs, arrays, enum, UUID, LocalDate][graph-clients-ser]

### Benchmark configuration

Tests were run on a dedicated Debian 13 virtual machine under KVM with an AMD Ryzen 7 7700X
(8 cores/16 threads) and 31 GiB RAM, using BellSoft Liberica JDK 25.0.4+9-LTS. The benchmark seed was
fixed at `20260811`.

JMH info:

```
# JMH version: 1.35
# VM version: JDK 25.0.4, OpenJDK 64-Bit Server VM, 25.0.4+9-LTS
# VM invoker: $SDKMAN_DIR/candidates/java/25.0.4-librca/bin/java
# VM options: -Xms2g -Xmx2g --add-opens=java.base/java.time=ALL-UNNAMED --add-modules=jdk.incubator.vector
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 1 iterations, 5 s each
# Measurement: 3 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 15 threads, will synchronize iterations
# Forks: 2
# Benchmark mode: Throughput, ops/time
```

## Run

### Local run

Prerequisites:

* JDK 25; and JAVA_HOME set.
* Bash (for `./run-everything`)
* [uv](https://docs.astral.sh/uv/) (only when regenerating CSV and chart artifacts)

By default, running `./run ser` (`./run deser` respectively) will run
all -- stream and databind -- serialization (deserialization respectively)
benchmarks with 1 KB payloads of _Users_.

You can also specify which libs, apis, payload-sizes and number of
iterations (and more) you want to run. For example:

    ./run deser --apis stream --libs genson,jackson
    ./run ser --apis databind,stream --libs jackson
    ./run deser --apis stream --libs dsljson,jackson --size 10 --datatype users

Type `./run help ser` or `./run help deser` to print help for those
commands.

If you wish to run _all_ benchmarks used to generate the reports above,
you can run `SEED=20260811 ./run-everything`. This takes about two hours on the hardware above, so
be patient.

After all 16 JMH runs finish, regenerate the checked-in report artifacts with:

```sh
uv run output/toCsv.py \
    --input-dir output \
    --output-dir archive/csv/2026-08-12 \
    --strict \
    --expected-seed 20260811 \
    --allow-failure boon &&
(cd output && RUN_DATE=2026-08-12 EXPECTED_SEED=20260811 ./toMd.sh) \
    > archive/raw-results-2026-08-12.md.tmp &&
mv archive/raw-results-2026-08-12.md.tmp archive/raw-results-2026-08-12.md &&
uv run output/toCharts.py \
    --input-dir archive/csv/2026-08-12 \
    --output-dir archive/charts/2026-08-12 \
    --date 2026-08-12
```

Strict CSV conversion rejects missing files, mixed seeds, incomplete result series, unexpected benchmark sets,
and any JMH failure other than the explicitly acknowledged Boon incompatibility.

### Cold-JVM run

The JMH suite measures warmed throughput. For applications that perform only a
few JSON operations, the separate cold harness starts a new JVM for every sample
and reports process startup, library initialization, the first operation, and
the remaining operations independently.

It is packaged as a second Gradle application entry point:

```sh
./gradlew installDist
build/install/java-json-benchmark/bin/cold-benchmark \
    --samples 1 --counts 1 --output build/reports/cold-jvm/smoke
```

In the August 12, 2026 phase-one run (30 fresh JVMs per cell, common
2-KiB Kotlin model), the median initialization-plus-first-operation time was:

| Library | Serialize | Deserialize |
|---------|----------:|------------:|
| kotlinx.serialization | 13.37 ms | 12.92 ms |
| Gson | 39.54 ms | 38.73 ms |
| Jackson | 114.17 ms | 134.03 ms |
| Fory JSON | 122.97 ms | 125.39 ms |

See [Cold-JVM benchmark methodology](docs/cold-jvm-benchmark.md) before
interpreting these figures. The [raw samples][cold-samples],
[metadata][cold-metadata], and [complete summary][cold-summary] are checked in.
Use
`--no-default-jvm-args` followed by repeatable `--jvm-arg` options when the
child JVM should use a production profile instead of the built-in Serial GC
profile.

## Run on Docker

You can use Docker if you wish to reproduce the consistent environment
or to run benchmarks in a separate safe environment.

Prerequisites:

* Docker

Build and run:

    docker build -t java-json-benchmark:latest .
    docker run --rm -it java-json-benchmark:latest ./run deser

## Run on AWS

Prerequisites:

* JDK 25; and JAVA_HOME set.
* make
* [packer](https://www.packer.io/)
* [awscli](https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html) and configured
  via `aws configure`

Then, simply run:

```
make packer
```

## Contribute

Any help to improve the existing benchmarks or write ones for other
libraries is welcome.

Adding a JSON library to the benchmark requires little work and you can
find numerous examples in the commit history. For instance:

* Addition of moshi: https://github.com/fabienrenaud/java-json-benchmark/commit/6af2c0a7091b12a9dc768e49499682b97ea57ff6
* Addition of jodd: https://github.com/fabienrenaud/java-json-benchmark/commit/288a4e61496588ed4c0a80e1f107f34f9a2c985c
* Addition of
  json-simple: https://github.com/fabienrenaud/java-json-benchmark/commit/1e1e559c39a6eddc3dd7d7cea777fc7861415469

Pull requests are welcome.


[jmh-results]: /archive/raw-results-2026-08-12.md
[csv-users-deser]: /archive/csv/2026-08-12/users-deser-1.csv
[csv-users-ser]: /archive/csv/2026-08-12/users-ser-1.csv
[csv-clients-deser]: /archive/csv/2026-08-12/clients-deser-1.csv
[csv-clients-ser]: /archive/csv/2026-08-12/clients-ser-1.csv
[graph-users-deser]: /archive/charts/2026-08-12/2026-08-12-users-deser.png
[graph-users-ser]: /archive/charts/2026-08-12/2026-08-12-users-ser.png
[graph-clients-deser]: /archive/charts/2026-08-12/2026-08-12-clients-deser.png
[graph-clients-ser]: /archive/charts/2026-08-12/2026-08-12-clients-ser.png
[cold-metadata]: /archive/cold-jvm/2026-08-12/metadata.json
[cold-samples]: /archive/cold-jvm/2026-08-12/samples.jsonl
[cold-summary]: /archive/cold-jvm/2026-08-12/summary.csv
