package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserStatistics
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_statistics", schema = "", catalog = "wholesale")
public class HdUserStatistics {
    @Id
    @GeneratedValue()
    private int usId;
    private String ip;
    private Integer userId;
    private String ipProvince;
    private String ipCity;
    private String ipTime;


    public int getUsId() {
        return usId;
    }

    public void setUsId(int usId) {
        this.usId = usId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIpProvince() {
        return ipProvince;
    }

    public void setIpProvince(String ipProvince) {
        this.ipProvince = ipProvince;
    }

    public String getIpCity() {
        return ipCity;
    }

    public void setIpCity(String ipCity) {
        this.ipCity = ipCity;
    }

    public String getIpTime() {
        return ipTime;
    }

    public void setIpTime(String ipTime) {
        this.ipTime = ipTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserStatistics that = (HdUserStatistics) o;

        if (usId != that.usId) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (ipProvince != null ? !ipProvince.equals(that.ipProvince) : that.ipProvince != null) return false;
        if (ipCity != null ? !ipCity.equals(that.ipCity) : that.ipCity != null) return false;
        if (ipTime != null ? !ipTime.equals(that.ipTime) : that.ipTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usId;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (ipProvince != null ? ipProvince.hashCode() : 0);
        result = 31 * result + (ipCity != null ? ipCity.hashCode() : 0);
        result = 31 * result + (ipTime != null ? ipTime.hashCode() : 0);
        return result;
    }
}
