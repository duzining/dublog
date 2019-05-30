package com.du.dublog.project.system.mapper;

import com.du.dublog.project.system.domain.Role;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :角色数据层
 * @Date : 2019/5/29 18:00
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface RoleMapper {

    public List<Role> selectRoleList(Role role);

    public List<Role> selectRolesByUSerId(Long userId);

    public Role selectRolesByUserId(Long userId);

    public int deleteRoleById(Long roleId);

    public int deleteRoleByIds(Long[] ids);

    public int updateRole(Role role);

    public int insertRole(Role role);

    public Role checkRoleNameUnique(String roleName);

    public Role checkRoleKeyUnique(String role);
}
