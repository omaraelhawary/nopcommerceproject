@automate
Feature: Guest could filter with color

  Background: user open browser
    Given User Navigates to Shoes Category

  Scenario: Guest could filter with color
    When Filter by Red Color
    Then Adidas items showed