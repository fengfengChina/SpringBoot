package com.zf.domian;

import java.math.BigDecimal;

import javax.persistence.*;

/**
 * Created by zengfeng on 16-4-7.
 */
@Entity
@Table(name = "hd_user_pay", schema = "", catalog = "wholesale")
public class HdUserPay {
    @Id
    @GeneratedValue()
    private Integer upId;
    private Integer userId;
    private Integer itemId;
    private String itemType;
    private String type;
    private BigDecimal price;
    private String remark;
    private String createTime;
    public HdUserPay(String create_time, Integer itemId, String itemType, BigDecimal price, String remark, Integer userId) {
        this.createTime = create_time;
        this.itemId = itemId;
        this.itemType = itemType;
        this.price = price;
        this.remark = remark;
        this.userId = userId;
    }

    public HdUserPay() {

    }

    public Integer getUpId() {
        return upId;
    }

    public void setUpId(Integer upId) {
        this.upId = upId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
