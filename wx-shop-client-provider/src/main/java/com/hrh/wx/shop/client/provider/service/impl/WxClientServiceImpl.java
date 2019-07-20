package com.hrh.wx.shop.client.provider.service.impl;

import com.hrh.wx.commons.api.WxClientApi;
import com.hrh.wx.commons.dto.WXClientDTO;
import com.hrh.wx.commons.mapper.WxUserMapper;
import com.hrh.wx.commons.utils.BaseResult;
import com.hrh.wx.commons.utils.HttpClientUtils;
import com.hrh.wx.commons.utils.MapperUtils;
import com.hrh.wx.shop.client.provider.service.WxClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.shop.client.provider.service.impl
 * @ClassName: WxClientServiceImpl
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 下午 14:48
 * @Version: 1.0
 */
@Service
public class WxClientServiceImpl implements WxClientService {
    @Autowired
    private WxUserMapper wxUserMapper;
    BaseResult baseResult = BaseResult.success();
    @Override
    public BaseResult getOpenId(String code) {
        String url = WxClientApi.getUrl(code);
        String json = HttpClientUtils.doGet(url);
        WXClientDTO wxClientDTO = null;
        try {
            Map<String, Object> stringObjectMap = MapperUtils.json2map(json);
            Object openid = stringObjectMap.get("openid");
            if(openid != null){
                wxClientDTO = MapperUtils.map2pojo(stringObjectMap, WXClientDTO.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        baseResult = json != null ? BaseResult.success("获取成功",wxClientDTO) : BaseResult.fail("获取失败") ;
        return baseResult;
    }
}
