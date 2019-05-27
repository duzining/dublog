package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :用户删除异常
 * @Date : 2019/5/27 17:52
 * @Version : 1.0
 * @param null
 * @Return
 */
public class UserDeleteException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserDeleteException() {
        super("user.password.delete", null);
    }
}
