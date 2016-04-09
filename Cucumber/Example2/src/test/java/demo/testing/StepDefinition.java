package demo.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

    int given = 0, when = 0, then = 0;

    @Given("^I execute given (\\d+) times$")
    public void i_execute_given_times(int arg1) throws Throwable {
        given += arg1;
    }

    @When("^I execute when (\\d+) times$")
    public void i_execute_when_times(int arg1) throws Throwable {
        when += arg1;
    }

    @Then("^I should have executed (\\d+) Given, (\\d+) When and (\\d+) Then steps$")
    public void i_should_have_executed_Given_When_and_Then_steps(int arg1, int arg2, int arg3) throws Throwable {
        then++;
        assert given == arg1;
        assert when == arg2;
        assert then == arg3;
    }

}