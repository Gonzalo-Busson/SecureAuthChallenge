# new feature
# Tags: optional

Feature: Login
  This feature deals with the login functionality of the application.

  Scenario: Login correctly with account.
    Given the user is on the ‘<Landing>’ page
    When the user clicks on '<login>' button
    And user inputs ‘<userName>’ field
    And user  inputs ‘<Password>’ field
    And selects '<login>' button
    Then the app should connect the Account
    And the user should see the name in hider