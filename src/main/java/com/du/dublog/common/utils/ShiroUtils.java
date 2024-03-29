package com.du.dublog.common.utils;

import com.du.dublog.framework.shiro.realm.UserRealm;
import com.du.dublog.project.system.domain.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;
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

    public static User getSysUser(){
        User user = null;
        Object obj = getSubject().getPrincipal();
        if (StringUtils.isNotNull(obj)){
            user = new User();
            BeanUtils.copyBeanProp(user,obj);
        }
        return user;
    }

    public static void clearCachedAuthorizationInfo(){
        RealmSecurityManager rsm = (RealmSecurityManager) SecurityUtils.getSecurityManager();
        UserRealm realm = (UserRealm) rsm.getRealms().iterator().next();
        realm.cla
    }
}
