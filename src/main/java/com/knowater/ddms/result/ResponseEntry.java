package com.knowater.ddms.result;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求相应实体类
 *
 * @author wangpf
 */
@Setter
@Getter
public class ResponseEntry<T> {
    /**
     * 状态，true成功，false 失败
     */
    private Integer code;

    /**
     * 返回结果消息简要
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

}
