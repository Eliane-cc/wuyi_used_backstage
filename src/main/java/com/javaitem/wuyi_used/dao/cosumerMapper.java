package com.javaitem.wuyi_used.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface cosumerMapper {
    /*
     * 验证密码是否正确
     * */
    public int verifyPassword(String username, String password);
    public int updateLoginTime(String username,String loginTime);
    /*
     * 用户注册
     * */
    public int verifyRegister(String username, String password);
    public Integer register(String username, String password,String registerTime);
}
