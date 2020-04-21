package com.zlkj.movement.common.exception;

import com.zlkj.movement.common.api.IErrorCode;

/**
 *
 * @Description 自定义API异常
 * @Author HeZeMin
 * @Date 2020年04月17日 14:54
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
