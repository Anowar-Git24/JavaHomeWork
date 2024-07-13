Feature: Login to IslahiArt Application

  Background:
    Given User is on IslahiArt Login page "https://islahiart.com/my-account/"

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters userename as "md.hossain-0900" and password as "password123"
    Then User should be able to login successfully and new page open

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters useremail as "<useremail>" and password as "<password>"
    Then User should be able to see error message "<errorMessage>"

    Examples:
      | userename                | password  | errorMessage            |
      | md.hossain-0900          | admin12$$ | Invalid credentials     |
      | admin$$                  | admin123  | Invalid credentials     |
      | abc123                   | xyz$$     | Invalid credentials     |
      | Matha-Mundu              | 123456    | Invalid credentials     |
