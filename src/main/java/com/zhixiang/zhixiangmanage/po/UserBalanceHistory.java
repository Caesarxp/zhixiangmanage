package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_balance_history
 * @author 
 */
@Data
public class UserBalanceHistory implements Serializable {
    private Integer id;

    /**
     * 请求编号
     */
    private String requestNo;

    /**
     * 账户ID
     */
    private Integer balanceId;

    /**
     * 变动金额,单位分
     */
    private Integer amount;

    /**
     * 手续费
     */
    private Integer fee;

    /**
     * 当前余额
     */
    private Integer balance;

    /**
     * 描述
     */
    private String remark;

    /**
     * 自己变动方向 123:加款 321:减款 321:冻结 123:解冻
     */
    private Byte fundDirection;

    /**
     * 是否允许结算
     */
    private Byte allowSett;

    /**
     * 是否结算
     */
    private Byte completeSett;

    /**
     * 交易类型
     */
    private Byte trxType;

    /**
     * 风险预存期天数
     */
    private Integer riskTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}