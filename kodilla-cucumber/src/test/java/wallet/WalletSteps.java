package wallet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private int requestedAmount;
    private int checkedBalance;

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());

    }

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request ${int}")
    public void i_request(Integer amount) {
        Cashier cashier = new Cashier(cashSlot);
        requestedAmount = amount;
        cashier.withdraw(wallet, amount);
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(Integer expectedAmount) {
        assertEquals(expectedAmount, cashSlot.getContents());

    }

    @Then("My wallet balance should be ${int}")
    public void my_wallet_balance_should_be(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance());
    }

    @Given("There is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        checkedBalance = wallet.getBalance();
    }

    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        assertEquals(100, checkedBalance, "The displayed balance is incorrect");
    }

    @Given("There is $200 in my wallet")
    public void there_is_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I withdraw $300")
    public void i_withdraw_$300() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 300);
    }

    @Then("Nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "Cash was dispensed incorrectly");
    }

    @And("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money_in_my_wallet() {
        assertEquals("Cannot withdraw more than the balance", wallet.getErrorMessage());
    }
}
