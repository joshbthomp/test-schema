package test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaConfig;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;
import org.junit.Assert;
import org.junit.Test;

public class SchemaGenerationTest {
    ObjectMapper objectMapper = new ObjectMapper();
    JsonSchemaConfig config = JsonSchemaConfig.vanillaJsonSchemaDraft4();

    @Test
    public void testSchemaGenerationMergeFalse() {
        JsonNode jsonNode = generateSchema(JustATestPojoSchemaDefined.class);
        System.out.println(jsonNode.toString());
        Assert.assertEquals("{\"example\": [\"some-id\"]}", jsonNode.toString());
    }

    private JsonNode generateSchema(Class clazz) {
        return  new JsonSchemaGenerator(objectMapper, config).generateJsonSchema(clazz);
    }

}
