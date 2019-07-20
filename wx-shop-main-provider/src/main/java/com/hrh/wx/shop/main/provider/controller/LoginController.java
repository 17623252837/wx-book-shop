package com.hrh.wx.shop.main.provider.controller;

import com.google.common.collect.Lists;
import com.hrh.wx.commons.domain.User;
import com.hrh.wx.commons.dto.AbstractBaseResult;
import com.hrh.wx.commons.dto.BaseResultFactory;
import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.shop.main.provider.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.main.provider.controller
 * @ClassName: LoginController
 * @Author: break
 * @Description:
 * @Date: 2019/6/20 0020 上午 9:51
 * @Version: 1.0
 */
@RestController
public class LoginController {
    //动态刷新参数
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;
    @Autowired
    private LoginService loginService;

    @PostMapping("/v1/wx/main/login/name/{name}/pwd/{pwd}")
    public BaseResult login(@PathVariable("name") String name, @PathVariable("pwd") String pwd){
        return loginService.login(name,pwd);
    }

    @PostMapping("/v2/wx/main/login/name/{name}/pwd/{pwd}")
    public AbstractBaseResult login2(@PathVariable("name") String name, @PathVariable("pwd") String pwd, HttpServletRequest request){
        StringBuffer requestURL = request.getRequestURL();

        User user = new User();
        user.setName("hmp");
        user.setId(1L);

        User user2 = new User();
        user2.setName("hmpp");
        user2.setId(2L);


        List<User> users = Lists.newArrayList();
        users.add(user);
        users.add(user2);


        return BaseResultFactory.getInstance().build(requestURL.toString(),1,1,users);
    }


    @PostMapping("/v3/wx/main/login/name/{name}/pwd/{pwd}")
    public AbstractBaseResult login3(@PathVariable("name") String name, @PathVariable("pwd") String pwd, HttpServletRequest request){
        StringBuffer requestURL = request.getRequestURL();
        return BaseResultFactory.build(200,"hmp","hmp","DEBUG");
    }


}

