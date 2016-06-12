package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsAttrType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_attr_type", schema = "", catalog = "wholesale")
public class HdGoodsAttrType {
    @Id
    @GeneratedValue()
    private int gatId;
    private String gatName;
    private Integer gatOrder;
    private String createTime;


    public int getGatId() {
        return gatId;
    }

    public void setGatId(int gatId) {
        this.gatId = gatId;
    }

    public String getGatName() {
        return gatName;
    }

    public void setGatName(String gatName) {
        this.gatName = gatName;
    }

    public Integer getGatOrder() {
        return gatOrder;
    }

    public void setGatOrder(Integer gatOrder) {
        this.gatOrder = gatOrder;
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

        HdGoodsAttrType that = (HdGoodsAttrType) o;

        if (gatId != that.gatId) return false;
        if (gatName != null ? !gatName.equals(that.gatName) : that.gatName != null) return false;
        if (gatOrder != null ? !gatOrder.equals(that.gatOrder) : that.gatOrder != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gatId;
        result = 31 * result + (gatName != null ? gatName.hashCode() : 0);
        result = 31 * result + (gatOrder != null ? gatOrder.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
