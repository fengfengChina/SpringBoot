package com.zf.domian;

import javax.persistence.*;

/**
 * HdProvince
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_province", schema = "", catalog = "wholesale")
public class HdProvince {
    @Id
    @GeneratedValue()
    private int provinceId;
    private String provinceName;

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public HdProvince(String provinceName) {
        this.provinceName = provinceName;
    }
    public HdProvince(Integer provinceId){
        this.provinceId = provinceId;
    }

    public HdProvince() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdProvince that = (HdProvince) o;

        if (provinceId != that.provinceId) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provinceId;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        return result;
    }
}
