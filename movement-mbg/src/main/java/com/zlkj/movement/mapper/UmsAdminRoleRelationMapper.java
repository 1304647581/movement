package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsAdminRoleRelation;
import com.zlkj.movement.model.UmsAdminRoleRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 后台用户和角色关系表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:28
 */
public interface UmsAdminRoleRelationMapper {
    long countByExample(UmsAdminRoleRelationExample example);

    int deleteByExample(UmsAdminRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    List<UmsAdminRoleRelation> selectByExample(UmsAdminRoleRelationExample example);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int updateByExample(@Param("record") UmsAdminRoleRelation record, @Param("example") UmsAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);
}