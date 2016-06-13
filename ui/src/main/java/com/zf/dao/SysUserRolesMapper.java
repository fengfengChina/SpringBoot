package src/main/java/com/zf/dao;

import src/main/java/com/zf/domain.SysUserRoles;

public interface SysUserRolesMapper {
    int deleteByPrimaryKey(Integer userRolesId);

    int insert(SysUserRoles record);

    int insertSelective(SysUserRoles record);

    SysUserRoles selectByPrimaryKey(Integer userRolesId);

    int updateByPrimaryKeySelective(SysUserRoles record);

    int updateByPrimaryKey(SysUserRoles record);
}