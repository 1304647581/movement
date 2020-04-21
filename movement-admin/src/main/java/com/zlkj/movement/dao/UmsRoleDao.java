package com.zlkj.movement.dao;

import com.zlkj.movement.model.UmsMenu;
import com.zlkj.movement.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @Description 后台用户角色自定义Dao
 * @Author HeZeMin
 * @Date 2020年04月20日 10:58
 */
public interface UmsRoleDao {
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
