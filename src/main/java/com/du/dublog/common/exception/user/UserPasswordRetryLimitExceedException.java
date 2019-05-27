package com.du.dublog.common.exception.user;


/**
 * @Author : Duzining
 * @Description :用户错误最大次数异常
 * @Date : 2019/5/27 17:58
 * @Version : 1.0
 * @param null
 * @Return
 */
public class UserPasswordRetryLimitExceedException extends UserException{
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitExceedException(int retryLimitCount) {
        super("user.password.retry.limit.exceed", new Object[]{retryLimitCount});
    }
}
