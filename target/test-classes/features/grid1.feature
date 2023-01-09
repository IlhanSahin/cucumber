@grid
Feature: Grid Test Firefox
  Scenario: Firefox Test

    Given get URL firefox
    Then Verify title firefox
    And Verify currentURL firefox