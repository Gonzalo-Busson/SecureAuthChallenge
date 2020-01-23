# new feature
# Tags: optional

Feature : Location
  This feature deals with the location the user will operate

  Scenario: The user selects to operate in ‘<Argentina>’ country
    Given the user is on the ‘<landing>’ page
    And the user clicks on ‘<Location> ‘button
    Then the user should see ‘<specify your location>’ pop-up
    When the user selects ‘<Argentina>’ option
    And the user clicks on ‘<Ready>’ button
    Then the user should be redirected to the landing page of ‘<Argentina’> country