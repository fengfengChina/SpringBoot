package com.zf.dao;

import com.zf.domain.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer usedId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer usedId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}