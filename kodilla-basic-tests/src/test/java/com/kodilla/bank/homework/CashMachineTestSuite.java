package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine;

    @BeforeEach
    public void setup() {
        cashMachine = new CashMachine();
    }

    @Test
    public void CashMachineProcedures() {
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-500);
        assertEquals(5, cashMachine.getTransactionCount());
    }

    @Test
    public void CalculatingBalance() {
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-200);
        assertEquals(100, cashMachine.getBalance());
    }
}
