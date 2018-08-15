package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @param <T>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo<T> {
    /** error code*/
    public static final Integer ERROR = -1;

    public Integer code;

    private String message;

    private String url;

    private T data;
}
