Feature: OrangeHRM Login

  Scenario: User login
    Given User opens the OrangeHRM login page
    When User enters valid credentials and clicks Login
    Then User should be navigated to the Dashboard page