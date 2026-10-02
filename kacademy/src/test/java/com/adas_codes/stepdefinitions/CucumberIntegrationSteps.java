package com.adas_codes.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertTrue;

public class CucumberIntegrationSteps {

    private boolean testExecuted;

    @Given("the test framework is initialized")
    public void theTestFrameworkIsInitialized() {
        testExecuted = false;
    }

    @When("the test is executed")
    public void theTestIsExecuted() {
        testExecuted = true;
    }

    @Then("the test should pass")
    public void theTestShouldPass() {
        assertTrue(testExecuted);
    }
}