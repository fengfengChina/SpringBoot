package com.zf.domian;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;

/**
 * HdGoodsAttr
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_attr", schema = "", catalog = "wholesale")
public class HdGoodsAttr implements Serializable{
    @Id
    @GeneratedValue()
    private int gaId;
    /**商品id*/
    private Integer goodsId;
    private Integer ganId;
    private Integer gavId;

    /**是否是库存属性*/
    private String isSku;

    /**库存id*/
    private Integer skuId;

    /**创建时间*/
    private String createTime;

    /** 商品属性名*/
    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name="ganId",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HdGoodsAttrName gan;

    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name="gavId",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HdGoodsAttrValue gav;
    /**
     * 商品库存
     */
    @OneToOne(cascade={CascadeType.DETACH},optional=true)
    @JoinColumn(name="skuId",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HdGoodsSku sku;

    public int getGaId() {
        return gaId;
    }

    public void setGaId(int gaId) {
        this.gaId = gaId;
    }


    public HdGoodsAttrValue getGav() {
        return gav;
    }

    public void setGav(HdGoodsAttrValue gav) {
        this.gav = gav;
    }

    public HdGoodsAttrName getGan() {
        return gan;
    }

    public void setGan(HdGoodsAttrName gan) {
        this.gan = gan;
    }

    public HdGoodsSku getSku() {

        return sku;
    }

    public void setSku(HdGoodsSku sku) {
        this.sku = sku;
    }


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }


    public Integer getGanId() {
        return ganId;
    }

    public void setGanId(Integer ganId) {
        this.ganId = ganId;
    }


    public Integer getGavId() {
        return gavId;
    }

    public void setGavId(Integer gavId) {
        this.gavId = gavId;
    }


    public String getIsSku() {
        return isSku;
    }

    public void setIsSku(String isSku) {
        this.isSku = isSku;
    }


    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
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

        HdGoodsAttr that = (HdGoodsAttr) o;

        if (gaId != that.gaId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
//        if (ganId != null ? !ganId.equals(that.ganId) : that.ganId != null) return false;
//        if (gavId != null ? !gavId.equals(that.gavId) : that.gavId != null) return false;
        if (isSku != null ? !isSku.equals(that.isSku) : that.isSku != null) return false;
//        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gaId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
//        result = 31 * result + (ganId != null ? ganId.hashCode() : 0);
//        result = 31 * result + (gavId != null ? gavId.hashCode() : 0);
        result = 31 * result + (isSku != null ? isSku.hashCode() : 0);
//        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
