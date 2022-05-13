@automate
Feature: Guest could add different products to Shopping cart

  Background: user open browser

  Scenario: Guest could add different products to Shopping cart
    When Click on Product Title
    And Click on Add to Cart button in Single product page
    Then Product shown in his Add to cart