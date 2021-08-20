Feature: Test Hooks Excution Order

  Scenario: First scenario
    Given first execution order step
    When second execution order step
    Then third execution order step

 Scenario: Second scenario
    Given first execution order step
    When second execution order step
    Then third execution order step