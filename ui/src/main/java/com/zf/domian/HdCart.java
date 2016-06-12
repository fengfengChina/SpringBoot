package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * HdCart
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_cart", schema = "", catalog = "wholesale")
public class HdCart implements Serializable{
    @Id
    @GeneratedValue()
    private int cartId;
    private Integer userId;
    private String sessionId;
    private Integer goodsId;
    private String goodsSn;
    private Integer goodsNumber;
    //private Integer gaId;
    private Integer gsId;
    private String createTime;
    @Transient
    private Integer goodsMount;

    //商品图片id
    private Integer giId;

    @OneToOne(cascade = {CascadeType.DETACH},optional = false)
    @JoinColumn(name = "giId",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HdGoodsImg hdGoodsImg;

    @OneToMany(mappedBy = "cartId",targetEntity = HdGoodsCollection.class,cascade = CascadeType.REMOVE)
    @LazyCollection(LazyCollectionOption.EXTRA)
    private List<HdGoodsCollection> goodsCollections;

    @OneToOne(cascade = {CascadeType.DETACH},optional = false)
    @JoinColumn(name = "goodsId",insertable = false,updatable = false)
    @NotFound(action=NotFoundAction.IGNORE)
    private HdGoods hdGoods;

    public HdGoods getHdGoods() {
        return hdGoods;
    }

    public void setHdGoods(HdGoods hdGoods) {
        this.hdGoods = hdGoods;
    }


    public Integer getGoodsMount() {
        return goodsMount;
    }

    public void setGoodsMount(Integer goodsMount) {
        this.goodsMount = goodsMount;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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


    public Integer getGsId() {
        return gsId;
    }

    public void setGsId(Integer gsId) {
        this.gsId = gsId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public List<HdGoodsCollection> getGoodsCollections() {
        return goodsCollections;
    }

    public void setGoodsCollections(List<HdGoodsCollection> goodsCollections) {
        this.goodsCollections = goodsCollections;
    }

    public Integer getGiId() {
        return giId;
    }

    public void setGiId(Integer giId) {
        this.giId = giId;
    }

    public HdGoodsImg getHdGoodsImg() {
        return hdGoodsImg;
    }

    public void setHdGoodsImg(HdGoodsImg hdGoodsImg) {
        this.hdGoodsImg = hdGoodsImg;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdCart hdCart = (HdCart) o;

        if (cartId != hdCart.cartId) return false;
        if (userId != null ? !userId.equals(hdCart.userId) : hdCart.userId != null) return false;
        if (sessionId != null ? !sessionId.equals(hdCart.sessionId) : hdCart.sessionId != null) return false;
        if (goodsId != null ? !goodsId.equals(hdCart.goodsId) : hdCart.goodsId != null) return false;
        if (goodsSn != null ? !goodsSn.equals(hdCart.goodsSn) : hdCart.goodsSn != null) return false;
        if (goodsNumber != null ? !goodsNumber.equals(hdCart.goodsNumber) : hdCart.goodsNumber != null) return false;
        if (gsId != null ? !gsId.equals(hdCart.gsId) : hdCart.gsId != null) return false;
        if (createTime != null ? !createTime.equals(hdCart.createTime) : hdCart.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsNumber != null ? goodsNumber.hashCode() : 0);
        result = 31 * result + (gsId != null ? gsId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
