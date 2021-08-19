
Feature: Register feature

	User should be able to register account with valid information
  
 
  Scenario: User should be able to register with valid credentials
    Given User is on Home Page
   	And User click on Register button
    Then User Navigate to Sign up Page
    When User enter all the register information
    Then User Navigate to Profile Page
    When User Click on Logout button
    Then User Navigate to Login Page
    Then This don't have step
    Then Browser is quited
    

  