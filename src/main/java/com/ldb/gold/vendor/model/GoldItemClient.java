package com.ldb.gold.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GoldItemClient {
    private String curr;
    private float xauPrice;
    private float xagPrice;
    private float chgXau;
    private float chgXag;
    private float pcXau;
    private float pcXag;
    private float xauClose;
    private float xagClose;
}
