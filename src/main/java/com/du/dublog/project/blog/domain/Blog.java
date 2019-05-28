package com.du.dublog.project.blog.domain;

import com.du.dublog.framework.web.domain.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :博客实体类
 * @Date : 2019/5/28 10:04
 * @Version : 1.0
 * @param null
 * @Return
 */
@Data
public class Blog extends BaseEntity{

    private static final long serialVersionUID = 1L;

    private Integer blogId;

    private Integer categoryId;

    private String title;

    private  String summary;

    /**
     * 博文状态，1表示已经发表，2表示在草稿箱，3表示在垃圾箱
     */
    private String status;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 是否推荐，Y表示推荐，N表示不推荐
     */
    private String support;

    private Integer click;

    private String headerImg;

    /**
     * 博文类型，1表示markdown，2表示富文本
     */
    private String type;

    private String content;

    private List<Tag> tagList;

    /**
     * 从页面获取或者传到页面的tags
     */
    private String[] tags;

    private String categoryTitle;

    private Category category;
}
