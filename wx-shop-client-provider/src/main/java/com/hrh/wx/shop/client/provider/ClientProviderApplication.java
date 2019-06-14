package com.hrh.wx.shop.client.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hrh.wx.commons.mapper")
public class ClientProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientProviderApplication.class, args);
    }
}
