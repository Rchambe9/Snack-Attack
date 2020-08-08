package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;
import java.util.Collection;

public class VendingMachine {
//    variable
    private BigDecimal currentAmount;
    private Collection<Product> snacks;
    private Cola sampleCola = new Cola();
    private Chips sampleChips = new Chips();
    private Candy sampleCandy = new Candy();
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
    public Product selectProduct(int choice) {
        if (choice == 1 && currentAmount.compareTo(sampleCola.getCost()) <= 0) {
            System.out.println("Thank you.  Enjoy your Cola!");
            return new Cola();
        } else if (choice == 2 && currentAmount.compareTo(sampleChips.getCost()) <= 0) {
            System.out.println("Thank you. Enjoy your Chips!");
            return new Chips();
        } else if (choice == 3 && currentAmount.compareTo(sampleCandy.getCost()) <= 0) {
            System.out.println("Thank you. Enjoy your Candy!");
            return new Candy();
        }
        return null;
    }

    public String acceptCoin(String coin) {
        BigDecimal dimeValue = new BigDecimal("0.10");
        BigDecimal nickelValue = new BigDecimal("0.05");
        BigDecimal quarterValue = new BigDecimal("0.25");
        if (coin.equals("dime")) {
            currentAmount = currentAmount.add(dimeValue);
        } else if (coin.equals("nickel")) {
            currentAmount = currentAmount.add(nickelValue);
        } else if (coin.equals("quarter")) {
            currentAmount = currentAmount.add(quarterValue);
        } else {
            return coin;
        }
    }


