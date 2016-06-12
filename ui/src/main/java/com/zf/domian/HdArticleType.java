package com.zf.domian;

import javax.persistence.*;

/**
 * HdArticleType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_article_type", schema = "", catalog = "wholesale")
public class HdArticleType {
    @Id
    @GeneratedValue()
    private int atId;
    private String atName;

    public int getAtId() {
        return atId;
    }

    public void setAtId(int atId) {
        this.atId = atId;
    }


    public String getAtName() {
        return atName;
    }

    public void setAtName(String atName) {
        this.atName = atName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdArticleType that = (HdArticleType) o;

        if (atId != that.atId) return false;
        if (atName != null ? !atName.equals(that.atName) : that.atName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = atId;
        result = 31 * result + (atName != null ? atName.hashCode() : 0);
        return result;
    }
}
