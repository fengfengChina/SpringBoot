package com.zf.domian;

import javax.persistence.*;

/**
 * HdKeywordsStatistics
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_keywords_statistics", schema = "", catalog = "wholesale")
public class HdKeywordsStatistics {
    @Id
    @GeneratedValue()
    private int ksId;
    private String ksName;
    private Integer ksCount;

    public int getKsId() {
        return ksId;
    }

    public void setKsId(int ksId) {
        this.ksId = ksId;
    }

    public String getKsName() {
        return ksName;
    }

    public void setKsName(String ksName) {
        this.ksName = ksName;
    }

    public Integer getKsCount() {
        return ksCount;
    }

    public void setKsCount(Integer ksCount) {
        this.ksCount = ksCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdKeywordsStatistics that = (HdKeywordsStatistics) o;

        if (ksId != that.ksId) return false;
        if (ksName != null ? !ksName.equals(that.ksName) : that.ksName != null) return false;
        if (ksCount != null ? !ksCount.equals(that.ksCount) : that.ksCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ksId;
        result = 31 * result + (ksName != null ? ksName.hashCode() : 0);
        result = 31 * result + (ksCount != null ? ksCount.hashCode() : 0);
        return result;
    }
}
