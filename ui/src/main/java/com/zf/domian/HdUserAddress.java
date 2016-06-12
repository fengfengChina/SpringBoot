package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserAddress
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_address", schema = "", catalog = "wholesale")
public class HdUserAddress {
    @Id
    @GeneratedValue()
    private Integer uadId;
    private Integer userId;
//    private Integer provinceId;
//    private Integer cityId;
//    private Integer areaId;
    private String address;
    private String postcode;
    private String receiver;
    private String receiverPhone;
    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name="province_id")
    private HdProvince hdProvince;
    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name="city_id")
    private HdCity hdCity;
    @OneToOne(cascade={CascadeType.DETACH}) // optional specified to false means the corresponding column couldn't be nullable
    @JoinColumn(name = "area_id")
    private HdArea hdArea;

    public HdUserAddress() {
    }

    public HdUserAddress(Integer uadId, Integer userId, String address, String postcode, String receiver, String receiverPhone, HdProvince hdProvince, HdCity hdCity, HdArea hdArea) {
        this.uadId = uadId;
        this.userId = userId;
        this.address = address;
        this.postcode = postcode;
        this.receiver = receiver;
        this.receiverPhone = receiverPhone;
        this.hdProvince = hdProvince;
        this.hdCity = hdCity;
        this.hdArea = hdArea;
    }

    public HdUserAddress(Integer userId, String address, String postcode, String receiver, String receiverPhone, HdProvince hdProvince, HdCity hdCity, HdArea hdArea) {

        this.userId = userId;
        this.address = address;
        this.postcode = postcode;
        this.receiver = receiver;
        this.receiverPhone = receiverPhone;
        this.hdProvince = hdProvince;
        this.hdCity = hdCity;
        this.hdArea = hdArea;
    }

     // Indicate the column name of the foreign key
    public HdProvince getHdProvince() {
        return hdProvince;
    }

    public void setHdProvince(HdProvince hdProvince) {
        this.hdProvince = hdProvince;
    }
     // Indicate the column name of the foreign key
    public HdCity getHdCity() {
        return hdCity;
    }

    public void setHdCity(HdCity hdCity) {
        this.hdCity = hdCity;
    }

    public HdArea getHdArea() {
        return hdArea;
    }

    public void setHdArea(HdArea hdArea) {
        this.hdArea = hdArea;
    }

    public Integer getUadId() {
        return uadId;
    }

    public void setUadId(Integer uadId) {
        this.uadId = uadId;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

//
//    @Column(name = "province_id", nullable = true, insertable = true, updatable = true)
//    public Integer getProvinceId() {
//        return provinceId;
//    }

//    public void setProvinceId(Integer provinceId) {
//        this.provinceId = provinceId;
//    }

//
//    @Column(name = "city_id", nullable = true, insertable = true, updatable = true)
//    public Integer getCityId() {
//        return cityId;
//    }

//    public void setCityId(Integer cityId) {
//        this.cityId = cityId;
//    }
//
//
//    @Column(name = "area_id", nullable = true, insertable = true, updatable = true)
//    public Integer getAreaId() {
//        return areaId;
//    }
//
//    public void setAreaId(Integer areaId) {
//        this.areaId = areaId;
//    }


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

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }


    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }


}
