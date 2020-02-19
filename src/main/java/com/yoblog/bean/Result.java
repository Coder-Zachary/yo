package com.yoblog.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 章学魁
 */
@Data
public class Result implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.code();
        this.msg = resultCode.msg();
        this.data = data;
    }
}
