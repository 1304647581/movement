package com.zlkj.movement.dao;

import com.zlkj.movement.model.UmsPermission;
import com.zlkj.movement.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @Description 后台用户角色管理自定义Dao
 * @Author HeZeMin
 * @Date 2020年04月20日 17:51
 */
public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
