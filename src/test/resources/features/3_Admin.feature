Feature: OrangeHRM Admin features and functionalities

  Scenario: Navigate through the Admin module

    Given the user is logged in to OrangeHRM
    And the user navigates to the Admin page

    When the user clicks the User Management link
    And the user clicks the Job link
    And the user clicks the Organization link
    And the user clicks the Qualifications link
    And the user clicks the Nationalities link
    And the user clicks the Corporate Banking link
    And the user clicks the Configuration link
    And the user clicks the Help icon

    Then the expected page or help content should be displayed
