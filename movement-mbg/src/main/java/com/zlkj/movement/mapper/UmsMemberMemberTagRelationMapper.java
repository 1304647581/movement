package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMemberMemberTagRelation;
import com.zlkj.movement.model.UmsMemberMemberTagRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 用户和标签关系表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:32
 */
public interface UmsMemberMemberTagRelationMapper {
    long countByExample(UmsMemberMemberTagRelationExample example);

    int deleteByExample(UmsMemberMemberTagRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    List<UmsMemberMemberTagRelation> selectByExample(UmsMemberMemberTagRelationExample example);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int updateByExample(@Param("record") UmsMemberMemberTagRelation record, @Param("example") UmsMemberMemberTagRelationExample example);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}