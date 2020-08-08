package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;

public class VendingMachine {
//    variable
    private BigDecimal currentAmount;
//    constructor
    public VendingMachine(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }
//    getter and setter
    public BigDecimal getCurrentAmount(){
        return currentAmount;
    }
    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String displayInsertCoins() {
        return "Insert Coins";
    }

    public void acceptCoin(String coin) {
        BigDecimal dimeValue = new BigDecimal("0.10");
        BigDecimal nickelValue = new BigDecimal("0.05");
        BigDecimal quarterValue = new BigDecimal("0.25");
            if (coin.equals("dime")){
                currentAmount = currentAmount.add(dimeValue);
        } else if (coin.equals("nickel")){
                currentAmount = currentAmount.add(nickelValue);
        } else if (coin.equals("quarter")){
                currentAmount = currentAmount.add(quarterValue);
            }
    }

}
