package com.github.fabienrenaud.jjb.cold

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import java.lang.management.ManagementFactory
import java.nio.charset.StandardCharsets
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.apache.fory.json.ForyJson

/**
 * One invocation is exactly one cold-JVM sample. The coordinator launches a
 * new JVM for every library/operation/count tuple.
 *
 * This class intentionally has no reference to JsonBench, JsonSource, or any of
 * the eager JsonProvider implementations in the main benchmark.
 */
object ColdJvmChild {
    @Volatile
    private var blackhole: Any? = null

    @JvmStatic
    fun main(args: Array<String>) {
        val mainEntryNs = System.nanoTime()
        val config = ChildConfig.parse(args)

        if (config.validateOnly) {
            validate(config.library)
            return
        }

        val metrics = PhaseMetrics.create()
        val snapshots = LongArray(PhaseMetrics.SNAPSHOT_COUNT * PhaseMetrics.WIDTH)
        val allocations = LongArray(PhaseMetrics.PHASE_COUNT * 2)
        metrics.captureInto(snapshots, 0)

        allocations[0] = metrics.allocatedBytes()
        val fixtureStartNs = System.nanoTime()
        val expected = ColdFixture.value()
        val fixtureJson = ColdFixture.canonicalJson(expected)
        val fixtureBytes = fixtureJson.toByteArray(StandardCharsets.UTF_8).size
        val fixtureHash = fixtureJson.hashCode()
        val fixtureEndNs = System.nanoTime()
        allocations[1] = metrics.allocatedBytes()
        metrics.captureInto(snapshots, 1)

        // Adapter class loading, construction, and explicit mapper/Json creation
        // all belong to initialization. The generated serializer/type cache is
        // deliberately first touched by the first operation.
        allocations[2] = metrics.allocatedBytes()
        val initStartNs = System.nanoTime()
        val codec = instantiateCodec(config.library)
        codec.initialize()
        val initEndNs = System.nanoTime()
        allocations[3] = metrics.allocatedBytes()
        metrics.captureInto(snapshots, 2)

        var checksum = 1L
        var lastResult: Any?

        allocations[4] = metrics.allocatedBytes()
        val firstStartNs = System.nanoTime()
        lastResult = execute(codec, config.operation, expected, fixtureJson)
        blackhole = lastResult
        checksum = mix(checksum, lastResult)
        val firstEndNs = System.nanoTime()
        allocations[5] = metrics.allocatedBytes()
        metrics.captureInto(snapshots, 3)

        allocations[6] = metrics.allocatedBytes()
        val remainingStartNs = System.nanoTime()
        repeat(config.count - 1) {
            lastResult = execute(codec, config.operation, expected, fixtureJson)
            blackhole = lastResult
            checksum = mix(checksum, lastResult)
        }
        val remainingEndNs = System.nanoTime()
        allocations[7] = metrics.allocatedBytes()
        metrics.captureInto(snapshots, 4)

        checkResult(config.operation, expected, lastResult)
        blackhole = checksum

        val fixtureNs = fixtureEndNs - fixtureStartNs
        val initializationNs = initEndNs - initStartNs
        val firstOperationNs = firstEndNs - firstStartNs
        val remainingOperationsNs =
            if (config.count > 1) remainingEndNs - remainingStartNs else 0

        println(
            resultJson(
                config = config,
                pid = ProcessHandle.current().pid(),
                mainEntryToFixtureStartNs = fixtureStartNs - mainEntryNs,
                fixtureNs = fixtureNs,
                initializationNs = initializationNs,
                firstOperationNs = firstOperationNs,
                remainingOperationsNs = remainingOperationsNs,
                fixtureBytes = fixtureBytes,
                fixtureHash = fixtureHash,
                checksum = checksum,
                snapshots = snapshots,
                allocations = allocations,
            ),
        )
    }

    private fun instantiateCodec(library: String): ColdCodec {
        val packageName = "com.github.fabienrenaud.jjb.cold."
        val className = when (library) {
            "jackson" -> packageName + "JacksonColdCodec"
            "gson" -> packageName + "GsonColdCodec"
            "kotlinx" -> packageName + "KotlinxColdCodec"
            "fory" -> packageName + "ForyColdCodec"
            else -> error("Unsupported library: " + library)
        }
        return Class.forName(className).getDeclaredConstructor().newInstance() as ColdCodec
    }

