package com.javaitem.wuyi_used.domain;

import java.io.Serializable;

/*
* 用户
* */
public class cosumer implements Serializable {
    /*主键*/
    private Integer userId;
    /*用户名*/
    private String userName;
    /*密码*/
    private String userPwd;
    /*用户头像链接*/
    private String avatar;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
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

    public String getRegistTime() {
        return registTime;
    }

    public void setRegistTime(String registTime) {
        this.registTime = registTime;
    }

    /*用户最新登录时间*/
    private String loginTime;
    /*用户最新登录时间*/
    private String registTime;


}
