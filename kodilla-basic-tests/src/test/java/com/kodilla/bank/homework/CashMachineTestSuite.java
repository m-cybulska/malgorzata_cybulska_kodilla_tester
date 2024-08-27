package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldAddThreeTransactionsToArray() {
        cashMachine.add(1200);
        cashMachine.add(-400);
        cashMachine.add(800);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(1200, transactions[0]);
        assertEquals(-400, transactions[1]);
        assertEquals(800, transactions[2]);
    }

    @Test
    public void shouldReturnBalance() {
        cashMachine.add(3600);
        cashMachine.add(-250);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(-450);

        assertEquals(3100, cashMachine.getBalance());
    }

    @Test
    public void zeroShouldNotBeIncludedInAnArray() {
        cashMachine.add(0);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldCountTransactions() {
        cashMachine.add(3600);
        cashMachine.add(-250);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(-450);

        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        assertEquals(5, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldReturnNumbersOfWithdrawals() {
        cashMachine.add(3600);
        cashMachine.add(-250);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(-450);

        int numberOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        assertEquals(3, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnNumbersOfDeposits() {
        cashMachine.add(3600);
        cashMachine.add(-250);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(-450);

        int numberOfDeposits = cashMachine.getNumberOfDeposits();
        assertEquals(2, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldCalculateSumOfWithdrawals() {
        cashMachine.add(3600);
        cashMachine.add(-250);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(-450);

        double totalWithdrawalsAmount = cashMachine.getTotalWithdrawalAmount();
        assertEquals(-800, cashMachine.getTotalWithdrawalAmount());
    }

    @Test
    public void shouldCalculateSumOfDeposits() {
        cashMachine.add(3600);
        cashMachine.add(-250);
        cashMachine.add(-100);
        cashMachine.add(300);
        cashMachine.add(-450);

        double totalDepositsAmount = cashMachine.getTotalDepositAmount();
        assertEquals(3900, cashMachine.getTotalDepositAmount());
    }
}
