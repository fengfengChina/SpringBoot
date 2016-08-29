package com.zf.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统角色菜单中间表
 *
 * @author zf
 * @date 16/8/28
 */
@Entity
@DynamicUpdate
public class SysRoleMenu  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sysRoleMenuId;

    private int sysMenuId;

    private int sysRoleId;

    @OneToOne()
    @JoinColumn(name = "sysMenuId", insertable = false,updatable = false)
    private SysMenu menu;

    @OneToOne()
    @JoinColumn(name = "sysRoleId", insertable = false,updatable = false)
    private SysRole role;


    public SysMenu getMenu() {
        return menu;
    }

    public void setMenu(SysMenu menu) {
        this.menu = menu;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public int getSysRoleMenuId() {
        return sysRoleMenuId;
    }

    public void setSysRoleMenuId(int sysRoleMenuId) {
        this.sysRoleMenuId = sysRoleMenuId;
    }

    public int getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(int sysMenuId) {
        this.sysMenuId = sysMenuId;
    }

    public int getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(int sysRoleId) {
        this.sysRoleId = sysRoleId;
    }
}
