package com.microsoft.cyclecloud;

import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BodyResponseParser<T> {

    private final TypeReference<?> typeRef;

    public BodyResponseParser(TypeReference<?> typeRef) {
        this.typeRef = typeRef;
    }

    public T parse(String body) {
        if (body == null) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        try {
            return objectMapper.readValue(body, typeRef);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }
}
