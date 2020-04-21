package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsMenu;
import com.zlkj.movement.model.UmsMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 后台菜单表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:39
 */
public interface UmsMenuMapper {
    long countByExample(UmsMenuExample example);

    int deleteByExample(UmsMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMenu record);

    int insertSelective(UmsMenu record);

    List<UmsMenu> selectByExample(UmsMenuExample example);

    UmsMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    int updateByExample(@Param("record") UmsMenu record, @Param("example") UmsMenuExample example);

    int updateByPrimaryKeySelective(UmsMenu record);

    int updateByPrimaryKey(UmsMenu record);
}