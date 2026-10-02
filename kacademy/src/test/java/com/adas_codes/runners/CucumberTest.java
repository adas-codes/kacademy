package com.adas_codes.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.adas_codes.stepdefinitions",
        plugin = {"pretty"}
)
public class CucumberTest extends AbstractTestNGCucumberTests {
}