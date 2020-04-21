package com.zlkj.movement.mapper;

import com.zlkj.movement.model.SmsHomeAdvertise;
import com.zlkj.movement.model.SmsHomeAdvertiseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 首页轮播广告表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:21
 */
public interface SmsHomeAdvertiseMapper {
    long countByExample(SmsHomeAdvertiseExample example);

    int deleteByExample(SmsHomeAdvertiseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertise record);

    int insertSelective(SmsHomeAdvertise record);

    List<SmsHomeAdvertise> selectByExample(SmsHomeAdvertiseExample example);

    SmsHomeAdvertise selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    int updateByExample(@Param("record") SmsHomeAdvertise record, @Param("example") SmsHomeAdvertiseExample example);

    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    int updateByPrimaryKey(SmsHomeAdvertise record);
}