package com.hrh.wx.commons.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.dto
 * @ClassName: AbstractBaseResult 通用请求返回数据
 * @Author: break
 * @Description:
 * @Date: 2019/7/20 0020 下午 14:08
 * @Version: 1.0
 */
@Data
public abstract class AbstractBaseResult {

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected static class Links {
        private String self;
        private String next;
        private String last;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected static class DataBean<T> {
        private String type;
        private Long id;
        private T attributes;
        private T relationships;
        private Links links;
    }

}
