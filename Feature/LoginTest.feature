
Feature: Login Feature
  User can login with valid credentials, and will get error when invalid credentials is used.

  Scenario: User should be able to login with valid credentials
    Given User is on Home Page
    And User click on Login button
    Then User Navigate to Login Page
    When User Enter "<email>" and "<password>"
<<<<<<< HEAD
    #When User Enter Username and Password
    #| john.test@gmail.com  | Test123 |
    #| john.test1@gmail.com  | Test1234 |
=======
>>>>>>> 0bc6257 (rebase new code)
    Then User Navigate to Profile Page
    When User Click on Logout button
    Then User Navigate to Login Page
    Then Browser is Quited
<<<<<<< HEAD
   
  Examples: 
  |     email         |        password      |
  
  |john.test@gmail.com     |      Test123        |
  
  |john.test1@gmail.com     |     Test123          |

  
  
=======

    Examples:
    |        email            |     password     |
    |xiangchen0704@gmail.com  |Cx704704          |
    |john.test@gmail.com      |Test123           |
    |john.test1@gmail.com     |Test123           |
    
>>>>>>> 0bc6257 (rebase new code)
