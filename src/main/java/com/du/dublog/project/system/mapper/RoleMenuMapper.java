package com.du.dublog.project.system.mapper;

import com.du.dublog.project.system.domain.RoleMenu;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :角色和菜单数据层
 * @Date : 2019/5/30 9:20
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface RoleMenuMapper {

    public int deleteRoleMenuByRoleId(Long roleId);

    public int deleteRoleMenu(Long[] ids);

    public int selectCountRoleMenuByMenuId(Long menuId);

    public int batchRoleMenu(List<RoleMenu> roleMenuList);
}
