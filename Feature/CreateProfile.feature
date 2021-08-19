<<<<<<< HEAD
Feature: Create Profile Feature
new User should be able to create profile

Scenario: create user profile
		Given User is on Home Page
    And User click on Login button
    Then User Navigate to Login Page
    When User Enter User Name and Password
    Then User Navigate to Profile Page
    When User Click on Create Profile Link
    Then User Navigate to Create Your Profile Page
    When User Enters Profile Infor and Click Submit
    Then Verify Profile Created Message displayed
    When User Click Delete Account
    And User accept the alert
    Then Account is Deleted
    Then Browser is Quited
=======

Feature: Create profile feature
  New user should be able to create peofile

 
  Scenario: Create a new profilex 
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
>>>>>>> 0bc6257 (rebase new code)
