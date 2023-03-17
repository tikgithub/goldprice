package com.ldb.gold.vendor.dao;

import com.ldb.gold.vendor.model.GoldPriceClient;
import org.springframework.stereotype.Component;

@Component
public interface GoldPriceClientDao {
    public GoldPriceClient getGoldLAK() throws Exception;
}
