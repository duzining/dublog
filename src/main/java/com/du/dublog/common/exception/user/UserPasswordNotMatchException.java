package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :用户密码不规范异常
 * @Date : 2019/5/27 17:54
 * @Version : 1.0
 * @param null
 * @Return 
 */
public class UserPasswordNotMatchException extends UserException{
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException() {
        super("user.password.not.match", null);
    }
}
