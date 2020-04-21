package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMemberStatisticsInfo;
import com.zlkj.movement.model.UmsMemberStatisticsInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 会员统计信息
 * @Author HeZeMin
 * @Date 2020年04月20日 10:37
 */
public interface UmsMemberStatisticsInfoMapper {
    long countByExample(UmsMemberStatisticsInfoExample example);

    int deleteByExample(UmsMemberStatisticsInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberStatisticsInfo record);

    int insertSelective(UmsMemberStatisticsInfo record);

    List<UmsMemberStatisticsInfo> selectByExample(UmsMemberStatisticsInfoExample example);

    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByExample(@Param("record") UmsMemberStatisticsInfo record, @Param("example") UmsMemberStatisticsInfoExample example);

    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}