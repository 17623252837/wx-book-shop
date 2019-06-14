package com.hrh.wx.commons.api;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.api
 * @ClassName: WxClientApi
 * @Author: break
 * @Description:
 * @Date: 2019/6/14 0014 下午 14:50
 * @Version: 1.0
 */
public class WxClientApi {
    private static final String WX_CLIENT_APPID = "wx2f5fe353f841ecb2&secret=3ca44dbfbb2f4beec01911817943347e";
    private static final String WX_CLIENT_SECRET = "3ca44dbfbb2f4beec01911817943347e";


    public static String getUrl(String code){
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
        return  String.format(url, WX_CLIENT_APPID,WX_CLIENT_SECRET,code);
    }
}
