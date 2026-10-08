package com.adas_codes.pages;

import org.openqa.selenium.WebDriver;

public class KhanAcademyHomePage {

    private final WebDriver driver;

    public KhanAcademyHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.khanacademy.org/");
    }

    public boolean isDisplayed() {
        return driver.getTitle().contains("Khan Academy");
    }
}