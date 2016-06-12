package com.zf.domian;

import javax.persistence.*;

/**
 * HdArea
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_area", schema = "", catalog = "wholesale")
public class HdArea {
    @Id
    @GeneratedValue()
    private int areaId;
    private String areaName;
    private Integer provinceId;
    private Integer cityId;

    public HdArea() {
    }

    public HdArea(int areaId) {
        this.areaId = areaId;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }


    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }


    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdArea hdArea = (HdArea) o;

        if (areaId != hdArea.areaId) return false;
        if (areaName != null ? !areaName.equals(hdArea.areaName) : hdArea.areaName != null) return false;
        if (provinceId != null ? !provinceId.equals(hdArea.provinceId) : hdArea.provinceId != null) return false;
        if (cityId != null ? !cityId.equals(hdArea.cityId) : hdArea.cityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = areaId;
        result = 31 * result + (areaName != null ? areaName.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        return result;
    }
}
