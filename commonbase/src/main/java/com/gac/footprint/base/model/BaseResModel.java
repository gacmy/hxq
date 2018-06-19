package com.gac.footprint.base.model;

/**
 * @author gacmy
 * @title $fileName$
 * @package $packageName$
 * @description {}
 * @date $date$
 */
public class BaseResModel<T> {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
