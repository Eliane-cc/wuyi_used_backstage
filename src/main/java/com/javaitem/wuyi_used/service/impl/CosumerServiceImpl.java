package com.javaitem.wuyi_used.service.impl;

import com.javaitem.wuyi_used.dao.cosumerMapper;
import com.javaitem.wuyi_used.service.CosumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service实现类
 */
@Service
public class CosumerServiceImpl implements CosumerService {

    @Autowired
    private cosumerMapper cosumerMapper;
    /**
     * 用户名和密码验证,登录更新时间
     */
    @Override
    public boolean verifyPassword(String username, String password) {
        return cosumerMapper.verifyPassword(username,password)>0;
    }
    public boolean updateLoginTime(String username,String loginTime){
        return cosumerMapper.updateLoginTime(username,loginTime)>0;
    }
    /**
     * 注册用户
     */
    public boolean verifyRegister(String username, String password){
        return cosumerMapper.verifyRegister(username,password)>0;
    }
    public boolean register(String username, String password, String registerTime){
        return cosumerMapper.register(username,password,registerTime)>0;
    }
}
