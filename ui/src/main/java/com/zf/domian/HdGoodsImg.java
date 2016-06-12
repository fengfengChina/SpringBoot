package com.zf.domian;

import javax.persistence.*;
import java.io.Serializable;

/**
 * HdGoodsImg
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_img", schema = "", catalog = "wholesale")
public class HdGoodsImg implements Serializable{
    @Id
    @GeneratedValue()
    private int giId;
    private Integer goodsId;
    private String imgUrl;
    private Integer imgWidth;
    private Integer imgHeight;
    private String thumbUrl;
    private Integer thumbWidth;
    private Integer thumbHeight;
    private Integer imgOrder;
    private String goodsColor;

    public int getGiId() {
        return giId;
    }

    public void setGiId(int giId) {
        this.giId = giId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    public Integer getImgOrder() {
        return imgOrder;
    }

    public void setImgOrder(Integer imgOrder) {
        this.imgOrder = imgOrder;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor;
    }
}
