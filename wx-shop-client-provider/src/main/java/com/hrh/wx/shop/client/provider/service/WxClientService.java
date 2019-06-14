package com.hrh.wx.shop.client.provider.service;

import com.hrh.wx.commons.utils.BaseResult;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.provider.service
 * @ClassName: WxClientService
 * @Author: break
 * @Description: 微信服务
 * @Date: 2019/6/14 0014 下午 14:46
 * @Version: 1.0
 */
public interface WxClientService {
    //获取微信openId
    BaseResult getOpenId(String code);
}
