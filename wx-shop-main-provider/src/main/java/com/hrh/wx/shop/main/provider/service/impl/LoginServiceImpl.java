package com.hrh.wx.shop.main.provider.service.impl;

import com.hrh.wx.commons.domain.WxMainAdmin;
import com.hrh.wx.commons.mapper.WxMainAdminMapper;
import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.main.provider.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.provider.service.impl
 * @ClassName: LoginServiceImpl
 * @Author: break
 * @Description:
 * @Date: 2019/6/19 0019 下午 20:53
 * @Version: 1.0
 */
@Service
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService {
    @Autowired
    private WxMainAdminMapper wxMainAdminMapper;

    @Override
    public BaseResult login(String loginPhone, String loginPwd) {
        WxMainAdmin wxMainAdmin = new WxMainAdmin();
        wxMainAdmin.setWxMainLoginNumber(loginPhone);
        wxMainAdmin.setWxMainLoginPwd(loginPwd);
        WxMainAdmin wxMainAdmin1 = wxMainAdminMapper.selectOne(wxMainAdmin);
        return wxMainAdmin1 != null ? BaseResult.success() : BaseResult.fail();
    }
}
