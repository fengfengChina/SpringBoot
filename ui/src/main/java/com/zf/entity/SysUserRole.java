package com.zf.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统用户角色中间表
 *
 * @author zf
 * @date 16/8/28
 */
@Entity
@DynamicUpdate
public class SysUserRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userRoleId;

    private int sysRoleId;

    private int sysUserId;

    @OneToOne()
    @JoinColumn(name = "sysRoleId", insertable = false,updatable = false)
    private SysRole role;

    @OneToOne()
    @JoinColumn(name = "sysUserId", insertable = false,updatable = false)
    private SysUser user;

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }




    public int getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public int getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(int sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public int getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(int sysUserId) {
        this.sysUserId = sysUserId;
    }
}
