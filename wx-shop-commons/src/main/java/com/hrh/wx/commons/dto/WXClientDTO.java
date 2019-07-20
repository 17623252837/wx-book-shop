package com.hrh.wx.commons.dto;

import lombok.Data;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.dto
 * @ClassName: WXClientDTO
 * @Author: break
 * @Description:微信小程序oppenid传输对象
 * @Date: 2019/6/14 0014 下午 16:18
 * @Version: 1.0
 */
@Data
public class WXClientDTO {
    private String openid;
    private String session_key;
}
