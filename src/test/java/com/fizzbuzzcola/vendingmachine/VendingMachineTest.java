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
    }