    private fun execute(
        codec: ColdCodec,
        operation: Operation,
        expected: ColdUsers,
        fixtureJson: String,
    ): Any = when (operation) {
        Operation.SERIALIZE -> codec.serialize(expected)
        Operation.DESERIALIZE -> codec.deserialize(fixtureJson)
    }

    private fun mix(checksum: Long, value: Any): Long = when (value) {
        is String -> checksum * 31L + value.length
        is ColdUsers -> {
            val first = value.users.firstOrNull()
            checksum * 31L + value.users.size * 17L + (first?.id?.length ?: 0)
        }
        else -> error("Unexpected result type: " + value.javaClass.name)
    }

    private fun checkResult(operation: Operation, expected: ColdUsers, result: Any?) {
        when (operation) {
            Operation.SERIALIZE -> {
                check(result is String && result.isNotEmpty() && result.contains("\"users\"")) {
                    "Serializer did not produce a Users JSON object"
                }
            }
            Operation.DESERIALIZE -> check(result == expected) {
                "Deserialized object differs from the fixed fixture"
            }
        }
    }

    private fun validate(library: String) {
        val codec = instantiateCodec(library)
        codec.initialize()
        val expected = ColdFixture.value()
        val canonical = ColdFixture.canonicalJson(expected)
        val fromCanonical = codec.deserialize(canonical)
        val encoded = codec.serialize(expected)
        val roundTrip = codec.deserialize(encoded)
        check(fromCanonical == expected)
        check(roundTrip == expected)
        println(
            "{\"schemaVersion\":1,\"validation\":true,\"library\":\"" +
                library + "\",\"fixtureBytes\":" +
                canonical.toByteArray(StandardCharsets.UTF_8).size +
                jvmIdentityJson() + "}",
        )
    }

    private fun resultJson(
        config: ChildConfig,
        pid: Long,
        mainEntryToFixtureStartNs: Long,
        fixtureNs: Long,
        initializationNs: Long,
        firstOperationNs: Long,
        remainingOperationsNs: Long,
        fixtureBytes: Int,
        fixtureHash: Int,
        checksum: Long,
        snapshots: LongArray,
        allocations: LongArray,
    ): String {
        fun delta(snapshotAfter: Int, snapshotBefore: Int, metric: Int): Long {
            val after = snapshots[snapshotAfter * PhaseMetrics.WIDTH + metric]
            val before = snapshots[snapshotBefore * PhaseMetrics.WIDTH + metric]
            return if (after < 0 || before < 0) -1 else after - before
        }

        fun StringBuilder.appendNullable(value: Long) {
            if (value < 0) append("null") else append(value)
        }

        fun allocationDelta(phase: Int): Long {
            val before = allocations[phase * 2]
            val after = allocations[phase * 2 + 1]
            return if (after < 0 || before < 0) -1 else after - before
        }

        val operationTotalNs = firstOperationNs + remainingOperationsNs
        return buildString(1_024) {
            append("{\"schemaVersion\":1")
            append(",\"library\":\"").append(config.library).append('"')
            append(",\"operation\":\"").append(config.operation.cliName).append('"')
            append(",\"operationCount\":").append(config.count)
            append(",\"pid\":").append(pid)
            append(jvmIdentityJson())
            append(",\"fixtureBytes\":").append(fixtureBytes)
            append(",\"fixtureHash\":").append(fixtureHash)
            append(",\"checksum\":").append(checksum)

            append(",\"timingNs\":{")
            append("\"mainEntryToFixtureStart\":").append(mainEntryToFixtureStartNs)
            append(",\"fixturePreparation\":").append(fixtureNs)
            append(",\"libraryInitialization\":").append(initializationNs)
            append(",\"firstOperation\":").append(firstOperationNs)
            append(",\"remainingOperations\":").append(remainingOperationsNs)
            append(",\"operationsTotal\":").append(operationTotalNs)
            append(",\"initializationPlusOperations\":").append(initializationNs + operationTotalNs)
            append('}')

            append(",\"threadAllocatedBytes\":{")
            append("\"supported\":").append(PhaseMetrics.ALLOCATION != null)
            append(",\"fixturePreparation\":")
            appendNullable(allocationDelta(0))
            append(",\"libraryInitialization\":")
            appendNullable(allocationDelta(1))
            append(",\"firstOperation\":")
            appendNullable(allocationDelta(2))
            append(",\"remainingOperations\":")
            appendNullable(
                if (config.count > 1) allocationDelta(3) else -1,
            )
            append('}')

            append(",\"loadedClassDelta\":{")
            append("\"fixturePreparation\":").append(delta(1, 0, PhaseMetrics.TOTAL_LOADED_CLASSES))
            append(",\"libraryInitialization\":").append(delta(2, 1, PhaseMetrics.TOTAL_LOADED_CLASSES))
            append(",\"firstOperation\":").append(delta(3, 2, PhaseMetrics.TOTAL_LOADED_CLASSES))
            append(",\"remainingOperations\":")
            appendNullable(
                if (config.count > 1) {
                    delta(4, 3, PhaseMetrics.TOTAL_LOADED_CLASSES)
                } else {
                    -1
                },
            )
            append('}')

            append(",\"heapUsedBytes\":{")
            append("\"beforeFixture\":").append(snapshots[PhaseMetrics.HEAP_USED])
            append(",\"afterFixture\":").append(snapshots[PhaseMetrics.WIDTH + PhaseMetrics.HEAP_USED])
            append(",\"afterInitialization\":").append(snapshots[2 * PhaseMetrics.WIDTH + PhaseMetrics.HEAP_USED])
            append(",\"afterFirstOperation\":").append(snapshots[3 * PhaseMetrics.WIDTH + PhaseMetrics.HEAP_USED])
            append(",\"afterAllOperations\":").append(snapshots[4 * PhaseMetrics.WIDTH + PhaseMetrics.HEAP_USED])
            append('}')

            append(",\"loadedClassesAfter\":{")
            append("\"fixture\":").append(snapshots[PhaseMetrics.WIDTH + PhaseMetrics.CURRENT_LOADED_CLASSES])
            append(",\"initialization\":").append(snapshots[2 * PhaseMetrics.WIDTH + PhaseMetrics.CURRENT_LOADED_CLASSES])
            append(",\"firstOperation\":").append(snapshots[3 * PhaseMetrics.WIDTH + PhaseMetrics.CURRENT_LOADED_CLASSES])
            append(",\"allOperations\":").append(snapshots[4 * PhaseMetrics.WIDTH + PhaseMetrics.CURRENT_LOADED_CLASSES])
            append("}}")
        }
    }

