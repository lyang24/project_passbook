package com.passbook.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {
    /** merchant id */
    private Integer id;

    private String title;

    private String summary;

    private String desc;

    private long limit;

    private boolean hasToken;

    private Integer background;

    private Date start;

    private Date end;
}
