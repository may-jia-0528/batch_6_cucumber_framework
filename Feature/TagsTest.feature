Feature: Tags Test Feature
@tag1 @tag2
Scenario: possitive login
	Given positive login scenario
	
@tag1
Scenario: invalid username
	Given invalid username scenario

@tag2
Scenario: invalid password
	Given invalid password scenario

@tag1
Scenario: invalid username and password
	Given invalid username and password scenario