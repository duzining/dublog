package com.du.dublog.project.blog.domain;

import com.du.dublog.framework.web.domain.BaseEntity;
import lombok.Data;

/**
 * @Author : Duzining
 * @Description :标签
 * @Date : 2019/5/28 10:21
 * @Version : 1.0
 * @param null
 * @Return
 */
@Data
public class Tag extends BaseEntity{
    private static final long serialVersionUID = 1L;

    private Integer tagId;

    private String tagTitle;

    /**
     * 关联的博客个数
     */
    private int count;
}
