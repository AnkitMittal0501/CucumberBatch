Feature: Test Login functionality

Scenario: Valid login for Rediffmail

Given User is on login page
When  validate login poage title should be rediffmail
Then  enter username and password
And   click on login
Then  verify user in on home page
Then  Close the browser