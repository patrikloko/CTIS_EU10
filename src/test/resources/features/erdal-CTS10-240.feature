@loginFeature
  @login
@wip
@CTS10-299 @CRM
Feature: Add and delete mentions,attach a link,insert and delete video,add tag features

#@CTS10-291
  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"
    And the user clicks to Send Message text under Message menu and see Send button

  @CTS10-292 @CRM
  Scenario: Add mentions
    When User click Add mention button
    And User click hr1user
    And User send message with added the mention
    Then User should be able to add mentions

  @CTS10-293 @CRM
  Scenario: Add link
    When User click Link button
    And User write "https://my.cydeo.com/apps" in Link box
    And User write "test2" in Text box
    And User clicks Save button
    And User send message with the added link
    Then  User should be able to attach the link to the specified text.

  @CTS10-294 @CRM
  Scenario Outline: Insert YouTube and Vimeo videos
    When User click Insert video button
    And User click Video source box
    And User write "<link>" in Video source box
    And User clicks video Save button
    And User send message with added the video
    Then  User should be able to insert  videos
    Examples:
      | link                                        |
      | https://vimeo.com/207707275                 |
      | https://www.youtube.com/watch?v=We80b2McYnc |

  @CTS10-295 @CRM
  Scenario: Cancel the link before sending the message
    Given the user added a link "https://my.cydeo.com/apps" with the specified text "test2"
    When User right click the link with the specified text
    And User click Remove link
    Then  User should be able to cancel the link before sending the message

  @CTS10-296 @CRM
  Scenario: Cancel the video before sending the message
    Given the user added a video "https://vimeo.com/207707275"
    When User right click the video
    And User click Delete video
    Then  User should be able to cancel the video before sending the message

  @CTS10-297 @CRM
  Scenario: Add tag
    Given User write "I am checking whether user can add tag or not" in Message Field
    When User click Add tag button
    And User write "test" in the box
    And User clicks ADD button
    And User sends message with added the tag
    Then   User should be able to add tags to messages

  @CTS10-298 @CRM
  Scenario: Remove tags
    Given user add a tag with "test"
    When User click cross button near the tag in tags column
    Then User should be able to remove tags before sending the message




