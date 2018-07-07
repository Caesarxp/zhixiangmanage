package com.zhixiang.zhixiangmanage.common;

/**
 * @项目名：zhixiangmanage
 * @包名：com.zhixiang.zhixiangmanage.common
 * @作者： 熊鹏
 * @描述：
 * @时间： created in 23:16 2018/6/7
 */
public enum BussinessErrorCode {


    SYSTEM_ERROR(100000, "系统问题"), // <br/>
    ;

    public int type;
    public String msg;

    private BussinessErrorCode(int type, String msg) {
        this.type = type;
        this.msg = msg;
    }
}
