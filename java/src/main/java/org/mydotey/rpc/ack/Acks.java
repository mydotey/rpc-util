package org.mydotey.rpc.ack;

import java.util.Objects;

/**
 * @author koqizhao
 *
 * Nov 14, 2018
 */
public interface Acks {

    String SUCCESS = "success";
    String FAIL = "fail";
    String PARTIAL_FAIL = "partial_fail";

    static boolean isSuccess(String ack) {
        return Objects.equals(ack, SUCCESS);
    }

    static boolean isFail(String ack) {
        return Objects.equals(ack, FAIL);
    }

    static boolean isPartialFail(String ack) {
        return Objects.equals(ack, PARTIAL_FAIL);
    }

}
