package com.hrh.wx.commons.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.dto
 * @ClassName: AbstractBaseDomain
 * @Author: break
 * @Description:
 * @Date: 2019/7/20 0020 下午 15:07
 * @Version: 1.0
 */
@Data
public abstract class AbstractBaseDomain implements Serializable {
    private Long id;
}
