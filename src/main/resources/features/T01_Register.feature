@automate
Feature: User could register with valid data

  Background: user open browser
  Given User Navigates to Register Page

  Scenario: User Register with valid username and password
    When Select Gender "male"
    And User Enter "Omar" and "ElHawary"
    And Select Birthday Date "25" "February" "1994"
    And Email Address "omar122233@gmail.com"
    And Enter Company name "Udacity"
    And Select Newsletter "UnCheck"
    And Add Password "123123123" and Password Confirm "123123123"
    And user click on Register button
    Then User Could Register successfully