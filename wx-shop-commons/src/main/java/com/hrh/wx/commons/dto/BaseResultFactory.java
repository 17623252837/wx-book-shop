package com.hrh.wx.commons.dto;

import java.util.List;

/**
 * @ProjectName: wx-book-shop
 * @Package: com.hrh.wx.commons.dto
 * @ClassName: BaseResultFactory 通用响应结构工厂
 * @Author: break
 * @Description:
 * @Date: 2019/7/20 0020 下午 14:17
 * @Version: 1.0
 */
public class BaseResultFactory<T extends AbstractBaseDomain> {
    private static final String LOGGER_LEVEL_DEBUG = "DEBUG";
    private static BaseResultFactory baseResultFactory;

    public BaseResultFactory(){

    }

    public static BaseResultFactory getInstance(){
        if(baseResultFactory == null){
            synchronized (BaseResultFactory.class){
                if(baseResultFactory == null ){
                    baseResultFactory = new BaseResultFactory();
                }
            }
        }

        return baseResultFactory;
    }
    /**
     * @Method 构造单笔数据
     * @Author hrh
     * @Version  1.0
     * @Description
     No such property: code for class: Script1
     * @Return
     * @Exception
     * @Date 2019/7/20 0020 下午 14:23
     */
    public  AbstractBaseResult build(String self,T t){
        return new SuccessResult(self,t);
    }

    /**
     * @Method 构造多笔数据
     * @Author hrh
     * @Version  1.0
     * @Description
     No such property: code for class: Script1
     * @Return
     * @Exception
     * @Date 2019/7/20 0020 下午 14:25
     */
    public AbstractBaseResult build(String self, int next, int last, List<T> attributes){
        return new SuccessResult(self ,next ,last ,attributes);
    }

    /**
     * @Method 构建请求错误响应结构
     * @Author hrh
     * @Version  1.0
     * @Description
     No such property: code for class: Script1
     * @Return
     * @Exception
     * @Date 2019/7/20 0020 下午 14:38
     */
    public static AbstractBaseResult build(int code,String title,String detail,String level){
        if(LOGGER_LEVEL_DEBUG.equals(level)){
            return new ErrorResult(code,title,detail);
        }
        else {
            return new ErrorResult(code,title,null);
        }
    }
}
