package com.passbook.passbook.constant;

/**
 * define constants
 */
public class Constants {
    /** merchant coupon's kafka topic */
    public static final String TEMPLATE_TOPIC = "merchants-template";

    public static final String TOKEN_DIR = "/tmp/token/";
    /** The SUFFIX characteristic of used tokens */
    public static final String USED_TOKEN_SUFFIX = "_";

    public static final String USE_COUNT_REDIS_KEY = "imooc-user-count";

    public class UserTable {
        /** Hbase table name for users */
        public static final String TABLE_NAME = "pb:user";
        /** basic info column family*/
        public static final String FAMILY_B = "b";
        /** user name*/
        public static final String NAME = "name";
        /** user age*/
        public static final String AGE = "age";
        /** user sex*/
        public static final String SEX = "sex";
        /** extra info column family*/
        public static final String FAMILY_O = "o";
        /** phone number */
        public static final String PHONE = "phone";
        /** address */
        public static final String ADDRESS = "address";
    }

    /**
     * Hbase table for pass template
     */
    public class PassTemplateTable {
        public static final String TABLE_NAME = "pb:passtemplate";

        public static final String FAMILY_B = "B";
        /** merchant id*/
        public static final String ID = "id";
        /** coupon title */
        public static final String TITLE = "title";

        public static final String SUMMARY = "summary";

        public static final String DESC = "desc";

        public static final String HAS_TOKEN = "has_token";

        public static final String BACKGROUND = "background";
        /** limit information column family */
        public static final String FAMILY_C = "c";

        public static final String LIMIT = "limit";

        public static final String START = "start";

        public static final String END = "end";
    }

    /**
     * hbase coupon table
     */
    public class PassTable {
        public static final String TABLE_NAME = "pb:pass";

        public static final String FAMILY_I = "i";

        public static final String USER_ID = "user_id";

        public static final String TEMPLATE_ID = "template_id";

        public static final String TOKEN = "token";

        public static final String ASSIGNED_DATE = "assigned_date";

        public static final String CON_DATE = "con_date";
    }

    /**
     * Feedback Hbase table
     */

    public class Feedback {

        public static final String TABLE_NAME = "pb:feedback";

        public static final String FAMILY_I = "i";

        public static final String USER_ID = "user_id";

        public static final String TYPE = "type";
        /** PassTemplate RowKey, if feedback is from app then its -1 */
        public static final String TEMPLATE_ID  = "template_id";

        public static final String COMMENT = "comment";
    }
}
