@gmibankpasswordsegment

Feature: US_Story08 Password segment on Homepage should be editable
  Background:
    Given Go to given URL
    When  Go to User Login
    And   Click Login Button
    And   Click Sign In Button
    And   Select Password button

  @TC_Valid_0801

  Scenario: The old password should not be used

    Given To enter Current Password credential
    And   To enter the Current Password in New password Box
    And   To enter to Current Password in New password confirmation Box
    And Verify fifth level bar is displayed
    And  Assert password strength first level
    And   To click to Save Button
    Then  Assert that Save Alert Negative

  @TC_Valid_0803
  Scenario:There should be at least 1 Uppercase char for stronger password and see the level chart change accordingly
    And  To enter the New Password to New password box
    And  To enter the Password with one uppercase adding to New password box
    And  Assert password strength level2
  @TC_Valid_0807
  Scenario:There should be at least 1 digit and see the level  chart change accordingly
    And   To enter the New Password to New password box
    And   To enter the Password with more one digit adding to New password box
    And   Assert password strength level2
  @TC_Valid_0811
  Scenario: There should be at least 7 chars for a stronger password
    And   To enter the New Password to New password box
    And   To enter the valid Password has least 7 chars to New password box
    And   Assert password strength level5
