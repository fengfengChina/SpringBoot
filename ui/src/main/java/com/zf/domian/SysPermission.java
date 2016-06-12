package com.zf.domian;

import javax.persistence.*;

/**
 * 权限
 * @author zf
 * @date 16/3/12
 */
public class SysPermission {
    /**
     * 权限id
     */
    private Integer permissionId;
    /**
     * 权限名称
     */
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
        this.description = description;
    }
}
