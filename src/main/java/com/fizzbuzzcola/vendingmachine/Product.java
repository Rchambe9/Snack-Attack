package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal cost;

    public Product(String name, BigDecimal cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCost() {
        return cost;
    }

}



