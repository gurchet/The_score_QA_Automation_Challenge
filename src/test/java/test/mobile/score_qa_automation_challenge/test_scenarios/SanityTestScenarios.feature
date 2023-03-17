Feature: Team Selection in Score application
  Scenario: Verify the league selection process
    Given User is at home screen
    When User goes to league selection page
    Then User verifies if following leagues are selected
      | NHL | NFL | MLB |
    When User goes to the Teams selection page
