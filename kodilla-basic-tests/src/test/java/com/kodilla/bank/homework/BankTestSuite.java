package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    CashMachine atm1;
    CashMachine atm2;
    Bank bank;

    @BeforeEach
    public void setupBank() {
        atm1 = new CashMachine();
        atm2 = new CashMachine();
        bank = new Bank();
    }

    @Test
    public void AddingATMS() {
        atm1.addTransaction(-500);
        atm1.addTransaction(-100);
        atm1.addTransaction( 500);

        atm2.addTransaction(-100);
        atm2.addTransaction( 300);
        atm2.addTransaction( 100);

        bank.addATM(atm1);
        bank.addATM(atm2);

        assertEquals(200, bank.getTotalBalance());
        assertEquals(3, bank.getWithdrawalCount());
        assertEquals(3, bank.getDepositCount());
        assertEquals(300, bank.averageDeposit());
        assertEquals(-233.0, bank.averagePayout());
    }
}
