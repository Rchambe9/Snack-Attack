package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;
import java.util.Collection;

public class VendingMachine {
//    variable
    private BigDecimal currentAmount;
    public Collection<Product> snacks;
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
    public String displayCurrentAmount(){
        return currentAmount.toString();
    }
    public String displayCurrentStatus(){
        if (currentAmount.equals(BigDecimal.ZERO)){
            return displayInsertCoins();
        } else {
            return displayCurrentAmount();
        }

    }
    public Product selectProduct(int choice){
        if (choice == 1){
            return new Cola();
        } else if (choice == 2){
            return new Chips();
        } else if (choice == 3){
            return new Candy();
        }
    }

    public String acceptCoin(String coin) {
        BigDecimal dimeValue = new BigDecimal("0.10");
        BigDecimal nickelValue = new BigDecimal("0.05");
        BigDecimal quarterValue = new BigDecimal("0.25");
            if (coin.equals("dime")){
                currentAmount = currentAmount.add(dimeValue);
        } else if (coin.equals("nickel")){
                currentAmount = currentAmount.add(nickelValue);
        } else if (coin.equals("quarter")){
                currentAmount = currentAmount.add(quarterValue);
            } else{
                return coin;
            }
    }

}
