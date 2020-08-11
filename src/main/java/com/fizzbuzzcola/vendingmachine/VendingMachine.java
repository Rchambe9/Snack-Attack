package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;
import java.util.ArrayList;
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
    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String displayInsertCoins() {
        return "Insert Coins";
    }

    public String displayCurrentAmount() {
        return currentAmount.toString();
    }

    public String displayCurrentStatus() {
        if (currentAmount.equals(BigDecimal.ZERO)) {
            return displayInsertCoins();
        } else {
            return displayCurrentAmount();
        }

    }

    public Product selectProduct(int choice) {
        if (choice == 1 && currentAmount.compareTo(sampleCola.getCost()) >= 0) {
            currentAmount = currentAmount.subtract(sampleCola.getCost());
            System.out.println("Your change is " + returnChange());
            System.out.println("Thank you.  Enjoy your Cola!");
            return new Cola();

        } else if (choice == 2 && currentAmount.compareTo(sampleChips.getCost()) >= 0) {
            currentAmount = currentAmount.subtract(sampleChips.getCost());
            System.out.println("Your change is " + returnChange());
            System.out.println("Thank you. Enjoy your Chips!");
            return new Chips();

        } else if (choice == 3 && currentAmount.compareTo(sampleCandy.getCost()) >= 0) {
            currentAmount = currentAmount.subtract(sampleCandy.getCost());
            System.out.println("Your change is " + returnChange());
            System.out.println("Thank you. Enjoy your Candy!");
            return new Candy();

        } else if (choice == 1 && currentAmount.compareTo(sampleCola.getCost()) < 0) {
            System.out.println("Price is $1.00");
            System.out.println("You have inserted " + currentAmount);
            System.out.println("Insert Coins");

        } else if (choice == 2 && currentAmount.compareTo(sampleChips.getCost()) < 0) {
            System.out.println("Price is $0.50");
            System.out.println("You have inserted " + currentAmount);
            System.out.println("Insert Coins");

        } else if (choice == 3 && currentAmount.compareTo(sampleCandy.getCost()) < 0) {
            System.out.println("Price is $0.65");
            System.out.println("You have inserted " + currentAmount);
            System.out.println("Insert Coins");
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
        return null;
    }

    public Collection<String> returnChange() {
        Collection<String> coinsReturned = new ArrayList<>();
        BigDecimal dimeValue = new BigDecimal("0.10");
        BigDecimal nickelValue = new BigDecimal("0.05");
        BigDecimal quarterValue = new BigDecimal("0.25");
        while (!(currentAmount.equals(BigDecimal.ZERO))) {
            if (currentAmount.compareTo(quarterValue) >= 0) {
                currentAmount = currentAmount.subtract(new BigDecimal("0.25"));
                coinsReturned.add("quarter");

            } else if (currentAmount.compareTo(dimeValue) >= 0) {
                currentAmount = currentAmount.subtract(new BigDecimal("0.10"));
                coinsReturned.add("dime");

            } else if (currentAmount.compareTo(nickelValue) >= 0) {
                currentAmount = currentAmount.subtract(new BigDecimal("0.05"));
                coinsReturned.add("nickel");

            }
        }
                return coinsReturned;
    }}






