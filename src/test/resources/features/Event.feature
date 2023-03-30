@login
@Event
Feature:As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"
    And user should click the Activity Stream button
    And user should click the Event tab

    Scenario: User should be able to sees today's date as default for starting date and ending
      Then user should sees today's as default for starting date and ending


    Scenario: User should be able to add starting and ending date and time
       When user should add starting date
       When user should add starting time
       When user should add ending date
       Then user should add ending time

    Scenario: User should be able to select all day
      Then user should select all day

    Scenario: User should be able to set reminder
      When user should set reminder
      Then user should set reminder time


    Scenario: User should be able to send event by filling in the mandatory field
      When user should add event name
      When user should click send button
      Then user should sees event sent on message page

    Scenario: User should be able to cancel sending event at any time before sending
      When user should fill mandatory field
      And user should click all day check box
      And user should click set reminder check box
      And user should cancel the event by clicking the cancel button
      Then user should sees message page



