package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * split_record
 * @author 
 */
@Data
public class SplitRecord implements Serializable {
    private Integer id;

    /**
     * 分账来源账号
     */
    private Integer fromUserBalanceId;

    /**
     * 分账账号
     */
    private Integer splitUserBalanceId;

    /**
     * 订单总金额,单位分
     */
    private Integer orderAmount;

    /**
     * 支付总金额,单位分
     */
    private Integer payAmount;

    /**
     * 分账金额,单位分
     */
    private Integer spliteAmount;

    /**
     * 分账状态 100:分账成功 102:未分账
     */
    private Byte splitStatus;

    /**
     * 交易类型
     */
    private Byte trxType;

    /**
     * 创建时间
     */
    private Date splitSuccessTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}