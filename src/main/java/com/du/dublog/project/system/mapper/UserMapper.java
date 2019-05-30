package com.du.dublog.project.system.mapper;

import com.du.dublog.project.system.domain.User;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :用户cao层，数据层
 * @Date : 2019/5/29 17:07
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface UserMapper {

    public List<User> selectUserList(User user);

    public User selectUserByLoginName(String userName);

    public User selectUserByPhoneNumber(String phoneNumber);

    public User selectUserByEmail(String email);

    public User selectUserById(Long userId);

    public int deleteUserById(Long userId);

    public int deleleUserByIds(Long[] ids);

    public int updateUser(User user);

    public int insertUser(User user);

    public int checkLoginName(String loginName);

    public User checkPhoneUnique(String phoneNumber);

    public User checkEmailUnique(String email);
}
