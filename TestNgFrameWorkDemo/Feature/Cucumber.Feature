Feature: Test scenario feature file

Scenario Outline: Calling method 1 through BDD Cucumber
Given Launch Chrome Browser
And User Launches the application URL
When User Enters '<username>'
And User enters '<password>'
And User clicks on the submit button
Then User verifies home page

Examples:
|username |password  |
|validUN  |validPWD  |
|invalidUN|InvalidPWD|
|invalidUN|validPWD  |
|validUN  |invalidPWD|
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
