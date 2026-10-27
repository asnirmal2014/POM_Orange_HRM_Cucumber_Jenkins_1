Feature: OrangeHRM logout functionality
  
  Scenario: Navigate to the Admin page
    When User clicks the profile picture
    And User clicks on the logout button
    Then User should be loggedout from the application
