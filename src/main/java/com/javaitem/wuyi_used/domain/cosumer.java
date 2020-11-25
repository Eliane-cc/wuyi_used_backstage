package com.javaitem.wuyi_used.domain;

import java.io.Serializable;

/*
* 用户
* */
public class cosumer implements Serializable {
    /*主键*/
    private Integer userId;
    /*用户名*/
    private String username;
    /*密码*/
    private String password;
    /*用户头像链接*/
    private String avatar;
    /*用户最新登录时间*/
    private String loginTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
