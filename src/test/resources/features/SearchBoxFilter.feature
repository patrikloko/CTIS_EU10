@loginFeature
@wip
Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"

  @CTS10-263 @CTIS_EU10
  Scenario:  User should be able to see default filters as
  "my activity, work, favorites, announcements, and workflows".
    When user clicks on the search-filter box
    Then user should see the buttons
      | WORK          |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
      | FAVORITES     |

  @CTIS_EU10    @CTS10-264
  Scenario: User should be able to remove fields
    When user clicks on the search-filter box
    And user clicks on the hide field button
    Then verify fields are removed

  @CTIS_EU10    @CTS10-265
  Scenario:  User should be able to add fields
    When user clicks on the search-filter box
    And user sees "add field" and clicks on it
    And user adds the fields
    Then verify user added the fields

  @CTIS_EU10 @CTS10-266
  Scenario: User should be able to search by specifying the Date
    When user clicks on the search-filter box
    And user clicks "restore default field"
    And user selects a date option "This Week"
    And user clicks on search button
    Then verify user searched with a date option "This Week"

  @CTIS_EU10 @CTS10-267
  Scenario: User should be able to search by selecting single type
    When user clicks on the search-filter box
    And clicks on type inputbox
    And clicks on "Posts" option
    And user clicks on search button
    Then verify user searhed with "Posts" option


  @CTIS_EU10 @CTS10-268
  Scenario: User should be able to search by selecting multiple types
    When user clicks on the search-filter box
    And clicks on type inputbox
    And clicks on multiple options "Announcements"," Polls","Tasks"
    And user clicks on search button
    Then verify user searhed with "Announcements"," Polls","Tasks" options

  @CTIS_EU10 @CTS10-278
  Scenario: User saves the filter
    When user clicks on the search-filter box
    And user clicks on "save Filter"
    And user writes a filter name "GROUPS"
    Then user clicks save button


  @CTIS_EU10 @CTS10-279
  Scenario: User should be able to restore the default field
    When user clicks on the search-filter box
    And user clicks restore default fields
    Then verify default fields are restored
      | Date   |
      | Type   |
      | Author |
      | To     |

  @CTIS_EU10 @CTS10-280
    Scenario: User resets filters to default
    When user clicks on the search-filter box
    And user selects a date option "This Week"
    And user click reset button
    Then verify filters are resetted