Feature: OrangeHRM Login and Logout functionality
  As an admin user
  I want to login to OrangeHRM
  So that I can access the Admin module and logout successfully

  Scenario: Successful login, navigate to Admin page and logout
    Given User is on the OrangeHRM login page
    When User enters username "Admin" and password "admin123"
    And User clicks on the Login button
    Then User should be navigated to the Dashboard page
    When User clicks on the Admin menu link
    Then User should be navigated to the Admin page
    When User clicks on the profile dropdown
    And User clicks on the Logout link
    Then User should be logged out successfully

        