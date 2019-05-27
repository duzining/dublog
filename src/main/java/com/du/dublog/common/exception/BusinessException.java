package com.du.dublog.common.exception;
/**
 * @Author : Duzining
 * @Description :业务异常
 * @Date : 2019/5/27 17:00
 * @Version : 1.0
 * @param null
 * @Return
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    protected final String message;

    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
