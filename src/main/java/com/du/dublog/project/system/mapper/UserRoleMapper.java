package com.du.dublog.project.system.mapper;

import com.du.dublog.project.system.domain.UserRole;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :用户和角色关联数据层
 * @Date : 2019/5/29 17:44
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface UserRoleMapper {

    public int deleteUserRoleById(Long userId);

    public int deleteUserRole(Long[] ids);

    public int countUserRoleByRoleId(Long roleId);

    public int batchUserRole(List<UserRole> userRoleList);
}
