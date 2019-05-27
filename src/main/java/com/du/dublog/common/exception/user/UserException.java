package com.du.dublog.common.exception.user;

import com.du.dublog.common.exception.base.BaseException;

/**
 * @Author : Duzining
 * @Description :用户异常信息类
 * @Date : 2019/5/27 17:47
 * @Version : 1.0
 * @param null
 * @Return
 */
public class UserException extends BaseException{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }

}
