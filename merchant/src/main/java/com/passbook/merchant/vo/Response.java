package com.passbook.merchant.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    /** if correct should return 0 */
    private Integer errorCode = 0;
    /** if correct should return empty string */
    private String errorMsg = "";

    private Object data;

    public Response(Object data) {
        this.data = data;
    }
}
