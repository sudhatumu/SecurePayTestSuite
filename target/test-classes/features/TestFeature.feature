#Author: sudha
Feature: SecurePay Coding challenge
  The purpose of this feature is to verify the ContactUs Submit feature

  Scenario: User launch the SecurePay site
    Given User is on Google page
    When he searches for "SecurePay"
    And open the first link
    Then he should navigate to SecurePay Home page

  Scenario: User navigates to Contactus Page
    Given User is on Google page
    When he searches for "SecurePay"
    And open the first link
    And click on "contact us" link
    Then he should navigate to ContactUs page

  Scenario: User submit the ContactUs form
    Given User is on Google page
    When he searches for "SecurePay"
    And open the first link
    And click on "contact us" link
    And fill the contactUs form
    And Submit the form
    Then the form should be submitted successfully

  # To capture the screenshot for failed scenario
  Scenario: User submit the ContactUs form - make it fail
    Given User is on Google page
    When he searches for "SecurePay"
    And open the first link
    And click on "contact us" link
    And fill the contactUs form
    And Submit the form
    Then the assert should fail
