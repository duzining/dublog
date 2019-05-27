package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :用户错误记数异常
 * @Date : 2019/5/27 17:56
 * @Version : 1.0
 * @param null
 * @Return
 */
public class UserPasswordRetryLimitCountException extends UserException{
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitCountException(int retryLimitCount) {
        super("user.password.retry.limit.count", new Object[]{retryLimitCount});
    }
}
