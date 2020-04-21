package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMemberTask;
import com.zlkj.movement.model.UmsMemberTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 会员任务表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:39
 */
public interface UmsMemberTaskMapper {
    long countByExample(UmsMemberTaskExample example);

    int deleteByExample(UmsMemberTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTask record);

    int insertSelective(UmsMemberTask record);

    List<UmsMemberTask> selectByExample(UmsMemberTaskExample example);

    UmsMemberTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example);

    int updateByExample(@Param("record") UmsMemberTask record, @Param("example") UmsMemberTaskExample example);

    int updateByPrimaryKeySelective(UmsMemberTask record);

    int updateByPrimaryKey(UmsMemberTask record);
}