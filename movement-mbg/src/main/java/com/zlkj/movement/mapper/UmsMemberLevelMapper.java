package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMemberLevel;
import com.zlkj.movement.model.UmsMemberLevelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 会员等级表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:29
 */
public interface UmsMemberLevelMapper {
    long countByExample(UmsMemberLevelExample example);

    int deleteByExample(UmsMemberLevelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    int updateByExample(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}