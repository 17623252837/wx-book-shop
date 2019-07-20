package com.hrh.wx.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "wx_main_admin")
public class WxMainAdmin {
    /**
     * 管理员id
     */
    @Id
    @Column(name = "wx_main_id")
    private String wxMainId;

    /**
     * 管理员登录账号
     */
    @Column(name = "wx_main_login_number")
    private String wxMainLoginNumber;

    /**
     * 管理员登录密码
     */
    @Column(name = "wx_main_login_pwd")
    private String wxMainLoginPwd;

    /**
     * 管理员头像
     */
    @Column(name = "wx_main_admin_header_img")
    private String wxMainAdminHeaderImg;

    /**
     * 管理员性别 1.男 2.女
     */
    @Column(name = "wx_main_admin_sex")
    private Integer wxMainAdminSex;

    /**
     * 管理员年龄
     */
    @Column(name = "wx_main_admin_age")
    private Integer wxMainAdminAge;

    /**
     * 管理员手机号码
     */
    @Column(name = "wx_main_admin_phone")
    private String wxMainAdminPhone;

    /**
     * 管理员邮箱
     */
    @Column(name = "wx_main_admin_email")
    private String wxMainAdminEmail;

    /**
     * 管理员账号状态 0.未激活 1.激活 2.封禁
     */
    @Column(name = "wx_main_admin_state")
    private Integer wxMainAdminState;

    /**
     * 管理员创建时间
     */
    @Column(name = "wx_main_admin_create_data")
    private Date wxMainAdminCreateData;

    /**
     * 管理员更新时间
     */
    @Column(name = "wx_main_admin_updated_dara")
    private Date wxMainAdminUpdatedDara;

    /**
     * 获取管理员id
     *
     * @return wx_main_id - 管理员id
     */
    public String getWxMainId() {
        return wxMainId;
    }

    /**
     * 设置管理员id
     *
     * @param wxMainId 管理员id
     */
    public void setWxMainId(String wxMainId) {
        this.wxMainId = wxMainId;
    }

    /**
     * 获取管理员登录账号
     *
     * @return wx_main_login_number - 管理员登录账号
     */
    public String getWxMainLoginNumber() {
        return wxMainLoginNumber;
    }

    /**
     * 设置管理员登录账号
     *
     * @param wxMainLoginNumber 管理员登录账号
     */
    public void setWxMainLoginNumber(String wxMainLoginNumber) {
        this.wxMainLoginNumber = wxMainLoginNumber;
    }

    /**
     * 获取管理员登录密码
     *
     * @return wx_main_login_pwd - 管理员登录密码
     */
    public String getWxMainLoginPwd() {
        return wxMainLoginPwd;
    }

    /**
     * 设置管理员登录密码
     *
     * @param wxMainLoginPwd 管理员登录密码
     */
    public void setWxMainLoginPwd(String wxMainLoginPwd) {
        this.wxMainLoginPwd = wxMainLoginPwd;
    }

    /**
     * 获取管理员头像
     *
     * @return wx_main_admin_header_img - 管理员头像
     */
    public String getWxMainAdminHeaderImg() {
        return wxMainAdminHeaderImg;
    }

    /**
     * 设置管理员头像
     *
     * @param wxMainAdminHeaderImg 管理员头像
     */
    public void setWxMainAdminHeaderImg(String wxMainAdminHeaderImg) {
        this.wxMainAdminHeaderImg = wxMainAdminHeaderImg;
    }

    /**
     * 获取管理员性别 1.男 2.女
     *
     * @return wx_main_admin_sex - 管理员性别 1.男 2.女
     */
    public Integer getWxMainAdminSex() {
        return wxMainAdminSex;
    }

    /**
     * 设置管理员性别 1.男 2.女
     *
     * @param wxMainAdminSex 管理员性别 1.男 2.女
     */
    public void setWxMainAdminSex(Integer wxMainAdminSex) {
        this.wxMainAdminSex = wxMainAdminSex;
    }

    /**
     * 获取管理员年龄
     *
     * @return wx_main_admin_age - 管理员年龄
     */
    public Integer getWxMainAdminAge() {
        return wxMainAdminAge;
    }

    /**
     * 设置管理员年龄
     *
     * @param wxMainAdminAge 管理员年龄
     */
    public void setWxMainAdminAge(Integer wxMainAdminAge) {
        this.wxMainAdminAge = wxMainAdminAge;
    }

    /**
     * 获取管理员手机号码
     *
     * @return wx_main_admin_phone - 管理员手机号码
     */
    public String getWxMainAdminPhone() {
        return wxMainAdminPhone;
    }

    /**
     * 设置管理员手机号码
     *
     * @param wxMainAdminPhone 管理员手机号码
     */
    public void setWxMainAdminPhone(String wxMainAdminPhone) {
        this.wxMainAdminPhone = wxMainAdminPhone;
    }

    /**
     * 获取管理员邮箱
     *
     * @return wx_main_admin_email - 管理员邮箱
     */
    public String getWxMainAdminEmail() {
        return wxMainAdminEmail;
    }

    /**
     * 设置管理员邮箱
     *
     * @param wxMainAdminEmail 管理员邮箱
     */
    public void setWxMainAdminEmail(String wxMainAdminEmail) {
        this.wxMainAdminEmail = wxMainAdminEmail;
    }

    /**
     * 获取管理员账号状态 0.未激活 1.激活 2.封禁
     *
     * @return wx_main_admin_state - 管理员账号状态 0.未激活 1.激活 2.封禁
     */
    public Integer getWxMainAdminState() {
        return wxMainAdminState;
    }

    /**
     * 设置管理员账号状态 0.未激活 1.激活 2.封禁
     *
     * @param wxMainAdminState 管理员账号状态 0.未激活 1.激活 2.封禁
     */
    public void setWxMainAdminState(Integer wxMainAdminState) {
        this.wxMainAdminState = wxMainAdminState;
    }

    /**
     * 获取管理员创建时间
     *
     * @return wx_main_admin_create_data - 管理员创建时间
     */
    public Date getWxMainAdminCreateData() {
        return wxMainAdminCreateData;
    }

    /**
     * 设置管理员创建时间
     *
     * @param wxMainAdminCreateData 管理员创建时间
     */
    public void setWxMainAdminCreateData(Date wxMainAdminCreateData) {
        this.wxMainAdminCreateData = wxMainAdminCreateData;
    }

    /**
     * 获取管理员更新时间
     *
     * @return wx_main_admin_updated_dara - 管理员更新时间
     */
    public Date getWxMainAdminUpdatedDara() {
        return wxMainAdminUpdatedDara;
    }

    /**
     * 设置管理员更新时间
     *
     * @param wxMainAdminUpdatedDara 管理员更新时间
     */
    public void setWxMainAdminUpdatedDara(Date wxMainAdminUpdatedDara) {
        this.wxMainAdminUpdatedDara = wxMainAdminUpdatedDara;
    }
}
