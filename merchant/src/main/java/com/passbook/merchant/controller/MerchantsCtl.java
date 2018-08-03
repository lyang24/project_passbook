package com.passbook.merchant.controller;

import com.alibaba.fastjson.JSON;
import com.passbook.merchant.service.IMerchantsServ;
import com.passbook.merchant.vo.CreateMerchantsRequest;
import com.passbook.merchant.vo.PassTemplate;
import com.passbook.merchant.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * merchant service controller
 */
@Slf4j
@RestController
@RequestMapping("/merchants")
public class MerchantsCtl {
    /** merchants service client*/
    private final IMerchantsServ merchantsServ;

    @Autowired
    public MerchantsCtl(IMerchantsServ merchantsServ) {
        this.merchantsServ = merchantsServ;
    }
    @ResponseBody
    @PostMapping("/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request) {
        log.info("CreateMerchants: {}", JSON.toJSONString(request));
        return merchantsServ.createMerchants(request);
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id) {
        log.info("BuildMerchantsInfo: {}", id);
        return merchantsServ.buildMerchantsInfoById(id);
    }

    @ResponseBody
    @PostMapping("/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate) {
        log.info("DropPassTempalte: {}", passTemplate);
        return merchantsServ.dropPassTemplate(passTemplate);
    }
}
