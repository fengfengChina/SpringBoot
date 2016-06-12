package com.zf.domian;

import javax.persistence.*;

/**
 * HdCity
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_city", schema = "", catalog = "wholesale")
public class HdCity {
    @Id
    @GeneratedValue()
    private Integer cityId;
    private String cityName;
    private Integer provinceId;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public HdCity(Integer cityId) {
        this.cityId = cityId;
    }

    public HdCity() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdCity hdCity = (HdCity) o;

        if (cityId != hdCity.cityId) return false;
        if (cityName != null ? !cityName.equals(hdCity.cityName) : hdCity.cityName != null) return false;
        if (provinceId != null ? !provinceId.equals(hdCity.provinceId) : hdCity.provinceId != null) return false;

        return true;

    }

    @Override
    public int hashCode() {
        int result = cityId;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        return result;
    }
}
