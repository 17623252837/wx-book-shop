package com.hrh.wx.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.gateway
 * @ClassName: WxGatewayApplication
 * @Author: break
 * @Description:
 * @Date: 2019/6/12 0012 下午 16:33
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WxGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxGatewayApplication.class,args);
    }
}
