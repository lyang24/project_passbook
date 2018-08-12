package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/** coupons user acquired */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pass {

    private Long userId;

    private String rowKey;

    private String templateId;
    /** if null return - 1 */
    private String token;

    private Date assignedDate;
    /** Consumed date */
    private Date conDate;
}
