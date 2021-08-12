# SecurePayTestSuite


This Framework created using Selenium - Cucumber(BDD) - JUnit - java

- Used PageObjectModel approach - used DependencyInjection for better use of Page objects
- Added Extent Reporting for good reports - find at ./target/cucumber-reports/report.html
- Added Screenshots to the ExtentReport for failed test cases - find at ./target/screenshots
- Generated TestData using RandomUtils
- Generated the logs for better debugging - find at ./SecurePayLogs.log

# Running tests

From Eclipse:
  Right click on TestRunner.Java and Run As 'JUnit Test'
 
From Comman line:
Go to your project directory from terminal and hit the following commands
. mvn test (default will run on local chrome browser)

# TestResults
Created 4 Test Scenarios
 - 3 Tests will Pass
 - Last test Scenario will fail - Intentionally make it failed to check the failed screenshot attached in ExtentReport
