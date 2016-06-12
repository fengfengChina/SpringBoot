package com.zf.domian;

import javax.persistence.*;

/**
 * HdPerformHistoryConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_perform_history_config", schema = "", catalog = "wholesale")
public class HdPerformHistoryConfig {
    @Id
    @GeneratedValue()
    private int phcId;
    private String beginTime;
    private String endTime;
    private Double discount;

    public int getPhcId() {
        return phcId;
    }

    public void setPhcId(int phcId) {
        this.phcId = phcId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdPerformHistoryConfig that = (HdPerformHistoryConfig) o;

        if (phcId != that.phcId) return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phcId;
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
