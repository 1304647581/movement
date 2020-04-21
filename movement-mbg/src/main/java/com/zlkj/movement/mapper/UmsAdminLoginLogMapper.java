package com.zlkj.movement.mapper;

import com.zlkj.movement.model.UmsAdminLoginLog;
import com.zlkj.movement.model.UmsAdminLoginLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *
 * @Description 后台用户登录日志表
 * @Author HeZeMin
 * @Date 2020年04月20日 10:23
 */
public interface UmsAdminLoginLogMapper {
    long countByExample(UmsAdminLoginLogExample example);

    int deleteByExample(UmsAdminLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);
}