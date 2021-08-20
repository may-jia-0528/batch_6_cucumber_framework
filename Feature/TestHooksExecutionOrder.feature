Feature: Test Hooks Execuation Order

Scenario: First Scenario
	Given first execuation order step
	When second execuation order step
	Then third execution order step
	
	Scenario: Second Scenario
	Given first execuation order step
	When second execuation order step
	Then third execution order step