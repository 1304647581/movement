package com.zlkj.movement.dao;

import com.zlkj.movement.model.UmsAdminRoleRelation;
import com.zlkj.movement.model.UmsPermission;
import com.zlkj.movement.model.UmsResource;
import com.zlkj.movement.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @Description 后台用户与角色管理自定义Dao
 * @Author HeZeMin
 * @Date 2020年04月20日 10:58
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
