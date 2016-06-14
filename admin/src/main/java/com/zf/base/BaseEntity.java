package com.zf.base;

import java.io.Serializable;

/**
 * BaseEntity
 *
 * @author zf
 * @date 16/3/21
 */
public class BaseEntity implements Serializable{
    private String status ;
    private String msg;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public BaseEntity(String msg) {
        status = "fail";
        this.msg = msg;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BaseEntity() {
    }

    public BaseEntity(String status, String msg) {

        this.status = status;
        this.msg = msg;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
