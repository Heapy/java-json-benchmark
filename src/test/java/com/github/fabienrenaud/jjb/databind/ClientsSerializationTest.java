package com.github.fabienrenaud.jjb.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.github.fabienrenaud.jjb.JsonBenchmarkClientsTest;
import com.github.fabienrenaud.jjb.data.JsonSource;
import com.github.fabienrenaud.jjb.data.JsonSourceFactory;
import com.github.fabienrenaud.jjb.support.Api;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ClientsSerializationTest extends JsonBenchmarkClientsTest {

    private static final Pattern BALANCE_VALUE = Pattern.compile(
        "(\\\"balance\\\"\\s*:\\s*)([-+]?\\d+(?:\\.\\d+)?(?:[eE][-+]?\\d+)?)"
    );

    public ClientsSerializationTest() {
        super(new Serialization() {
            private final JsonSource source = JsonSourceFactory.create("clients", 1, 2000);
            @Override
            public JsonSource JSON_SOURCE() {
                return source;
            }
        }, Api.DATABIND);
    }

    @Test
    public void kotlinx_serialization_preserves_big_decimal_lexemes() throws Exception {
        String jacksonJson = BENCH.JSON_SOURCE().nextString();
        String kotlinxJson = (String) BENCH.kotlinx_serialization();
        List<String> jacksonBalances = balanceLexemes(jacksonJson);

        assertFalse(jacksonBalances.isEmpty());
        assertEquals(jacksonBalances, balanceLexemes(kotlinxJson));
    }

    @Test
    public void kotlinx_serialization_preserves_big_decimal_exponent_notation() throws Exception {
        String json = BENCH.JSON_SOURCE().nextString();
        Matcher balance = BALANCE_VALUE.matcher(json);
        assertTrue(balance.find());

        String exponentJson = json.substring(0, balance.start(2)) + "1E+3" + json.substring(balance.end(2));
        Object value = BENCH.JSON_SOURCE().provider().kotlinxSerialization().fromJson(exponentJson);
        String serialized = BENCH.JSON_SOURCE().provider().kotlinxSerialization().toJson(value);

        assertEquals("1E+3", balanceLexemes(serialized).get(0));
    }

    private List<String> balanceLexemes(String json) throws IOException {
        List<String> result = new ArrayList<>();
        try (JsonParser parser = BENCH.JSON_SOURCE().provider().jacksonFactory().createParser(json)) {
            while (parser.nextToken() != null) {
                if (parser.currentToken() == JsonToken.FIELD_NAME && "balance".equals(parser.currentName())) {
                    parser.nextToken();
                    assertTrue(parser.currentToken().isNumeric());
                    result.add(parser.getText());
                }
            }
        }
        return result;
    }

    @Override
    public void yasson() throws Exception {
        // FIXME: yasson fails on UUID
    }

    @Override
    public void boon() throws Exception {
        // FIXME: null collection
    }

    @Override
    public void genson() throws Exception {
        // FIXME: does not support BigDecimal correctly
    }

    @Override
    public void jsonsmart() throws Exception {
        // FIXME: tried to access field java.time.LocalDate.month
    }

    @Override
    public void johnzon() throws Exception {
        // FIXME: does not work
    }

    @Override
    public void qson() throws Exception {
        // FIXME: does not support arrays
    }
}
