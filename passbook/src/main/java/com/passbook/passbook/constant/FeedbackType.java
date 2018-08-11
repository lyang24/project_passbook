package com.passbook.passbook.constant;

/**
 * enum of reviews
 */
public enum FeedbackType {
    PASS(1, "reviews about coupon"),
    APP(2, "reviews about the app");

    private Integer code;

    private String desc;

    FeedbackType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
