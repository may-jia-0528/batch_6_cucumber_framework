Feature: Register Feature

Scenario: User should be able to successfully register an account
    Given User is on Home Page
    When User clicks Register
    Then User directed to Registration Page
    And User enters Information
    When User clicks Register 
    Then User will be directed to Dashboard for User
    When User Click on Logout button
    Then User directed to Sign In Page


