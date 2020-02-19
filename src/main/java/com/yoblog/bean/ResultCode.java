package com.yoblog.bean;

/**
 * @Author 章学魁
 */
public enum ResultCode {
    SUCCESS(200, "成功"),
    ERROR(500, "失败");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer code() {
        return this.code;
    }

    public String msg() {
        return this.msg;
    }


}
