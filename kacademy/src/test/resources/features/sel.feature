Feature: Selenium integration

  Scenario: Verify Selenium can navigate to Khan Academy
    Given the browser is opened
    When the browser navigates to Khan Academy
    Then the Khan Academy page should be displayed