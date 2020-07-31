package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {



    @Test
    public void vendingMachineShouldDisplayInsertCoins() {
        VendingMachine underTest = new VendingMachine();

       String message = underTest.displayInsertCoins();
        assertEquals("Insert Coins", message);
    }



    }




