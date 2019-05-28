package com.du.dublog.project.blog.mapper;

import com.du.dublog.project.blog.domain.Tag;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :标签的dao层
 * @Date : 2019/5/28 14:19
 * @Version : 1.0
 * @param null
 * @Return 
 */
public interface TagMapper {

    int deleteTagByIds(Integer[] ids);

    List<Tag> selectTagList(Tag tag);

    int insertTag(Tag tag);

    Tag selectTagById(Integer tagId);

    int updateTag(Tag tag);

    Tag selectTagByTagTitle(String tag);

    List<Integer> selectTagIdsByTagTitles(@Param("tagTitles") String [] tagTitles);
}
