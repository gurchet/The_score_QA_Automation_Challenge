Feature: Team Selection in Score application
  Scenario Outline: Verify the league selection process
    Given User is at home screen
    When User goes to league selection page
    Then League selection page should get opened
    Then User should be able to select the league "<leagues>"
    When User goes to the Teams selection page
    Then Team selection page should get opened
    And User goes to alerts settings page
    Then Alerts settings page should get opened
    When User continue from alerts settings screen
    Examples:
      | leagues     |
      | NHL,NFL,MLB |

  Scenario Outline: Verify the teams selection process
    Given User is at home screen
    When User goes to league selection page
    Then User should be able to select the league "<league>"
    When User goes to the Teams selection page
    Then Team selection page should get opened
    When User selects the tab "<league>"
    Then User should be able to select the teams "<teams>" for "<league>"
    And User should be able to see the selected "<league>" and "<teams>"
    When User goes to alerts settings page
    Then Alerts settings page should get opened
    When User continue from alerts settings screen
    Then Dashboard page should get opened
    And User should be able to see the selected "<teams>"
    Examples:
      | league | teams   |
      | NHL    | BOS,BUF |
