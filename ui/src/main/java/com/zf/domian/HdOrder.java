package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * HdOrder
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_order", schema = "", catalog = "wholesale")
public class HdOrder {
	@Id
	@GeneratedValue()
	private int orderId;
	private String tradeNo;
	private String orderSn;
	private Integer userId;
	private Integer orderStatus;
	private Integer uadId;
	private String address;
	private String postcode;
	private String receiver;
	private String receiverPhone;
	private String remark;
	private Integer scId;
	private String scName;
	private Integer pcId;
	private String pcName;
	private String isSplit;
	private String invoiceTitle;

	private Integer goodsAmount;
	private Double shippingPrice;
	private Double actualPrice;
	private Integer pointPay;
	private Double pointMoney;
	private Integer orderAmount;
	private String orderSource;
	private Double tax;
	private Double discount;
	private String createTime;
	private String tranOrderImg;
	private Boolean isTrueTranOrder;

	public static final class Status{
		public static Integer WAIT_PAY = 1;//待付款
		
		public static Integer CANCEL = 17;
		public static Integer WAIT_CONFIRM = 19;//付款待确认
	}
	
	public String getTranOrderImg() {
		return tranOrderImg;
	}

	public void setTranOrderImg(String tranOrderImg) {
		this.tranOrderImg = tranOrderImg;
	}

	public Boolean getTrueTranOrder() {
		return isTrueTranOrder;
	}

