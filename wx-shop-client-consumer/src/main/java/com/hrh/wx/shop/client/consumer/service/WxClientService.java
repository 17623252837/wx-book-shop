package com.hrh.wx.shop.client.consumer.service;

import com.hrh.wx.commons.utils.BaseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.consumer.service
 * @ClassName: WxClientService
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 下午 15:15
 * @Version: 1.0
 */
@Component
@FeignClient(value = "wx-shop-client-provider" )
public interface WxClientService {
    @GetMapping("/v1/wx/client/get/openid/{code}")
    public BaseResult getOpenid(@PathVariable("code") String Code);
}
