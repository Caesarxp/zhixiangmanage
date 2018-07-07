package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * website_account_price
 * @author 
 */
@Data
public class WebsiteAccountPrice implements Serializable {
    private Integer id;

    /**
     * 网站类型
     */
    private Integer websiteType;

    /**
     * 0:normal 1:offline
     */
    private Byte status;

    /**
     * 单位时间内价格,单位 (分/h)
     */
    private String rentPrice;

    /**
     * 单位时间内价格,单位 (分/month)
     */
    private String ownPrice;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;


}