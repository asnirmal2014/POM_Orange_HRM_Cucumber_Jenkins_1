# NOTE: @loggedIn tag at Feature level => the tagged @Before("@loggedIn") hook
# performs login automatically before every scenario in this feature.
# So the Background below only VERIFIES that login worked — it does NOT re-login.

@loggedIn
Feature: User navigation from Dashboard page to PIM page

  Background: User is on the Dashboard page
    Given User is on the Dashboard page

  Scenario: User navigate to PIM page from Dashboard page
    When User clicks on the PIM page icon from the Dashboard page
    Then User should be navigated to the PIM page
