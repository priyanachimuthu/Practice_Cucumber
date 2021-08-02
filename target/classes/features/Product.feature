Feature: Product should be added to the cart

  Background: 
    Given I open the swaglab application
    When I enter username "standard_user" and password "secret_sauce"
    And Click on Login button

  @ProductFeature
  Scenario Outline: Update the product to the cart
    Given I am in Product page
    When I click on Add to cart for one item "<Product>"
    
    And navigate to Mycart
    Then I can view the final selected product

    Examples: 
      | Product             |
      | Sauce Labs Backpack |
