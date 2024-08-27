package com.kodilla.bank.homework;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BankTest {
    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    @Test
    public void shouldAddCashMachinesToBank() {
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(2, bank.getCashMachines().length);
    }

    @Test
    public void shouldCalculateTotalBalance() {
        cashMachine1.add(5000);
        cashMachine1.add(3500);
        cashMachine2.add(-3200);
        cashMachine2.add(2000);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(7300, bank.getTotalBalance());
    }

    @Test
    public void shouldCalculateTotalNumberOfWithdrawals() {
        cashMachine1.add(-1500);
        cashMachine1.add(4000);
        cashMachine2.add(-3000);
        cashMachine2.add(9000);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(2, bank.getNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateTotalNumberOfDeposits() {
        cashMachine1.add(1000);
        cashMachine1.add(-200);
        cashMachine2.add(3900);
        cashMachine2.add(-400);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(2, bank.getNumberOfDeposits());
    }
    @Test
    public void shouldCalculateAverageWithdrawal() {

        cashMachine1.add(-1000);
        cashMachine1.add(200);
        cashMachine2.add(-350);
        cashMachine2.add(400);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(-675, bank.getAverageWithdrawal(), 0.0000001);
    }

    @Test
    public void shouldCalculateAverageDeposit() {

        cashMachine1.add(1000);
        cashMachine1.add(-200);
        cashMachine2.add(300);
        cashMachine2.add(-450);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(650, bank.getAverageDeposit(), 0.0000001);
    }

    @Test
    public void shouldCalculateTotalWithdrawalAmount() {

        cashMachine1.add(-100);
        cashMachine1.add(2000);
        cashMachine2.add(-350);
        cashMachine2.add(-400);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(-850, bank.getTotalWithdrawalAmount());
    }
    @Test
    public void shouldCalculateTotalDepositAmount() {

        cashMachine1.add(1100);
        cashMachine1.add(-200);
        cashMachine2.add(3500);
        cashMachine2.add(-400);
        bank.add(cashMachine1);
        bank.add(cashMachine2);
        assertEquals(4600, bank.getTotalDepositAmount());
    }
}