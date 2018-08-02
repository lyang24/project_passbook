package com.passbook.merchant.constant;

public enum TemplateColors {
    RED(1, "Red"),
    GREEN(2, "Green"),
    BLUE(3, "Blue");
    /** color code */
    private Integer code;
    private String color;

    TemplateColors(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getColor() {
        return this.color;
    }
}
