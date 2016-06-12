package com.zf.domian;

import javax.persistence.*;

/**
 * HdKeyword
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_keyword", schema = "", catalog = "wholesale")
public class HdKeyword {
    @Id
    @GeneratedValue()
    private int keywordId;
    private String keyword;

    public int getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(int keywordId) {
        this.keywordId = keywordId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdKeyword hdKeyword = (HdKeyword) o;

        if (keywordId != hdKeyword.keywordId) return false;
        if (keyword != null ? !keyword.equals(hdKeyword.keyword) : hdKeyword.keyword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keywordId;
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        return result;
    }
}
