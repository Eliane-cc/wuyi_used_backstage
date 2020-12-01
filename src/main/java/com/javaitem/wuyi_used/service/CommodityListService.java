package com.javaitem.wuyi_used.service;

import com.javaitem.wuyi_used.domain.commodityList;

import java.util.List;

/**
 * 商品接口
 */
public interface CommodityListService {
    /**
     * 获取商品信息列表
     */
    public List<commodityList> allCommodity();

    /**
     * 根据商品分类、新旧程度、价格查询列表
     */
    public List<commodityList> commodityListOfSort(Integer sort,Integer extent,Float startPrice,Float endPrice);

    /**
     * 根据商品名查找列表
     */
    public List<commodityList> commodityListOfName(String name);

    /**
     * 增删改--还未实现
     */
    public boolean insert(commodityList commodityList);
    public boolean update(commodityList commodityList);
    public boolean delete(Integer id);


}
