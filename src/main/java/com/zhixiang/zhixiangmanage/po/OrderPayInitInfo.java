package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * order_pay_init_info
 * @author 
 */
@Data
public class OrderPayInitInfo implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private String orderNo;

    /**
     * 支付方式
     */
    private Byte payChannel;

    /**
     * 微信支付预置码
     */
    private String payInitData;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 失效时间
     */
    private Date expireTime;

    /**
     * 支付hash标识
     */
    private String payHash;


}