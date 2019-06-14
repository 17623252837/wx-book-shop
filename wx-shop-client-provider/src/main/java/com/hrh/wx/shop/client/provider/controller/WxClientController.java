package com.hrh.wx.shop.client.provider.controller;

import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.client.provider.service.WxClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.provider.controller
 * @ClassName: WxClientController
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 下午 15:01
 * @Version: 1.0
 */
@RestController
public class WxClientController {
    @Autowired
    private WxClientService wxClientService;
    @GetMapping("/v1/wx/client/get/openid/{code}")
    public BaseResult getOpenid(@PathVariable("code") String Code){
        return wxClientService.getOpenId(Code);
    }
}
