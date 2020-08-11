package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {



    @Test
    public void vendingMachineShouldDisplayInsertCoins() {
        VendingMachine underTest = new VendingMachine(BigDecimal.ZERO);

       String message = underTest.displayInsertCoins();
        assertEquals("Insert Coins", message);
    }

    @Test
    public void vendingMachineShouldAcceptCoins(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ZERO);
        underTest.acceptCoin("dime");
        BigDecimal dimeValue = new BigDecimal("0.10");
        assertEquals(dimeValue, underTest.getCurrentAmount());
    }
    @Test
    public void vendingMachineShouldAcceptNickel(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ZERO);
        underTest.acceptCoin("nickel");
        BigDecimal nickelValue = new BigDecimal("0.05");
        assertEquals(nickelValue, underTest.getCurrentAmount());
    }
    @Test
    public void vendingMachineShouldAcceptQuarter(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ZERO);
        underTest.acceptCoin("quarter");
        BigDecimal quarterValue = new BigDecimal("0.25");
        assertEquals(quarterValue, underTest.getCurrentAmount());
    }
    @Test
    public void vendingMachineShouldRejectPennies(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ZERO);
        underTest.acceptCoin("penny");
        assertEquals(BigDecimal.ZERO, underTest.getCurrentAmount());
    }
    @Test
    public void vendingMachineResetsToZero(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ONE);
        underTest.selectProduct(1);
        assertEquals(BigDecimal.ZERO,underTest.getCurrentAmount());
    }
    @Test
    public void vendingMachineDisplayInsertCoins(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ONE);
        underTest.selectProduct(1);
        assertEquals("Insert Coins",underTest.displayCurrentStatus());
        System.out.println("Insert Coins");
    }
    @Test
    public void vendingMachineInsufficientFunds(){
        VendingMachine underTest = new VendingMachine(BigDecimal.ZERO);
        underTest.acceptCoin("dime");
        underTest.selectProduct(1);
        assertEquals(new BigDecimal("0.10"),underTest.getCurrentAmount());
    }
    @Test
    public void vendingMachineShouldMakeChange(){

    }
    }




