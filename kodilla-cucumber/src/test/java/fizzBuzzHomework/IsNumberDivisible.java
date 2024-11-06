package fizzBuzzHomework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fizzBuzzHomework.NumberChecker.checkNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsNumberDivisible {
    private int number;
    private String message;

    @Given("number {int}")
    public void number(int number) {
        this.number = number;
    }

    @When("I check the divisibility")
    public void i_check_the_divisibility() {
        this.message = checkNumber(this.number);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, this.message);
    }
}
