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
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CosumerController {
    @Autowired
    private CosumerService cosumerService;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式

    /**
     * 判断是否登录成功
     */
    @RequestMapping(value = "/cosumer/login/status",method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean flag = cosumerService.verifyPassword(username,password);
        if (flag){
            boolean login = cosumerService.updateLoginTime(username,df.format(new Date()));
            if (login){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"登录成功");
                session.setAttribute(Consts.USERNAME,username);
            }
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"用户名或密码错误");
        return jsonObject;
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/cosumer/register/status",method = RequestMethod.POST)
    public Object registerStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean flag = cosumerService.verifyRegister(username,password);
        if (!flag){
            boolean isRegister = cosumerService.register(username,password,df.format(new Date()));
            if (isRegister){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"注册成功");
                session.setAttribute(Consts.USERNAME,username);
            }else{
                jsonObject.put(Consts.CODE,2);
                jsonObject.put(Consts.MSG,"注册失败");
                session.setAttribute(Consts.USERNAME,username);
            }
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"该用户已注册");
        return jsonObject;
    }
}
