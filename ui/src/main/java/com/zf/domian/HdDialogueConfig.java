package com.zf.domian;

import javax.persistence.*;

/**
 * HdDialogueConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_dialogue_config", schema = "", catalog = "wholesale")
public class HdDialogueConfig {
    @Id
    @GeneratedValue()
    private int dcId;
    private String dcQq;

    public int getDcId() {
        return dcId;
    }

    public void setDcId(int dcId) {
        this.dcId = dcId;
    }

    public String getDcQq() {
        return dcQq;
    }

    public void setDcQq(String dcQq) {
        this.dcQq = dcQq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdDialogueConfig that = (HdDialogueConfig) o;

        if (dcId != that.dcId) return false;
        if (dcQq != null ? !dcQq.equals(that.dcQq) : that.dcQq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dcId;
        result = 31 * result + (dcQq != null ? dcQq.hashCode() : 0);
        return result;
    }
}
