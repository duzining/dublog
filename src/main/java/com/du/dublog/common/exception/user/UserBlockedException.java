package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :用户锁定异常
 * @Date : 2019/5/27 17:59
 * @Version : 1.0
 * @param null
 * @Return 
 */
public class UserBlockedException extends UserException{
    private static final long serialVersionUID = 1L;

    public UserBlockedException() {
        super("user.blocked", null);
    }
}
