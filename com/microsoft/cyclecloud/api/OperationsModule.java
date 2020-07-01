/**
* Generated Code - Do Not Edit
*/

package com.microsoft.cyclecloud.api;

import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.cyclecloud.BodyResponseParser;
import com.microsoft.cyclecloud.PageResponseParser;
import com.microsoft.cyclecloud.RequestDetails;
import com.microsoft.cyclecloud.Result;
import com.microsoft.cyclecloud.NoValue;
import com.microsoft.cyclecloud.Session;
import com.microsoft.cyclecloud.model.OperationStatus;

@SuppressWarnings("unused")
public class OperationsModule {

    public static final String TAG = "Operations";

    /**
     * No description available
     *
     * @param  requestId  The request ID for the operation. If this is given, the list will only have 0 or 1 element in it. - Optional
     * @return OK
     */
    public static Result<List<OperationStatus>> list(Session session, String requestId) {
        String _path = "/operations/";
        String _host = "None";

        Map<String, String> _query = new HashMap<>();
        if (requestId != null) {
            _query.put("request_id", requestId);
        }

        Map<String, String> _headers = new HashMap<>();

        String _body = null;

        String _verb = "GET";

        TypeReference<List<OperationStatus>> _typeRef = new TypeReference<List<OperationStatus>>() {};
        BodyResponseParser<List<OperationStatus>> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(requestId);
        return session.<List<OperationStatus>> execute(TAG, "list", _argsList, _requestDetails, _responseParser);
    }

    /**
     * No description available
     *
     * @param  id  The operation ID - Required
     * @return OK
     */
    public static Result<OperationStatus> getStatus(Session session, String id) {
        if (id == null) {
            throw new IllegalArgumentException("id is required.");
        }

        String _path = "/operations/{0}";
        _path = MessageFormat.format(_path, id);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;

        String _verb = "GET";

        TypeReference<OperationStatus> _typeRef = new TypeReference<OperationStatus>() {};
        BodyResponseParser<OperationStatus> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(id);
        return session.<OperationStatus> execute(TAG, "getStatus", _argsList, _requestDetails, _responseParser);
    }

}