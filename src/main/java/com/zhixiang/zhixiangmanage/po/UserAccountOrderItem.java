package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_account_order_item
 * @author 
 */
@Data
public class UserAccountOrderItem implements Serializable {
    private Integer id;

    private Integer orderId;

    /**
     * 商品ID,用户租借订单项该值是用户owner_webxx的主键ID
     */
    private Integer goodsId;

    /**
     * 商品单价
     */
    private Integer price;

    /**
     * 订单项总价
     */
    private Integer payPrice;

    /**
     * 订单项状态 0:有效 1:无效
     */
    private Byte itemStatus;

    /**
     * 描述
     */
    private String description;

    /**
     * 开始时间(租借的开始时间|认购账号使用的开始时间)
     */
    private Date startTime;

    /**
     * 结束时间(租借的结束时间|认购账号使用的结束时间)
     */
    private Date endTime;

    /**
     * 数量 租借订单项为分钟时长
     */
    private Integer num;

    private Date createTime;

    private Date updateTime;


}