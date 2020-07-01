package com.microsoft.cyclecloud;

import java.util.List;

public interface Session {
    public <T> Result<T> execute(String tag, String operation, List<Object> arguments, RequestDetails requestDetails, BodyResponseParser<T> responseParser);

    public <T> Iterable<Result<List<T>>> executePaged(String tag, String operation, List<Object> arguments, RequestDetails requestDetails, PageResponseParser<T> responseParser);

    public <T> List<T> executeList(String tag, String operation, List<Object> arguments, RequestDetails requestDetails, PageResponseParser<T> responseParser);
}