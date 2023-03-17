package com.ldb.gold.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldb.gold.dao.GoldPriceInterface;
import com.ldb.gold.model.GoldPrice;
import com.ldb.gold.vendor.dao.GoldPriceClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoldPriceServiceImpl implements GoldPriceInterface {

    @Autowired
    private GoldPriceClientDao goldPriceClientDao;

    @Override
    public GoldPrice getGoldLAK() throws Exception {
        GoldPrice goldPrice = new GoldPrice();
        try {
            Object response = goldPriceClientDao.getGoldLAK();
            goldPrice = new ObjectMapper().convertValue(response,GoldPrice.class);
        } catch (Exception ex) {
            ex.printStackTrace();
       }
        return goldPrice;
    }
}
