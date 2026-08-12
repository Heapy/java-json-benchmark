2026-08-12

# *clients* data type

## JMH: Serialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 5399658.817 | ±743788.507 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 4787452.443 | ±406219.007 | ops/s |
| djomo/databind | thrpt | 6 | 6286814.860 | ±337413.851 | ops/s |
| dsljson/databind | thrpt | 6 | 10634922.320 | ±414500.378 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 4771545.681 | ±919572.108 | ops/s |
| fastjson/databind | thrpt | 6 | 15595792.736 | ±852961.948 | ops/s |
| fastjson_features/databind | thrpt | 6 | 14928934.852 | ±2034587.318 | ops/s |
| flexjson/databind | thrpt | 6 | 4298.722 | ±738.949 | ops/s |
| foryjson/databind | thrpt | 6 | 20425357.806 | ±6091662.333 | ops/s |
| genson/databind | thrpt | 6 | 2652156.219 | ±39793.222 | ops/s |
| gson/databind | thrpt | 6 | 2902107.255 | ±59843.321 | ops/s |
| jackson/databind | thrpt | 6 | 3779175.849 | ±88699.883 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 4100151.981 | ±272871.693 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 3955351.343 | ±175873.022 | ops/s |
| jodd/databind | thrpt | 6 | 1154463.400 | ±110557.923 | ops/s |
| jsonio/databind | thrpt | 6 | 729860.015 | ±104957.098 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 3246760.415 | ±368796.472 | ops/s |
| logansquare/databind | thrpt | 6 | 4869336.881 | ±77598.535 | ops/s |
| moshi/databind | thrpt | 6 | 2316531.517 | ±131647.666 | ops/s |
| wast/databind | thrpt | 6 | 23108432.051 | ±3354559.569 | ops/s |

## JMH: Serialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 488952.314 | ±40330.681 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 458459.774 | ±43972.551 | ops/s |
| djomo/databind | thrpt | 6 | 646133.946 | ±52293.051 | ops/s |
| dsljson/databind | thrpt | 6 | 1075656.027 | ±74600.903 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 482795.727 | ±82194.597 | ops/s |
| fastjson/databind | thrpt | 6 | 1766093.466 | ±143224.248 | ops/s |
| fastjson_features/databind | thrpt | 6 | 1812571.083 | ±94408.540 | ops/s |
| flexjson/databind | thrpt | 6 | 1396.160 | ±328.279 | ops/s |
| foryjson/databind | thrpt | 6 | 2595656.227 | ±67293.919 | ops/s |
| genson/databind | thrpt | 6 | 346170.597 | ±10489.068 | ops/s |
| gson/databind | thrpt | 6 | 285083.239 | ±34313.467 | ops/s |
| jackson/databind | thrpt | 6 | 335809.377 | ±10458.875 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 342654.270 | ±32365.931 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 346941.053 | ±23123.417 | ops/s |
| jodd/databind | thrpt | 6 | 116602.799 | ±11348.125 | ops/s |
| jsonio/databind | thrpt | 6 | 217821.007 | ±21265.800 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 458599.293 | ±32948.737 | ops/s |
| logansquare/databind | thrpt | 6 | 436667.020 | ±63795.785 | ops/s |
| moshi/databind | thrpt | 6 | 217762.235 | ±8457.920 | ops/s |
| wast/databind | thrpt | 6 | 2424656.044 | ±81369.138 | ops/s |

## JMH: Serialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 43956.750 | ±2530.932 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 42942.922 | ±1987.185 | ops/s |
| djomo/databind | thrpt | 6 | 56614.809 | ±3027.116 | ops/s |
| dsljson/databind | thrpt | 6 | 99363.657 | ±5177.702 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 57486.218 | ±20671.485 | ops/s |
| fastjson/databind | thrpt | 6 | 181880.034 | ±13856.436 | ops/s |
| fastjson_features/databind | thrpt | 6 | 178329.294 | ±7526.126 | ops/s |
| flexjson/databind | thrpt | 6 | 453.784 | ±81.079 | ops/s |
| foryjson/databind | thrpt | 6 | 256069.980 | ±16850.701 | ops/s |
| genson/databind | thrpt | 6 | 33582.039 | ±2115.070 | ops/s |
| gson/databind | thrpt | 6 | 24514.257 | ±4533.335 | ops/s |
| jackson/databind | thrpt | 6 | 31217.397 | ±514.939 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 32088.733 | ±1237.490 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 34110.131 | ±2788.829 | ops/s |
| jodd/databind | thrpt | 6 | 10822.817 | ±604.530 | ops/s |
| jsonio/databind | thrpt | 6 | 22087.227 | ±1209.958 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 36084.810 | ±1383.226 | ops/s |
| logansquare/databind | thrpt | 6 | 42432.917 | ±475.580 | ops/s |
| moshi/databind | thrpt | 6 | 20580.472 | ±1760.331 | ops/s |
| wast/databind | thrpt | 6 | 248323.682 | ±27338.404 | ops/s |

