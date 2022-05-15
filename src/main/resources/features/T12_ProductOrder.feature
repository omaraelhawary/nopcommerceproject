@automate
Feature: Create successful Order

  Background: user open browser

  Scenario: Create successful Order
    When Click on First Product Title
    And Click on Add to Cart button in Single product page
    And User Navigates to Add To Cart Page
    And Check Terms and Click Checkout
    And Checkout as a Guest
    And Fill CheckOut Data "Omar", "ElHawary", "omarelhawary@gmail.com", "Egypt", "Cairo", "123 Mohamed Ibrahem", "11311", "01150377005"
    And Select Ground Transport
    And Select Check-Money Order
    And Confirm Payment Data
    And Confirm Order
    Then Order Created Successfully