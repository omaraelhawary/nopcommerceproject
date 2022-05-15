@automate
Feature: Guest could add different products to compare list

  Background: user open browser

  Scenario: Guest could add different products to compare list
    When Click on First Product Title
    And Click on Add to Compare Button in First Product page
    And Click on Second Product Title
    And Click on Add to Compare Button in Second product page
    And User Navigates to Compare Page
    Then Products shown in his Compare List