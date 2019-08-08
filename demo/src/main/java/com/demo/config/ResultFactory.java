package com.demo.config;

import com.demo.constant.ResultCode;

public class ResultFactory {
    public static Result buildSuccessResult(Object data) {
        return buildResult(ResultCode.SUCCESS, "success", data);
    }

    public static Result buildFailResult(String message) {
        return buildResult(ResultCode.FAIL, message, null);
    }

    public static Result buildResult(ResultCode resultCode, String message, Object data) {
        return buildResult(resultCode.code, message, data);
    }

    public static Result buildResult(int code, String message, Object data) {
        return new Result(code, message, data);
    }
}
