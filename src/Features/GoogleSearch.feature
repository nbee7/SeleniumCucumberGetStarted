Feature: Feature to test google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    And user is on google search page
    When user enters a keywoard in search box
    And click enter
    Then user is navigated to search result