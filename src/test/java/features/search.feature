# new feature
# Tags: optional

Feature : Search
  This feature deals with the search functionality of the application   

  Scenario: the user  use the  search bar to find an item.
    Given the user is on the ‘<Landing>’ page
    When the user types  ‘< String>’ on the search bar
    And the user click on search button
    Then the user should see the results of the search in the screenGiven something..