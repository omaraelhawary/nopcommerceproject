@automate
Feature: Guest could filter with color

  Background: user open browser
    Given Hover on menu item and select Category

  Scenario: Guest could filter with color
    When Filter by Cool Tag
    Then User navigate to Cool tag page