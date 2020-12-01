package com.javaitem.wuyi_used.service.impl;

import com.javaitem.wuyi_used.dao.commodityListMapper;
import com.javaitem.wuyi_used.domain.commodityList;
import com.javaitem.wuyi_used.service.CommodityListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品信息service实现类
 */
@Service
public class CommodityListServiceImpl implements CommodityListService {

    @Autowired
    private commodityListMapper commodityListMapper;
    /**
     * 获取商品信息列表
     */
    @Override
    public List<commodityList> allCommodity() {
        return commodityListMapper.allCommodity();
    }

    /**
     * 根据商品分类、新旧程度、价格查询列表
     *
     * @param sort
     */
    @Override
    public List<commodityList> commodityListOfSort(Integer sort,Integer extent,Float startPrice,Float endPrice) {
        return commodityListMapper.commodityListOfSort(sort,extent,startPrice,endPrice);
    }


    /**
     * 根据商品名查找列表
     *
     * @param name
     */
    @Override
    public List<commodityList> commodityListOfName(String name) {
        return commodityListMapper.commodityListOfName(name);
    }

    /**
     * 增删改---还未实现
     *
     * @param commodityList
     */
    @Override
    public boolean insert(commodityList commodityList) {
        return commodityListMapper.insert(commodityList)>0;
    }

    @Override
    public boolean update(commodityList commodityList) {
        return commodityListMapper.update(commodityList)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return commodityListMapper.delete(id)>0;
    }

}
