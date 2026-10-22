Feature: OrangeHRM Login and Logout functionality
  As an admin user
  I want to login to OrangeHRM
  So that I can access the Dashboard page

  Scenario: Successful login, navigate to the Dashboard page
    Given User is on the OrangeHRM login page
    When User enters username "Admin" and password "admin123"
    And User clicks on the Login button
    Then User should be navigated to the Dashboard page
   