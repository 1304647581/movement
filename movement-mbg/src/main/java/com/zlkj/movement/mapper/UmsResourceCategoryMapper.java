package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsResourceCategory;
import com.zlkj.movement.model.UmsResourceCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 资源分类表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:40
 */
public interface UmsResourceCategoryMapper {
    long countByExample(UmsResourceCategoryExample example);

    int deleteByExample(UmsResourceCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsResourceCategory record);

    int insertSelective(UmsResourceCategory record);

    List<UmsResourceCategory> selectByExample(UmsResourceCategoryExample example);

    UmsResourceCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example);

    int updateByExample(@Param("record") UmsResourceCategory record, @Param("example") UmsResourceCategoryExample example);

    int updateByPrimaryKeySelective(UmsResourceCategory record);

    int updateByPrimaryKey(UmsResourceCategory record);
}