@automate
Feature: Guest could select different Categories

  Background: user open browser

  Scenario: Guest could select different Categories
    When Hover on menu item and select Category
    Then Category Page Opened