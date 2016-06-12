package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsKeywords
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_keywords", schema = "", catalog = "wholesale")
public class HdGoodsKeywords {
    @Id
    @GeneratedValue()
    private int gkId;
    private Integer goodsId;
    private Integer keywordId;

    public int getGkId() {
        return gkId;
    }

    public void setGkId(int gkId) {
        this.gkId = gkId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Integer keywordId) {
        this.keywordId = keywordId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsKeywords that = (HdGoodsKeywords) o;

        if (gkId != that.gkId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (keywordId != null ? !keywordId.equals(that.keywordId) : that.keywordId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gkId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (keywordId != null ? keywordId.hashCode() : 0);
        return result;
    }
}
