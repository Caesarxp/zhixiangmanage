package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_owener_website_account
 * @author 
 */
@Data
public class UserOwenerWebsiteAccount implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer websiteAccountId;

    /**
     * 记录关联订单项,用于退单时候处理记录清理
     */
    private Integer orderItemId;

    /**
     * 账号使用到期时间
     */
    private Date endTime;

    /**
     * 账号使用开始时间
     */
    private Date beginTime;

    /**
     * 0:normal 1:offline
     */
    private Byte status;

    private Date createTime;

    private Date updateTime;


}