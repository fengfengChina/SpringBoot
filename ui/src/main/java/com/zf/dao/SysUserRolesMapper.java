package com.zf.dao;

import com.zf.domain.SysUserRoles;
import org.apache.ibatis.annotations.*;

public interface SysUserRolesMapper  {
    @Delete("delete from sys_user_roles where user_roles_id = #{userRolesId}")
    int deleteByPrimaryKey(Integer userRolesId);
    @Insert("insert into sys_user_roles (user_id,role_id) values (#{userId}, #{roleId})")
    int insert(SysUserRoles record);
    @Insert("insert into ")
    int insertSelective(SysUserRoles record);
    @Select("select * from user_sys_user_roles where user_roles_id = #{userRolesId}")
    SysUserRoles selectByPrimaryKey(Integer userRolesId);
    @Update("update from user_sys_user_roles where user_roles_id = #{userRolesId} ")
    int updateByPrimaryKeySelective(SysUserRoles record);
}