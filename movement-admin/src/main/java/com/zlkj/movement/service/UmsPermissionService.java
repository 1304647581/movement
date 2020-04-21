package com.zlkj.movement.service;

import com.zlkj.movement.dto.UmsPermissionNode;
import com.zlkj.movement.model.UmsPermission;

import java.util.List;

/**
 *
 * @Description 后台用户权限管理Service
 * @Author HeZeMin
 * @Date 2020年04月20日 10:59
 */
public interface UmsPermissionService {
    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id, UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
}
