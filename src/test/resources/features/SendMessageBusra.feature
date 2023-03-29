
Feature:As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"



  Scenario: User should be able to send a message by filling the mandatory fields.
    Given user clicks the send message field
    When user writes message
    Then user clicks the send button


  Scenario: User should not be able to send a message when user does not write message
    Given user clicks the send message field
    When user doesn't write message
    When user clicks the send button
    Then user should see The message title is not specified message


  Scenario: User should not be able to send a message when user does not choose anybody and  remove default
    Given user clicks the send message field
    When user writes message
    When user remove default All employees
    When user clicks the send button
    Then user should see Please specify at least one person. message

  @sendMessage
  Scenario: The message delivery should be to 'All employees' by default and should be changeable.
    Given user clicks the send message field
    When user writes messages
    When user should see all employees by default for recipients
    Then user remove default and add new more than one, changeable


  Scenario: User should be able to cancel sending message at any time before sending
    Given user clicks the send message field
    When user writes message
    Then user clicks the cancel button


  Scenario: User should be able to delete message after sending
    Given user clicks the send message field
    When user writes the message
    When user clicks the send button
    Then user clicks more and then delete button to delete the message




