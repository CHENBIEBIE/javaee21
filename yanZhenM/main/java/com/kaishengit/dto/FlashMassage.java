package com.kaishengit.dto;

/**
 * 数据传输
 * 显示穿各种提示颜色分类
 */
public class FlashMassage {

    public static final String STATE_SUCCESS = "success";
    public static final String STATE_ERROR = "error";


    private String state;
    private String message;

    public String getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public FlashMassage(String message) {
        this.state = STATE_SUCCESS;
        this.message = message;
    }

    public FlashMassage(String state, String message) {
        this.state = state;
        this.message = message;
    }
}
