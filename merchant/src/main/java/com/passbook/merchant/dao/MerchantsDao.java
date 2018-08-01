package com.passbook.merchant.dao;

import com.passbook.merchant.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Merchants Dao interface
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     *  use id to find merchants
     *  @param id  merchant_id
     *  @return {@link com.passbook.merchant.entity.Merchants}
     */
    Merchants findById(Integer id);

    /**
     *  use merchants name to retrive merchant entity
     * @param name
     * @return {@link com.passbook.merchant.entity.Merchants}
     */
    Merchants findByName(String name);
}
