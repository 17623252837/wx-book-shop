package com.hrh.wx.commons.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: lqgxwd
 * @Package: org.lanqiao.utils
 * @ClassName: PageInfoUtil
 * @Author: hrh
 * @Description:
 * @Date: 2019/6/4 0004 下午 19:55
 * @Version: 1.0
 */
public class PageInfoUtil {
    private static Map<String,Integer> info = new HashMap<>();
    public final static String PAGE_DRAW = "draw";
    public final static String PAGE_START = "start";
    public final static String PAGE_LENGTH = "length";


    public static Map<String,Integer> getInfo(HttpServletRequest request){
        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength =  request.getParameter("length");
        int draw = strDraw ==null ? 0 :Integer.parseInt(strDraw);
        int start = strStart == null ?0 :Integer.parseInt(strStart);
        int length = strLength == null ? 1 :Integer.parseInt(strLength);

        info.put(PAGE_START,(start / length) + 1);
        info.put(PAGE_LENGTH,length);
        info.put(PAGE_DRAW,draw);
        return info;
    };
}
