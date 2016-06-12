package com.zf.domian;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * HdAd
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_recommend_goods", schema = "", catalog = "wholesale")
public class HdRecommendGoods {
    @Id
    @GeneratedValue()
    private int hgId;
    private int userId;
    private int goodsId;
    private int hgOrder;

    @OneToOne(cascade = {CascadeType.DETACH},optional = false)
    @JoinColumn(name = "goodsId",insertable = false,updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HdGoods hdGoods;

    public HdGoods getHgGoods() {
        return hdGoods;
    }

    public void setHdGoods(HdGoods hdGoods) {
        this.hdGoods = hdGoods;
    }




    public int getHgId() {

        return hgId;
    }

    public void setHgId(int hgId) {
        this.hgId = hgId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getHgOrder() {
        return hgOrder;
    }

    public void setHgOrder(int hdOrder) {
        this.hgOrder = hdOrder;
    }
}
