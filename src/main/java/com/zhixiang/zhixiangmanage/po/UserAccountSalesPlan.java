package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_account_sales_plan
 * @author 
 */
@Data
public class UserAccountSalesPlan implements Serializable {
    private Integer id;

    private Integer userId;

    /**
     * 用户具有的认购账号的主键ID标识
     */
    private Integer userOwnId;

    /**
     * 账号售卖价格/hour
     */
    private Integer sellPrice;

    private Date startTime;

    private Date endTime;

    private String planCycle;

    /**
     * 0:投放中1:暂停
     */
    private Byte planStatus;

    private Date createTime;

    private Date updateTime;

    /**
     * 网站类型,冗余字段
     */
    private Byte websiteType;


}