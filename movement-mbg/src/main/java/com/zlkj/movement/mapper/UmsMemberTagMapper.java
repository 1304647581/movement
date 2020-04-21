package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMemberTag;
import com.zlkj.movement.model.UmsMemberTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 用户标签表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:38
 */
public interface UmsMemberTagMapper {
    long countByExample(UmsMemberTagExample example);

    int deleteByExample(UmsMemberTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByExample(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);
}