Feature: Register User
	User should be able to register account with valid information
	
	Scenario: User shoulbe able to register account with valid info
	Given User is on Home Page
	When User click on Register Link
	Then User Navigate to Register Page
	When User enter Personal Info
	And User Click on Register Button
	Then User Navigate to Profile Page
	When User Click on Logout button
	Then User Navigate to Login Page
	Then Browser is Quited