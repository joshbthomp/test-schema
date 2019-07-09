package test;

import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaInject;

@JsonSchemaInject(merge = false, json = "{\"example\": [\"some-id\"]}}")
public class JustATestPojoSchemaDefined {

    private String id;

    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
