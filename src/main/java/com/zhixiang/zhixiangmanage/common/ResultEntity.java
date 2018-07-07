package com.zhixiang.zhixiangmanage.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;
import sun.misc.Contended;

/**
 * @项目名：zhixiangmanage
 * @包名：com.zhixiang.zhixiangmanage.common
 * @作者： 熊鹏
 * @描述：
 * @时间： created in 23:14 2018/6/7
 */
@Contended
@ApiModel("返回数据包装类")
public class ResultEntity<T> {
    @ApiModelProperty(value = "返回状态码")
    private Integer code;

    @ApiModelProperty(value = "返回数据")
    private T data;

    @ApiModelProperty(value = "描述信息")
    private String msg;

    public ResultEntity(T data) {
        this.code = 200;
        this.data = data;
    }
    public ResultEntity() {
        this.code = 200;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public static <T> ResultEntity<T> instance(T data) {
        return new ResultEntity<T>(data);
    }
    public static <T> ResultEntity<T> instance() {
        return new ResultEntity<T>();
    }

}
