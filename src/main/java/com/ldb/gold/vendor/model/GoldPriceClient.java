package com.ldb.gold.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GoldPriceClient {
    private float ts;
    private float tsj;
    private String date;
    private List<GoldItemClient> items;
}
