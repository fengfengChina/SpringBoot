package com.zf.domian;

import javax.persistence.*;

/**
 * HdRateConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_rate_config", schema = "", catalog = "wholesale")
public class HdRateConfig {
    @Id
    @GeneratedValue()
    private int rcId;
    private Double annualRate;

    public int getRcId() {
        return rcId;
    }

    public void setRcId(int rcId) {
        this.rcId = rcId;
    }

    public Double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(Double annualRate) {
        this.annualRate = annualRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdRateConfig that = (HdRateConfig) o;

        if (rcId != that.rcId) return false;
        if (annualRate != null ? !annualRate.equals(that.annualRate) : that.annualRate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rcId;
        result = 31 * result + (annualRate != null ? annualRate.hashCode() : 0);
        return result;
    }
}
