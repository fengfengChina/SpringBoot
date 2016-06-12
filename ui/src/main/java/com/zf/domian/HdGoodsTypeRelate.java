package com.zf.domian;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * HdGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_type_relate", schema = "", catalog = "wholesale")
public class HdGoodsTypeRelate implements Serializable {
    @Id
    @GeneratedValue()
    private Integer gtrId;
//    private Integer goodsId;
    private Integer gtId;
    private String gtName;
    private String gtIdPath;

    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name="goods_id")
    private HdGoods hdGoods;

    public HdGoods getHdGoods() {
        return hdGoods;
    }

    public void setHdGoods(HdGoods hdGoods) {
        this.hdGoods = hdGoods;
    }

    public Integer getGtrId() {
        return gtrId;
    }

    public void setGtrId(Integer gtrId) {
        this.gtrId = gtrId;
    }

//    public Integer getGoodsId() {
//        return goodsId;
//    }

//    public void setGoodsId(Integer goodsId) {
//        this.goodsId = goodsId;
//    }

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    public String getGtIdPath() {
        return gtIdPath;
    }

    public void setGtIdPath(String gtIdPath) {
        this.gtIdPath = gtIdPath;
    }
}
