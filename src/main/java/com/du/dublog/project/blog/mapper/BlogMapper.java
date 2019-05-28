package com.du.dublog.project.blog.mapper;

import com.du.dublog.project.blog.domain.Blog;
import com.du.dublog.project.dashboard.domain.BusinessCommonData;
import com.du.dublog.project.front.domain.Archives;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :博客处理dao层
 * @Date : 2019/5/28 10:24
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface BlogMapper {

    List<Blog> selectBlogList(Blog blog);

    int deleteBlogById(Integer id);

    int deleteBlogByIds(Integer[] ids);

    int updateBlog(Blog blog);

    int insertBlog(Blog blog);

    Blog selectBlogById(Integer id);

    int updateBlogStatusByIds(@Param("blogIds") Integer[] blogIds,@Param("status") String status);

    int updateBlogSupportById(@Param("blogId") Integer blogId,@Param("support") String support);

    int selectBlogCountByStatus(int status);

    Blog selectBlogWithTextById(Integer blogId);

    List<Blog> selectFrontBlogList(Blog blog);

    List<Blog> selectNewestUpdateBlog(int i);

    List<Blog> selectBlogRankingList(int i);

    List<Blog> selectSupportBlogList(int i);

    Blog selectPreviousBlogById(Integer blogId);

    Blog selectNextBlogById(Integer blogId);

    List<Blog> selectRandBlogListLimit(int i);

    List<Blog> selectBlogsByTagId(@Param("tagId") Integer tagId);

    List<Archives> selectArchivesDateAndCount();

    List<Blog> selectBlogByCreateTime(String date);

    int increamentBlogClick(Integer blogId);

    List<BusinessCommonData> selectBlogClickData(@org.apache.ibatis.annotations.Param("startTime") String startTime, @org.apache.ibatis.annotations.Param("endTime") String endTime);
}
