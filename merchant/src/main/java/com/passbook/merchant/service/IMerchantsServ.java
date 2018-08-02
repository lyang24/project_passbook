package com.passbook.merchant.service;

import com.passbook.merchant.vo.CreateMerchantsRequest;
import com.passbook.merchant.vo.PassTemplate;
import com.passbook.merchant.vo.Response;

/**
 * define services to merchants
 */
public interface IMerchantsServ {
    /**
     * create merchant service
     * @param request
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * create merchant info by id
     * @param id
     * @return {@link Response}
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * depoly coupons
     * @param template {@link PassTemplate} coupons
     * @return {@link Response}
     */
    Response dropPassTemplate(PassTemplate template);
}
