
Feature:  Feature Tags
  
@group1 @smokeTest

  Scenario: Scenario One
    Given this is step one
    And this is step two
    When this is step three
   @group2 
 Scenario: Scenario two
    Given this is step one
    And this is step two
    When this is step three
    
@group1
     Scenario: Scenario three
    Given this is step one
    And this is step two
    When this is step three
    
 @group2   @smokeTest
     Scenario: Scenario four
    Given this is step one
    And this is step two
    When this is step three