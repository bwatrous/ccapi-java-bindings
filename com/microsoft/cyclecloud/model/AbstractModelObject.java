package com.microsoft.cyclecloud.model;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractModelObject implements ModelObject {
    @Deprecated
    @SuppressWarnings("unchecked")
    public Map<String, Object> toDict() throws IOException {
        String json = jsonEncode();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Map.class);
    }

    @Deprecated
    public Map<String, Object> to_dict() throws IOException {
        return toDict();
    }

    public String jsonEncode() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public String json_encode() {
        return jsonEncode();
    }
}