package com.passbook.merchant.Service;

import com.alibaba.fastjson.JSON;
import com.passbook.merchant.service.IMerchantsServ;
import com.passbook.merchant.vo.CreateMerchantsRequest;
import com.passbook.merchant.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

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

    @Test
    public void testDropPassTemplate() {
        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(9);
        passTemplate.setTitle("title: ey");
        passTemplate.setSummary("summary: ey");
        passTemplate.setDesc("desc: ey");
        passTemplate.setLimit(6666L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(new Date());
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));

        System.out.println(JSON.toJSONString(
                merchantsServ.dropPassTemplate((passTemplate))
        ));
    }
}
