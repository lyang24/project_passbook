package com.passbook.passbook.utils;

import com.passbook.passbook.vo.FeedBack;
import com.passbook.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * <h1>RowKey Generators</h1>
 */
@Slf4j
public class RowKeyGenUtil {

    public static String genPassTemplateRowKey(PassTemplate passTemplate) {
        String passInfo = String.valueOf(passTemplate.getId()) + "_" + passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);
        log.info("GenPassTemplateRowKey: {}, {}", passInfo, rowKey);

        return rowKey;
    }

    public static String genFeedbackRowKey(FeedBack feedBack) {
        return new StringBuilder(String.valueOf(feedBack.getUserId())).reverse().toString() + (Long.MAX_VALUE - System.currentTimeMillis());
    }
}
