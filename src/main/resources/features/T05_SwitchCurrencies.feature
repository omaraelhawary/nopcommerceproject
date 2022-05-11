@automate
Feature: Guest could switch between currencies US-Euro

  Background: user open browser

  Scenario: Guest could switch between currencies US-Euro
    When Select Euro from currency dropdown list
    Then Price is Euro