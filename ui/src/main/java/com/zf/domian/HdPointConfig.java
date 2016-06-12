package com.zf.domian;

import javax.persistence.*;

/**
 * HdPointConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_point_config", schema = "", catalog = "wholesale")
public class HdPointConfig {
    @Id
    @GeneratedValue()
    private int pcId;
    private Integer pointExchange;
    private Integer moneyExchange;

    public int getPcId() {
        return pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    public Integer getPointExchange() {
        return pointExchange;
    }

    public void setPointExchange(Integer pointExchange) {
        this.pointExchange = pointExchange;
    }

    public Integer getMoneyExchange() {
        return moneyExchange;
    }

    public void setMoneyExchange(Integer moneyExchange) {
        this.moneyExchange = moneyExchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdPointConfig that = (HdPointConfig) o;

        if (pcId != that.pcId) return false;
        if (pointExchange != null ? !pointExchange.equals(that.pointExchange) : that.pointExchange != null)
            return false;
        if (moneyExchange != null ? !moneyExchange.equals(that.moneyExchange) : that.moneyExchange != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pcId;
        result = 31 * result + (pointExchange != null ? pointExchange.hashCode() : 0);
        result = 31 * result + (moneyExchange != null ? moneyExchange.hashCode() : 0);
        return result;
    }
}
