package com.knowater.ddms.result;


import com.knowater.ddms.contants.MsgContants;
import com.knowater.ddms.contants.StatusCode;

/**
 * 返回结果builder类
 *
 * @author wangpf
 */
public class ResultBuilder {
    public static <T> ResponseEntry<T> buildSuccessResult(T t) {
        ResponseEntry<T> result = new ResponseEntry<T>();
        result.setCode(StatusCode.SUCCESS);
        result.setMsg(MsgContants.SUCCESS);
        result.setData(t);
        return result;
    }

    public static <T> ResponseEntry<T> buildErrorResult(Integer errorCode) {
        ResponseEntry<T> result = new ResponseEntry<T>();
        result.setCode(errorCode);
        switch (errorCode) {
            case 500:
                result.setMsg(MsgContants.FAIL);
                break;
            case 401:
                result.setMsg(MsgContants.NO_OBJECT);
                break;
            case 402:
                result.setMsg(MsgContants.CASE_TIME_EXCEED);
                break;
            case 405:
                result.setMsg(MsgContants.PARAM_ERROR);
                break;
            default:
                result.setMsg(MsgContants.UNKNOWN);
                break;
        }
        return result;
    }

    public static <T> ResponseEntry<T> buildErrorResult(String msg) {
        ResponseEntry<T> result = new ResponseEntry<T>();
        result.setCode(401);
        result.setMsg(msg);
        return result;
    }

    public static <T> ResponseEntry<T> buildResult(Integer errorCode,String msg) {
        ResponseEntry<T> result = new ResponseEntry<T>();
        result.setCode(errorCode);
        result.setMsg(msg);
        return result;
    }


}