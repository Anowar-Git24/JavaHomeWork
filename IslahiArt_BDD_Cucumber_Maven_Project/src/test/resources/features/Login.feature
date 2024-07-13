Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page "https://islahiart.com/my-account/"
    When the user clicks the login in tab
    And the user enters a valid username "mahossain3094@gmail"
    And the user enters a valid password "Auto12345$"
    And the user clicks the log in button
    Then the user will land on home page "https://islahiart.com/my-account/?login=success"
