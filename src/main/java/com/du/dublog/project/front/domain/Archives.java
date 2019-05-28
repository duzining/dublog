package com.du.dublog.project.front.domain;

import com.du.dublog.project.blog.domain.Blog;
import lombok.Data;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :归档VO
 * @Date : 2019/5/28 11:38
 * @Version : 1.0
 * @param null
 * @Return
 */
@Data
public class Archives {

    private String date;

    private Integer count;

    private List<Blog> blogs;
}
