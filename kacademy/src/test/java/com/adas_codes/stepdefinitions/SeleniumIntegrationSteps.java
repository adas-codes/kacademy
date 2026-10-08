package com.adas_codes.stepdefinitions;
import com.adas_codes.pages.KhanAcademyHomePage;
import com.adas_codes.driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class SeleniumIntegrationSteps {

    private WebDriver driver;

    @Given("the browser is opened")
    public void theBrowserIsOpened() {
        driver = DriverManager.getDriver();
    }

    @When("the browser navigates to Khan Academy")
    public void theBrowserNavigatesToKhanAcademy() {
      KhanAcademyHomePage homePage =
            new KhanAcademyHomePage(driver);

    homePage.open();
    }

    @Then("the Khan Academy page should be displayed")
    public void theKhanAcademyPageShouldBeDisplayed() {
       KhanAcademyHomePage homePage =
            new KhanAcademyHomePage(driver);

    assertTrue(homePage.isDisplayed());
    }
}
