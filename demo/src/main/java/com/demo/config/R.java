package com.demo.config;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    /**
     * 成功
     */
    public static final Integer OK = 0;
    /**
     * 未知异常
     */
    public static final Integer ERROR = 500;
    /**
     * 状态码KEY
     */
    public static final String CODE_KEY = "code";
    /**
     * 消息KEY
     */
    public static final String MSG_KEY = "msg";
    /**
     * 数据
     */
    public static final String DATA = "data";
    /**
     * 默认成功消息
     */
    private static final String DEFAULT_SUCCESS_MSG = "success";
    /**
     * 默认错误消息
     */
    private static final String DEFAULT_ERROR_MSG = "未知错误，请联系管理员！";

    public R() {
        put(CODE_KEY, OK);
        put(MSG_KEY, DEFAULT_SUCCESS_MSG);
    }

    public static R error() {
        return error(ERROR, DEFAULT_ERROR_MSG);
    }

    public static R error(String msg) {
        return error(ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put(CODE_KEY, code);
        r.put(MSG_KEY, msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public boolean isOk() {
        return this.get(CODE_KEY) != null && OK.toString().equals(this.get(CODE_KEY).toString());
    }
}
