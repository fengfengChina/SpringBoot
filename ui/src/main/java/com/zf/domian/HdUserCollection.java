package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserCollection
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_collection", schema = "", catalog = "wholesale")
public class HdUserCollection {
    @Id
    @GeneratedValue()
    private int ucId;
    private Integer userId;
    private Integer goodsId;
    private Integer shopId;
    private String createTime;

    @Id
    @Column(name = "uc_id", nullable = false, insertable = true, updatable = true)
    public int getUcId() {
        return ucId;
    }

    public void setUcId(int ucId) {
        this.ucId = ucId;
    }


    @Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    @Column(name = "goods_id", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }


    @Column(name = "shop_id", nullable = true, insertable = true, updatable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }


    @Column(name = "create_time", nullable = true, insertable = true, updatable = true, length = 20)
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

        HdUserCollection that = (HdUserCollection) o;

        if (ucId != that.ucId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ucId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
