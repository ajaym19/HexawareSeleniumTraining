Feature: Adding Products to Cart
  As a registered user
  I can select few products
  To add them in my cart

  Scenario: Validate adding single product to cart
    Given user is on products page
    When user selects one product
    And user clicks on Add to Card button
    Then the product should get added to the user's cart

  Scenario: Validate adding multiple product to cart
    Given user is on products page
    When user selects multiple product
    And user clicks on Add to Card button
    Then the product should get added to the user's cart
