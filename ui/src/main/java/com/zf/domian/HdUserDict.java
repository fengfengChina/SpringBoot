package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserDict
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_dict", schema = "", catalog = "wholesale")
public class HdUserDict {
    @Id
    @GeneratedValue()
    private int udId;
    private String udType;
    private String udName;

    @Id
    @Column(name = "ud_id", nullable = false, insertable = true, updatable = true)
    public int getUdId() {
        return udId;
    }

    public void setUdId(int udId) {
        this.udId = udId;
    }


    @Column(name = "ud_type", nullable = true, insertable = true, updatable = true, length = 16)
    public String getUdType() {
        return udType;
    }

    public void setUdType(String udType) {
        this.udType = udType;
    }


    @Column(name = "ud_name", nullable = true, insertable = true, updatable = true, length = 60)
    public String getUdName() {
        return udName;
    }

    public void setUdName(String udName) {
        this.udName = udName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserDict that = (HdUserDict) o;

        if (udId != that.udId) return false;
        if (udType != null ? !udType.equals(that.udType) : that.udType != null) return false;
        if (udName != null ? !udName.equals(that.udName) : that.udName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = udId;
        result = 31 * result + (udType != null ? udType.hashCode() : 0);
        result = 31 * result + (udName != null ? udName.hashCode() : 0);
        return result;
    }
}
