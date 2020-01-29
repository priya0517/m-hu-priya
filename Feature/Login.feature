Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn page
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully
    
Examples:
| username | password    |
| lalitha  | password123 |
| admin    | password456 |