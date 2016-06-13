package src/main/java/com/zf/dao;

import src/main/java/com/zf/domain.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}