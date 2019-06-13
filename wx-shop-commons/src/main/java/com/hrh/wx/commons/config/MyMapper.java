package com.hrh.wx.commons.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.config
 * @ClassName: MyMapper
 * @Author: break
 * @Description:
 * @Date: 2019/6/13 0013 上午 9:43
 * @Version: 1.0
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
