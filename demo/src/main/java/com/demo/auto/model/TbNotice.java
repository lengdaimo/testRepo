package com.demo.auto.model;

import java.util.Date;

public class TbNotice {
    private Long ntId;

    private Integer status;

    private String message;

    private Date addTime;

    private Date editTime;

    private Integer kind;

    public Long getNtId() {
        return ntId;
    }

    public void setNtId(Long ntId) {
        this.ntId = ntId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }
}