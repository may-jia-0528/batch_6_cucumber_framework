
Feature: Creating a Profile
  User will log into their account and add all of their personal information on the profile page

  Scenario: Creating a Profile
    Given User is on Home Page
    When User click on Login button
    Then User Navigate to Login Page
    When User Enter User Name and Password
    Then User Navigate to Dashboard Page
		Then User Clicks on Create Profile button
		When User Navigates to Profile Page
		Then User Fills out Personal Information
		And User Clicks Submit
		When User sees Profile Created Message 
		Then the browser closes
		