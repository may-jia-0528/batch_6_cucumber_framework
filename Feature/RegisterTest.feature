
Feature: Register feature
  User  can register with valid informtion.
  
  Scenario: User should be able to register account with valid info
  
    Given User is at Home Page
    When   User click register link
    Then  User is at Register Page
    When  User Enter Personal registere infor
    Then User is at Porfile Page
    When User Click on Logout button
    Then User is at Login Page
    Then Browser is Quited

 