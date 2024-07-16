Feature: User Login

  Scenario: Successful login with valid credentials
    
    Given the user is on the login page "https://www.saucedemo.com/"
    When the user enters a valid username "Md Hossain"
    And the user enters a valid password "Passward"
    Then the user clicks the log in button
    
