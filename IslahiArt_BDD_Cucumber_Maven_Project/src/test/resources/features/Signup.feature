Feature: User Authentication

Background:
    

Scenario: 
    Given the user is on the signup page "https://islahiart.com/my-account/"
    And user clicks on the signup tab
    When User enters email "mahossain3094@gmail.com"
    And User enters first name "Md"
    And User enters last name "Hossain"
    And User enters password "password123"
    And User confirms password "password123"
    And User accepts the Privacy Policy
    And User clicks on the signup button
    Then User should be able to successfully sign up for an account
    And the user will land on the home page "https://islahiart.com/my-account/?signup=success"
    And user should see a confirmation welcome message
    And User should take a screenshot after successfully signing up for an account
