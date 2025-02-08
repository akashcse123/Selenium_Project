Feature: Login Functionality

  Scenario: Successful Login
    Given user navigates to login page
    When user enters username "admin" and password "admin123"
    And clicks the login button
    Then user should be redirected to the home page
