Feature: Test Tags Hooks
@First
  Scenario: First Tagged Hooks Scenario
    Given first tagged hooks step
    When second tagged hooks step
    Then Third tagged hooks step
@Second
  Scenario: Second Tagged Hooks Scenario
    Given first tagged hooks step
    When second tagged hooks step
    Then Third tagged hooks step
@Third
  Scenario: Third Tagged Hooks Scenario
    Given first tagged hooks step
    When second tagged hooks step
    Then Third tagged hooks step
