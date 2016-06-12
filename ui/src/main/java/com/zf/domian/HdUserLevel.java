package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserLevel
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_level", schema = "", catalog = "wholesale")
public class HdUserLevel {
    @Id
    @GeneratedValue()
    private int ulId;
    private String ulName;
    private Integer levelConfig;
    private Integer ulLevel;


    //    private String showVip;
    
    public int getUlId() {
        return ulId;
    }

    public void setUlId(int ulId) {
        this.ulId = ulId;
    }

    public String getUlName() {
        return ulName;
    }

    public void setUlName(String ulName) {
        this.ulName = ulName;
    }

    public Integer getLevelConfig() {
        return levelConfig;
    }

    public void setLevelConfig(Integer levelConfig) {
        this.levelConfig = levelConfig;
    }

    public Integer getUlLevel() {
        return ulLevel;
    }

    public void setUlLevel(Integer ulLevel) {
        this.ulLevel = ulLevel;
    }
//    public String getShowVip() {
//		return showVip;
//	}
//
//	public void setShowVip(String showVip) {
//		this.showVip = showVip;
//	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserLevel that = (HdUserLevel) o;

        if (ulId != that.ulId) return false;
        if (ulName != null ? !ulName.equals(that.ulName) : that.ulName != null) return false;
        if (levelConfig != null ? !levelConfig.equals(that.levelConfig) : that.levelConfig != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ulId;
        result = 31 * result + (ulName != null ? ulName.hashCode() : 0);
        result = 31 * result + (levelConfig != null ? levelConfig.hashCode() : 0);
        return result;
    }
}
