package com.hrh.wx.shop.client.consumer.service.fallback;

import com.hrh.wx.shop.client.consumer.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.consumer.service.fallback
 * @ClassName: TestFallback
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 上午 11:13
 * @Version: 1.0
 */

@Component
public class TestFallback implements TestService {
    @Override
    public String echo(String message) {
        return "熔断了";
    }
}
