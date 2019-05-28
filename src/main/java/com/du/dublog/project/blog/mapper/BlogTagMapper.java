package com.du.dublog.project.blog.mapper;

import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :博客标签dao层
 * @Date : 2019/5/28 11:40
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface BlogTagMapper {

    int insertBlogTag(@Param("blogId") int blogId,@Param("tagId") Integer tagId);

    void deleteBlogTagByBlogId(Integer blogId);

    List<Integer> selectTagIdsByBlogId(Integer blogId);

    int deleteBlogTagByTagIds(Integer[] ids);

    int selectBlogTagCountByTagId(Integer tagId);
}
