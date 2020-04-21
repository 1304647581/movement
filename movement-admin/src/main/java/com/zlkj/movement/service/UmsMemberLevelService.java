package com.zlkj.movement.service;

import com.zlkj.movement.model.UmsMemberLevel;
import java.util.List;

/**
 *
 * @Description 会员等级管理Service
 * @Author HeZeMin
 * @Date 2020年04月20日 11:00
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
