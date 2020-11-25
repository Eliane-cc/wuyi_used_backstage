package com.javaitem.wuyi_used.controller;

import com.alibaba.fastjson.JSONObject;
import com.javaitem.wuyi_used.service.CosumerService;
import com.javaitem.wuyi_used.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.com.Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class CosumerController {
    @Autowired
    private CosumerService cosumerService;

    /**
     * 判断是否登录成功
     */
//    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/cosumer/login/status",method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        boolean flag = cosumerService.verifyPassword(username,password);
        boolean flag = false;
        if (flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"登录成功");
            session.setAttribute(Consts.USERNAME,username);
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"用户名或密码错误");
        return jsonObject;
    }
}
