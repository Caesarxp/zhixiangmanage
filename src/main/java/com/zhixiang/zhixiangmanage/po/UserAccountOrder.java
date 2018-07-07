package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_account_order
 * @author 
 */
@Data
public class UserAccountOrder implements Serializable {
    private Integer id;

    private Integer userId;

    /**
     * 订单编号
     */
    private String orderSeqId;

    /**
     * 用户具有的认购账号的主键ID标识
     */
    private Byte orderType;

    /**
     * 订单总金额
     */
    private Integer totalPrice;

    /**
     * 实际支付金额
     */
    private Integer payPrice;

    /**
     * 支付状态
     */
    private Byte payStatus;

    /**
     * 描述
     */
    private String description;

    /**
     * 订单完成时间
     */
    private Date completeTime;

    /**
     * 订单支付成功时间
     */
    private Date paySuccessTime;

    /**
     * 订单取消时间
     */
    private Date payCancelTime;

    private Date createTime;

    private Date updateTime;


}