    private fun escapeJson(value: String): String =
        value.replace("\\", "\\\\").replace("\"", "\\\"")

    private fun jvmIdentityJson(): String = buildString(256) {
        append(",\"jvmVersion\":\"")
        append(escapeJson(Runtime.version().toString()))
        append('"')
        append(",\"javaVendor\":\"")
        append(escapeJson(System.getProperty("java.vendor")))
        append('"')
        append(",\"javaVmName\":\"")
        append(escapeJson(System.getProperty("java.vm.name")))
        append('"')
        append(",\"javaHome\":\"")
        append(escapeJson(System.getProperty("java.home")))
        append('"')
    }
}

private data class ChildConfig(
    val library: String,
    val operation: Operation,
    val count: Int,
    val validateOnly: Boolean,
) {
    companion object {
        fun parse(args: Array<String>): ChildConfig {
            val values = mutableMapOf<String, String>()
            var validateOnly = false
            var index = 0
            while (index < args.size) {
                if (args[index] == "--validate-only") {
                    validateOnly = true
                    index += 1
                } else {
                    require(index + 1 < args.size) { "Missing value for " + args[index] }
                    values[args[index]] = args[index + 1]
                    index += 2
                }
            }
            val library = requireNotNull(values["--library"]) { "--library is required" }
            require(library in setOf("jackson", "gson", "kotlinx", "fory"))
            val operation = Operation.parse(values["--operation"] ?: "serialize")
            val count = (values["--count"] ?: "1").toInt()
            require(count in setOf(1, 10, 100)) { "--count must be 1, 10, or 100" }
            return ChildConfig(library, operation, count, validateOnly)
        }
    }
}

private enum class Operation(val cliName: String) {
    SERIALIZE("serialize"),
    DESERIALIZE("deserialize");

    companion object {
        fun parse(value: String): Operation =
            entries.firstOrNull { it.cliName == value } ?: error("Unsupported operation: " + value)
    }
}

