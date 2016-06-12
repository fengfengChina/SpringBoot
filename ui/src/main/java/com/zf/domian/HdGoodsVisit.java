package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsVisit
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_visit", schema = "", catalog = "wholesale")
public class HdGoodsVisit {
    @Id
    @GeneratedValue()
    private int gvId;
    private Integer goodsId;
    private String visitTime;
    private String visitIp;

    public int getGvId() {
        return gvId;
    }

    public void setGvId(int gvId) {
        this.gvId = gvId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsVisit that = (HdGoodsVisit) o;

        if (gvId != that.gvId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (visitTime != null ? !visitTime.equals(that.visitTime) : that.visitTime != null) return false;
        if (visitIp != null ? !visitIp.equals(that.visitIp) : that.visitIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gvId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (visitTime != null ? visitTime.hashCode() : 0);
        result = 31 * result + (visitIp != null ? visitIp.hashCode() : 0);
        return result;
    }
}
