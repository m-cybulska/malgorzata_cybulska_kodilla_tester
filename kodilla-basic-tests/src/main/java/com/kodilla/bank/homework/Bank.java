package com.kodilla.bank.homework;
public class Bank {
    private CashMachine[] cashMachines;
    private int size;

    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newArray = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newArray, 0, cashMachines.length);
        newArray[this.size - 1] = cashMachine;
        this.cashMachines = newArray;
    }

    public int getTotalBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum += cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getNumberOfWithdrawals() {
        int totalWithdrawals = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawals += cashMachines[i].getNumberOfWithdrawals();
        }
        return totalWithdrawals;
    }

    public int getNumberOfDeposits() {
        int totalDeposits = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalDeposits += cashMachines[i].getNumberOfDeposits();
        }
        return totalDeposits;
    }

    public double getAverageWithdrawal() {
        if (getNumberOfWithdrawals() == 0) {
            return 0;
        }
        return getTotalWithdrawalAmount() / getNumberOfWithdrawals();
    }

    public double getAverageDeposit() {
        if (getNumberOfDeposits() == 0) {
            return 0;
        }
        return getTotalDepositAmount() / getNumberOfDeposits();
    }

    public int getTotalWithdrawalAmount() {
        int totalWithdrawalAmount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalWithdrawalAmount += cashMachines[i].getTotalWithdrawalAmount();
        }
        return totalWithdrawalAmount;
    }

    public double getTotalDepositAmount() {
        double totalDepositAmount = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            totalDepositAmount += cashMachines[i].getTotalDepositAmount();
        }
        return totalDepositAmount;
    }
}
