package com.hrh.wx.shop.main.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.provider
 * @ClassName: MainProviderApplication
 * @Author: break
 * @Description:
 * @Date: 2019/6/19 0019 下午 20:17
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hrh.wx.commons.mapper")
public class MainProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainProviderApplication.class,args);
    }
}
