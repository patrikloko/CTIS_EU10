@loginFeature
@wip
Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"


    Scenario:  User should be able to see default filters as
    "my activity, work, favorites, announcements, and workflows".
      When user click on the search-filter box
      Then user should see the buttons
        | WORK          |
        | MY ACTIVITY   |
        | ANNOUNCEMENTS |
        | WORKFLOWS     |
        | FAVORITES     |


   Scenario: User should be able to remove fields
    When user click on the search-filter box
    And user clicks on the hide field button


   Scenario:  User should be able to add fields
     When user click on the search-filter box
     And user sees "add field" and clicks on it
     Then user adds the field




