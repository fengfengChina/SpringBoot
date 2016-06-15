package com.zf.domain;

import org.apache.ibatis.type.Alias;

@Alias("SysRolePermission")
public class SysRolePermission {
    private Integer rolePermissionId;

    private Integer roleid;

    private Integer permissionId;

    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}