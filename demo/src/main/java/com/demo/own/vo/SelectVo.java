package com.demo.own.vo;

public class SelectVo {
    private static final long serialVersionUID = 1L;
    private String id;

    public SelectVo(String id,String name){
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
