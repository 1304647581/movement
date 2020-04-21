package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsAdminPermissionRelation;
import com.zlkj.movement.model.UmsAdminPermissionRelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * @Author HeZeMin
 * @Date 2020年04月20日 10:26
 */
public interface UmsAdminPermissionRelationMapper {
    long countByExample(UmsAdminPermissionRelationExample example);

    int deleteByExample(UmsAdminPermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermissionRelation record);

    int insertSelective(UmsAdminPermissionRelation record);

    List<UmsAdminPermissionRelation> selectByExample(UmsAdminPermissionRelationExample example);

    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByExample(@Param("record") UmsAdminPermissionRelation record, @Param("example") UmsAdminPermissionRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}