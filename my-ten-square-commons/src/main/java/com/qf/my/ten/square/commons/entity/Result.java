package com.qf.my.ten.square.commons.entity;

import lombok.Data;

/**
 * 这是返回结果数据
 */
@Data
public class Result {
    /**
     * //是否成功
     */
    private boolean flag;
    /**
     * //返回码
     */

    private Integer code;
    /**
     * //返回信息
     */

    private String message;
    /**
     * 返回数据
     */
    private Object data;

    public Result(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
