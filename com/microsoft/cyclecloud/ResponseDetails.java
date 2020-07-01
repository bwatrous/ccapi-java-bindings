package com.microsoft.cyclecloud;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ResponseDetails {

    private final int statusCode;
    private final Map<String, String> headers;
    private final String body;

    public ResponseDetails(int statusCode, Map<String, String> headers, String body) {
        this.statusCode = statusCode;
        if (headers == null) {
            this.headers = null;
        } else {
            this.headers = Collections.unmodifiableMap(new HashMap<>(headers));
        }
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }
}