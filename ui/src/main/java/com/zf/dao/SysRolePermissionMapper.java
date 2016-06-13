package com.zf.dao;
import com.zf.domain.SysRolePermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Integer rolePermissionId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Integer rolePermissionId);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}