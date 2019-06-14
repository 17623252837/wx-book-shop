package com.hrh.wx.shop.client.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.provider.controller
 * @ClassName: testControlelr
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 上午 10:52
 * @Version: 1.0
 */
@RestController
public class testController {
    @GetMapping("echo/hi/{message}")
    public String say(@PathVariable("message")String message){
        return message;
    }
}
