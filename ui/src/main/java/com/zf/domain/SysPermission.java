package com.zf.domain;

import org.apache.ibatis.type.Alias;

@Alias("SysPermission")
public class SysPermission {
    private Integer permissionId;

    private String description;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}