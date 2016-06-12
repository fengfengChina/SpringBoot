package com.zf.domian;

import javax.persistence.*;

/**
 * HdTypeGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_type_goods", schema = "", catalog = "wholesale")
public class HdTypeGoods {
    @Id
    @GeneratedValue()
    private int tgId;
    private Integer goodsId;
    private String gtIds;

    public int getTgId() {
        return tgId;
    }

    public void setTgId(int tgId) {
        this.tgId = tgId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGtIds() {
        return gtIds;
    }

    public void setGtIds(String gtIds) {
        this.gtIds = gtIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdTypeGoods that = (HdTypeGoods) o;

        if (tgId != that.tgId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (gtIds != null ? !gtIds.equals(that.gtIds) : that.gtIds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tgId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (gtIds != null ? gtIds.hashCode() : 0);
        return result;
    }
}
