package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * HdSpecialConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_special_config", schema = "", catalog = "wholesale")
public class HdSpecialConfig {
    @Id
    @GeneratedValue()
    private Integer scId;
    private String scName;
    private String scTitle;
    private Integer colNum;
    private Integer rowNum;
    private String scIcon;
    private String color;

	@OneToMany(cascade = CascadeType.DETACH)
	@JoinColumn(name="scId",referencedColumnName="scId")
    private List<HdSpecialGoods> specialGoodses;
    /**
     * 广告图片
     */
    private String scImg;
    

	/**
     * 广告商品id
     */
    private Integer goodsId;
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getScImg() {
        return scImg;
    }

    public void setScImg(String scImg) {
        this.scImg = scImg;
    }
    public Integer getSpecialOrder() {
        return specialOrder;
    }

    public void setSpecialOrder(Integer specialOrder) {
        this.specialOrder = specialOrder;
    }

    public Integer getColNum() {
        return colNum;
    }

    public void setColNum(Integer colNum) {
        this.colNum = colNum;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Integer specialOrder;
    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getScIcon() {
        return scIcon;
    }

    public void setScIcon(String scIcon) {
        this.scIcon = scIcon;
    }

    public String getScTitle() {
        return scTitle;
    }

    public void setScTitle(String scTitle) {
        this.scTitle = scTitle;
    }

    public List<HdSpecialGoods> getSpecialGoodses() {
		return specialGoodses;
	}

	public void setSpecialGoodses(List<HdSpecialGoods> specialGoodses) {
		this.specialGoodses = specialGoodses;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdSpecialConfig that = (HdSpecialConfig) o;

        if (scId != that.scId) return false;
        if (scName != null ? !scName.equals(that.scName) : that.scName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scId;
        result = 31 * result + (scName != null ? scName.hashCode() : 0);
        return result;
    }
}
