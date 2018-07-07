package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * operator_log
 * @author 
 */
@Data
public class OperatorLog implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 操作类型
     */
    private Byte operatorType;

    /**
     * 创建时间
     */
    private Date createTime;


}