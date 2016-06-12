package com.zf.domian;

import javax.persistence.*;

/**
 * 系统角色表
 * @author zf
 * @date 16/3/12
 */
public class SysRole {
    private String roleId;
    private String roleName;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
