package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

/**
 * HdGoodsAttrName
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_attr_name", schema = "", catalog = "wholesale")
public class HdGoodsAttrName {
    @Id
    @GeneratedValue()
    private int ganId;
    private String ganName;
    private Integer gatId;
    private String isRequired;
    private String isMultiple;
    private Integer ganOrder;
    private String createTime;


    public int getGanId() {
        return ganId;
    }

    public void setGanId(int ganId) {
        this.ganId = ganId;
    }


    public String getGanName() {
        return ganName;
    }

    public void setGanName(String ganName) {
        this.ganName = ganName;
    }


    public Integer getGatId() {
        return gatId;
    }

    public void setGatId(Integer gatId) {
        this.gatId = gatId;
    }


    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }


    public String getIsMultiple() {
        return isMultiple;
    }

    public void setIsMultiple(String isMultiple) {
        this.isMultiple = isMultiple;
    }


    public Integer getGanOrder() {
        return ganOrder;
    }

    public void setGanOrder(Integer ganOrder) {
        this.ganOrder = ganOrder;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsAttrName that = (HdGoodsAttrName) o;

        if (ganId != that.ganId) return false;
        if (ganName != null ? !ganName.equals(that.ganName) : that.ganName != null) return false;
        if (gatId != null ? !gatId.equals(that.gatId) : that.gatId != null) return false;
        if (isRequired != null ? !isRequired.equals(that.isRequired) : that.isRequired != null) return false;
        if (isMultiple != null ? !isMultiple.equals(that.isMultiple) : that.isMultiple != null) return false;
        if (ganOrder != null ? !ganOrder.equals(that.ganOrder) : that.ganOrder != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ganId;
        result = 31 * result + (ganName != null ? ganName.hashCode() : 0);
        result = 31 * result + (gatId != null ? gatId.hashCode() : 0);
        result = 31 * result + (isRequired != null ? isRequired.hashCode() : 0);
        result = 31 * result + (isMultiple != null ? isMultiple.hashCode() : 0);
        result = 31 * result + (ganOrder != null ? ganOrder.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
