package com.du.dublog.project.system.mapper;

import com.du.dublog.project.system.domain.Menu;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @Author : Duzining
 * @Description :
 * @Date : 2019/5/30 11:12
 * @Version : 1.0
 * @param null
 * @Return 
 */
public interface MenuMapper {

    public List<Menu> selectMenuAll();

    public List<Menu> selectMenuNormalAll();

    public List<Menu> selectMenuByUserId(Long userId);

    public List<String> selectPermsByUserId(Long userId);

    public List<String> selectMenuTree(Long roleId);

    public List<Menu> selectMenuList(Menu menu);

    public int deleteMenuById(Long menuId);

    public Menu selectMenuById(Long menuId);

    public int selectCountMenuByParentId(Long parentId);

    public int insertMenu(Menu menu);

    public int updateMenu(Menu menu);

    public Menu checkMenuNameUnique(@Param("menuName") String menuName, @Param("parentId") Long parentId);
}
