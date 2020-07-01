package com.microsoft.cyclecloud;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RequestDetails {

    private final String host;
    private final String path;
    private final String url;
    private final String verb;
    private final Map<String, String> query;
    private final Map<String, String> headers;
    private final String body;

    public RequestDetails(String host, String path, String verb, Map<String, String> query, Map<String, String> headers, String body) {
        this.host = host;
        this.path = path;
        this.url = null;
        this.verb = verb;
        this.query = wrapMap(query);
        this.headers = wrapMap(headers);
        this.body = body;
    }

    public RequestDetails(String url, String verb, Map<String, String> query, Map<String, String> headers, String body) {
        this.host = null;
        this.path = null;
        this.url = url;
        this.verb = verb;
        this.query = wrapMap(query);
        this.headers = wrapMap(headers);
        this.body = body;
    }

    private static Map<String, String> wrapMap(Map<String, String> map) {
        if (map == null) {
            return null;
        } else {
            return Collections.unmodifiableMap(new HashMap<>(map));
        }
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getUrl() {
        return url;
    }

    public String getVerb() {
        return verb;
    }

    public Map<String, String> getQuery() {
        return query;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }
}