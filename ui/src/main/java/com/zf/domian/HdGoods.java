package com.zf.domian;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * HdGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_goods", schema = "", catalog = "wholesale")
public class HdGoods implements Serializable {
    public HdGoods(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    public HdGoods() {
    }

    @Id
    @GeneratedValue()
    private Integer goodsId;
    @Transient
    private Integer goodsAmount;
    @JsonIgnore
    private Integer salesCount;
   
    @JsonIgnore
    private Integer gtId;

    @OneToMany(mappedBy = "goodsId", targetEntity = HdGoodsImg.class, cascade = CascadeType.DETACH)
    @LazyCollection(LazyCollectionOption.EXTRA)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<HdGoodsImg> goodsImgs;


    @JsonIgnore
    private String goodsSn;

    private String goodsName;
    @JsonIgnore
    private Integer brandId;
    @JsonIgnore
    private Integer shopId;
    @JsonIgnore
    private Integer provinceId;
    @JsonIgnore
    private String goodsSource;
    @JsonIgnore
    private Double marketPrice;
    @JsonIgnore
    private Double salesPrice;
    @JsonIgnore
    private Integer unitId;
    @JsonIgnore
    private String isReal;
    @JsonIgnore
    private String isOnSale;
    @JsonIgnore
    private Integer goodsPoint;
    @JsonIgnore
    private String createUser;
    @JsonIgnore
    private String createTime;
    @JsonIgnore
    private String updateUser;
    @JsonIgnore
    private String updateTime;
    @JsonIgnore
    private String isDelete;
    @JsonIgnore
    private Integer auditStep;
    @JsonIgnore
    private String auditUser;
    @JsonIgnore
    private String remark;
    @Transient
    private Float goodsPrice;
    @JsonIgnore
    private Double vipPrice;
    @Transient
    private Integer skuId;
    
    @JsonIgnore
    private Integer ulId;

    @OneToOne(cascade=CascadeType.DETACH)
    @JoinColumn(name="ulId",insertable = false,updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    private HdUserLevel hdUserLevel;

    

    public HdUserLevel getHdUserLevel() {
		return hdUserLevel;
	}

	public void setHdUserLevel(HdUserLevel hdUserLevel) {
		this.hdUserLevel = hdUserLevel;
	}

	public Integer getUlId() {
        return ulId;
    }

    public void setUlId(Integer ulId) {
        this.ulId = ulId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }


    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public List<HdGoodsImg> getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(List<HdGoodsImg> goodsImgs) {
        this.goodsImgs = goodsImgs;
    }

    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getGoodsSource() {
        return goodsSource;
    }

    public void setGoodsSource(String goodsSource) {
        this.goodsSource = goodsSource;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal;
    }

    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Integer getGoodsPoint() {
        return goodsPoint;
    }

    public void setGoodsPoint(Integer goodsPoint) {
        this.goodsPoint = goodsPoint;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAuditStep() {
        return auditStep;
    }

    public void setAuditStep(Integer auditStep) {
        this.auditStep = auditStep;
    }

    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    public Double getVipPrice() {
        return vipPrice;
    }
    public void setVipPrice(Double vipPrice) {
        this.vipPrice = vipPrice;
    }
}
