Feature: Login

  Background:
    Given Go to page

  Scenario Outline: Login with rest of the users
    When User enters '<user>' credentials
    Then User is logged in
    And User logs out
    And User is on 'login' page

    Examples:
      | user                   |
      |problem_user            |
      |performance_glitch_user |
      |error_user              |
      |visual_user             |
      |standard_user           |


  Scenario: Login fail
    When User enters 'locked_out_user' credentials
    And User is on 'login' page
    And User sees an error
    And Quit the browser
