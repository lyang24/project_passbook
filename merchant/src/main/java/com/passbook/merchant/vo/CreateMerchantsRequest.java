package com.passbook.merchant.vo;

import com.passbook.merchant.constant.ErrorCode;
import com.passbook.merchant.dao.MerchantsDao;
import com.passbook.merchant.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * create merchants request object
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {
    /** merchant name*/
    private String name;

    private String logoUrl;

    private String businessLicenseUrl;

    private String phone;

    private String address;

    /**
     * validate requests
     * @param merchantsDao
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (merchantsDao.findByName(this.name) != null) {
            return ErrorCode.DUPLICATE_NAME;
        }

        if (this.logoUrl == null) {
            return ErrorCode.EMPTY_LOGO;
        }

        if (this.businessLicenseUrl == null) {
            return ErrorCode.EMPTY_ADDRESS;
        }

        if (this.phone == null) {
            return ErrorCode.ERROR_PHONE;
        }

        return ErrorCode.SUCCESS;
    }

    /**
     * convert merchant request to merchant object
     * @return {@link Merchants}
     */
    public Merchants toMerchants() {

        Merchants merchants = new Merchants();

        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setAddress(address);
        return merchants;
    }
}
