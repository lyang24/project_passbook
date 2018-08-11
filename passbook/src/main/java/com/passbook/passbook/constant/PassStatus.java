package com.passbook.passbook.constant;

/**
 * the status of a coupon
 */

public enum PassStatus {
    UNUSED(1, "have not consumed"),
    UESD(2, "consumed"),
    ALL(3, "consumed all");

    private Integer code;

    private String desc;

    PassStatus(Integer code, String desc) {
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
