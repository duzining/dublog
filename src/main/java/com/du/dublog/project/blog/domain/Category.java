package com.du.dublog.project.blog.domain;

import com.du.dublog.framework.web.domain.BaseEntity;
import lombok.Data;
/**
 * @Author : Duzining
 * @Description :分类实体类
 * @Date : 2019/5/28 10:16
 * @Version : 1.0
 * @param null
 * @Return
 */
@Data
public class Category extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Integer categoryId;

    private String categoryTitle;

    private Integer weight;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否推荐，0表示不推荐，1表示推荐
     */
    private String support;


}