private class PhaseMetrics(
    private val allocation: com.sun.management.ThreadMXBean?,
    private val threadId: Long,
) {
    fun captureInto(target: LongArray, snapshot: Int) {
        val offset = snapshot * WIDTH
        target[offset + TOTAL_LOADED_CLASSES] = CLASS_LOADING.totalLoadedClassCount
        target[offset + CURRENT_LOADED_CLASSES] = CLASS_LOADING.loadedClassCount.toLong()
        target[offset + HEAP_USED] = MEMORY.heapMemoryUsage.used
        target[offset + HEAP_COMMITTED] = MEMORY.heapMemoryUsage.committed
    }

    fun allocatedBytes(): Long = allocation?.getThreadAllocatedBytes(threadId) ?: -1

    companion object {
        const val TOTAL_LOADED_CLASSES = 0
        const val CURRENT_LOADED_CLASSES = 1
        const val HEAP_USED = 2
        const val HEAP_COMMITTED = 3
        const val WIDTH = 4
        const val SNAPSHOT_COUNT = 5
        const val PHASE_COUNT = 4

        private val CLASS_LOADING = ManagementFactory.getClassLoadingMXBean()
        private val MEMORY = ManagementFactory.getMemoryMXBean()

        var ALLOCATION: com.sun.management.ThreadMXBean? = null
            private set

        fun create(): PhaseMetrics {
            val candidate = ManagementFactory.getThreadMXBean() as? com.sun.management.ThreadMXBean
            ALLOCATION = try {
                if (candidate?.isThreadAllocatedMemorySupported == true) {
                    if (!candidate.isThreadAllocatedMemoryEnabled) {
                        candidate.isThreadAllocatedMemoryEnabled = true
                    }
                    candidate
                } else {
                    null
                }
            } catch (_: UnsupportedOperationException) {
                null
            } catch (_: SecurityException) {
                null
            }

            val metrics = PhaseMetrics(ALLOCATION, Thread.currentThread().threadId())
            // Prime all MXBean access before snapshot zero.
            val scratch = LongArray(WIDTH)
            metrics.captureInto(scratch, 0)
            return metrics
        }
    }
}

internal interface ColdCodec {
    fun initialize()

    fun serialize(value: ColdUsers): String

    fun deserialize(json: String): ColdUsers
}

internal class JacksonColdCodec : ColdCodec {
    private lateinit var mapper: ObjectMapper

    override fun initialize() {
        mapper = ObjectMapper()
    }

    override fun serialize(value: ColdUsers): String = mapper.writeValueAsString(value)

    override fun deserialize(json: String): ColdUsers = mapper.readValue(json, ColdUsers::class.java)
}

internal class GsonColdCodec : ColdCodec {
    private lateinit var gson: Gson

    override fun initialize() {
        gson = Gson()
    }

    override fun serialize(value: ColdUsers): String = gson.toJson(value)

    override fun deserialize(json: String): ColdUsers = gson.fromJson(json, ColdUsers::class.java)
}

internal class KotlinxColdCodec : ColdCodec {
    private lateinit var json: Json

    override fun initialize() {
        json = Json.Default
    }

    override fun serialize(value: ColdUsers): String = json.encodeToString(ColdUsers.serializer(), value)

    override fun deserialize(json: String): ColdUsers = this.json.decodeFromString(ColdUsers.serializer(), json)
}

internal class ForyColdCodec : ColdCodec {
    private lateinit var json: ForyJson

    override fun initialize() {
        json = ForyJson.builder().build()
    }

    override fun serialize(value: ColdUsers): String = json.toJson(value, ColdUsers::class.java)

    override fun deserialize(json: String): ColdUsers = this.json.fromJson(json, ColdUsers::class.java)
}

@Serializable
internal data class ColdUsers(
    var users: List<ColdUser>,
) {
    constructor() : this(emptyList())
}

@Serializable
internal data class ColdUser(
    var id: String,
    var index: Int,
    var guid: String,
    var active: Boolean,
    var balance: String,
    var picture: String,
    var age: Int,
    var eyeColor: String,
    var name: String,
    var gender: String,
    var company: String,
    var email: String,
    var phone: String,
    var address: String,
    var about: String,
    var registered: String,
    var latitude: Double,
    var longitude: Double,
    var tags: List<String>,
    var friends: List<ColdFriend>,
    var greeting: String,
    var favoriteFruit: String,
) {
    constructor() : this(
        id = "",
        index = 0,
        guid = "",
        active = false,
        balance = "",
        picture = "",
        age = 0,
        eyeColor = "",
        name = "",
        gender = "",
        company = "",
        email = "",
        phone = "",
        address = "",
        about = "",
        registered = "",
        latitude = 0.0,
        longitude = 0.0,
        tags = emptyList(),
        friends = emptyList(),
        greeting = "",
        favoriteFruit = "",
    )
}

