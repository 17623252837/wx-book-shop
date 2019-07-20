package com.hrh.wx.shop.main.consumer.service.fallback;

import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.main.consumer.service.LoginService;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.consumer.service.fallback
 * @ClassName: LoginServiceFallback
 * @Author: break
 * @Description:
 * @Date: 2019/6/20 0020 上午 10:06
 * @Version: 1.0
 */
@Component
public class LoginServiceFallback implements LoginService {
    @Override
    public BaseResult login(String name, String pwd) {
        return BaseResult.fail("服务熔断");
    }
}
