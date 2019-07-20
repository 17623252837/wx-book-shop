package com.hrh.wx.shop.main.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.consumer
 * @ClassName: MainConsumerApplication
 * @Author: break
 * @Description:
 * @Date: 2019/6/20 0020 上午 10:01
 * @Version: 1.0
 */
@SpringBootApplication(scanBasePackages = "com.hrh.wx", exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class MainConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainConsumerApplication.class,args);
    }
}
