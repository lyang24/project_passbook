package com.passbook.merchant.service.impl;

import com.passbook.merchant.constant.ErrorCode;
import com.passbook.merchant.dao.MerchantsDao;
import com.passbook.merchant.entity.Merchants;
import com.passbook.merchant.service.IMerchantsServ;
import com.passbook.merchant.vo.CreateMerchantsRequest;
import com.passbook.merchant.vo.CreateMerchantsResponse;
import com.passbook.merchant.vo.PassTemplate;
import com.passbook.merchant.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Coding the IMerchantsServ interface methods
 */

@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsServ {
    /** Merchants database implementation */
    private MerchantsDao merchantsDao;

    @Autowired
    public MerchantsServImpl(MerchantsDao merchantsDao) {
        this.merchantsDao = merchantsDao;
    }

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response = new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();

        ErrorCode errorCode = request.validate(merchantsDao);
        if (errorCode != ErrorCode.SUCCESS) {
            merchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        } else {
            merchantsResponse.setId(merchantsDao.save(request.toMerchants()).getId());
        }

        response.setData(merchantsResponse);

        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        Response response = new Response();
        Merchants merchants = merchantsDao.findById(id);
        if (merchants == null) {
            response.setErrorCode(ErrorCode.MERCHANTS_DNE.getCode());
            response.setErrorMsg(ErrorCode.MERCHANTS_DNE.getDesc());
        }
        response.setData(merchants);
        return response;
    }

    @Override
    public Response dropPassTemplate(PassTemplate template) {
        return null;
    }
}
