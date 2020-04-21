package com.zlkj.movement.common.exception;

import com.zlkj.movement.common.api.IErrorCode;

/**
 *
 * @Description 断言处理类，用于抛出各种API异常
 * @Author HeZeMin
 * @Date 2020年04月17日 14:54
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
