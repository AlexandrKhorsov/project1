Feature: Hre i give a test feature name
  An a user i should be able to get on google page and interact with the page

  Background:
    Given user on the google page

    @regression @sanity
    Scenario Outline: User should be able to search product
      When User in put "<product>" into input bar
      Then title should include "<product>" name
      Examples:
        | product      |
        | grapefruit   |
        | lemon |
        | apple |

  @regression
  Scenario: Google home page footer links verification
    Then User should see following links
      |Advertising|
      |Business|
      |How Search Works|
      |Privacy|
      |Terms|