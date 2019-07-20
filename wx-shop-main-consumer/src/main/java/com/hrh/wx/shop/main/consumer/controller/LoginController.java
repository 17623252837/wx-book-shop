package com.hrh.wx.shop.main.consumer.controller;

import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.main.consumer.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.consumer.controller
 * @ClassName: LoginController
 * @Author: break
 * @Description:
 * @Date: 2019/6/20 0020 上午 10:07
 * @Version: 1.0
 */
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/v1/wx/main/login/name/{name}/pwd/{pwd}")
    public BaseResult login(@PathVariable("name") String name, @PathVariable("pwd") String pwd){
        return loginService.login(name,pwd);
    }
}