## JMH: Serialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 4683.119 | ±65.681 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 4370.977 | ±245.138 | ops/s |
| djomo/databind | thrpt | 6 | 5831.138 | ±161.567 | ops/s |
| dsljson/databind | thrpt | 6 | 9661.007 | ±424.067 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 6115.343 | ±1430.664 | ops/s |
| fastjson/databind | thrpt | 6 | 15659.974 | ±207.415 | ops/s |
| fastjson_features/databind | thrpt | 6 | 15838.963 | ±390.244 | ops/s |
| flexjson/databind | thrpt | 6 | 142.824 | ±28.816 | ops/s |
| foryjson/databind | thrpt | 6 | 21355.643 | ±1457.819 | ops/s |
| genson/databind | thrpt | 6 | 3464.007 | ±66.752 | ops/s |
| gson/databind | thrpt | 6 | 2775.362 | ±74.767 | ops/s |
| jackson/databind | thrpt | 6 | 3095.817 | ±122.966 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 3195.618 | ±90.446 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 3141.819 | ±184.912 | ops/s |
| jodd/databind | thrpt | 6 | 925.955 | ±27.474 | ops/s |
| jsonio/databind | thrpt | 6 | 1843.731 | ±146.476 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 3110.311 | ±80.336 | ops/s |
| logansquare/databind | thrpt | 6 | 3986.551 | ±238.367 | ops/s |
| moshi/databind | thrpt | 6 | 2134.553 | ±41.240 | ops/s |
| wast/databind | thrpt | 6 | 19648.465 | ±2371.911 | ops/s |

## JMH: Deserialization - 1 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 2370816.986 | ±112337.892 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 1866057.443 | ±23370.688 | ops/s |
| djomo/databind | thrpt | 6 | 5154002.659 | ±173446.422 | ops/s |
| dsljson/databind | thrpt | 6 | 6427266.965 | ±728678.862 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 4457658.262 | ±581258.015 | ops/s |
| fastjson/databind | thrpt | 6 | 10124141.690 | ±415161.903 | ops/s |
| fastjson_features/databind | thrpt | 6 | 10709360.655 | ±211446.181 | ops/s |
| flexjson/databind | thrpt | 6 | 483072.526 | ±12466.642 | ops/s |
| foryjson/databind | thrpt | 6 | 12482566.232 | ±546169.915 | ops/s |
| genson/databind | thrpt | 6 | 1081695.511 | ±19573.358 | ops/s |
| gson/databind | thrpt | 6 | 1116063.559 | ±29309.520 | ops/s |
| jackson/databind | thrpt | 6 | 1514554.298 | ±50016.423 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 1602801.276 | ±74807.203 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 1617447.637 | ±16420.430 | ops/s |
| jodd/databind | thrpt | 6 | 1176950.356 | ±106829.634 | ops/s |
| jsonio/databind | thrpt | 6 | 250286.407 | ±54105.906 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 1560118.940 | ±32698.450 | ops/s |
| logansquare/databind | thrpt | 6 | 1187177.222 | ±21998.989 | ops/s |
| moshi/databind | thrpt | 6 | 1492667.431 | ±294018.184 | ops/s |
| wast/databind | thrpt | 6 | 9734410.157 | ±410008.993 | ops/s |

## JMH: Deserialization - 10 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 156473.469 | ±17006.920 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 137931.873 | ±2263.169 | ops/s |
| djomo/databind | thrpt | 6 | 575205.906 | ±18265.278 | ops/s |
| dsljson/databind | thrpt | 6 | 694332.855 | ±23390.982 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 461488.764 | ±48877.407 | ops/s |
| fastjson/databind | thrpt | 6 | 1007376.655 | ±68250.454 | ops/s |
| fastjson_features/databind | thrpt | 6 | 1026480.876 | ±11958.949 | ops/s |
| flexjson/databind | thrpt | 6 | 50134.858 | ±4236.685 | ops/s |
| foryjson/databind | thrpt | 6 | 1105016.170 | ±23813.025 | ops/s |
| genson/databind | thrpt | 6 | 110244.001 | ±32072.111 | ops/s |
| gson/databind | thrpt | 6 | 114919.482 | ±2645.107 | ops/s |
| jackson/databind | thrpt | 6 | 107299.128 | ±8906.764 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 107540.446 | ±4092.589 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 108613.506 | ±8389.085 | ops/s |
| jodd/databind | thrpt | 6 | 94267.148 | ±866.631 | ops/s |
| jsonio/databind | thrpt | 6 | 18637.673 | ±6282.490 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 116096.588 | ±10907.864 | ops/s |
| logansquare/databind | thrpt | 6 | 121381.875 | ±34496.799 | ops/s |
| moshi/databind | thrpt | 6 | 101252.319 | ±19421.744 | ops/s |
| wast/databind | thrpt | 6 | 840259.993 | ±85513.101 | ops/s |

## JMH: Deserialization - 100 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 15557.939 | ±1604.334 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 13790.947 | ±1672.197 | ops/s |
| djomo/databind | thrpt | 6 | 55355.243 | ±4648.192 | ops/s |
| dsljson/databind | thrpt | 6 | 67794.526 | ±3847.301 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 43519.829 | ±21400.102 | ops/s |
| fastjson/databind | thrpt | 6 | 97153.097 | ±4332.731 | ops/s |
| fastjson_features/databind | thrpt | 6 | 97515.982 | ±3322.524 | ops/s |
| flexjson/databind | thrpt | 6 | 4885.595 | ±162.286 | ops/s |
| foryjson/databind | thrpt | 6 | 105470.237 | ±1998.739 | ops/s |
| genson/databind | thrpt | 6 | 12637.640 | ±293.255 | ops/s |
| gson/databind | thrpt | 6 | 11638.834 | ±391.276 | ops/s |
| jackson/databind | thrpt | 6 | 10271.309 | ±214.595 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 10975.278 | ±293.499 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 10719.582 | ±245.994 | ops/s |
| jodd/databind | thrpt | 6 | 9382.857 | ±113.947 | ops/s |
| jsonio/databind | thrpt | 6 | 1934.436 | ±971.053 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 12000.713 | ±318.625 | ops/s |
| logansquare/databind | thrpt | 6 | 12727.836 | ±984.940 | ops/s |
| moshi/databind | thrpt | 6 | 10809.126 | ±1114.624 | ops/s |
| wast/databind | thrpt | 6 | 94019.843 | ±7150.183 | ops/s |

