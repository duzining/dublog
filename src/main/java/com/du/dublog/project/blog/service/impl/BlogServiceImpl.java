package com.du.dublog.project.blog.service.impl;

import com.du.dublog.project.blog.domain.Blog;
import com.du.dublog.project.blog.mapper.BlogMapper;
import com.du.dublog.project.blog.service.BlogService;
import com.du.dublog.project.dashboard.domain.BusinessCommonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :博客业务service层
 * @Date : 2019/5/28 16:36
 * @Version : 1.0
 * @param null
 * @Return
 */
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public List<Blog> selectBlogList(Blog blog) {
        return blogMapper.selectBlogList(blog);
    }

    @Override
    public int insertBlog(Blog blog) {
        return ;
    }

    @Override
    public Blog selectBlogById(Integer blogId) {
        return null;
    }

    @Override
    public int updateBlog(Blog blog) {
        return 0;
    }

    @Override
    public int updateBlogSupportById(Integer blogId, String support) {
        return 0;
    }

    @Override
    public int updateBlogStatusById(String blogIds, String status) {
        return 0;
    }

    @Override
    public int deleteBlogById(Integer[] ids) {
        return 0;
    }

    @Override
    public int selectBlogCountByStatus(int status) {
        return 0;
    }

    @Override
    public Blog selectBlogWithTextAndTagsAndCategoryByBlogId(Integer blogId) {
        return null;
    }

    @Override
    public List<Blog> selectNewestUpdateBlog() {
        return null;
    }

    @Override
    public List<Blog> selectBlogRanking() {
        return null;
    }

    @Override
    public List<Blog> selectSupportBlog() {
        return null;
    }

    @Override
    public Blog selectPreviousBlogById(Integer blogId) {
        return null;
    }

    @Override
    public Blog selectNextBlogById(Integer blogId) {
        return null;
    }

    @Override
    public List<Blog> selectRandBlogList() {
        return null;
    }

    @Override
    public List<Blog> selectBlogListByTagId(Integer tagId) {
        return null;
    }

    @Override
    public List<BusinessCommonData> selectBlogClickData(String startTime, String endTime) {
        return null;
    }
}
