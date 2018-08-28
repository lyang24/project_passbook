package com.passbook.passbook.mapper;

import com.passbook.passbook.constant.Constants;
import com.passbook.passbook.vo.FeedBack;
import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * <h1>Feedback Hbase row to Object</h1>
 */
public class FeedbackRowMapper implements RowMapper<FeedBack> {

    private static byte[] FAMILY_I = Constants.Feedback.FAMILY_I.getBytes();
    private static byte[] USER_ID = Constants.Feedback.USER_ID.getBytes();
    private static byte[] TYPE = Constants.Feedback.TYPE.getBytes();
    private static byte[] TEMPLATE_ID = Constants.Feedback.TEMPLATE_ID.getBytes();
    private static byte[] COMMENT = Constants.Feedback.COMMENT.getBytes();

    @Override
    public FeedBack mapRow(Result result, int i) throws Exception {
        FeedBack feedBack = new FeedBack();
        feedBack.setUserId(Bytes.toLong(result.getValue(FAMILY_I, USER_ID)));
        feedBack.setType(Bytes.toString(result.getValue(FAMILY_I, TYPE)));
        feedBack.setTemplateId(Bytes.toString(result.getValue(FAMILY_I, TEMPLATE_ID)));
        feedBack.setComment(Bytes.toString(result.getValue(FAMILY_I, COMMENT)));
        return feedBack;
    }
}
