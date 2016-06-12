package com.zf.domian;

import javax.persistence.*;

/**
 * HdWebFooter
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_web_footer", schema = "", catalog = "wholesale")
public class HdWebFooter {
    @Id
    @GeneratedValue()
    private int wfId;
    private String wfName;
    private String wfContent;

    public int getWfId() {
        return wfId;
    }

    public void setWfId(int wfId) {
        this.wfId = wfId;
    }

    public String getWfName() {
        return wfName;
    }

    public void setWfName(String wfName) {
        this.wfName = wfName;
    }

    public String getWfContent() {
        return wfContent;
    }

    public void setWfContent(String wfContent) {
        this.wfContent = wfContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdWebFooter that = (HdWebFooter) o;

        if (wfId != that.wfId) return false;
        if (wfName != null ? !wfName.equals(that.wfName) : that.wfName != null) return false;
        if (wfContent != null ? !wfContent.equals(that.wfContent) : that.wfContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wfId;
        result = 31 * result + (wfName != null ? wfName.hashCode() : 0);
        result = 31 * result + (wfContent != null ? wfContent.hashCode() : 0);
        return result;
    }
}
