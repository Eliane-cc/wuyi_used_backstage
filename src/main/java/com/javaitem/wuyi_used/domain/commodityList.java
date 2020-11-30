package com.javaitem.wuyi_used.domain;

import java.io.Serializable;
import java.util.Date;

public class commodityList implements Serializable {
    /*主键*/
    private Integer commodityId;
    /*用户id*/
    private String userId;
    /*标题*/
    private String title;
    /*新旧程度*/
    private Integer extent;
    /*发布时间*/
    private Date releaseTime;
    /*价格*/
    private String price;
    /*购买时间*/
    private Date buyTime;
    /*商品图片*/
    private String imgUrl;
    /*分类*/
    private Integer sort;
    /*是否购买*/
    private Integer isSold;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getExtent() {
        return extent;
    }

    public void setExtent(Integer extent) {
        this.extent = extent;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsSold() {
        return isSold;
    }

    public void setIsSold(Integer isSold) {
        this.isSold = isSold;
    }
}
