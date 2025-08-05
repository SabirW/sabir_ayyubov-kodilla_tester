package com.kodilla.bank.homework;

public class CashMachine {
    private int[] completedTransaction;
    private int size;
    private int balance;

    public CashMachine() {
        this.completedTransaction = new int[0];
        this.size = 0;
    }

    public void addTransaction(int amount) {
        this.size++;
        int[] transaction = new int[this.size];
        System.arraycopy(this.completedTransaction, 0, transaction, 0, completedTransaction.length);
        transaction[this.size - 1] = amount;
        this.completedTransaction = transaction;
    }

    public int getBalance() {
        int balance = 0;
        for (int i = 0; i < completedTransaction.length; i++) {
            balance += completedTransaction[i];
        } return balance;
    }

    public int getTransactionCount() {
        return completedTransaction.length;
    }

    public int getWithdrawal() {
        int withdrawal = 0;
        for (int i = 0; i < completedTransaction.length; i++) {
            if (completedTransaction[i] < 0) {
                withdrawal++;
            }
        }
        return withdrawal;
    }

    public int getWithdrawalSum() {
        int withdrawalSum = 0;
        for (int i = 0; i < completedTransaction.length; i++) {
            if (completedTransaction[i] < 0) {
                withdrawalSum += completedTransaction[i];
            }
        }
        return withdrawalSum;
    }

    public int getDeposit() {
        int deposit = 0;
        for (int i = 0; i < completedTransaction.length; i++) {
            if (completedTransaction[i] > 0) {
                deposit++;
            }
        }
        return deposit;
    }

    public int getDepositSum() {
        int depositSum = 0;
        for (int i = 0; i < completedTransaction.length; i++) {
            if (completedTransaction[i] > 0) {
                depositSum += completedTransaction[i];
            }
        }
        return depositSum;
    }
}