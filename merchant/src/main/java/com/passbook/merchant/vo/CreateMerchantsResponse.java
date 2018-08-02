package com.passbook.merchant.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * create metchant response object
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {
    /** merchant id : if failed to create a merchant then the value is -1 */
    private Integer id;
}
