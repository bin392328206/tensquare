package com.qf.my.ten.square.commons.entity;

/**
 * 返回状态码的信息
 */
public class StatusCode {
    /**
     * 成功
     */
    public static final int Ok=20000;

    /**
     * 失败
     */
    public static final int ERROR=20001;

    /**
     * 用户名或密码错误
     */

    public static final int LOGINERROR=20002;
    /**
     * 权限不足
     */

    public static final int ACCESSERROR=20003;

    /**
     * 重复操作
     */

    public static final int REPERROR=20004;


}
