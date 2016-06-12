package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * HdOrderGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_order_goods", schema = "", catalog = "wholesale")
public class HdOrderGoods {
    @Id
    @GeneratedValue()
    private int ogId;
    private Integer orderId;
    private Integer goodsId;
    private String goodsName;
    private String goodsSn;
    @Transient
    private Integer goodsNumber;
    private Double marketPrice;
    private Double salesPrice;
    private Double standardPrice;
    private Integer gsId;
    private String gsName;
    private Double extraPrice;
    private String createTime;
    private int goodsAmount;
    private Integer skuId;

    @OneToOne(cascade = {CascadeType.DETACH},optional = false)
    @JoinColumn(name = "goodsId",insertable = false,updatable = false)
    private HdGoods hdGoods;

    @Transient
    private List<HdGoodsAttr> attrs;

    public HdOrderGoods() {
    }

    public HdOrderGoods(Integer orderId, Integer goodsId, String goodsName, String goodsSn, Integer goodsAmount, Double marketPrice,  String createTime) {
        this.orderId = orderId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsSn = goodsSn;
        this.goodsAmount = goodsAmount;
        this.marketPrice = marketPrice;
        this.createTime = createTime;
    }

    public List<HdGoodsAttr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<HdGoodsAttr> attrs) {
        this.attrs = attrs;
    }

    public int getOgId() {
        return ogId;
    }

    public void setOgId(int ogId) {
        this.ogId = ogId;
    }


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }


    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }


    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }


    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }


    public Double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Double standardPrice) {
        this.standardPrice = standardPrice;
    }


    public Integer getGsId() {
        return gsId;
    }

    public void setGsId(Integer gsId) {
        this.gsId = gsId;
    }


    public String getGsName() {
        return gsName;
    }

    public void setGsName(String gsName) {
        this.gsName = gsName;
    }


    public Double getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(Double extraPrice) {
        this.extraPrice = extraPrice;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public HdGoods getHdGoods() {
        return hdGoods;
    }

    public void setHdGoods(HdGoods hdGoods) {
        this.hdGoods = hdGoods;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdOrderGoods that = (HdOrderGoods) o;

        if (ogId != that.ogId) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsSn != null ? !goodsSn.equals(that.goodsSn) : that.goodsSn != null) return false;
        if (goodsNumber != null ? !goodsNumber.equals(that.goodsNumber) : that.goodsNumber != null) return false;
        if (marketPrice != null ? !marketPrice.equals(that.marketPrice) : that.marketPrice != null) return false;
        if (standardPrice != null ? !standardPrice.equals(that.standardPrice) : that.standardPrice != null)
            return false;
        if (gsId != null ? !gsId.equals(that.gsId) : that.gsId != null) return false;
        if (gsName != null ? !gsName.equals(that.gsName) : that.gsName != null) return false;
        if (extraPrice != null ? !extraPrice.equals(that.extraPrice) : that.extraPrice != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ogId;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsNumber != null ? goodsNumber.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (standardPrice != null ? standardPrice.hashCode() : 0);
        result = 31 * result + (gsId != null ? gsId.hashCode() : 0);
        result = 31 * result + (gsName != null ? gsName.hashCode() : 0);
        result = 31 * result + (extraPrice != null ? extraPrice.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }


}
