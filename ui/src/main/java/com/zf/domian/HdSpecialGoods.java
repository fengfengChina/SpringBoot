package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * HdSpecialGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_special_goods", schema = "", catalog = "wholesale")
public class HdSpecialGoods {
    @Id
    @GeneratedValue()
    private int sgId;
    private Integer scId;
    //private Integer goodsId;
    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name="goods_id")
    private HdGoods hdGoods;
     // Indicate the column name of the foreign key

    public HdGoods getHdGoods() {
        return hdGoods;
    }

    public void setHdGoods(HdGoods hdGoods) {
        this.hdGoods = hdGoods;
    }

    public int getSgId() {
        return sgId;
    }

    public void setSgId(int sgId) {
        this.sgId = sgId;
    }

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

  

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdSpecialGoods that = (HdSpecialGoods) o;

        if (sgId != that.sgId) return false;
        if (scId != null ? !scId.equals(that.scId) : that.scId != null) return false;
//        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sgId;
        result = 31 * result + (scId != null ? scId.hashCode() : 0);
//        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        return result;
    }
}
