package com.zhixiang.zhixiangmanage.po;

import java.io.Serializable;
import java.util.Date;

/**
 * website_account
 * @author 
 */
public class WebsiteAccount implements Serializable {
    private Integer id;

    /**
     * 外键依赖website_register_configuration配置表
     */
    private Integer registerConfigId;

    /**
     * 当前账号所属的网站类型
     */
    private Byte websiteType;

    /**
     * 登录该互联网账号使用的当前密码
     */
    private String currentPsd;

    /**
     * 账号第一次初始化密码,提供给认购用户使用,避免该用户使用的时候频繁替换密码
     */
    private String originPsd;

    /**
     * 账号当前状态:0:普通状态1:vip
     */
    private Byte accountStatus;

    /**
     * 0:normal1:delete
     */
    private Byte status;

    /**
     * 当前视频账号的VIP开始时间
     */
    private Date vipBeginDate;

    /**
     * 当前视频账号的VIP结束时间
     */
    private Date vipEndDate;

    private Date createTime;

    private Date updateTime;

    /**
     * 使用次数
     */
    private Integer usedNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegisterConfigId() {
        return registerConfigId;
    }

    public void setRegisterConfigId(Integer registerConfigId) {
        this.registerConfigId = registerConfigId;
    }

    public Byte getWebsiteType() {
        return websiteType;
    }

    public void setWebsiteType(Byte websiteType) {
        this.websiteType = websiteType;
    }

    public String getCurrentPsd() {
        return currentPsd;
    }

    public void setCurrentPsd(String currentPsd) {
        this.currentPsd = currentPsd;
    }

    public String getOriginPsd() {
        return originPsd;
    }

    public void setOriginPsd(String originPsd) {
        this.originPsd = originPsd;
    }

    public Byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getVipBeginDate() {
        return vipBeginDate;
    }

    public void setVipBeginDate(Date vipBeginDate) {
        this.vipBeginDate = vipBeginDate;
    }

    public Date getVipEndDate() {
        return vipEndDate;
    }

    public void setVipEndDate(Date vipEndDate) {
        this.vipEndDate = vipEndDate;
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

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }
}