package com.hrh.wx.shop.main.consumer.service;

import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.main.consumer.service.fallback.LoginServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.consumer.service
 * @ClassName: LoginService
 * @Author: break
 * @Description:
 * @Date: 2019/6/20 0020 上午 10:03
 * @Version: 1.0
 */
@Component
@FeignClient(value = "wx-shop-main-provider" ,fallback = LoginServiceFallback.class)
public interface LoginService {
    @PostMapping("/v1/wx/main/login/name/{name}/pwd/{pwd}")
    public BaseResult login(@PathVariable("name") String name, @PathVariable("pwd") String pwd);
}
