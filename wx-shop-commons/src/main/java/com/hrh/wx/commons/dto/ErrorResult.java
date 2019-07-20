package com.hrh.wx.commons.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.dto
 * @ClassName: ErrorResult 请求失败
 * @Author: break
 * @Description:
 * @Date: 2019/7/20 0020 下午 14:06
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResult extends AbstractBaseResult {
    private int code;
    private String title;
    private String detail;
}
