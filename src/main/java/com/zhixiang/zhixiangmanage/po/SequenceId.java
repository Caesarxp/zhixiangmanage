package com.zhixiang.zhixiangmanage.po;

import lombok.Data;

import java.io.Serializable;

/**
 * sequence_id
 * @author 
 */
@Data
public class SequenceId implements Serializable {
    /**
     * 取号的批次
     */
    private Long idTimes;

    /**
     * 服务器IP
     */
    private String ip;


}