package com.javaitem.wuyi_used.service;

/*
* 用户service接口
* */
public interface CosumerService {
    /**
     * 用户名和密码验证
     * @param username
     * @param password
     * @return
     */
    public boolean verifyPassword(String username,String password);
}
