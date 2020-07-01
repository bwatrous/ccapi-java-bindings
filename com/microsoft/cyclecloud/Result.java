package com.microsoft.cyclecloud;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Result<T> {

    private final RequestDetails requestDetails;
    private final ResponseDetails responseDetails;
    private final T value;

    Result(RequestDetails requestDetails, ResponseDetails responseDetails, T value) {
        this.requestDetails = requestDetails;
        this.responseDetails = responseDetails;
        this.value = value;
    }

    public RequestDetails getRequestDetails() {
        return requestDetails;
    }

    public ResponseDetails getResponseDetails() {
        return responseDetails;
    }

    public T getValue() {
        return value;
    }
}