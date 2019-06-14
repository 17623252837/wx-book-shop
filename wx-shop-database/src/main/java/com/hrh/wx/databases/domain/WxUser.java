package com.hrh.wx.databases.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "wx_user")
public class WxUser {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户绑定微信
     */
    @Column(name = "user_wx_oppenid")
    private String userWxOppenid;

    /**
     * 用户登录账号
     */
    @Column(name = "user_number")
    private String userNumber;

    /**
     * 用户登录密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户性别
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 用户年龄
     */
    @Column(name = "user_age")
    private Integer userAge;

    /**
     * 用户头像
     */
    @Column(name = "user_heade_image")
    private String userHeadeImage;

    /**
     * 用户创建时间
     */
    @Column(name = "user_create_data")
    private Date userCreateData;

    /**
     * 用户更新时间
     */
    @Column(name = "user_update_data")
    private Date userUpdateData;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户绑定微信
     *
     * @return user_wx_oppenid - 用户绑定微信
     */
    public String getUserWxOppenid() {
        return userWxOppenid;
    }

    /**
     * 设置用户绑定微信
     *
     * @param userWxOppenid 用户绑定微信
     */
    public void setUserWxOppenid(String userWxOppenid) {
        this.userWxOppenid = userWxOppenid;
    }

    /**
     * 获取用户登录账号
     *
     * @return user_number - 用户登录账号
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * 设置用户登录账号
     *
     * @param userNumber 用户登录账号
     */
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * 获取用户登录密码
     *
     * @return user_password - 用户登录密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户登录密码
     *
     * @param userPassword 用户登录密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户性别
     *
     * @return user_sex - 用户性别
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置用户性别
     *
     * @param userSex 用户性别
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取用户年龄
     *
     * @return user_age - 用户年龄
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * 设置用户年龄
     *
     * @param userAge 用户年龄
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * 获取用户头像
     *
     * @return user_heade_image - 用户头像
     */
    public String getUserHeadeImage() {
        return userHeadeImage;
    }

    /**
     * 设置用户头像
     *
     * @param userHeadeImage 用户头像
     */
    public void setUserHeadeImage(String userHeadeImage) {
        this.userHeadeImage = userHeadeImage;
    }

    /**
     * 获取用户创建时间
     *
     * @return user_create_data - 用户创建时间
     */
    public Date getUserCreateData() {
        return userCreateData;
    }

    /**
     * 设置用户创建时间
     *
     * @param userCreateData 用户创建时间
     */
    public void setUserCreateData(Date userCreateData) {
        this.userCreateData = userCreateData;
    }

    /**
     * 获取用户更新时间
     *
     * @return user_update_data - 用户更新时间
     */
    public Date getUserUpdateData() {
        return userUpdateData;
    }

    /**
     * 设置用户更新时间
     *
     * @param userUpdateData 用户更新时间
     */
    public void setUserUpdateData(Date userUpdateData) {
        this.userUpdateData = userUpdateData;
    }
}
