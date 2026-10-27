# Login was already done once in Hooks.@BeforeAll.
# This feature only navigates from Dashboard → PIM using the shared session.

Feature: User navigation from Dashboard page to PIM page

  Background: User is on the Dashboard page
    Given User is on the Dashboard page

  Scenario: User navigate to PIM page from Dashboard page
    When User clicks on the PIM page icon from the Dashboard page
    Then User should be navigated to the PIM page