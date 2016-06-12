package com.zf.domian;

import javax.persistence.*;

/**
 * SysGlQx
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "sys_gl_qx", schema = "", catalog = "wholesale")
public class SysGlQx {
    @Id
    @GeneratedValue()
    private String glId;
    private String roleId;
    private Integer fxQx;
    private Integer fwQx;
    private Integer qx1;
    private Integer qx2;
    private Integer qx3;
    private Integer qx4;


    public String getGlId() {
        return glId;
    }

    public void setGlId(String glId) {
        this.glId = glId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getFxQx() {
        return fxQx;
    }

    public void setFxQx(Integer fxQx) {
        this.fxQx = fxQx;
    }

    public Integer getFwQx() {
        return fwQx;
    }

    public void setFwQx(Integer fwQx) {
        this.fwQx = fwQx;
    }

    public Integer getQx1() {
        return qx1;
    }

    public void setQx1(Integer qx1) {
        this.qx1 = qx1;
    }

    public Integer getQx2() {
        return qx2;
    }

    public void setQx2(Integer qx2) {
        this.qx2 = qx2;
    }

    public Integer getQx3() {
        return qx3;
    }

    public void setQx3(Integer qx3) {
        this.qx3 = qx3;
    }

    public Integer getQx4() {
        return qx4;
    }

    public void setQx4(Integer qx4) {
        this.qx4 = qx4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysGlQx sysGlQx = (SysGlQx) o;

        if (glId != null ? !glId.equals(sysGlQx.glId) : sysGlQx.glId != null) return false;
        if (roleId != null ? !roleId.equals(sysGlQx.roleId) : sysGlQx.roleId != null) return false;
        if (fxQx != null ? !fxQx.equals(sysGlQx.fxQx) : sysGlQx.fxQx != null) return false;
        if (fwQx != null ? !fwQx.equals(sysGlQx.fwQx) : sysGlQx.fwQx != null) return false;
        if (qx1 != null ? !qx1.equals(sysGlQx.qx1) : sysGlQx.qx1 != null) return false;
        if (qx2 != null ? !qx2.equals(sysGlQx.qx2) : sysGlQx.qx2 != null) return false;
        if (qx3 != null ? !qx3.equals(sysGlQx.qx3) : sysGlQx.qx3 != null) return false;
        if (qx4 != null ? !qx4.equals(sysGlQx.qx4) : sysGlQx.qx4 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = glId != null ? glId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (fxQx != null ? fxQx.hashCode() : 0);
        result = 31 * result + (fwQx != null ? fwQx.hashCode() : 0);
        result = 31 * result + (qx1 != null ? qx1.hashCode() : 0);
        result = 31 * result + (qx2 != null ? qx2.hashCode() : 0);
        result = 31 * result + (qx3 != null ? qx3.hashCode() : 0);
        result = 31 * result + (qx4 != null ? qx4.hashCode() : 0);
        return result;
    }
}
