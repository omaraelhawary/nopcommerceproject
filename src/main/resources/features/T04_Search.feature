@automate
Feature: Guest could search for any product

  Background: user open browser

  Scenario: Guest could search for any product
    When Enter Search Item Name "Apple iCam"
    And Click on Search Button
    Then User Able to Find "Apple iCam" Successfully