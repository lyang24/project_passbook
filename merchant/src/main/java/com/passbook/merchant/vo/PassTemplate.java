package com.passbook.merchant.vo;

import com.passbook.merchant.constant.ErrorCode;
import com.passbook.merchant.dao.MerchantsDao;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * merchant upload coupon object reference
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    private Integer id;

    private String title;

    private String summary;

    private String desc;
    /** is there a usage limit on this coupon*/
    private Long limit;

    private Boolean hasToken;
    /** background color*/
    private Integer background;

    private Date start;

    private Date end;

    public ErrorCode validate(MerchantsDao merchantsDao) {
        /**
         * validate coupon objects
         * @param MerchantsDao {@link  MerchantsDao}
         * @return {@link ErrorCode}
         */

        if (merchantsDao.findById(id) == null) {
            return ErrorCode.MERCHANTS_DNE;
        }
        return ErrorCode.SUCCESS;
    }
}
