package com.zhixiang.zhixiangmanage.exception;

import com.zhixiang.zhixiangmanage.common.BussinessErrorCode;
import org.springframework.util.StringUtils;

/**
 * @项目名：zhixiangmanage
 * @包名：com.zhixiang.zhixiangmanage.exception
 * @作者： 熊鹏
 * @描述：
 * @时间： created in 23:15 2018/6/7
 */
public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 280273815263727423L;

    private int errorCode;
    private String errorMsg;

    public BusinessException(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BusinessException(BussinessErrorCode errorCode, String msg) {
        this(errorCode.type, StringUtils.isEmpty(msg) ? errorCode.msg : msg);
    }

    public BusinessException(BussinessErrorCode errorCode) {
        this(errorCode.type, errorCode.msg);
    }

    public static BusinessException instance(BussinessErrorCode errorCode) {
        return new BusinessException(errorCode);
    }

    public static BusinessException instance(BussinessErrorCode errorCode, String msg) {
        return new BusinessException(errorCode, msg);
    }

    public static BusinessException instance(int errorCode, String msg) {
        return new BusinessException(errorCode, msg);
    }

    /**
     * @return the errorCode
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode
     *            the errorCode to set
     */
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return the errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * @param errorMsg
     *            the errorMsg to set
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
