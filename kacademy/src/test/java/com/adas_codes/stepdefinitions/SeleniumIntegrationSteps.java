package com.adas_codes.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class SeleniumIntegrationSteps {

    private WebDriver driver;

    @Given("the browser is opened")
    public void theBrowserIsOpened() {
        driver = new ChromeDriver();
    }

    @Then("the browser should open successfully")
    public void theBrowserShouldOpenSuccessfully() {
        assertTrue(driver != null);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}