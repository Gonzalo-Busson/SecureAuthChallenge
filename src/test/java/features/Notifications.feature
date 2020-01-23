# new feature
# Tags: optional

Feature: notifications

  Scenario: The notification component should be displayed on the ‘<Landing>’ page
    Given the user is logged in  using ‘<Facebook>’ Account
    When the user use the mouse hover the ‘<notification>’ button
    Then notification ‘<component>’ should be displayed
