Feature: Islahi Atr Application

Background:
    Given User is on the IslahI Art Home Page
    
    Scenario: User navigate to the Home Page "https://islahiart.com/"
    When user see the Islahi Art Home Page
     Then user click on click on account button
     Then userb should be see Account Creation Page
     
  Scenario: Successfully Signup Page
    Given user click on signup tab
    When User enters email "mahossain3094@gmail.com"
    When User enters first name "Md"
    And User enters last name "Hossain"
    And User enters password "password123"
    And User confirms password "password123"
    And User accepts the Privacy Policy
    And User clicks on the signup button
    Then User should be able to successfully sign up for an account
    Then user should see a confirmation welcome message
    Then User should take a screenshot after sucessfully sign up account
    
      @ValidCredentials
  Scenario: Login with valid credentials
    Given user click on login tab
    When user enters userename as "md.hossain-0900" and password as "password123"
    And user click on sign in button
    And  User should be able to login successfully and new page open
    Then User should take a screenshot after sucessfully sign in account