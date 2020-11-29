package com.javaitem.wuyi_used.service;

/*
* 用户service接口
* */
public interface CosumerService {
    /**
     * 用户名和密码验证
     */
    public boolean verifyPassword(String username,String password);
    public boolean updateLoginTime(String username,String loginTime);
    /**
     * 注册用户
     */
    public boolean verifyRegister(String username,String password);
    public boolean register(String username,String password,String registerTime);
}
