package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsActivity
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_activity", schema = "", catalog = "wholesale")
public class HdGoodsActivity {
    @Id
    @GeneratedValue()
    private int gaId;
    private String gaName;
    private String beginTime;
    private String endTime;
    private String gaRange;
    private String rangeIds;
    private Integer minAmount;
    private String gaType;
    private Integer typeExt;
    private Integer gaOrder;

    public int getGaId() {
        return gaId;
    }

    public void setGaId(int gaId) {
        this.gaId = gaId;
    }


    public String getGaName() {
        return gaName;
    }

    public void setGaName(String gaName) {
        this.gaName = gaName;
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


    public String getGaRange() {
        return gaRange;
    }

    public void setGaRange(String gaRange) {
        this.gaRange = gaRange;
    }


    public String getRangeIds() {
        return rangeIds;
    }

    public void setRangeIds(String rangeIds) {
        this.rangeIds = rangeIds;
    }


    public Integer getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
    }


    public String getGaType() {
        return gaType;
    }

    public void setGaType(String gaType) {
        this.gaType = gaType;
    }


    public Integer getTypeExt() {
        return typeExt;
    }

    public void setTypeExt(Integer typeExt) {
        this.typeExt = typeExt;
    }


    public Integer getGaOrder() {
        return gaOrder;
    }

    public void setGaOrder(Integer gaOrder) {
        this.gaOrder = gaOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsActivity that = (HdGoodsActivity) o;

        if (gaId != that.gaId) return false;
        if (gaName != null ? !gaName.equals(that.gaName) : that.gaName != null) return false;
        if (beginTime != null ? !beginTime.equals(that.beginTime) : that.beginTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (gaRange != null ? !gaRange.equals(that.gaRange) : that.gaRange != null) return false;
        if (rangeIds != null ? !rangeIds.equals(that.rangeIds) : that.rangeIds != null) return false;
        if (minAmount != null ? !minAmount.equals(that.minAmount) : that.minAmount != null) return false;
        if (gaType != null ? !gaType.equals(that.gaType) : that.gaType != null) return false;
        if (typeExt != null ? !typeExt.equals(that.typeExt) : that.typeExt != null) return false;
        if (gaOrder != null ? !gaOrder.equals(that.gaOrder) : that.gaOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gaId;
        result = 31 * result + (gaName != null ? gaName.hashCode() : 0);
        result = 31 * result + (beginTime != null ? beginTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (gaRange != null ? gaRange.hashCode() : 0);
        result = 31 * result + (rangeIds != null ? rangeIds.hashCode() : 0);
        result = 31 * result + (minAmount != null ? minAmount.hashCode() : 0);
        result = 31 * result + (gaType != null ? gaType.hashCode() : 0);
        result = 31 * result + (typeExt != null ? typeExt.hashCode() : 0);
        result = 31 * result + (gaOrder != null ? gaOrder.hashCode() : 0);
        return result;
    }
}
