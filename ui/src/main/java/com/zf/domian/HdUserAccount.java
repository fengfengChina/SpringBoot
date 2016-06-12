package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserAccount
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_account", schema = "", catalog = "wholesale")
public class HdUserAccount {
    @Id
    @GeneratedValue()
    private int uaId;
    private Integer userId;
    private String account;
    private String bank;
    private String branch;
    private String isPublic;

    public int getUaId() {
        return uaId;
    }

    public void setUaId(int uaId) {
        this.uaId = uaId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserAccount that = (HdUserAccount) o;

        if (uaId != that.uaId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (isPublic != null ? !isPublic.equals(that.isPublic) : that.isPublic != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uaId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
        return result;
    }
}
