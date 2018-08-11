package com.passbook.passbook.dao;

import com.passbook.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <h1>Merchants Dao Interface</h1>
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * use id to retrive merchant object
     * @param id merchants id
     * @return {@link com.passbook.passbook.entity.Merchants}
     */
    Merchants findByMerchantId(Integer id);

    /**
     * user name to retrieve merchant object
     * @param name
     * @return {@link com.passbook.passbook.entity.Merchants}
     */
    Merchants findByName(String name);

    /**
     * query batch of merchants base on ids
     * @param ids merchant ids
     * @return {@link com.passbook.passbook.entity.Merchants}
     */

    List<Merchants> findByIdIn(List<Integer> ids);

}
