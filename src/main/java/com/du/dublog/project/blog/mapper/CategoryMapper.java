package com.du.dublog.project.blog.mapper;

import com.du.dublog.project.blog.domain.Category;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :分类的dao层
 * @Date : 2019/5/28 14:09
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface CategoryMapper {

    List<Category>  selectCategoryList(Category category);

    int insertCategory(Category category);

    Category selectCategoryById(Integer categoryId);

    int updateCategory(Category category);

    int deleteCategoryByIds(Integer[] ids);

    int updateCategorySupportById(@Param("categoryId") Integer categoryId,@Param("support") String support);

    Category selectCategoryByCategoryTitle(String title);

    List<Category> selectSupportCategoryList();
}
