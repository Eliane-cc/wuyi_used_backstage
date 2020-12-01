package com.javaitem.wuyi_used.dao;

import com.javaitem.wuyi_used.domain.commodityList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface commodityListMapper {
    /**
     * 获取商品信息列表
     */
    public List<commodityList> allCommodity();

    /**
     * 根据商品分类查询列表
     */
    public List<commodityList> commodityListOfSort(Integer sort,Integer extent,Float startPrice,Float endPrice);

    /**
     * 获取筛选条件后的商品列表
     * @return
     */
//    public List<commodityList> filterCommodity();


    /**
     * 增删改
     */
    public int insert(commodityList commodityList);
    public int update(commodityList commodityList);
    public int delete(Integer id);

    /**
     * 根据主键查询单条数据
     */
    public commodityList selectByPrimaryKey(Integer id);

    /**
     * 根据商品名查找列表
     */
    public List<commodityList> commodityListOfName(String name);

    /**
     * 根据商品新旧程度查询列表
     */
    public List<commodityList> commodityListOfExtent(Integer extent);


    /**
     * 根据商品价格查询列表
     */
//    public List<commodityList> commodityListOfPrice(Decimal price);
}
