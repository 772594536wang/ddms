package com.knowater.ddms.contants;

/**
 * 定义系统统一相应代码
 *
 * @author wangpf
 *
 */
public class StatusCode {
    /**
     * 系统执行成功
     */
    public static final Integer SUCCESS = 200;

    /**
     * 系统执行异常
     */
    public static final Integer FAIL = 500;

    /**
     * 系统未知异常
     */
    public static final Integer UNKNOWN = 501;

    /**
     * 未登录异常
     */
    public static final Integer UN_LOGIN = 401;

    /**
     * 该测试案例已经过期
     */
    public static final Integer CASE_TIME_EXCEED = 402;

    /**
     * 参数传递异常
     */
    public static final Integer PARAM_ERROR = 405;


}
