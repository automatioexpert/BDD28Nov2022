Feature: Login Feature Test
  In order to perform successful login
  As a user
  I have to enter correct username and password


  Scenario: Login to the	Fb website
    Given user navigates 	to the facebook Website
    When user validates the homepage title
    Then user enters the username
    And user enters the password
    And user clicks on the signin button
