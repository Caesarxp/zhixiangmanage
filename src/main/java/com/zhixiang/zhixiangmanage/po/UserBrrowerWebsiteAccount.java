package com.zhixiang.zhixiangmanage.po;

import java.io.Serializable;
import java.util.Date;

/**
 * user_brrower_website_account
 * @author 
 */
public class UserBrrowerWebsiteAccount implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer websiteAccountId;

    /**
     * 记录关联订单项,用于退单时候处理记录清理
     */
    private Integer orderItemId;

    /**
     * 用户租借账号所属的投放计划,用户重新启用或暂停计划
     */
    private Integer userSalePlanId;

    /**
     * 账号使用到期时间
     */
    private Date endTime;

    /**
     * 账号使用开始时间
     */
    private Date beginTime;

    /**
     * 0:normal1:offline
     */
    private Byte status;

    private Date createTime;

    private Date updateTime;

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

    public Integer getWebsiteAccountId() {
        return websiteAccountId;
    }

    public void setWebsiteAccountId(Integer websiteAccountId) {
        this.websiteAccountId = websiteAccountId;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getUserSalePlanId() {
        return userSalePlanId;
    }

    public void setUserSalePlanId(Integer userSalePlanId) {
        this.userSalePlanId = userSalePlanId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
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
}