## JMH: Deserialization - 1000 KB

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 1564.893 | ±46.407 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 1414.309 | ±178.934 | ops/s |
| djomo/databind | thrpt | 6 | 5054.022 | ±330.235 | ops/s |
| dsljson/databind | thrpt | 6 | 6503.366 | ±486.618 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 3609.431 | ±1906.188 | ops/s |
| fastjson/databind | thrpt | 6 | 9059.189 | ±164.869 | ops/s |
| fastjson_features/databind | thrpt | 6 | 9008.276 | ±183.207 | ops/s |
| flexjson/databind | thrpt | 6 | 439.821 | ±14.706 | ops/s |
| foryjson/databind | thrpt | 6 | 9929.365 | ±629.312 | ops/s |
| genson/databind | thrpt | 6 | 1265.745 | ±57.352 | ops/s |
| gson/databind | thrpt | 6 | 1163.390 | ±23.086 | ops/s |
| jackson/databind | thrpt | 6 | 1073.713 | ±22.321 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 1131.009 | ±39.223 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 1126.044 | ±53.318 | ops/s |
| jodd/databind | thrpt | 6 | 901.600 | ±65.956 | ops/s |
| jsonio/databind | thrpt | 6 | 196.940 | ±31.965 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 1203.717 | ±110.437 | ops/s |
| logansquare/databind | thrpt | 6 | 1277.592 | ±23.525 | ops/s |
| moshi/databind | thrpt | 6 | 1091.902 | ±25.787 | ops/s |
| wast/databind | thrpt | 6 | 8869.966 | ±1001.295 | ops/s |

# *users* data type

## JMH: Serialization - 1 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 18 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-10"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	... 10 more



# Run progress: 6.10% complete, ETA 00:09:02
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 5045991.114 | ±2656216.359 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 6002553.610 | ±49462.906 | ops/s |
| djomo/databind | thrpt | 6 | 6925871.478 | ±123447.888 | ops/s |
| dsljson/databind | thrpt | 6 | 6609769.024 | ±890538.431 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 4289020.685 | ±2037715.806 | ops/s |
| fastjson/databind | thrpt | 6 | 13048532.351 | ±286125.693 | ops/s |
| fastjson_features/databind | thrpt | 6 | 12065878.003 | ±1135233.113 | ops/s |
| flexjson/databind | thrpt | 6 | 4267.772 | ±1326.214 | ops/s |
| foryjson/databind | thrpt | 6 | 14883740.299 | ±5450692.101 | ops/s |
| genson/databind | thrpt | 6 | 2932012.318 | ±50718.175 | ops/s |
| gson/databind | thrpt | 6 | 3261497.256 | ±743851.068 | ops/s |
| jackson/databind | thrpt | 6 | 5225323.342 | ±164100.486 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 5182478.635 | ±331370.628 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 5226054.964 | ±1012387.418 | ops/s |
| jodd/databind | thrpt | 6 | 1097225.263 | ±221970.554 | ops/s |
| johnzon/databind | thrpt | 6 | 2621770.432 | ±478580.175 | ops/s |
| jsonio/databind | thrpt | 6 | 764642.767 | ±6475.253 | ops/s |
| jsonsmart/databind | thrpt | 6 | 2212044.137 | ±776034.665 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 3326916.618 | ±47382.396 | ops/s |
| logansquare/databind | thrpt | 6 | 5671667.941 | ±388187.590 | ops/s |
| moshi/databind | thrpt | 6 | 2384846.072 | ±83936.580 | ops/s |
| qson/databind | thrpt | 6 | 4389885.318 | ±648879.159 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 10862830.348 | ±610287.425 | ops/s |
| wast/databind | thrpt | 6 | 19125496.907 | ±1801562.067 | ops/s |
| yasson/databind | thrpt | 6 | 1736985.332 | ±140922.375 | ops/s |
| antons/stream | thrpt | 6 | 780820.203 | ±42778.284 | ops/s |
| genson/stream | thrpt | 6 | 2401250.122 | ±157544.476 | ops/s |
| gson/stream | thrpt | 6 | 920116.089 | ±5181.961 | ops/s |
| jackson/stream | thrpt | 6 | 5855195.665 | ±138028.961 | ops/s |
| jakartajson/stream | thrpt | 6 | 3561429.708 | ±261337.155 | ops/s |
| jsonio/stream | thrpt | 6 | 767811.059 | ±4836.934 | ops/s |
| jsonsimple/stream | thrpt | 6 | 643433.421 | ±22692.436 | ops/s |
| minimaljson/stream | thrpt | 6 | 3325734.147 | ±281462.649 | ops/s |
| mjson/stream | thrpt | 6 | 763242.977 | ±12897.906 | ops/s |
| moshi/stream | thrpt | 6 | 2694779.776 | ±139550.694 | ops/s |
| nanojson/stream | thrpt | 6 | 2422598.802 | ±64077.479 | ops/s |
| orgjson/stream | thrpt | 6 | 1081808.508 | ±34325.897 | ops/s |
| purejson/stream | thrpt | 6 | 356744.030 | ±8569.579 | ops/s |
| tapestry/stream | thrpt | 6 | 741473.105 | ±33330.582 | ops/s |
| underscore_java/stream | thrpt | 6 | 1447232.837 | ±30539.486 | ops/s |

## JMH: Serialization - 10 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-8"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more



