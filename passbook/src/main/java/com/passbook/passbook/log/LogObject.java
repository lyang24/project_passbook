package com.passbook.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {
    /** logging action type */
    private String action;

    private long userId;

    private Date timestamp;
    /** client ip*/
    private String remoteIp;

    private Object info = null;
}
