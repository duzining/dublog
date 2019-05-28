package com.du.dublog.common.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * @Author : Duzining
 * @Description :shiro 工具类
 * @Date : 2019/5/28 16:56
 * @Version : 1.0
 * @param null
 * @Return
 */
public class ShiroUtils {
    public static Subject getSubject(){
        return SecurityUtils.getSubject();
    }

    public static Session getSession(){
        return SecurityUtils.getSubject().getSession();
    }

    public static void logout(){
        getSubject().logout();
    }

    public static User
}
