package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsSalesItem
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_sales_item", schema = "", catalog = "wholesale")
public class HdGoodsSalesItem {
    @Id
    @GeneratedValue()
    private int gsiId;
    private Integer shopId;

    public HdGoodsSalesItem( Integer goodsId){
        this.goodsId = goodsId;

    }

    private Integer goodsId;
    private Double goodsPrice;
    private String salesTime;
    private Integer userId;
    private Integer gaId;
    private Integer goodsPoint;
    private Integer gsiUsePoint;
    private Integer ggId;

    public int getGsiId() {
        return gsiId;
    }

    public void setGsiId(int gsiId) {
        this.gsiId = gsiId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getSalesTime() {
        return salesTime;
    }

    public void setSalesTime(String salesTime) {
        this.salesTime = salesTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    public Integer getGoodsPoint() {
        return goodsPoint;
    }

    public void setGoodsPoint(Integer goodsPoint) {
        this.goodsPoint = goodsPoint;
    }

    public Integer getGsiUsePoint() {
        return gsiUsePoint;
    }

    public void setGsiUsePoint(Integer gsiUsePoint) {
        this.gsiUsePoint = gsiUsePoint;
    }

    public Integer getGgId() {
        return ggId;
    }

    public void setGgId(Integer ggId) {
        this.ggId = ggId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsSalesItem that = (HdGoodsSalesItem) o;

        if (gsiId != that.gsiId) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsPrice != null ? !goodsPrice.equals(that.goodsPrice) : that.goodsPrice != null) return false;
        if (salesTime != null ? !salesTime.equals(that.salesTime) : that.salesTime != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (gaId != null ? !gaId.equals(that.gaId) : that.gaId != null) return false;
        if (goodsPoint != null ? !goodsPoint.equals(that.goodsPoint) : that.goodsPoint != null) return false;
        if (gsiUsePoint != null ? !gsiUsePoint.equals(that.gsiUsePoint) : that.gsiUsePoint != null) return false;
        if (ggId != null ? !ggId.equals(that.ggId) : that.ggId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gsiId;
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsPrice != null ? goodsPrice.hashCode() : 0);
        result = 31 * result + (salesTime != null ? salesTime.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (gaId != null ? gaId.hashCode() : 0);
        result = 31 * result + (goodsPoint != null ? goodsPoint.hashCode() : 0);
        result = 31 * result + (gsiUsePoint != null ? gsiUsePoint.hashCode() : 0);
        result = 31 * result + (ggId != null ? ggId.hashCode() : 0);
        return result;
    }
}
