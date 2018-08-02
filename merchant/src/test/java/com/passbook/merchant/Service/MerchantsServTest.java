package com.passbook.merchant.Service;

import com.alibaba.fastjson.JSON;
import com.passbook.merchant.service.IMerchantsServ;
import com.passbook.merchant.vo.CreateMerchantsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * merchants services test class
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {

    @Autowired
    private IMerchantsServ merchantsServ;

    @Test
    public void testCreateMerchantServ() {
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("ey-test");
        request.setLogoUrl("www.linkedin.com");
        request.setBusinessLicenseUrl("www.linkedin.com");
        request.setPhone("9738888888");
        request.setAddress("bay area");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }

    @Test
    public void testBuildMerchantsInfoById() {
        System.out.println(JSON.toJSONString(merchantsServ.buildMerchantsInfoById(9)));
    }
}
