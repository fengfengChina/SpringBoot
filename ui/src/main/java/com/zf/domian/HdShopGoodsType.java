package com.zf.domian;

import javax.persistence.*;
import java.util.Arrays;

/**
 * HdShopGoodsType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_shop_goods_type", schema = "", catalog = "wholesale")
public class HdShopGoodsType {
    @Id
    @GeneratedValue()
    private int sgtId;
    private Integer shopId;
    private byte[] gtId;

    public int getSgtId() {
        return sgtId;
    }

    public void setSgtId(int sgtId) {
        this.sgtId = sgtId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public byte[] getGtId() {
        return gtId;
    }

    public void setGtId(byte[] gtId) {
        this.gtId = gtId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdShopGoodsType that = (HdShopGoodsType) o;

        if (sgtId != that.sgtId) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (!Arrays.equals(gtId, that.gtId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sgtId;
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (gtId != null ? Arrays.hashCode(gtId) : 0);
        return result;
    }
}
