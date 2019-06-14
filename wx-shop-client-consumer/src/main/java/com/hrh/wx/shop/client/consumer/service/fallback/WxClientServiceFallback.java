package com.hrh.wx.shop.client.consumer.service.fallback;

import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.client.consumer.service.WxClientService;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.consumer.service.fallback
 * @ClassName: WxClientServiceFillback
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 下午 15:18
 * @Version: 1.0
 */
@Component
public class WxClientServiceFallback implements WxClientService {
    @Override
    public BaseResult getOpenid(String Code) {
        return BaseResult.fail("服务熔断");
    }
}
