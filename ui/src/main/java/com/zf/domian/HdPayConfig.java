package com.zf.domian;

import javax.persistence.*;

/**
 * HdPayConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_pay_config", schema = "", catalog = "wholesale")
public class HdPayConfig {
    @Id
    @GeneratedValue()
    private int pcId;
    private String pcCode;
    private String pcName;
    private Integer pcOrder;
    private String pcConfig;
    private String enabled;

    public int getPcId() {
        return pcId;
    }

    public void setPcId(int pcId) {
        this.pcId = pcId;
    }

    public String getPcCode() {
        return pcCode;
    }

    public void setPcCode(String pcCode) {
        this.pcCode = pcCode;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public Integer getPcOrder() {
        return pcOrder;
    }

    public void setPcOrder(Integer pcOrder) {
        this.pcOrder = pcOrder;
    }

    public String getPcConfig() {
        return pcConfig;
    }

    public void setPcConfig(String pcConfig) {
        this.pcConfig = pcConfig;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdPayConfig that = (HdPayConfig) o;

        if (pcId != that.pcId) return false;
        if (pcCode != null ? !pcCode.equals(that.pcCode) : that.pcCode != null) return false;
        if (pcName != null ? !pcName.equals(that.pcName) : that.pcName != null) return false;
        if (pcOrder != null ? !pcOrder.equals(that.pcOrder) : that.pcOrder != null) return false;
        if (pcConfig != null ? !pcConfig.equals(that.pcConfig) : that.pcConfig != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pcId;
        result = 31 * result + (pcCode != null ? pcCode.hashCode() : 0);
        result = 31 * result + (pcName != null ? pcName.hashCode() : 0);
        result = 31 * result + (pcOrder != null ? pcOrder.hashCode() : 0);
        result = 31 * result + (pcConfig != null ? pcConfig.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