# Run progress: 6.10% complete, ETA 00:09:04
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-3"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 649277.695 | ±69994.005 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 688101.363 | ±5508.778 | ops/s |
| djomo/databind | thrpt | 6 | 709055.505 | ±44204.525 | ops/s |
| dsljson/databind | thrpt | 6 | 918511.464 | ±15899.608 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 420745.785 | ±127223.663 | ops/s |
| fastjson/databind | thrpt | 6 | 1456395.414 | ±101937.486 | ops/s |
| fastjson_features/databind | thrpt | 6 | 1500726.862 | ±58015.150 | ops/s |
| flexjson/databind | thrpt | 6 | 1203.416 | ±414.247 | ops/s |
| foryjson/databind | thrpt | 6 | 2167680.336 | ±277228.498 | ops/s |
| genson/databind | thrpt | 6 | 490676.799 | ±6317.501 | ops/s |
| gson/databind | thrpt | 6 | 350666.048 | ±52887.127 | ops/s |
| jackson/databind | thrpt | 6 | 613774.299 | ±37755.737 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 600570.733 | ±24112.493 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 630568.433 | ±120481.869 | ops/s |
| jodd/databind | thrpt | 6 | 120988.593 | ±2661.894 | ops/s |
| johnzon/databind | thrpt | 6 | 332723.159 | ±27920.600 | ops/s |
| jsonio/databind | thrpt | 6 | 222585.263 | ±16575.603 | ops/s |
| jsonsmart/databind | thrpt | 6 | 311598.045 | ±54689.176 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 690446.270 | ±71849.160 | ops/s |
| logansquare/databind | thrpt | 6 | 629954.873 | ±5218.412 | ops/s |
| moshi/databind | thrpt | 6 | 257131.408 | ±13011.278 | ops/s |
| qson/databind | thrpt | 6 | 485805.599 | ±45086.943 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 1066398.093 | ±61474.523 | ops/s |
| wast/databind | thrpt | 6 | 2241401.923 | ±226294.573 | ops/s |
| yasson/databind | thrpt | 6 | 236281.790 | ±2709.695 | ops/s |
| antons/stream | thrpt | 6 | 84457.175 | ±1181.085 | ops/s |
| genson/stream | thrpt | 6 | 418609.297 | ±11095.330 | ops/s |
| gson/stream | thrpt | 6 | 97587.398 | ±2410.168 | ops/s |
| jackson/stream | thrpt | 6 | 627268.989 | ±32578.633 | ops/s |
| jakartajson/stream | thrpt | 6 | 452697.221 | ±149882.594 | ops/s |
| jsonio/stream | thrpt | 6 | 249439.208 | ±24119.455 | ops/s |
| jsonsimple/stream | thrpt | 6 | 70293.923 | ±2918.146 | ops/s |
| minimaljson/stream | thrpt | 6 | 347600.602 | ±15455.948 | ops/s |
| mjson/stream | thrpt | 6 | 72588.259 | ±2904.032 | ops/s |
| moshi/stream | thrpt | 6 | 274948.599 | ±2872.801 | ops/s |
| nanojson/stream | thrpt | 6 | 366695.370 | ±5589.415 | ops/s |
| orgjson/stream | thrpt | 6 | 113828.850 | ±7318.050 | ops/s |
| purejson/stream | thrpt | 6 | 32093.333 | ±167.741 | ops/s |
| tapestry/stream | thrpt | 6 | 74991.280 | ±6752.186 | ops/s |
| underscore_java/stream | thrpt | 6 | 114241.156 | ±17799.432 | ops/s |

## JMH: Serialization - 100 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-12"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more



# Run progress: 6.10% complete, ETA 00:09:06
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-15"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 70262.109 | ±5792.610 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 68140.849 | ±2749.014 | ops/s |
| djomo/databind | thrpt | 6 | 70954.971 | ±3079.614 | ops/s |
| dsljson/databind | thrpt | 6 | 92172.700 | ±5850.790 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 47156.649 | ±17143.781 | ops/s |
| fastjson/databind | thrpt | 6 | 149811.899 | ±1592.286 | ops/s |
| fastjson_features/databind | thrpt | 6 | 153290.184 | ±3649.048 | ops/s |
| flexjson/databind | thrpt | 6 | 402.814 | ±102.990 | ops/s |
| foryjson/databind | thrpt | 6 | 228712.494 | ±21943.140 | ops/s |
| genson/databind | thrpt | 6 | 50060.030 | ±818.902 | ops/s |
| gson/databind | thrpt | 6 | 36576.935 | ±4071.925 | ops/s |
| jackson/databind | thrpt | 6 | 54066.719 | ±1556.715 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 61926.946 | ±10153.784 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 61509.933 | ±4302.770 | ops/s |
| jodd/databind | thrpt | 6 | 10305.368 | ±104.292 | ops/s |
| johnzon/databind | thrpt | 6 | 27868.835 | ±1630.770 | ops/s |
| jsonio/databind | thrpt | 6 | 20163.600 | ±1826.438 | ops/s |
| jsonsmart/databind | thrpt | 6 | 19253.631 | ±5961.199 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 37204.591 | ±3501.157 | ops/s |
| logansquare/databind | thrpt | 6 | 42211.352 | ±799.905 | ops/s |
| moshi/databind | thrpt | 6 | 25816.459 | ±3613.385 | ops/s |
| qson/databind | thrpt | 6 | 51093.171 | ±11916.144 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 107773.874 | ±5354.230 | ops/s |
| wast/databind | thrpt | 6 | 232388.128 | ±9226.901 | ops/s |
| yasson/databind | thrpt | 6 | 25101.562 | ±2756.792 | ops/s |
| antons/stream | thrpt | 6 | 7333.808 | ±318.386 | ops/s |
| genson/stream | thrpt | 6 | 45734.255 | ±1975.880 | ops/s |
| gson/stream | thrpt | 6 | 9872.801 | ±344.088 | ops/s |
| jackson/stream | thrpt | 6 | 59449.648 | ±1448.802 | ops/s |
| jakartajson/stream | thrpt | 6 | 49712.324 | ±4045.766 | ops/s |
| jsonio/stream | thrpt | 6 | 21112.914 | ±6256.172 | ops/s |
| jsonsimple/stream | thrpt | 6 | 6031.919 | ±471.855 | ops/s |
| minimaljson/stream | thrpt | 6 | 25567.454 | ±1171.923 | ops/s |
| mjson/stream | thrpt | 6 | 7089.124 | ±39.699 | ops/s |
| moshi/stream | thrpt | 6 | 29025.634 | ±732.267 | ops/s |
| nanojson/stream | thrpt | 6 | 24440.019 | ±480.142 | ops/s |
| orgjson/stream | thrpt | 6 | 10390.082 | ±691.637 | ops/s |
| purejson/stream | thrpt | 6 | 2366.067 | ±25.826 | ops/s |
| tapestry/stream | thrpt | 6 | 6804.815 | ±1498.534 | ops/s |
| underscore_java/stream | thrpt | 6 | 10731.908 | ±4505.406 | ops/s |

