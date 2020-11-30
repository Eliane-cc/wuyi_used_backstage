package com.javaitem.wuyi_used.controller;

import com.alibaba.fastjson.JSONObject;
import com.javaitem.wuyi_used.domain.commodityList;
import com.javaitem.wuyi_used.service.CommodityListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/commodity")
public class CommodityListController {

    @Autowired
    private CommodityListService commodityListService;

    /**
     * 获取商品信息列表
     */
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public Object getCommodityList(HttpServletRequest request){
        return commodityListService.allCommodity();
    }

    /**
     * 添加商品
     */
//    @RequestMapping("/add")
//    public Object addCommodity(HttpServletRequest request){
//        JSONObject jsonObject  = new JSONObject();
//        String userId = request.getParameter("userId").trim();      //发布者
//        String title = request.getParameter("title").trim();        //商品标题
//        String extent = request.getParameter("extent").trim();      //商品新旧程度
//        String price = request.getParameter("price").trim();        //商品价格
//        String buyTime = request.getParameter("buyTime").trim();    //商品购买时间
//        String imgUrl = request.getParameter("imgUrl").trim();      //商品图片
//        String sort = request.getParameter("sort").trim();          //商品分类
//        String isSold = request.getParameter("isSold").trim();      //商品是否卖出
//        //把商品购买时间转换成Date格式
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date buyDate = new Date();
//        try{
//            buyDate = dateFormat.parse(buyTime);
//        }catch (ParseException e){
//            e.printStackTrace();
//        }
//        //保存商品信息到对象中
//        commodityList commodityList = new commodityList();
////        commodityList.setName(name);
//    }

}
