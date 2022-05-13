@automate
Feature: Guest could add different products to Wishlist

  Background: user open browser

  Scenario: Guest could add different products to Wishlist
    When Click on Product Title
    And Click on Wishlist icon in Single product page
    And User Navigates to Wishlist
    Then Product shown in his Wishlist