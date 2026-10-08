package com.adas_codes.hooks;
import com.adas_codes.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

     @Before
    public void setUp() {
        DriverManager.setDriver(new ChromeDriver());
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}