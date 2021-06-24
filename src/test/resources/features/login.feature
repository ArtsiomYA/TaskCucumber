Feature: Login user in system

  Scenario: Login user
    Then Click "Log In" button
    Then Input login
    Then Input password
    Then Click Log in button span
    Then Content with "Courses you might be interested in" visible