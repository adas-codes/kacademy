package com.adas_codes.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import com.adas_codes.driver.DriverManager;
import static org.testng.Assert.assertTrue;

public class SeleniumIntegrationSteps {

    private WebDriver driver;

    @Given("the browser is opened")
    public void theBrowserIsOpened() {
        driver = DriverManager.getDriver();
    }

    @Then("the browser should open successfully")
    public void theBrowserShouldOpenSuccessfully() {
        assertTrue(driver != null);
    }
}