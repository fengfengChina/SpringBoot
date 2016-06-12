package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsDocument
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_document", schema = "", catalog = "wholesale")
public class HdGoodsDocument {
    @Id
    @GeneratedValue()
    private int gdId;
    private Integer goodsId;
    private String documentUrl;

    public int getGdId() {
        return gdId;
    }

    public void setGdId(int gdId) {
        this.gdId = gdId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsDocument that = (HdGoodsDocument) o;

        if (gdId != that.gdId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (documentUrl != null ? !documentUrl.equals(that.documentUrl) : that.documentUrl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gdId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (documentUrl != null ? documentUrl.hashCode() : 0);
        return result;
    }
}
