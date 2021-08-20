Feature: Test Tagged Hooks

	@First
	Scenario: First Tagged Hook Scenario
			Given first tagged hooks step
			When second tagged hooks step
			Then third tagged hooks step
		
	@Second	
	Scenario: Second Tagged Hook Scenario
			Given first tagged hooks step
			When second tagged hooks step
			Then third tagged hooks step
	
	@Third		
	Scenario: Third Tagged Hook Scenario
			Given first tagged hooks step
			When second tagged hooks step
			Then third tagged hooks step