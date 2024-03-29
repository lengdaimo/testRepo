package com.demo.own.vo;

import javax.validation.constraints.NotNull;

public class LoginInfoVo {
    @NotNull(message = "用户名不允许为空")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotNull(message = "密码不允许为空")
    private String password;
}
