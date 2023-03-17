package com.ldb.gold.commandRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldb.gold.dao.GoldPriceInterface;
import com.ldb.gold.model.GoldPrice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class appRunner implements CommandLineRunner {
    @Autowired
    private GoldPriceInterface goldPriceInterface;

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapping = new ObjectMapper();
        GoldPrice gold = new GoldPrice();
        gold = goldPriceInterface.getGoldLAK();
        log.info("Gold Price Today ");
        log.info(mapping.writerWithDefaultPrettyPrinter().writeValueAsString(gold));

        log.info("ts {}", gold.getTs());
        log.info("tsj {}", gold.getTsj());
        log.info("date {}", gold.getDate());
        log.info("items {}", gold.getItems());
        //example of get each item
        for (int i = 0; i < gold.getItems().size(); i++) {
            log.info("curr {}", gold.getItems().get(i).getCurr());
            log.info("xauPrice {}", gold.getItems().get(i).getXauPrice());
            log.info("xagPrice {}", gold.getItems().get(i).getXagPrice());
            log.info("chgXau {}", gold.getItems().get(i).getChgXau());
            log.info("chgXag {}", gold.getItems().get(i).getChgXag());
            log.info("pcXau {}", gold.getItems().get(i).getPcXau());
            log.info("pcXag {}", gold.getItems().get(i).getPcXag());
            log.info("xauClose {}", gold.getItems().get(i).getXauClose());
            log.info("xagClose {}", gold.getItems().get(i).getXagClose());

        }
    }
}
