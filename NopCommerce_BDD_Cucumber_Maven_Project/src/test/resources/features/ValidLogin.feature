Feature: User Login

  Scenario: Successful login with valid credentials
    
    Given the user is on the login page "https://demo.nopcommerce.com/login?returnUrl=%2F"
    When the user enters a valid username "mahossain3094@gmail"
    And the user enters a valid password "Auto12345$"
    And the user clicks the remember button
    Then the user clicks the log in button
    
