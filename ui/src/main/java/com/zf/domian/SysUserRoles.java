package com.zf.domian;

/**
 * 用户和角色的关联表：
 * @author zf
 * @date 16/6/12
 */
public class SysUserRoles {
    private Integer userRolesId;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 权限id
     */
    private Integer roleId;

    public Integer getUserRolesId() {
        return userRolesId;
    }

    public void setUserRolesId(Integer userRolesId) {
        this.userRolesId = userRolesId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