	public void setTrueTranOrder(Boolean trueTranOrder) {
		isTrueTranOrder = trueTranOrder;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@OneToMany(mappedBy = "orderId", targetEntity = HdOrderGoods.class, cascade = CascadeType.REMOVE)
	@LazyCollection(LazyCollectionOption.EXTRA)
	private Set<HdOrderGoods> goodsList;

	public HdOrder() {
	}

	public int getOrderId() {

		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getUadId() {
		return uadId;
	}

	public void setUadId(Integer uadId) {
		this.uadId = uadId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getReceiver() {
		return receiver;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

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

	public Integer getPcId() {
		return pcId;
	}

	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}

	public String getPcName() {
		return pcName;
	}

	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	public String getIsSplit() {
		return isSplit;
	}

	public void setIsSplit(String isSplit) {
		this.isSplit = isSplit;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public Integer getGoodsAmount() {
		return goodsAmount;
	}

	public void setGoodsAmount(Integer goodsAmount) {
		this.goodsAmount = goodsAmount;
	}

	public Double getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(Double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}

	public Double getActualPrice() {
		return actualPrice;
	}

	public void setActualPrice(Double actualPrice) {
		this.actualPrice = actualPrice;
	}

	public Integer getPointPay() {
		return pointPay;
	}

	public void setPointPay(Integer pointPay) {
		this.pointPay = pointPay;
	}

	public Double getPointMoney() {
		return pointMoney;
	}

	public void setPointMoney(Double pointMoney) {
		this.pointMoney = pointMoney;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Set<HdOrderGoods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(Set<HdOrderGoods> goodsList) {
		this.goodsList = goodsList;
	}

	public HdOrder(String orderSn, Integer userId, Integer orderStatus, Integer uadId, String address, String postcode,
			String receiver, String receiverPhone, String remark, String orderSource, String createTime,
			Double actualPrice) {
		this.orderSn = orderSn;
		this.userId = userId;
		this.orderStatus = orderStatus;
		this.uadId = uadId;
		this.address = address;
		this.postcode = postcode;
		this.receiver = receiver;
		this.receiverPhone = receiverPhone;
		this.remark = remark;
		this.orderSource = orderSource;
		this.createTime = createTime;
		this.actualPrice = actualPrice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		HdOrder hdOrder = (HdOrder) o;

		if (orderId != hdOrder.orderId)
			return false;
		if (orderSn != null ? !orderSn.equals(hdOrder.orderSn) : hdOrder.orderSn != null)
			return false;
		if (userId != null ? !userId.equals(hdOrder.userId) : hdOrder.userId != null)
			return false;
		if (orderStatus != null ? !orderStatus.equals(hdOrder.orderStatus) : hdOrder.orderStatus != null)
			return false;
		if (uadId != null ? !uadId.equals(hdOrder.uadId) : hdOrder.uadId != null)
			return false;
		if (address != null ? !address.equals(hdOrder.address) : hdOrder.address != null)
			return false;
		if (postcode != null ? !postcode.equals(hdOrder.postcode) : hdOrder.postcode != null)
			return false;
		if (receiver != null ? !receiver.equals(hdOrder.receiver) : hdOrder.receiver != null)
			return false;
		if (receiverPhone != null ? !receiverPhone.equals(hdOrder.receiverPhone) : hdOrder.receiverPhone != null)
			return false;
		if (remark != null ? !remark.equals(hdOrder.remark) : hdOrder.remark != null)
			return false;
		if (scId != null ? !scId.equals(hdOrder.scId) : hdOrder.scId != null)
			return false;
		if (scName != null ? !scName.equals(hdOrder.scName) : hdOrder.scName != null)
			return false;
		if (pcId != null ? !pcId.equals(hdOrder.pcId) : hdOrder.pcId != null)
			return false;
		if (pcName != null ? !pcName.equals(hdOrder.pcName) : hdOrder.pcName != null)
			return false;
		if (isSplit != null ? !isSplit.equals(hdOrder.isSplit) : hdOrder.isSplit != null)
			return false;
		if (invoiceTitle != null ? !invoiceTitle.equals(hdOrder.invoiceTitle) : hdOrder.invoiceTitle != null)
			return false;
		if (goodsAmount != null ? !goodsAmount.equals(hdOrder.goodsAmount) : hdOrder.goodsAmount != null)
			return false;
		if (shippingPrice != null ? !shippingPrice.equals(hdOrder.shippingPrice) : hdOrder.shippingPrice != null)
			return false;
		if (actualPrice != null ? !actualPrice.equals(hdOrder.actualPrice) : hdOrder.actualPrice != null)
			return false;
		if (pointPay != null ? !pointPay.equals(hdOrder.pointPay) : hdOrder.pointPay != null)
			return false;
		if (pointMoney != null ? !pointMoney.equals(hdOrder.pointMoney) : hdOrder.pointMoney != null)
			return false;
		if (orderAmount != null ? !orderAmount.equals(hdOrder.orderAmount) : hdOrder.orderAmount != null)
			return false;
		if (orderSource != null ? !orderSource.equals(hdOrder.orderSource) : hdOrder.orderSource != null)
			return false;
		if (tax != null ? !tax.equals(hdOrder.tax) : hdOrder.tax != null)
			return false;
		if (discount != null ? !discount.equals(hdOrder.discount) : hdOrder.discount != null)
			return false;
		if (createTime != null ? !createTime.equals(hdOrder.createTime) : hdOrder.createTime != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = orderId;
		result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
		result = 31 * result + (uadId != null ? uadId.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
		result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
		result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
		result = 31 * result + (remark != null ? remark.hashCode() : 0);
		result = 31 * result + (scId != null ? scId.hashCode() : 0);
		result = 31 * result + (scName != null ? scName.hashCode() : 0);
		result = 31 * result + (pcId != null ? pcId.hashCode() : 0);
		result = 31 * result + (pcName != null ? pcName.hashCode() : 0);
		result = 31 * result + (isSplit != null ? isSplit.hashCode() : 0);
		result = 31 * result + (invoiceTitle != null ? invoiceTitle.hashCode() : 0);
		result = 31 * result + (goodsAmount != null ? goodsAmount.hashCode() : 0);
		result = 31 * result + (shippingPrice != null ? shippingPrice.hashCode() : 0);
		result = 31 * result + (actualPrice != null ? actualPrice.hashCode() : 0);
		result = 31 * result + (pointPay != null ? pointPay.hashCode() : 0);
		result = 31 * result + (pointMoney != null ? pointMoney.hashCode() : 0);
		result = 31 * result + (orderAmount != null ? orderAmount.hashCode() : 0);
		result = 31 * result + (orderSource != null ? orderSource.hashCode() : 0);
		result = 31 * result + (tax != null ? tax.hashCode() : 0);
		result = 31 * result + (discount != null ? discount.hashCode() : 0);
		result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
		return result;
	}
}
