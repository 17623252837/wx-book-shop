package com.hrh.wx.shop.client.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.consumer
 * @ClassName: ClientConsumerApplication
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 上午 11:03
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.hrh.wx", exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class ClientConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientConsumerApplication.class,args);
    }
}
