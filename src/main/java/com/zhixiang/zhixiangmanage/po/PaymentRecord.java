package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * payment_record
 * @author 
 */
@Data
public class PaymentRecord implements Serializable {
    private Integer id;

    /**
     * 订单标号
     */
    private String orderNo;

    /**
     * 外部交易流水号
     */
    private String tradeNo;

    /**
     * 账号ID
     */
    private Integer userBalanceId;

    /**
     * 收款方账号类型
     */
    private Byte receiverAccountType;

    /**
     * 付款方账号ID
     */
    private Integer payerBalanceId;

    /**
     * 付款方账号类型
     */
    private Byte payerAccountType;

    /**
     * 支付总金额
     */
    private BigDecimal totalAmount;

    /**
     * 付款方手续费
     */
    private BigDecimal payerFee;

    /**
     * 付款方支付金额
     */
    private BigDecimal payerPayAmount;

    /**
     * 收款方手续费
     */
    private BigDecimal receiverFee;

    /**
     * 收款方实收金额
     */
    private BigDecimal receiverPostAmount;

    /**
     * 平台收入
     */
    private BigDecimal platIncome;

    /**
     * 业务类型
     */
    private Integer bizType;

    /**
     * 交易类型
     */
    private Byte trxType;

    /**
     * 支付类型
     */
    private Byte paymentType;

    /**
     * 风险预存期天数
     */
    private Integer riskTime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 订单来源
     */
    private Byte orderFrom;

    /**
     * 支付产品
     */
    private String product;

    /**
     * 支付渠道码
     */
    private String frpCode;

    /**
     * 支付成功时间
     */
    private Date paySuccessTime;

    /**
     * 交易完成时间
     */
    private Date completeTime;

    /**
     * 撤销时间
     */
    private Date cancelTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}