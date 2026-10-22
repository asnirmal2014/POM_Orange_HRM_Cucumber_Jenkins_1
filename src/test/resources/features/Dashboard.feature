Feature: OrangeHRM Login and Logout functionality
  As an admin user when I enter the correct username and password I should be navigated to the Dashbaord page

  Scenario: Successful login, navigate to Dashboard page
    Given User is on the OrangeHRM login page
    When User enters username "Admin" and password "admin123"
    And User clicks on the Login button
    Then User should be navigated to the Dashboard page
    