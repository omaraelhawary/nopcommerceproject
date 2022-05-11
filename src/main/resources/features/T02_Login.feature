@automate
Feature: User could log in with valid email and password

  Background: user open browser
    Given User Navigates to Login Page

  Scenario: User could log in with valid email and password
    When Enter Email "omar122233@gmail.com" and Enter Password "123123123"
    And Click on Login Button
    Then User Could Login successfully