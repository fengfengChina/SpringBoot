package com.zf.domian;

import javax.persistence.*;

/**
 * SysUser
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "sys_user", schema = "", catalog = "wholesale")
public class SysUser {
    @Id
    @GeneratedValue()
    private String userId;
    private String username;
    private String password;
    private String name;
    private String rights;
    private String roleId;
    private String lastLogin;
    private String ip;
    private String status;
    private String bz;
    private String skin;
    private String email;
    private String number;
    private String phone;
    private Integer asUserId;
    private Integer asShopId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAsUserId() {
        return asUserId;
    }

    public void setAsUserId(Integer asUserId) {
        this.asUserId = asUserId;
    }

    public Integer getAsShopId() {
        return asShopId;
    }

    public void setAsShopId(Integer asShopId) {
        this.asShopId = asShopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysUser sysUser = (SysUser) o;

        if (userId != null ? !userId.equals(sysUser.userId) : sysUser.userId != null) return false;
        if (username != null ? !username.equals(sysUser.username) : sysUser.username != null) return false;
        if (password != null ? !password.equals(sysUser.password) : sysUser.password != null) return false;
        if (name != null ? !name.equals(sysUser.name) : sysUser.name != null) return false;
        if (rights != null ? !rights.equals(sysUser.rights) : sysUser.rights != null) return false;
        if (roleId != null ? !roleId.equals(sysUser.roleId) : sysUser.roleId != null) return false;
        if (lastLogin != null ? !lastLogin.equals(sysUser.lastLogin) : sysUser.lastLogin != null) return false;
        if (ip != null ? !ip.equals(sysUser.ip) : sysUser.ip != null) return false;
        if (status != null ? !status.equals(sysUser.status) : sysUser.status != null) return false;
        if (bz != null ? !bz.equals(sysUser.bz) : sysUser.bz != null) return false;
        if (skin != null ? !skin.equals(sysUser.skin) : sysUser.skin != null) return false;
        if (email != null ? !email.equals(sysUser.email) : sysUser.email != null) return false;
        if (number != null ? !number.equals(sysUser.number) : sysUser.number != null) return false;
        if (phone != null ? !phone.equals(sysUser.phone) : sysUser.phone != null) return false;
        if (asUserId != null ? !asUserId.equals(sysUser.asUserId) : sysUser.asUserId != null) return false;
        if (asShopId != null ? !asShopId.equals(sysUser.asShopId) : sysUser.asShopId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rights != null ? rights.hashCode() : 0);
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (skin != null ? skin.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (asUserId != null ? asUserId.hashCode() : 0);
        result = 31 * result + (asShopId != null ? asShopId.hashCode() : 0);
        return result;
    }
}
