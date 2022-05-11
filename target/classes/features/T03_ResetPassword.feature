@automate
Feature: User could reset his/her password successfully

  Background: user open browser
    Given User Navigates to Login Page
    And User Clicks on Forget Password Button

  Scenario: User could reset his/her password successfully
    When Enter Email "omar122233@gmail.com"
    And Click on Recover Button
    Then User Able to Reset his Password successfully