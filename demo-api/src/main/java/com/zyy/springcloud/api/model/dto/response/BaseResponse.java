package com.zyy.springcloud.api.model.dto.response;


import com.zyy.springcloud.api.model.enums.ResultCode;
import io.swagger.models.auth.In;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 3478493193648267325L;

    private boolean success;
    private String msg;
    private T data;
    private Integer code;

    public BaseResponse() {
        super();
    }

    private BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg  = msg;
        this.data = data;
    }

    private BaseResponse(T data) {
        this.code = ResultCode.SUCCESS.getCode();
        this.msg = ResultCode.SUCCESS.getDesc();
        this.data = data;
    }

    /**
     * 返回失败的JSON串
     * @param code
     * @param data
     * @return
     */
    public static BaseResponse fail(Integer code, String msg, Object data) {
        return new BaseResponse(code, msg, data);
    }

    /**
     * 返回失败的JSON串,数据体为null
     * @param code
     * @param msg
     * @return
     */
    public static BaseResponse fail(Integer code, String msg) {
        return BaseResponse.fail(code, msg, null);
    }
    /**
     * 返回系统异常的错误信息JSON串
     * @return
     */
    public static BaseResponse systemError() {
        return BaseResponse.fail(ResultCode.ERROR.getCode(), ResultCode.ERROR.getDesc(), null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
