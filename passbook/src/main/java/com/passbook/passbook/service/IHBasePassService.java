package com.passbook.passbook.service;

import com.passbook.passbook.vo.PassTemplate;

/**
 * pass hbase service
 */
public interface IHBasePassService {

    boolean dropPassTemplateToHbase(PassTemplate passTemplate);
}