@Serializable
internal data class ColdFriend(
    var id: String,
    var name: String,
) {
    constructor() : this("", "")
}

private object ColdFixture {
    fun value(): ColdUsers = ColdUsers(
        users = listOf(user(7), user(11)),
    )

    private fun user(index: Int): ColdUser = ColdUser(
        id = "000000000000000" + index,
        index = index,
        guid = "fixed-guid-0000000" + index,
        active = index % 2 == 1,
        balance = "USD-" + index + "-1234.56",
        picture = "https://example.invalid/picture/" + index + ".png",
        age = 30 + index,
        eyeColor = if (index % 2 == 1) "GREEN" else "BLUE",
        name = "Cold User " + index,
        gender = "unspecified",
        company = "Example Company",
        email = "user" + index + "@example.invalid",
        phone = "+000-555-00" + index,
        address = index.toString() + " Deterministic Street",
        about = ("cold-start-payload-" + index + "-").repeat(20),
        registered = "2026-01-02T03:04:05Z",
        latitude = 53.9045 + index,
        longitude = 27.5615 + index,
        tags = listOf("cold", "json", "deterministic", "batch-" + index),
        friends = listOf(
            ColdFriend("friend-" + index + "-1", "Ada"),
            ColdFriend("friend-" + index + "-2", "Grace"),
        ),
        greeting = "Hello from fixture " + index,
        favoriteFruit = "apple",
    )

    fun canonicalJson(value: ColdUsers): String = buildString(2_048) {
        append("{\"users\":[")
        value.users.forEachIndexed { userIndex, user ->
            if (userIndex != 0) append(',')
            append('{')
            append("\"id\":")
            quoted(user.id)
            field("index", user.index)
            field("guid", user.guid)
            field("active", user.active)
            field("balance", user.balance)
            field("picture", user.picture)
            field("age", user.age)
            field("eyeColor", user.eyeColor)
            field("name", user.name)
            field("gender", user.gender)
            field("company", user.company)
            field("email", user.email)
            field("phone", user.phone)
            field("address", user.address)
            field("about", user.about)
            field("registered", user.registered)
            field("latitude", user.latitude)
            field("longitude", user.longitude)
            append(",\"tags\":[")
            user.tags.forEachIndexed { tagIndex, tag ->
                if (tagIndex != 0) append(',')
                quoted(tag)
            }
            append(']')
            append(",\"friends\":[")
            user.friends.forEachIndexed { friendIndex, friend ->
                if (friendIndex != 0) append(',')
                append("{\"id\":")
                quoted(friend.id)
                append(",\"name\":")
                quoted(friend.name)
                append('}')
            }
            append(']')
            field("greeting", user.greeting)
            field("favoriteFruit", user.favoriteFruit)
            append('}')
        }
        append("]}")
    }

    private fun StringBuilder.field(name: String, value: String) {
        append(",\"").append(name).append("\":")
        quoted(value)
    }

    private fun StringBuilder.field(name: String, value: Int) {
        append(",\"").append(name).append("\":").append(value)
    }

    private fun StringBuilder.field(name: String, value: Double) {
        append(",\"").append(name).append("\":").append(value)
    }

    private fun StringBuilder.field(name: String, value: Boolean) {
        append(",\"").append(name).append("\":").append(value)
    }

    private fun StringBuilder.quoted(value: String) {
        append('"')
        value.forEach { character ->
            when (character) {
                '"' -> append("\\\"")
                '\\' -> append("\\\\")
                '\b' -> append("\\b")
                '\u000c' -> append("\\f")
                '\n' -> append("\\n")
                '\r' -> append("\\r")
                '\t' -> append("\\t")
                else -> {
                    if (character.code < 0x20) {
                        append("\\u")
                        append(character.code.toString(16).padStart(4, '0'))
                    } else {
                        append(character)
                    }
                }
            }
        }
        append('"')
    }
}
