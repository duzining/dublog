package com.du.dublog.common.exception.user;
/**
 * @Author : Duzining
 * @Description :验证码异常
 * @Date : 2019/5/27 17:48
 * @Version : 1.0
 * @param null
 * @Return
 */
public class CaptchaException extends UserException{
    private static final long serialVersionUID = 1L;

    public CaptchaException() {
        super("user.jcaptcha.error", null);
    }
}
