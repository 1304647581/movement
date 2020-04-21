package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMember;
import com.zlkj.movement.model.UmsMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 会员表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:30
 */
public interface UmsMemberMapper {
    long countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    List<UmsMember> selectByExample(UmsMemberExample example);

    UmsMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);
}