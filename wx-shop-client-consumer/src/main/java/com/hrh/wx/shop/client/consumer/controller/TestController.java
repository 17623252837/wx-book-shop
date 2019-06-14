package com.hrh.wx.shop.client.consumer.controller;

import com.hrh.wx.shop.client.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.consumer.controller
 * @ClassName: TestController
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 上午 11:08
 * @Version: 1.0
 */
@RestController
public class TestController {
    @Autowired
    private TestService echoService;

    @GetMapping("/echo/hi/{message}")
    public String echo(@PathVariable("message") String message){
        return echoService.echo(message);
    }
}
