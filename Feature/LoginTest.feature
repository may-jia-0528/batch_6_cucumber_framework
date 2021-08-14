
<<<<<<< HEAD
Feature: Login Feature
  User can login with valid credentials, and will get error when invalid credentials is used.

  Scenario: User should be able to login with valid credentials
    Given User is on Home Page
    And User click on Login button
    Then User Navigate to Login Page
    When User Enter User Name and Password
    Then User Navigate to Profile Page
    When User Click on Logout button
    Then User Navigate to Login Page
=======
Feature: Login feature
  User can login with valid credentials and will get error when credentials invalid

  Scenario: User should be able to login with valid credentials
    Given User is on Home Page
    And User click on logi button
    Then User navigate to Login Page
    When User enter User Name and Password
    Then User avigate to Profile Page
    When User click on logout button
    Then User naviagte to Login Page

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
>>>>>>> 7e8729b (feature)
