package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsAssociated
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_associated", schema = "", catalog = "wholesale")
public class HdGoodsAssociated {
    @Id
    @GeneratedValue()
    private int gaId;
    private Integer goodsId;
    private String associaIds;

    public int getGaId() {
        return gaId;
    }

    public void setGaId(int gaId) {
        this.gaId = gaId;
    }


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }


    public String getAssociaIds() {
        return associaIds;
    }

    public void setAssociaIds(String associaIds) {
        this.associaIds = associaIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsAssociated that = (HdGoodsAssociated) o;

        if (gaId != that.gaId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (associaIds != null ? !associaIds.equals(that.associaIds) : that.associaIds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gaId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (associaIds != null ? associaIds.hashCode() : 0);
        return result;
    }
}
