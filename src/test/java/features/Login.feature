@LoginFeature
Feature: Login to the SwagLabs  application

  @PositiveLogin
  Scenario Outline: Login to the SwagLabs  application
    Given I am a SwagLabs  user
    When I enter the username "<UserName>" and the passcode "<Password>"
    And click the Login button
    Then I login to the SwagLabs application

    Examples: 
      | UserName      | Password     |
      | standard_user | secret_sauce |

  @NegativeLogin
  Scenario Outline: Unable to Login to the SwagLabs  application
    Given I am a SwagLabs  user
    When I enter the username "<UserName>" and the passcode "<Password>"
    And click the Login button
    Then I can view the error message "<error>"

    Examples: 
      | UserName        | Password     | Error                                               |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
