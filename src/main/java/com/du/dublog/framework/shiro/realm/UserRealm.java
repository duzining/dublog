package com.du.dublog.framework.shiro.realm;

import com.du.dublog.common.utils.ShiroUtils;
import com.du.dublog.project.system.domain.User;
import com.du.dublog.project.system.service.MenuService;
import com.du.dublog.project.system.service.RoleService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author : Duzining
 * @Description :自定义Realm处理登录权限
 * @Date : 2019/5/30 16:58
 * @Version : 1.0
 * @param null
 * @Return
 */
public class UserRealm extends AuthorizingRealm{

    @Autowired
    private MenuService menuService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private
    /**
     * @Author : Duzining
     * @Description :授权
     * @Date : 2019/5/30 17:32
     * @Version : 1.0
     * @param principalCollection
     * @Return org.apache.shiro.authz.AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = ShiroUtils.getSysUser();
        Set<String> roles = new HashSet<>();
        Set<String> menus = new HashSet<>();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        if (user.isAdmin()){
            info.addRole("admin");
            info.addStringPermission("*:*:*");
        }else {
            roles = roleService.selectRoleKeys(user.getUserId());
            menus = menuService.selectPermsByUserId(user.getUserId());

            info.setRoles(roles);
            info.setStringPermissions(menus);
        }
        return info;
    }
    /**
     * @Author : Duzining
     * @Description :登录认证
     * @Date : 2019/5/30 17:32
     * @Version : 1.0
     * @param authenticationToken
     * @Return org.apache.shiro.authc.AuthenticationInfo
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        String username = upToken.getUsername();
        String password = "";
        if (upToken.getPassword()!=null){
            password = new String(upToken.getPassword());
        }

        User user =null;
        return null;
    }
}
