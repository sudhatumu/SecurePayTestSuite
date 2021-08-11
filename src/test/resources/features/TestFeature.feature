#Author: sudha

Feature: SecurePay-ContactUs page feature
Description: the purpose of this feature is to verify the ContactUs Submit featu


  Scenario: User launch the SecurePay site
    Given User is on Google page
    When he search for "SecurePay" 
    And open the first link
    Then he should navigate to SecurePay Home page
    
Scenario: User navigates to Contactus Page 
   Given User is on Google page
   When he search for "SecurePay"
   And open the first link
   And click on "contact us" link
   Then he should navigate to ContactUs page
   
  

