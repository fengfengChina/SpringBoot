package com.zf.domian;

import javax.persistence.*;

/**
 * HdSearchKeywords
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_search_keywords", schema = "", catalog = "wholesale")
public class HdSearchKeywords {
    @Id
    @GeneratedValue()
    private int skId;
    private String skName;
    private Integer skOrder;

    public int getSkId() {
        return skId;
    }

    public void setSkId(int skId) {
        this.skId = skId;
    }

    public String getSkName() {
        return skName;
    }

    public void setSkName(String skName) {
        this.skName = skName;
    }

    public Integer getSkOrder() {
        return skOrder;
    }

    public void setSkOrder(Integer skOrder) {
        this.skOrder = skOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdSearchKeywords that = (HdSearchKeywords) o;

        if (skId != that.skId) return false;
        if (skName != null ? !skName.equals(that.skName) : that.skName != null) return false;
        if (skOrder != null ? !skOrder.equals(that.skOrder) : that.skOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = skId;
        result = 31 * result + (skName != null ? skName.hashCode() : 0);
        result = 31 * result + (skOrder != null ? skOrder.hashCode() : 0);
        return result;
    }
}
