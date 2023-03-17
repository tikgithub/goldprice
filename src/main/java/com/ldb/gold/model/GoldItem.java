package com.ldb.gold.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GoldItem {
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
