package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ZM on 2016/4/28.
 */
@Entity
@Table(name = "hd_goods_collection",schema = "",catalog = "wholesale")
public class HdGoodsCollection implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    private Integer gcId;
    private Integer cartId;
    private Integer skuId;
    private int goodsAmount;

    @OneToMany(targetEntity = HdGoodsAttr.class,cascade = CascadeType.DETACH)
    @LazyCollection(LazyCollectionOption.EXTRA)
    @JoinColumn(name="skuId",referencedColumnName = "skuId",updatable=false,insertable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    private List<HdGoodsAttr> goodsAttrs;


    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public List<HdGoodsAttr> getGoodsAttrs() {
        return goodsAttrs;
    }

    public void setGoodsAttrs(List<HdGoodsAttr> goodsAttrs) {
        this.goodsAttrs = goodsAttrs;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

}
