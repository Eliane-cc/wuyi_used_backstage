package com.javaitem.wuyi_used.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 定位图片url
 */
@Configuration
public class CommodityPicConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/img/commodity/**").addResourceLocations(
          "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
          +System.getProperty("file.separator")+"commodity"+System.getProperty("file.separator")
        );
    }
}
