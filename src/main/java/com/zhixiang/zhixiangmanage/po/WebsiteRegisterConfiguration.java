package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * website_register_configuration
 * @author 
 */
@Data
public class WebsiteRegisterConfiguration implements Serializable {
    private Integer id;

    /**
     * 操作人ID
     */
    private Integer operatorId;

    private String mobile;

    private String email;

    /**
     * 注册邮箱的密码
     */
    private String emailPsd;

    private Byte status;

    private Date createTime;

    private Date updateTime;


}