package fizzBuzzHomework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static fizzBuzzHomework.NumberChecker.checkNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsNumberDivisible {
    private int number;
    private String message;

    @Given("number 1")
    public void number_1() {
        this.number = 1;
    }
    @Given("number 2")
    public void number_2() {
        this.number = 2;
    }
    @Given("number 3")
    public void number_3() {
        this.number = 3;
    }
    @Given("number 5")
    public void number_5() {
        this.number = 5;
    }
    @Given("number 6")
    public void number_6() {
        this.number = 6;
    }
    @Given("number 10")
    public void number_10() {
        this.number = 10;
    }
    @Given("number 15")
    public void number_15() {
        this.number = 15;
    }
    @Given("number 60")
    public void number_60() {
        this.number = 60;
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