## JMH: Serialization - 1000 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-11"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more



# Run progress: 6.10% complete, ETA 00:09:12
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Serialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.ExceptionInInitializerError
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.Str.underBarCase(Str.java:538)
	at org.boon.core.Sys.sysProp(Sys.java:341)
	at org.boon.core.timer.TimeKeeperBasic.<init>(TimeKeeperBasic.java:52)
	at org.boon.core.Sys.<clinit>(Sys.java:182)
	... 17 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_thrpt_jmhStub(Serialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.core.reflection.Reflection
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeInstance(JsonSimpleSerializerImpl.java:601)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serializeObject(JsonSimpleSerializerImpl.java:564)
	at org.boon.json.serializers.impl.JsonSimpleSerializerImpl.serialize(JsonSimpleSerializerImpl.java:152)
	at org.boon.json.implementation.ObjectMapperImpl.writeValue(ObjectMapperImpl.java:217)
	at com.github.fabienrenaud.jjb.databind.Serialization.boon(Serialization.java:105)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Serialization_boon_jmhTest.boon_Throughput(Serialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Serialization.boon-jmh-worker-9"]
	at org.boon.core.reflection.Reflection.<clinit>(Reflection.java:122)
	... 16 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 6371.096 | ±1793.579 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 6423.441 | ±233.886 | ops/s |
| djomo/databind | thrpt | 6 | 7105.033 | ±337.026 | ops/s |
| dsljson/databind | thrpt | 6 | 9166.166 | ±91.385 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 4681.679 | ±497.306 | ops/s |
| fastjson/databind | thrpt | 6 | 14295.924 | ±897.826 | ops/s |
| fastjson_features/databind | thrpt | 6 | 14112.844 | ±146.016 | ops/s |
| flexjson/databind | thrpt | 6 | 131.299 | ±24.421 | ops/s |
| foryjson/databind | thrpt | 6 | 22303.908 | ±2883.700 | ops/s |
| genson/databind | thrpt | 6 | 5083.800 | ±253.382 | ops/s |
| gson/databind | thrpt | 6 | 3649.287 | ±596.021 | ops/s |
| jackson/databind | thrpt | 6 | 5027.155 | ±134.845 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 5530.307 | ±205.942 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 5581.537 | ±526.430 | ops/s |
| jodd/databind | thrpt | 6 | 931.156 | ±57.162 | ops/s |
| johnzon/databind | thrpt | 6 | 2847.420 | ±169.500 | ops/s |
| jsonio/databind | thrpt | 6 | 2149.240 | ±566.519 | ops/s |
| jsonsmart/databind | thrpt | 6 | 2429.194 | ±157.045 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 3884.509 | ±468.347 | ops/s |
| logansquare/databind | thrpt | 6 | 4329.087 | ±49.852 | ops/s |
| moshi/databind | thrpt | 6 | 2577.769 | ±127.835 | ops/s |
| qson/databind | thrpt | 6 | 4985.448 | ±314.170 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 10502.348 | ±842.383 | ops/s |
| wast/databind | thrpt | 6 | 20655.679 | ±834.109 | ops/s |
| yasson/databind | thrpt | 6 | 2426.052 | ±38.622 | ops/s |
| antons/stream | thrpt | 6 | 529.017 | ±27.290 | ops/s |
| genson/stream | thrpt | 6 | 4862.645 | ±197.671 | ops/s |
| gson/stream | thrpt | 6 | 965.622 | ±35.546 | ops/s |
| jackson/stream | thrpt | 6 | 5564.505 | ±97.634 | ops/s |
| jakartajson/stream | thrpt | 6 | 3860.246 | ±137.306 | ops/s |
| jsonio/stream | thrpt | 6 | 2095.348 | ±305.101 | ops/s |
| jsonsimple/stream | thrpt | 6 | 609.070 | ±36.035 | ops/s |
| minimaljson/stream | thrpt | 6 | 2187.469 | ±64.073 | ops/s |
| mjson/stream | thrpt | 6 | 554.014 | ±32.561 | ops/s |
| moshi/stream | thrpt | 6 | 2843.853 | ±53.028 | ops/s |
| nanojson/stream | thrpt | 6 | 2397.129 | ±121.486 | ops/s |
| orgjson/stream | thrpt | 6 | 974.766 | ±31.730 | ops/s |
| purejson/stream | thrpt | 6 | 48.923 | ±31.066 | ops/s |
| tapestry/stream | thrpt | 6 | 582.591 | ±22.600 | ops/s |
| underscore_java/stream | thrpt | 6 | 848.487 | ±43.364 | ops/s |

## JMH: Deserialization - 1 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-12"]
	... 15 more



# Run progress: 6.10% complete, ETA 00:09:02
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 5620844.983 | ±139486.005 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 3456887.071 | ±97979.050 | ops/s |
| djomo/databind | thrpt | 6 | 5508216.942 | ±389088.981 | ops/s |
| dsljson/databind | thrpt | 6 | 5859181.697 | ±236465.847 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 4210442.854 | ±394918.928 | ops/s |
| fastjson/databind | thrpt | 6 | 7118450.731 | ±85472.623 | ops/s |
| fastjson_features/databind | thrpt | 6 | 7292667.195 | ±67486.478 | ops/s |
| flexjson/databind | thrpt | 6 | 560570.893 | ±43597.708 | ops/s |
| foryjson/databind | thrpt | 6 | 7849507.028 | ±104118.503 | ops/s |
| genson/databind | thrpt | 6 | 1492651.555 | ±10379.610 | ops/s |
| gson/databind | thrpt | 6 | 1485481.371 | ±241594.842 | ops/s |
| jackson/databind | thrpt | 6 | 3090252.067 | ±289117.597 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 3572896.971 | ±107284.418 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 3297680.318 | ±514211.858 | ops/s |
| jodd/databind | thrpt | 6 | 1998782.530 | ±226328.591 | ops/s |
| johnzon/databind | thrpt | 6 | 1101801.868 | ±23196.452 | ops/s |
| jsonio/databind | thrpt | 6 | 326030.047 | ±114861.482 | ops/s |
| jsonsmart/databind | thrpt | 6 | 3226326.757 | ±204441.007 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 2673119.919 | ±109531.059 | ops/s |
| logansquare/databind | thrpt | 6 | 1364941.120 | ±26998.474 | ops/s |
| moshi/databind | thrpt | 6 | 2277300.887 | ±676786.395 | ops/s |
| qson/databind | thrpt | 6 | 3043398.297 | ±30643.153 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 2535645.556 | ±49905.282 | ops/s |
| wast/databind | thrpt | 6 | 7436185.893 | ±164692.002 | ops/s |
| yasson/databind | thrpt | 6 | 1356635.055 | ±11070.367 | ops/s |
| antons/stream | thrpt | 6 | 1320173.217 | ±84969.446 | ops/s |
| genson/stream | thrpt | 6 | 1520473.924 | ±23900.221 | ops/s |
| gson/stream | thrpt | 6 | 1611391.251 | ±10229.924 | ops/s |
| jackson/stream | thrpt | 6 | 3601606.638 | ±380511.349 | ops/s |
| jakartajson/stream | thrpt | 6 | 32666.944 | ±490.872 | ops/s |
| jsonio/stream | thrpt | 6 | 976519.811 | ±80102.907 | ops/s |
| jsonsimple/stream | thrpt | 6 | 448173.227 | ±15903.280 | ops/s |
| minimaljson/stream | thrpt | 6 | 1371105.149 | ±23680.930 | ops/s |
| mjson/stream | thrpt | 6 | 1034169.582 | ±28749.276 | ops/s |
| moshi/stream | thrpt | 6 | 2214748.508 | ±710962.019 | ops/s |
| nanojson/stream | thrpt | 6 | 250304.422 | ±3049.211 | ops/s |
| orgjson/stream | thrpt | 6 | 919196.238 | ±129791.327 | ops/s |
| purejson/stream | thrpt | 6 | 374183.489 | ±4569.306 | ops/s |
| tapestry/stream | thrpt | 6 | 2348661.913 | ±290273.922 | ops/s |
| underscore_java/stream | thrpt | 6 | 2379848.555 | ±94900.079 | ops/s |

## JMH: Deserialization - 10 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-7"]
	... 15 more



# Run progress: 6.10% complete, ETA 00:09:02
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-15"]
	... 15 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 600275.203 | ±20839.041 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 421482.934 | ±7244.913 | ops/s |
| djomo/databind | thrpt | 6 | 607073.549 | ±33826.642 | ops/s |
| dsljson/databind | thrpt | 6 | 674730.785 | ±17825.834 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 485618.725 | ±101048.140 | ops/s |
| fastjson/databind | thrpt | 6 | 834161.674 | ±8028.591 | ops/s |
| fastjson_features/databind | thrpt | 6 | 834120.754 | ±5829.118 | ops/s |
| flexjson/databind | thrpt | 6 | 77045.388 | ±5978.015 | ops/s |
| foryjson/databind | thrpt | 6 | 846533.506 | ±7597.548 | ops/s |
| genson/databind | thrpt | 6 | 335839.025 | ±29219.995 | ops/s |
| gson/databind | thrpt | 6 | 296495.978 | ±15702.024 | ops/s |
| jackson/databind | thrpt | 6 | 368881.122 | ±29928.029 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 424436.820 | ±53314.114 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 431416.045 | ±14586.845 | ops/s |
| jodd/databind | thrpt | 6 | 232195.321 | ±3230.282 | ops/s |
| johnzon/databind | thrpt | 6 | 141507.384 | ±8033.664 | ops/s |
| jsonio/databind | thrpt | 6 | 28684.905 | ±9125.748 | ops/s |
| jsonsmart/databind | thrpt | 6 | 387504.793 | ±11788.385 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 309776.278 | ±3092.414 | ops/s |
| logansquare/databind | thrpt | 6 | 390654.929 | ±7682.237 | ops/s |
| moshi/databind | thrpt | 6 | 289150.121 | ±5971.499 | ops/s |
| qson/databind | thrpt | 6 | 387174.469 | ±12853.261 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 314689.267 | ±2662.780 | ops/s |
| wast/databind | thrpt | 6 | 817544.660 | ±80937.907 | ops/s |
| yasson/databind | thrpt | 6 | 209107.952 | ±11052.121 | ops/s |
| antons/stream | thrpt | 6 | 142167.615 | ±3377.762 | ops/s |
| genson/stream | thrpt | 6 | 379912.807 | ±43419.246 | ops/s |
| gson/stream | thrpt | 6 | 323338.544 | ±23071.625 | ops/s |
| jackson/stream | thrpt | 6 | 445920.854 | ±5103.031 | ops/s |
| jakartajson/stream | thrpt | 6 | 27348.380 | ±3813.384 | ops/s |
| jsonio/stream | thrpt | 6 | 308706.093 | ±7369.191 | ops/s |
| jsonsimple/stream | thrpt | 6 | 111043.247 | ±5719.693 | ops/s |
| minimaljson/stream | thrpt | 6 | 228537.435 | ±4202.716 | ops/s |
| mjson/stream | thrpt | 6 | 108652.956 | ±2838.616 | ops/s |
| moshi/stream | thrpt | 6 | 281439.389 | ±12957.280 | ops/s |
| nanojson/stream | thrpt | 6 | 152136.005 | ±2524.798 | ops/s |
| orgjson/stream | thrpt | 6 | 97810.125 | ±4689.932 | ops/s |
| purejson/stream | thrpt | 6 | 43943.595 | ±1460.821 | ops/s |
| tapestry/stream | thrpt | 6 | 269052.618 | ±14142.565 | ops/s |
| underscore_java/stream | thrpt | 6 | 252232.351 | ±21213.846 | ops/s |

## JMH: Deserialization - 100 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-8"]
	... 15 more



# Run progress: 6.10% complete, ETA 00:09:04
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-11"]
	... 15 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 58730.299 | ±4952.570 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 41405.697 | ±610.006 | ops/s |
| djomo/databind | thrpt | 6 | 60071.226 | ±1486.246 | ops/s |
| dsljson/databind | thrpt | 6 | 62611.685 | ±12713.573 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 42150.195 | ±4204.737 | ops/s |
| fastjson/databind | thrpt | 6 | 84597.073 | ±932.559 | ops/s |
| fastjson_features/databind | thrpt | 6 | 83335.209 | ±4178.038 | ops/s |
| flexjson/databind | thrpt | 6 | 7297.806 | ±288.642 | ops/s |
| foryjson/databind | thrpt | 6 | 84551.811 | ±2214.758 | ops/s |
| genson/databind | thrpt | 6 | 36023.280 | ±1815.056 | ops/s |
| gson/databind | thrpt | 6 | 30149.572 | ±4320.313 | ops/s |
| jackson/databind | thrpt | 6 | 37094.761 | ±2079.766 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 43555.500 | ±4534.951 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 42564.703 | ±4111.261 | ops/s |
| jodd/databind | thrpt | 6 | 23631.484 | ±925.795 | ops/s |
| johnzon/databind | thrpt | 6 | 12219.165 | ±909.704 | ops/s |
| jsonio/databind | thrpt | 6 | 3026.936 | ±1068.546 | ops/s |
| jsonsmart/databind | thrpt | 6 | 36852.711 | ±8254.994 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 20601.720 | ±20890.736 | ops/s |
| logansquare/databind | thrpt | 6 | 41088.738 | ±8547.780 | ops/s |
| moshi/databind | thrpt | 6 | 26215.672 | ±6949.196 | ops/s |
| qson/databind | thrpt | 6 | 40637.291 | ±1757.173 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 39651.602 | ±2076.693 | ops/s |
| wast/databind | thrpt | 6 | 85189.510 | ±823.784 | ops/s |
| yasson/databind | thrpt | 6 | 21692.220 | ±552.859 | ops/s |
| antons/stream | thrpt | 6 | 14539.832 | ±333.287 | ops/s |
| genson/stream | thrpt | 6 | 41041.902 | ±1821.865 | ops/s |
| gson/stream | thrpt | 6 | 30086.311 | ±10819.116 | ops/s |
| jackson/stream | thrpt | 6 | 43397.708 | ±3787.072 | ops/s |
| jakartajson/stream | thrpt | 6 | 9317.155 | ±4458.336 | ops/s |
| jsonio/stream | thrpt | 6 | 27364.974 | ±9275.671 | ops/s |
| jsonsimple/stream | thrpt | 6 | 11887.985 | ±237.057 | ops/s |
| minimaljson/stream | thrpt | 6 | 22368.693 | ±1316.500 | ops/s |
| mjson/stream | thrpt | 6 | 10798.662 | ±167.923 | ops/s |
| moshi/stream | thrpt | 6 | 25497.871 | ±9389.767 | ops/s |
| nanojson/stream | thrpt | 6 | 24886.700 | ±640.512 | ops/s |
| orgjson/stream | thrpt | 6 | 9178.826 | ±2383.520 | ops/s |
| purejson/stream | thrpt | 6 | 3949.595 | ±98.914 | ops/s |
| tapestry/stream | thrpt | 6 | 26846.151 | ±659.473 | ops/s |
| underscore_java/stream | thrpt | 6 | 26059.568 | ±655.818 | ops/s |

## JMH: Deserialization - 1000 KB

<details>
<summary>JMH failure output (no score was recorded)</summary>

```text
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 16 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-14"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	... 10 more



# Run progress: 6.10% complete, ETA 00:09:11
# Fork: 2 of 2
WARNING: Using incubator modules: jdk.incubator.vector
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.openjdk.jmh.util.Utils (file:/benchmark/build/libs/app.jar)
WARNING: Please consider reporting this to the maintainers of class org.openjdk.jmh.util.Utils
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
# Warmup Iteration   1: Using SEED=20260811 as seed for Random
# Benchmark: com.github.fabienrenaud.jjb.databind.Deserialization.boon
<failure>

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_thrpt_jmhStub(Deserialization_boon_jmhTest.java:119)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:83)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	... 10 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.ExceptionInInitializerError
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ClassCastException: class [B cannot be cast to class [C ([B and [C are in module java.base of loader 'bootstrap')
	at org.boon.core.reflection.FastStringUtils$StringImplementation$1.toCharArray(FastStringUtils.java:92)
	at org.boon.core.reflection.FastStringUtils.toCharArray(FastStringUtils.java:175)
	at org.boon.primitive.Chr.chars(Chr.java:70)
	at org.boon.json.implementation.JsonParserCharArray.<clinit>(JsonParserCharArray.java:275)
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more

java.lang.NoClassDefFoundError: Could not initialize class org.boon.json.implementation.JsonParserLax
	at org.boon.json.JsonMappingParser.<init>(JsonMappingParser.java:85)
	at org.boon.json.JsonParserFactory.create(JsonParserFactory.java:228)
	at org.boon.json.implementation.ObjectMapperImpl.readValue(ObjectMapperImpl.java:78)
	at com.github.fabienrenaud.jjb.databind.Deserialization.boon(Deserialization.java:86)
	at com.github.fabienrenaud.jjb.databind.jmh_generated.Deserialization_boon_jmhTest.boon_Throughput(Deserialization_boon_jmhTest.java:78)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:475)
	at org.openjdk.jmh.runner.BenchmarkHandler$BenchmarkTask.call(BenchmarkHandler.java:458)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:545)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:328)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1090)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:614)
	at java.base/java.lang.Thread.run(Thread.java:1474)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.ExceptionInInitializerError [in thread "com.github.fabienrenaud.jjb.databind.Deserialization.boon-jmh-worker-4"]
	... 15 more
```
</details>

| Benchmark | Mode | Cnt | Score | Error | Units |
|-----------|------|-----|-------|-------|-------|
| avajejsonb/databind | thrpt | 6 | 5881.461 | ±139.474 | ops/s |
| avajejsonb_jackson/databind | thrpt | 6 | 4140.562 | ±302.971 | ops/s |
| djomo/databind | thrpt | 6 | 6104.887 | ±102.748 | ops/s |
| dsljson/databind | thrpt | 6 | 6026.845 | ±1014.317 | ops/s |
| dsljson_reflection/databind | thrpt | 6 | 4038.546 | ±1735.850 | ops/s |
| fastjson/databind | thrpt | 6 | 8049.468 | ±262.789 | ops/s |
| fastjson_features/databind | thrpt | 6 | 8104.212 | ±150.129 | ops/s |
| flexjson/databind | thrpt | 6 | 612.401 | ±52.749 | ops/s |
| foryjson/databind | thrpt | 6 | 8228.242 | ±212.151 | ops/s |
| genson/databind | thrpt | 6 | 3346.411 | ±207.986 | ops/s |
| gson/databind | thrpt | 6 | 2976.947 | ±39.733 | ops/s |
| jackson/databind | thrpt | 6 | 3729.560 | ±420.630 | ops/s |
| jackson_afterburner/databind | thrpt | 6 | 4423.442 | ±305.415 | ops/s |
| jackson_blackbird/databind | thrpt | 6 | 4136.544 | ±367.199 | ops/s |
| jodd/databind | thrpt | 6 | 2323.673 | ±121.202 | ops/s |
| johnzon/databind | thrpt | 6 | 840.229 | ±20.608 | ops/s |
| jsonio/databind | thrpt | 6 | 269.985 | ±45.370 | ops/s |
| jsonsmart/databind | thrpt | 6 | 3837.363 | ±126.863 | ops/s |
| kotlinx_serialization/databind | thrpt | 6 | 3032.179 | ±120.768 | ops/s |
| logansquare/databind | thrpt | 6 | 4335.080 | ±63.068 | ops/s |
| moshi/databind | thrpt | 6 | 2683.835 | ±665.698 | ops/s |
| qson/databind | thrpt | 6 | 3859.675 | ±308.792 | ops/s |
| quickbuf_json/databind | thrpt | 6 | 2959.709 | ±75.562 | ops/s |
| wast/databind | thrpt | 6 | 8261.873 | ±128.396 | ops/s |
| yasson/databind | thrpt | 6 | 2070.670 | ±159.155 | ops/s |
| antons/stream | thrpt | 6 | 1387.668 | ±49.713 | ops/s |
| genson/stream | thrpt | 6 | 4072.707 | ±101.553 | ops/s |
| gson/stream | thrpt | 6 | 3297.891 | ±41.931 | ops/s |
| jackson/stream | thrpt | 6 | 4283.711 | ±40.301 | ops/s |
| jakartajson/stream | thrpt | 6 | 1429.293 | ±46.078 | ops/s |
| jsonio/stream | thrpt | 6 | 2375.218 | ±339.272 | ops/s |
| jsonsimple/stream | thrpt | 6 | 1086.450 | ±22.220 | ops/s |
| minimaljson/stream | thrpt | 6 | 1704.493 | ±12.889 | ops/s |
| mjson/stream | thrpt | 6 | 1020.243 | ±25.046 | ops/s |
| moshi/stream | thrpt | 6 | 2233.863 | ±710.118 | ops/s |
| nanojson/stream | thrpt | 6 | 2339.097 | ±182.482 | ops/s |
| orgjson/stream | thrpt | 6 | 924.923 | ±23.637 | ops/s |
| purejson/stream | thrpt | 6 | 311.055 | ±4.366 | ops/s |
| tapestry/stream | thrpt | 6 | 2418.794 | ±36.274 | ops/s |
| underscore_java/stream | thrpt | 6 | 1990.681 | ±171.107 | ops/s |
