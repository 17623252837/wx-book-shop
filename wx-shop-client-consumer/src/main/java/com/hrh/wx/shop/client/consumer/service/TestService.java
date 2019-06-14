package com.hrh.wx.shop.client.consumer.service;

import com.hrh.wx.shop.client.consumer.service.fallback.TestFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.consumer.service
 * @ClassName: TestService
 * @Author: break
 * @Description: \
 * @Date: 2019/6/14 0014 上午 11:07
 * @Version: 1.0
 */
@Component
@FeignClient(value = "wx-shop-client-provider",fallback = TestFallback.class)
public interface TestService {
    @GetMapping("/echo/hi/{message}")
    String echo(@PathVariable("message")String message);
}
