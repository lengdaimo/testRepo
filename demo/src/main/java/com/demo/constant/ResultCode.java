package com.demo.constant;

public enum ResultCode {
    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
