package com.zhixiang.zhixiangmanage.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_info
 * @author 
 */
@Data
@ApiModel("用户信息")
public class UserInfo implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    private String userName;

    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    private String mobile;

    /**
     * 微信openId
     */
    @ApiModelProperty(value = "微信openId")
    private String wechatId;

    /**
     * 微信用户sessionKey
     */
    @ApiModelProperty(value = "微信用户sessionKey")
    private String wechatSessionKey;

    /**
     * 微信开放平台unionid
     */
    @ApiModelProperty(value = "微信开放平台unionid")
    private String unionId;

    /**
     * 用户邮箱
     */
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Byte age;

    private String userLogo;


}