package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsRoleResourceRelation;
import com.zlkj.movement.model.UmsRoleResourceRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 后台角色资源关系表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:44
 */
public interface UmsRoleResourceRelationMapper {
    long countByExample(UmsRoleResourceRelationExample example);

    int deleteByExample(UmsRoleResourceRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsRoleResourceRelation record);

    int insertSelective(UmsRoleResourceRelation record);

    List<UmsRoleResourceRelation> selectByExample(UmsRoleResourceRelationExample example);

    UmsRoleResourceRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsRoleResourceRelation record, @Param("example") UmsRoleResourceRelationExample example);

    int updateByExample(@Param("record") UmsRoleResourceRelation record, @Param("example") UmsRoleResourceRelationExample example);

    int updateByPrimaryKeySelective(UmsRoleResourceRelation record);

    int updateByPrimaryKey(UmsRoleResourceRelation record);
}