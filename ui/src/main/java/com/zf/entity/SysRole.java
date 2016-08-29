package com.zf.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 系统角色
 *
 * @author zf
 * @date 16/8/28
 */
@Entity
@DynamicUpdate
public class SysRole implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sysRoleId;

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(int sysRoleId) {
        this.sysRoleId = sysRoleId;
    }
}
