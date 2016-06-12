package com.zf.domian;

import javax.persistence.*;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * HdUsers
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_users", schema = "", catalog = "wholesale")
public class HdUsers {
    public Integer getUserId() {
        return userId;
    }


    @Id
    @GeneratedValue()
    private Integer userId;

    private String userName;

    private String realName;

    private String nickName;

    private String password;

    private String email;

    private String sex;

    private String birthday;

    private String officePhone;

    private String mobilePhone;

    private String regTime;

    private String lastLogin;

    private String lastIp;

    private String qq;

    @OneToOne( cascade = CascadeType.DETACH)
    @JoinColumn(name = "ulId", insertable = false, updatable = false)
    @NotFound(action = NotFoundAction.IGNORE)
    private HdUserLevel hdUserLevel;

    private Integer payPoints;

    private Integer levelPoints;

    private String qqId;

    private String weixinId;

    private String weiboId;

    private Integer prestoreMoney;

    private Double balanceMoney;

    private String userHead;

    private Integer uadId;

    private Integer ulId;

    private Integer provinceId;

    private String businessLicence;

    private String isPerfected;

    private String isBusiness;
    
    private String companyName;
    
    @OneToOne(targetEntity =HdProvince.class)
    @JoinColumn(name="provinceId",insertable=false,updatable=false)
    @NotFound(action=NotFoundAction.IGNORE)
    private HdProvince province;
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getBusinessLicence() {
        return businessLicence;
    }

    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence;
    }

    public String getIsPerfected() {
        return isPerfected;
    }

    public void setIsPerfected(String isPerfected) {
        this.isPerfected = isPerfected;
    }

    public String getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(String isBusiness) {
        this.isBusiness = isBusiness;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    private Integer utId;

    public Integer getUtId() {
        return utId;
    }

    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    private Integer uptId;

    public Integer getUptId() {
        return uptId;
    }



    public void setUptId(Integer uptId) {
        this.uptId = uptId;
    }

    public Integer getUlId() {
        return ulId;
    }

    public void setUlId(Integer ulId) {
        this.ulId = ulId;
    }

    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    public Integer getLevelPoints() {
        return levelPoints;
    }

    public void setLevelPoints(Integer levelPoints) {
        this.levelPoints = levelPoints;
    }

    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    public String getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }

    public Integer getPrestoreMoney() {
        return prestoreMoney;
    }

    public HdUserLevel getHdUserLevel() {
        return hdUserLevel;
    }

    public void setHdUserLevel(HdUserLevel hdUserLevel) {
        this.hdUserLevel = hdUserLevel;
    }

    public void setPrestoreMoney(Integer prestoreMoney) {
        this.prestoreMoney = prestoreMoney;
    }

    public Double getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(Double balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public Integer getUadId() {
        return uadId;
    }

    public void setUadId(Integer uadId) {
        this.uadId = uadId;
    }

    public HdUsers() {
    }
    
    
    public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public HdProvince getProvince() {
		return province;
	}

	public void setProvince(HdProvince province) {
		this.province = province;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUsers hdUsers = (HdUsers) o;

        if (userId != hdUsers.userId) return false;
        if (userName != null ? !userName.equals(hdUsers.userName) : hdUsers.userName != null) return false;
        if (realName != null ? !realName.equals(hdUsers.realName) : hdUsers.realName != null) return false;
        if (nickName != null ? !nickName.equals(hdUsers.nickName) : hdUsers.nickName != null) return false;
        if (password != null ? !password.equals(hdUsers.password) : hdUsers.password != null) return false;
        if (email != null ? !email.equals(hdUsers.email) : hdUsers.email != null) return false;
        if (sex != null ? !sex.equals(hdUsers.sex) : hdUsers.sex != null) return false;
        if (birthday != null ? !birthday.equals(hdUsers.birthday) : hdUsers.birthday != null) return false;
        if (officePhone != null ? !officePhone.equals(hdUsers.officePhone) : hdUsers.officePhone != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(hdUsers.mobilePhone) : hdUsers.mobilePhone != null) return false;
        if (regTime != null ? !regTime.equals(hdUsers.regTime) : hdUsers.regTime != null) return false;
        if (lastLogin != null ? !lastLogin.equals(hdUsers.lastLogin) : hdUsers.lastLogin != null) return false;
        if (lastIp != null ? !lastIp.equals(hdUsers.lastIp) : hdUsers.lastIp != null) return false;
        if (qq != null ? !qq.equals(hdUsers.qq) : hdUsers.qq != null) return false;
        if (utId != null ? !utId.equals(hdUsers.utId) : hdUsers.utId != null) return false;
        if (uptId != null ? !uptId.equals(hdUsers.uptId) : hdUsers.uptId != null) return false;
        if (ulId != null ? !ulId.equals(hdUsers.ulId) : hdUsers.ulId != null) return false;
        if (payPoints != null ? !payPoints.equals(hdUsers.payPoints) : hdUsers.payPoints != null) return false;
        if (levelPoints != null ? !levelPoints.equals(hdUsers.levelPoints) : hdUsers.levelPoints != null) return false;
        if (qqId != null ? !qqId.equals(hdUsers.qqId) : hdUsers.qqId != null) return false;
        if (weixinId != null ? !weixinId.equals(hdUsers.weixinId) : hdUsers.weixinId != null) return false;
        if (weiboId != null ? !weiboId.equals(hdUsers.weiboId) : hdUsers.weiboId != null) return false;
        if (prestoreMoney != null ? !prestoreMoney.equals(hdUsers.prestoreMoney) : hdUsers.prestoreMoney != null)
            return false;
        if (balanceMoney != null ? !balanceMoney.equals(hdUsers.balanceMoney) : hdUsers.balanceMoney != null)
            return false;
        if (userHead != null ? !userHead.equals(hdUsers.userHead) : hdUsers.userHead != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (officePhone != null ? officePhone.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (regTime != null ? regTime.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (lastIp != null ? lastIp.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (utId != null ? utId.hashCode() : 0);
        result = 31 * result + (uptId != null ? uptId.hashCode() : 0);
        result = 31 * result + (ulId != null ? ulId.hashCode() : 0);
        result = 31 * result + (payPoints != null ? payPoints.hashCode() : 0);
        result = 31 * result + (levelPoints != null ? levelPoints.hashCode() : 0);
        result = 31 * result + (qqId != null ? qqId.hashCode() : 0);
        result = 31 * result + (weixinId != null ? weixinId.hashCode() : 0);
        result = 31 * result + (weiboId != null ? weiboId.hashCode() : 0);
        result = 31 * result + (prestoreMoney != null ? prestoreMoney.hashCode() : 0);
        result = 31 * result + (balanceMoney != null ? balanceMoney.hashCode() : 0);
        result = 31 * result + (userHead != null ? userHead.hashCode() : 0);
        return result;
    }

    public HdUsers(String password, String mobilePhone) {
        this.password = password;
        this.mobilePhone = mobilePhone;
    }
}
