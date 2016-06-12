package com.zf.domian;

import javax.persistence.*;

/**
 * HdShop
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_shop", schema = "", catalog = "wholesale")
public class HdShop {
    @Id
    @GeneratedValue()
    private int shopId;
    private Integer brandId;
    private String shopName;
    private String shopLogo;
    private Integer shopOwner;
    private String createTime;
    private Integer collectionNum;
    private Integer visitNum;
    private String remark;
    private String website;

    @Id
    @Column(name = "shop_id", nullable = false, insertable = true, updatable = true)
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }


    @Column(name = "brand_id", nullable = true, insertable = true, updatable = true)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }


    @Column(name = "shop_name", nullable = true, insertable = true, updatable = true, length = 100)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    @Column(name = "shop_logo", nullable = true, insertable = true, updatable = true, length = 255)
    public String getShopLogo() {
        return shopLogo;
    }

    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }


    @Column(name = "shop_owner", nullable = true, insertable = true, updatable = true)
    public Integer getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(Integer shopOwner) {
        this.shopOwner = shopOwner;
    }


    @Column(name = "create_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    @Column(name = "collection_num", nullable = true, insertable = true, updatable = true)
    public Integer getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(Integer collectionNum) {
        this.collectionNum = collectionNum;
    }


    @Column(name = "visit_num", nullable = true, insertable = true, updatable = true)
    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }


    @Column(name = "remark", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Column(name = "website", nullable = true, insertable = true, updatable = true, length = 255)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdShop hdShop = (HdShop) o;

        if (shopId != hdShop.shopId) return false;
        if (brandId != null ? !brandId.equals(hdShop.brandId) : hdShop.brandId != null) return false;
        if (shopName != null ? !shopName.equals(hdShop.shopName) : hdShop.shopName != null) return false;
        if (shopLogo != null ? !shopLogo.equals(hdShop.shopLogo) : hdShop.shopLogo != null) return false;
        if (shopOwner != null ? !shopOwner.equals(hdShop.shopOwner) : hdShop.shopOwner != null) return false;
        if (createTime != null ? !createTime.equals(hdShop.createTime) : hdShop.createTime != null) return false;
        if (collectionNum != null ? !collectionNum.equals(hdShop.collectionNum) : hdShop.collectionNum != null)
            return false;
        if (visitNum != null ? !visitNum.equals(hdShop.visitNum) : hdShop.visitNum != null) return false;
        if (remark != null ? !remark.equals(hdShop.remark) : hdShop.remark != null) return false;
        if (website != null ? !website.equals(hdShop.website) : hdShop.website != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopId;
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (shopLogo != null ? shopLogo.hashCode() : 0);
        result = 31 * result + (shopOwner != null ? shopOwner.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (collectionNum != null ? collectionNum.hashCode() : 0);
        result = 31 * result + (visitNum != null ? visitNum.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (website != null ? website.hashCode() : 0);
        return result;
    }
}
