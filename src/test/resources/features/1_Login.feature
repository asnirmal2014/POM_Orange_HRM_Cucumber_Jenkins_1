# Login is performed ONCE in Hooks.@BeforeAll.
# This feature only verifies that the shared session landed on the Dashboard.

Feature: OrangeHRM Login verification (shared session)
  As an admin user
  I want to confirm that the one-time login worked
  So that all other features can reuse the same session

  Scenario: User is already logged in and is on the Dashboard page
    Given User is on the Dashboard page
    Then User should be navigated to the Dashboard page