
Feature: Register user
   Create a user account

  
  Scenario: User create a new account on home page
    Given User is on Home Page
    And User click on Register button
    Then User Navigate to Register Page
    And User enter personal info
    And User click on register button
    Then User navigate to profile page
    And User click on logout button
    Then User Navigate to Login Page
		Then Browser is Quited