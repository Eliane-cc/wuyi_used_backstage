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
     * 用户名和密码验证
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean verifyPassword(String username, String password) {
        return cosumerMapper.verifyPassword(username,password)>0;
    }
}
