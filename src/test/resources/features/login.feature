Feature: Login Test

  Scenario: Login as standart_user
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce"
    Then The user should be able to login and "PRODUCTS" see page