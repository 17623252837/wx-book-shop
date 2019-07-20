package com.hrh.wx.commons.domain;

import com.hrh.wx.commons.dto.AbstractBaseDomain;
import lombok.Data;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.domain
 * @ClassName: User
 * @Author: break
 * @Description:
 * @Date: 2019/7/20 0020 下午 15:09
 * @Version: 1.0
 */
@Data
public class User extends AbstractBaseDomain {
    private String name;
}
