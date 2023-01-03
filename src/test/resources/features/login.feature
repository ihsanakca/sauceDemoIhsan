Feature: Login Test

  Background:
    Given The user is on the login page

  Scenario: Login as standart_user
    When The user enters "standard_user" and "secret_sauce"
    Then The user should be able to verify being on the page by using page title "Products"

  @wip
  Scenario Outline: Login with valid credentials
    When The user enters "<userName>" and "<password>"
    Then The user should be able to verify being on the page by using page title "Products"
    #When The user turns to login page
    Examples:
      | userName                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
