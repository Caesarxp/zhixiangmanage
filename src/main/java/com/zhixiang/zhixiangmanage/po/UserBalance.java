package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_balance
 * @author 
 */
@Data
public class UserBalance implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 账号状态 0:normal 1:not_active
     */
    private Byte status;

    /**
     * 账号余额,单位分
     */
    private Integer balance;

    /**
     * 账户不可用余额
     */
    private Integer unBalance;

    /**
     * 可结算余额
     */
    private Integer availableSettAmount;

    /**
     * 保证金
     */
    private Integer securityMoney;

    /**
     * 账户类型 1:个人/会员 2:账户商 3:内部账户 4:手续费账户 5:外部结算账户
     */
    private Byte accountType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}