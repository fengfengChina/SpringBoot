package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsParameter
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_parameter", schema = "", catalog = "wholesale")
public class HdGoodsParameter {
    @Id
    @GeneratedValue()
    private int gpId;
    private Integer goodsId;
    private String gpText;
    private String gpType;

    public int getGpId() {
        return gpId;
    }

    public void setGpId(int gpId) {
        this.gpId = gpId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGpText() {
        return gpText;
    }

    public void setGpText(String gpText) {
        this.gpText = gpText;
    }

    public String getGpType() {
        return gpType;
    }

    public void setGpType(String gpType) {
        this.gpType = gpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsParameter that = (HdGoodsParameter) o;

        if (gpId != that.gpId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (gpText != null ? !gpText.equals(that.gpText) : that.gpText != null) return false;
        if (gpType != null ? !gpType.equals(that.gpType) : that.gpType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gpId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (gpText != null ? gpText.hashCode() : 0);
        result = 31 * result + (gpType != null ? gpType.hashCode() : 0);
        return result;
    }
}
