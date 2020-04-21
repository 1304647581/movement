package com.zlkj.movement.service;


import com.zlkj.movement.model.UmsResourceCategory;

import java.util.List;

/**
 *
 * @Description 后台资源分类管理Service
 * @Author HeZeMin
 * @Date 2020年04月20日 10:59
 */
public interface UmsResourceCategoryService {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Long id);
}
