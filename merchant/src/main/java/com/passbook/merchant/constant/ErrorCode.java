package com.passbook.merchant.constant;

public class ErrorCode {
    /** error code definition */
    SUCCESS(0. ),
    DUPLICATE_NAME(1, "Duplicated merchant name"),
    EMPTY_LOGO(2, "No Logo Found"),
    EMPTY_BUSINESS_LINCENSE(3, "Business license not found"),
    ERROR_PHONE(4, "Invalid_phone_number"),
    EMPTY_ADDRESS(5, "Business Address is empty"),
    MERCHANT_DNE(6, "Merchant does not exist");

    private Integer code;

    Private String desc;

    ErrorCode(Integer code, String desc) {
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
