@loginFeature @CTS10-290

Feature:As a user, I should be able to upload files and pictures as messages

  Background:
    Given the user should enter app with valid "https://qa.ctissolutions.com/" "helpdesk1@cybertekschool.com" "UserUser"
    When user click the massage button
    And user click the uploadFiles button

	#*1. User should be able to upload multiple files at the same time (Test with max 3 files.).*
	#*2. User should be able to upload files in different formats.*
	#*3. User should be able to upload pictures.*
    #*4. User should be able to insert the files and images into the text
    #*5. User should be able to remove files and images at any time before sending.
    #*6. User should be able to rename the file before sending it.

  @CTS10-277 @wip
  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.)
    And user upload a ppt file
    And user upload a cvs file
    And user upload a image
    Then user should see three files uploded.

  @CTS10-281 @wip
  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.)
    And user upload a ppt file
    And user upload a cvs file
    And user upload a image
    And user click the insert in text button
    Then user should see three files inserted.

  @CTS10-282 @wip
  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.)
    And user upload a ppt file
    And user upload a cvs file
    And user upload a image
    And user click the remove button
    Then user should see the images and files remove.


  @CTS10-284 @wip
  Scenario: User should be able to upload files in different formats.
    And user upload a ppt file
    And user upload a cvs file
    And user upload a image
    Then user should see three files uploded.


  @CTS10-285 @wip
  Scenario: User should be able to upload pictures
    And user upload a image
    Then user should see image file is uploded.

  @CTS10-283 @wip
  Scenario:User should be able to rename the file before sending it.
    And user upload a cvs file
    And user upload a image
    And user click edit button near the files
    And user change the name
    Then user should see new the file name.
