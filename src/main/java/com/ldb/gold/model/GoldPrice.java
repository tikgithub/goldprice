package com.ldb.gold.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GoldPrice {
    private float ts;
    private float tsj;
    private String date;
    private List<GoldItem> items;
}
