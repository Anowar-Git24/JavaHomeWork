Feature: Create Account

Scenario: Successfully Create an Account

    Given the user is on the home page "https://www.amazon.com/"
    When user clicks on the account tab
    And user see the account creation page
    And User enters your name "Md Hossain"
    And User enters email "mahossain3094@gmail.com"
    And User enters password "password123"
    And User reenters password "password123"
    And User clicks on the continue button
    Then User should be able to successfully create  an account
    And the user will land on the home page "https://www.amazon.com/?create account=success"
    And user should see a confirmation welcome message
    