package com.kodilla.bank.homework;
public class CashMachine {
    private int[] transactions;
    private int size;
    private int transaction;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        if (transaction != 0) {
            this.size++;
            int[] newArray = new int[this.size];
            System.arraycopy(transactions, 0, newArray, 0, transactions.length);
            newArray[this.size - 1] = transaction;
            this.transactions = newArray;
        }
    }

    public int[] getTransactions() {
        return this.transactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return this.size;
    }

    public int getNumberOfWithdrawals() {
        int withdrawals = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawals++;
            }
        }
        return withdrawals;
    }

    public int getNumberOfDeposits() {
        int deposits = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                deposits++;
            }
        }
        return deposits;
    }

    public int getTotalWithdrawalAmount() {
        int totalWithdrawalAmount = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                totalWithdrawalAmount += transactions[i];
            }
        }
        return totalWithdrawalAmount;
    }

    public int getTotalDepositAmount() {
        int totalDepositAmount = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                totalDepositAmount += transactions[i];
            }
        }
        return totalDepositAmount;
    }
}
