@activity3
Feature: SecondTest

  @SimpleAlert @SmokeTest
  Scenario: Test for Simple Alert
    Given User is on the page
    When User clicks the Simple Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert
    And Close Browser

  @ConfirmAlert
  Scenario: Opening a webpage using Selenium
    Given User is on the page
    When User clicks the Confirm Alert button
    Then Alert opens
    And Read the text from it and print it
    And Close the alert with Cancel
    And Close Browser

  @PromptAlert
  Scenario: Opening a webpage using Selenium
    Given User is on the page
    When User clicks the Prompt Alert button
    Then Alert opens
    And Read the text from it and print it
    And Write a custom message in it
    And Close the alert
    And Close Browser