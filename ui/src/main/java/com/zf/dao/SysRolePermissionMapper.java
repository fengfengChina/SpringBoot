package src/main/java/com/zf/dao;

import src/main/java/com/zf/domain.SysRolePermission;

public interface SysRolePermissionMapper {
    int deleteByPrimaryKey(Integer rolePermissionId);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Integer rolePermissionId);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}