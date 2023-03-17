package com.ldb.gold.dao;

import com.ldb.gold.model.GoldPrice;
import org.springframework.stereotype.Component;

@Component
public interface GoldPriceInterface {
    public GoldPrice getGoldLAK() throws Exception;
}
