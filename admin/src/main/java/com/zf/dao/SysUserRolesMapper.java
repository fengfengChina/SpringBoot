package com.zf.dao;
import com.zf.domain.SysUserRoles;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserRolesMapper {
    int deleteByPrimaryKey(Integer userRolesId);

    int insert(SysUserRoles record);

    int insertSelective(SysUserRoles record);

    SysUserRoles selectByPrimaryKey(Integer userRolesId);

    int updateByPrimaryKeySelective(SysUserRoles record);

    int updateByPrimaryKey(SysUserRoles record);
}