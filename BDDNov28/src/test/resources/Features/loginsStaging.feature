@staging
Feature: Login Feature Test
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title

  Scenario Outline: Login to the	Fb website as a valid user
    Given user navigates 	to the facebook Website
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the signin button

    Examples: 
      | username | password |
      | valid    | valid    |
      | valid    | invalid  |
      | invalid  | valid    |
      | invalid  | invalid  |
