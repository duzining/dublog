package com.du.dublog.project.system.service.impl;

import com.du.dublog.common.exception.BusinessException;
import com.du.dublog.common.utils.text.Convert;
import com.du.dublog.framework.aspectj.lang.annotation.DataScope;
import com.du.dublog.project.system.domain.User;
import com.du.dublog.project.system.mapper.RoleMapper;
import com.du.dublog.project.system.mapper.UserMapper;
import com.du.dublog.project.system.mapper.UserRoleMapper;
import com.du.dublog.project.system.service.ConfigService;
import com.du.dublog.project.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :
 * @Date : 2019/5/29 17:57
 * @Version : 1.0
 * @param null
 * @Return
 */
@Service
@Slf4j
public class UserServiceImpl  implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private ConfigService configService;

    @Autowired
    private PasswordService passwordService;
    @Override
    @DataScope(tableAlias = "u")
    public List<User> selectUserList(User user) {
        return userMapper.selectUserList(user);
    }

    @Override
    public User selectUserByLoginName(String userName) {
        return userMapper.selectUserByLoginName(userName);
    }

    @Override
    public User selectUserByPhoneNumber(String phoneNumber) {
        return userMapper.selectUserByPhoneNumber(phoneNumber);
    }

    @Override
    public User selectUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }

    @Override
    public User selectUserById(Long userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public int deleteUserById(Long userId) {

        userRoleMapper.deleteUserRoleById(userId);
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int deleteUserByIds(String ids) throws Exception {
        Long[] userIds = Convert.toLongArray(ids);
        for (Long userId: userIds
             ) {
            if (User.isAdmin(userId)){
                throw new BusinessException("不允许删除超级管理员用户");
            }
        }
        return userMapper.deleleUserByIds(userIds);
    }

    @Override
    public int insertUser(User user) {
        user.randomSalt();
        user.setPassword(passwordService);
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int updateUserInfo(User user) {
        return 0;
    }

    @Override
    public int resetUserPwd(User user) {
        return 0;
    }

    @Override
    public String checkLoginNameUnique(String loginName) {
        return null;
    }

    @Override
    public String checkPhoneUnique(User user) {
        return null;
    }

    @Override
    public String checkEmailUnique(User user) {
        return null;
    }

    @Override
    public String selectUserRoleGroup(Long userId) {
        return null;
    }

    @Override
    public String importUser(List<User> userList, Boolean isUpdateSupport) {
        return null;
    }

    @Override
    public int changeStatus(User user) {
        return 0;
    }
}
