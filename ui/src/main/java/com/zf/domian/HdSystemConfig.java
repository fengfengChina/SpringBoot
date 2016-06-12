package com.zf.domian;

import javax.persistence.*;

/**
 * HdSystemConfig
 *
 * @author zf
 * @date 16/5/26
 */
@Entity
@Table(name = "hd_system_config", schema = "", catalog = "wholesale")
public class HdSystemConfig {
    @Id
    @GeneratedValue()
    private Integer sc_id;
    private Integer perfectedPoint;
    private Integer businessPoint;

    public Integer getSc_id() {
        return sc_id;
    }

    public void setSc_id(Integer sc_id) {
        this.sc_id = sc_id;
    }

    public Integer getPerfectedPoint() {
        return perfectedPoint;
    }

    public void setPerfectedPoint(Integer perfectedPoint) {
        this.perfectedPoint = perfectedPoint;
    }

    public Integer getBusinessPoint() {
        return businessPoint;
    }

    public void setBusinessPoint(Integer businessPoint) {
        this.businessPoint = businessPoint;
    }
}
