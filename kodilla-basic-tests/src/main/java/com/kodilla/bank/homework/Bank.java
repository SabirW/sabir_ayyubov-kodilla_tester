package com.kodilla.bank.homework;

public class Bank {
    private CashMachine [] ATMS;
    private int size;

    public Bank(){
        this.ATMS = new CashMachine[0];
        this.size = 0;
    }

    public void addATM(CashMachine atm) {
        this.size++;
        CashMachine[] newATMS = new CashMachine[this.size];
        System.arraycopy(this.ATMS, 0, newATMS, 0, this.ATMS.length);
        newATMS[this.size - 1] = atm;
        this.ATMS = newATMS;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine atm : ATMS) {
            total += atm.getBalance();
        }
        return total;
    }

    public int getWithdrawalCount() {
        int withdrawalCount = 0;
        for (CashMachine atm : ATMS) {
            withdrawalCount += atm.getWithdrawal();
        }
        return withdrawalCount;
    }

    public int getDepositCount() {
        int depositCount = 0;
        for (CashMachine atm : ATMS) {
            depositCount += atm.getDeposit();
        }
        return depositCount;
    }

    public double averagePayout() {
        double averegaPayoutValue = 0;
        int sum = 0;
        int divider = 0;
        for (CashMachine atm : ATMS) {
            sum += atm.getWithdrawalSum();
            divider += atm.getWithdrawal();
        }
        averegaPayoutValue = sum / divider;
        return averegaPayoutValue;
    }

    public double averageDeposit() {
        double averegaDepositValue = 0;
        int sum = 0;
        int divider = 0;
        for (CashMachine atm : ATMS) {
            sum += atm.getDepositSum();
            divider += atm.getDeposit();
        }
        averegaDepositValue = sum / divider;
        return averegaDepositValue;
    }
}


