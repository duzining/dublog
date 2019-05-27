package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :角色锁定异常
 * @Date : 2019/5/27 18:01
 * @Version : 1.0
 * @param null
 * @Return 
 */
public class RoleBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public RoleBlockedException() {
        super("role.blocked", null);
    }

}
