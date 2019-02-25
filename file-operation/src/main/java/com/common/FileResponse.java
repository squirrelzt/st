package com.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 类名称: FileResponse
 * 类描述: 文件返回
 * @author squirrel
 * @date 2019-02-25
 */
@Data
public class FileResponse<T> implements Serializable {

    private String code;
    private String msg;
    private T data;

    public FileResponse(){}

    public FileResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> FileResponse<T> ok(T data) {
        return new FileResponse("000000", "成功", data);
    }

    public static <T> FileResponse<T> fail(String msg, T data) {
        return new FileResponse("999999", msg, data);
    }
}
