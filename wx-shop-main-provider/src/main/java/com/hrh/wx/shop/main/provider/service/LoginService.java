package com.hrh.wx.shop.main.provider.service;

import com.hrh.wx.commons.utils.BaseResult;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.provider.service
 * @ClassName: LoginService
 * @Author: break
 * @Description: 管理员用户登录
 * @Date: 2019/6/19 0019 下午 20:52
 * @Version: 1.0
 */
public interface LoginService {
    //login
    BaseResult login(String loginPhone,String loginPwd);
}
