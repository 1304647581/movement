package com.zlkj.movement.dao;

import com.zlkj.movement.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @Description 用户权限自定义Dao
 * @Author HeZeMin
 * @Date 2020年04月20日 10:57
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
