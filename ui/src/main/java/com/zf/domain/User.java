package com.zf.domain;

/**
 * User
 *
 * @author zf
 * @date 16/6/14
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String headerImg;
    public User() {
    }
    public User(User user) {
        super();
        this.id = user.getId();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.headerImg = user.getHeaderImg();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }
}
