
Feature: Login Feature
  User can login with valid credentials, and will get error when invalid credentials is used.

  Scenario: User should be able to login with valid credentials
    Given User is on Home Page
    And User click on Login button
    Then User Navigate to Login Page
    When User Enter "<email>" and "<password>"
   
   #DATA TABLE
    #When User Enter Username and Password
    #|john.test@gmail.com 				| Test123 											|
    #|aivan@gmail.com						| Test1234											|
		#|aivan.nguyen@gmail.com			| Test1234											|
    
    Then User Navigate to Profile Page
    When User Click on Logout button
    Then User Navigate to Login Page
    Then Browser is Quited

    #EXAMPLE TABLE
    Examples:
		|						email						|						password						|
		
		|aivan@gmail.com						| Test1234											|
		|aivan.nguyen@gmail.com			| Test1234											|
		