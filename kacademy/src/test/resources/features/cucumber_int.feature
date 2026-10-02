Feature: Cucumber integration

  Scenario: Verify Cucumber executes through TestNG
    Given the test framework is initialized
    When the test is executed
    Then the test should pass