package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

/**
 * HdGoodsType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_type", schema = "", catalog = "wholesale")
public class HdGoodsType {
    @Id
    @GeneratedValue()
    private int gtId;
    private String gtName;
    private Integer parentId;
    private String idPath;
    private Integer gtOrder;
    private String gtImg;
    private Integer gtLevel;
    private String isShow;
    @Transient
    private List<HdGoodsType> thirdType;

    public List<HdGoodsType> getThirdType() {
        return thirdType;
    }

    public void setThirdType(List<HdGoodsType> thirdType) {
        this.thirdType = thirdType;
    }

    @Transient
    private List<HdGoods> hdGoodses;

    @OneToMany(mappedBy = "gt_id",targetEntity = HdGoods.class,cascade = CascadeType.DETACH)
    @LazyCollection(LazyCollectionOption.EXTRA)
    public List<HdGoods> getHdGoodses() {
        return hdGoodses;
    }

    public void setHdGoodses(List<HdGoods> hdGoodses) {
        this.hdGoodses = hdGoodses;
    }

    public int getGtId() {
        return gtId;
    }

    public void setGtId(int gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }

    public Integer getGtOrder() {
        return gtOrder;
    }

    public void setGtOrder(Integer gtOrder) {
        this.gtOrder = gtOrder;
    }

    public String getGtImg() {
        return gtImg;
    }

    public void setGtImg(String gtImg) {
        this.gtImg = gtImg;
    }

    public Integer getGtLevel() {
        return gtLevel;
    }

    public void setGtLevel(Integer gtLevel) {
        this.gtLevel = gtLevel;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsType that = (HdGoodsType) o;

        if (gtId != that.gtId) return false;
        if (gtName != null ? !gtName.equals(that.gtName) : that.gtName != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (idPath != null ? !idPath.equals(that.idPath) : that.idPath != null) return false;
        if (gtOrder != null ? !gtOrder.equals(that.gtOrder) : that.gtOrder != null) return false;
        if (gtImg != null ? !gtImg.equals(that.gtImg) : that.gtImg != null) return false;
        if (gtLevel != null ? !gtLevel.equals(that.gtLevel) : that.gtLevel != null) return false;
        if (isShow != null ? !isShow.equals(that.isShow) : that.isShow != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gtId;
        result = 31 * result + (gtName != null ? gtName.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (idPath != null ? idPath.hashCode() : 0);
        result = 31 * result + (gtOrder != null ? gtOrder.hashCode() : 0);
        result = 31 * result + (gtImg != null ? gtImg.hashCode() : 0);
        result = 31 * result + (gtLevel != null ? gtLevel.hashCode() : 0);
        result = 31 * result + (isShow != null ? isShow.hashCode() : 0);
        return result;
    }
}
