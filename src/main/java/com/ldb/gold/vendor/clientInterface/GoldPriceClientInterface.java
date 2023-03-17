package com.ldb.gold.vendor.clientInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "goldPriceService",url = "https://data-asg.goldprice.org/dbXRates")
@Component
public interface GoldPriceClientInterface {
    @GetMapping("LAK")
    public ResponseEntity<?> getGoldPriceLak() throws Exception;
}
