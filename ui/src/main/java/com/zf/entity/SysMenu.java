package com.zf.entity;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * 系统菜单
 *
 * @author zf
 * @date 16/8/28
 */
@Entity
@DynamicUpdate
public class SysMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sysMenuId;

    private String menuUrl;

    private int parentId;

    private int menuOrder;

    private int menuIcon;

    private int add;

    private int update;

    private int delete;

    private int select;

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    public int getDelete() {
        return delete;
    }

    public void setDelete(int delete) {
        this.delete = delete;
    }

    public int getSelect() {
        return select;
    }

    public void setSelect(int select) {
        this.select = select;
    }

    public int getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(int sysMenuId) {
        this.sysMenuId = sysMenuId;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public int getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(int menuIcon) {
        this.menuIcon = menuIcon;
    }
}
