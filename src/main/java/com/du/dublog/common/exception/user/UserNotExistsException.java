package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :用户不存在异常
 * @Date : 2019/5/27 17:50
 * @Version : 1.0
 * @param null
 * @Return
 */
public class UserNotExistsException extends UserException{
    private static final long serialVersionUID = 1L;

    public UserNotExistsException() {
        super("user.not.exists", null);
    }
}
