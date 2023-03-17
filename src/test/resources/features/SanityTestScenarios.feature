Feature: Team Selection in Score application
  Scenario Outline: Verify the league selection process
    Given User is at home screen
    When User goes to league selection page
    Then League selection page should get opened
    Then User should be able to select the leagues "<leagues>"
    Examples:
      | leagues     |
      | NHL,NFL,MLB |

  Scenario Outline: Verify the teams selection process
    Given User is at home screen
    When User goes to league selection page
    Then User should be able to select the leagues "<leagues>"
    When User goes to the Teams selection page
    Then Team selection page should get opened
    When User selects the tab "<tab>"
    Then User should be able to select the teams "<teams>"
    And User should be able to see the selected "<leagues>" and "<teams>"
    When User goes to notification settings page
    Examples:
      | leagues | tab | teams                               |
      | NHL,NFL | NHL | Boston Bruins, Montreal Canadiens   |
