package org.mydotey.rpc.error;

/**
 * @author koqizhao
 *
 * Nov 14, 2018
 */
public class ServiceUnavailableException extends RpcException {

    private static final long serialVersionUID = 1L;

    public ServiceUnavailableException() {
        super();
    }

    public ServiceUnavailableException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ServiceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceUnavailableException(String message) {
        super(message);
    }

    public ServiceUnavailableException(Throwable cause) {
        super(cause);
    }

}
