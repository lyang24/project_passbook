package com.passbook.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.http.HttpServletRequest
import java.util.Date;

@Slf4j
public class LogGenerator {

    public static void genLog(HttpServletRequest request, Long userId, String action, Object info) {
        log.info(
                JSON.toJSONString(
                        new LogObject(action, userId, new Date(System.currentTimeMillis()), request.getRemoteAddr(), info)
                )
        );
    }
}
