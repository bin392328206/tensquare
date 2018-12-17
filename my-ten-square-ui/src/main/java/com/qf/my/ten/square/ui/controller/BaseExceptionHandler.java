package com.qf.my.ten.square.ui.controller;

import com.qf.my.ten.square.commons.entity.Result;
import com.qf.my.ten.square.commons.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaowang
 * @date 2018/12/16 17:16
 */

@ControllerAdvice
public class BaseExceptionHandler {
    /**
     * 处理异常的方法
     */

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return new Result(false, StatusCode.ERROR,e.getMessage());
    }
}
