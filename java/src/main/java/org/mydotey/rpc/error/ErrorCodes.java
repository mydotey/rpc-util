package org.mydotey.rpc.error;

import java.util.Objects;

/**
 * @author koqizhao
 *
 * Nov 14, 2018
 */
public interface ErrorCodes {

    String BAD_REQUEST = "bad_request";
    String SERVICE_UNAVAILABLE = "service_unavailable";
    String SERVICE_EXCEPTION = "service_exception";

    static boolean isBadRequest(String errorCode) {
        return Objects.equals(errorCode, BAD_REQUEST);
    }

    static boolean isServiceUnavailable(String errorCode) {
        return Objects.equals(errorCode, SERVICE_UNAVAILABLE);
    }

    static boolean isServiceException(String errorCode) {
        return Objects.equals(errorCode, SERVICE_EXCEPTION);
    }

}
