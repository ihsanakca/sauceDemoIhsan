Feature: Purchase E2E Test

  Background:
    Given The user is on the login page
    When The user enters "standard_user" and "secret_sauce"

  @wip
  Scenario: Sauce Purchase
    When The user should be able to sort the product "Price (high to low)"
    And The user should be able to select the product by using "7.99"
    And The user should be able to select the product by using "29.99"
    And The user should be able to select the product by using "9.99"
    And The user should be able to go to your cart page
    Then The user should be able to verify being on the page by using page title "Your Cart"
    When The user should be able to click checkout and navigate to checkout page
    Then The user should be able to verify being on the page by using page title "Checkout: Your Information"
    When The user should be able to fill the form by using "İhsan" "Akçair" and "34550"
    And The user should be able to click continue and navigate to checkout overview page
    Then The user should be able to verify being on the page by using page title "Checkout: Overview"
    When The user should be able to verify bill with Item Total
    And The user should be able to click finish button and navigate to last page
    Then The user should be able to verify being on the page by using page title "Checkout: Complete!"
