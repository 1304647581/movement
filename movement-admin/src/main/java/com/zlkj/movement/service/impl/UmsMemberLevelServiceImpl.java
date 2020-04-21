package com.zlkj.movement.service.impl;

import com.zlkj.movement.mapper.UmsMemberLevelMapper;
import com.zlkj.movement.model.UmsMemberLevel;
import com.zlkj.movement.model.UmsMemberLevelExample;
import com.zlkj.movement.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @Description 会员等级管理Service实现类
 * @Author HeZeMin
 * @Date 2020年04月20日 11:03
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
