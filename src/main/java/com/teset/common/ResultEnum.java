package com.teset.common;


import lombok.Getter;

/**
 * ResultEnum
 *
 * @author yaodd
 * @date 2020/7/3
 */
@Getter
public enum ResultEnum {

    SUCCESS(true,0,"成功"),
    ERROR(false,1,"失败"),
    PARAM_ERROR(false,1,"参数不正确"),
    PARAM_NULL(false,1,"参数不能为空"),
    METHOD_NOT_SUPPORTED(false,1,"请求类型错误"),
    ;

    // 响应是否成功
    private Boolean success;
    private Integer code;
    private String message;

    ResultEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}