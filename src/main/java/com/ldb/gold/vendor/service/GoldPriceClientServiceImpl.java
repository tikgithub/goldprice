package com.ldb.gold.vendor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldb.gold.vendor.clientInterface.GoldPriceClientInterface;
import com.ldb.gold.vendor.dao.GoldPriceClientDao;
import com.ldb.gold.vendor.model.GoldPriceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GoldPriceClientServiceImpl implements GoldPriceClientDao {

    @Autowired
    private GoldPriceClientInterface goldPriceClientInterface;

    @Override
    public GoldPriceClient getGoldLAK() throws Exception {
        GoldPriceClient goldPriceClient = new GoldPriceClient();
        ResponseEntity<?> goldEntity;
        try {
            goldEntity = goldPriceClientInterface.getGoldPriceLak();

            goldPriceClient = new ObjectMapper().convertValue(goldEntity.getBody(), GoldPriceClient.class);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return goldPriceClient;
    }
}
