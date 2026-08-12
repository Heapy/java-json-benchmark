package com.github.fabienrenaud.jjb.provider

import java.math.BigDecimal
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonUnquotedLiteral
import kotlinx.serialization.json.jsonPrimitive

interface KotlinxSerializationAdapter {
    fun fromJson(value: String): Any

    fun toJson(value: Any): String
}

object KotlinxUsersJsonAdapter : KotlinxSerializationAdapter {
    override fun fromJson(value: String): Any = Json.decodeFromString(KotlinxUsers.serializer(), value)

    override fun toJson(value: Any): String = Json.encodeToString(KotlinxUsers.serializer(), value as KotlinxUsers)
}

object KotlinxClientsJsonAdapter : KotlinxSerializationAdapter {
    override fun fromJson(value: String): Any = Json.decodeFromString(KotlinxClients.serializer(), value)

    override fun toJson(value: Any): String = Json.encodeToString(KotlinxClients.serializer(), value as KotlinxClients)
}

@Serializable
private data class KotlinxUsers(
    val users: List<User>,
) {
    @Serializable
    data class User(
        val id: String,
        val index: Int,
        val guid: String,
        val isActive: Boolean,
        val balance: String,
        val picture: String,
        val age: Int,
        val eyeColor: String,
        val name: String,
        val gender: String,
        val company: String,
        val email: String,
        val phone: String,
        val address: String,
        val about: String,
        val registered: String,
        val latitude: Double,
        val longitude: Double,
        val tags: List<String>,
        val friends: List<Friend>,
        val greeting: String,
        val favoriteFruit: String,
    )

    @Serializable
    data class Friend(
        val id: String,
        val name: String,
    )
}

@Serializable
private data class KotlinxClients(
    val clients: List<Client>,
) {
    @Serializable
    data class Client(
        val id: Long,
        val index: Int,
        @Serializable(with = UuidAsStringSerializer::class)
        val guid: UUID,
        val isActive: Boolean,
        @Serializable(with = BigDecimalAsJsonNumberSerializer::class)
        val balance: BigDecimal,
        val picture: String,
        val age: Int,
        val eyeColor: EyeColor,
        val name: String,
        val gender: String,
        val company: String,
        val emails: Array<String>,
        val phones: LongArray,
        val address: String,
        val about: String,
        @Serializable(with = LocalDateAsStringSerializer::class)
        val registered: LocalDate,
        val latitude: Double,
        val longitude: Double,
        val tags: List<String>,
        val partners: List<Partner>,
    )

    @Serializable
    enum class EyeColor {
        BROWN,
        BLUE,
        GREEN,
    }

    @Serializable
    data class Partner(
        val id: Long,
        val name: String,
        @Serializable(with = OffsetDateTimeAsStringSerializer::class)
        val since: OffsetDateTime,
    )
}

private object UuidAsStringSerializer : KSerializer<UUID> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("java.util.UUID", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: UUID) = encoder.encodeString(value.toString())

    override fun deserialize(decoder: Decoder): UUID = UUID.fromString(decoder.decodeString())
}

private object LocalDateAsStringSerializer : KSerializer<LocalDate> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("java.time.LocalDate", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: LocalDate) = encoder.encodeString(value.toString())

    override fun deserialize(decoder: Decoder): LocalDate = LocalDate.parse(decoder.decodeString())
}

private object OffsetDateTimeAsStringSerializer : KSerializer<OffsetDateTime> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("java.time.OffsetDateTime", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: OffsetDateTime) = encoder.encodeString(value.toString())

    override fun deserialize(decoder: Decoder): OffsetDateTime = OffsetDateTime.parse(decoder.decodeString())
}

private object BigDecimalAsJsonNumberSerializer : KSerializer<BigDecimal> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("java.math.BigDecimal", PrimitiveKind.DOUBLE)

    override fun serialize(encoder: Encoder, value: BigDecimal) {
        val text = value.toString()
        if (encoder is JsonEncoder) {
            encoder.encodeJsonElement(JsonUnquotedLiteral(text))
        } else {
            encoder.encodeString(text)
        }
    }

    override fun deserialize(decoder: Decoder): BigDecimal {
        val value = if (decoder is JsonDecoder) {
            decoder.decodeJsonElement().jsonPrimitive.content
        } else {
            decoder.decodeString()
        }
        return BigDecimal(value)
    }
}
