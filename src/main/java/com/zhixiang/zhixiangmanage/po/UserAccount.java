package com.zhixiang.zhixiangmanage.po;

import java.io.Serializable;
import java.util.Date;

/**
 * user_account
 * @author 
 */
public class UserAccount implements Serializable {
    private Integer id;

    private Integer userId;

    /**
     * 账号类型0:普通用户账号 1:系统管理员账号
     */
    private Byte accountType;

    private String loginName;

    /**
     * 0:用户名 1:手机号 2:邮箱
     */
    private Byte loginType;

    private String password;

    /**
     * 0:normal 1:delete
     */
    private Byte status;

    private Date createTime;

    private Date updateTime;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 登出时间
     */
    private Date loginOutTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getAccountType() {
        return accountType;
    }

    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Byte getLoginType() {
        return loginType;
    }

    public void setLoginType(Byte loginType) {
        this.loginType = loginType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLoginOutTime() {
        return loginOutTime;
    }

    public void setLoginOutTime(Date loginOutTime) {
        this.loginOutTime = loginOutTime;
    }
}