Feature: Test Cucumber

  Scenario Outline: Demo
    Given I execute given <given> times
    When I execute when <when> times
    Then I should have executed <given> Given, <when> When and <then> Then steps

  Examples:
    | given | when | then |
    | 1     | 1    | 1    |
    | 2     | 4    | 1    |

  Scenario: Test Cucumber
  	Given I test it