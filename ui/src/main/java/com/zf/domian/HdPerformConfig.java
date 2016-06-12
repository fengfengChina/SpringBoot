package com.zf.domian;

import javax.persistence.*;

/**
 * HdPerformConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_perform_config", schema = "", catalog = "wholesale")
public class HdPerformConfig {
    @Id
    @GeneratedValue()
    private int pcId;
    private Integer pcRanking;
    private Double discount;

    public int getPcId() {
        return pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    public Integer getPcRanking() {
        return pcRanking;
    }

    public void setPcRanking(Integer pcRanking) {
        this.pcRanking = pcRanking;
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

        HdPerformConfig that = (HdPerformConfig) o;

        if (pcId != that.pcId) return false;
        if (pcRanking != null ? !pcRanking.equals(that.pcRanking) : that.pcRanking != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pcId;
        result = 31 * result + (pcRanking != null ? pcRanking.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
