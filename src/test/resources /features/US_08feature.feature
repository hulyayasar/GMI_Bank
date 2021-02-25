@gmibankpasswordsegment

Feature:
  US_Story08 Password segment on Homepage should be editable

  Background:
    Given Go to given URL
    When  User login
    And   Click Account Menu
    And   To click Sign In Box
    And   Select Password button

  @TC_Valid_001
  Scenario : The old password should not be used

    Given To enter Current Password credential
    And   To enter the Current Password in New password Box
    And   To enter to Current Password in New password confirmation Box
    And   To click to Save Button
    And   Assert password strength level1
    Then  Assert that Save Alert Negative


  @TC_Valid_003
  Scenario : There should be at least 1 Uppercase char for stronger password and see
  the level chart change accordingly

    And  To enter the New Password to New password box
    And  To enter the Password with one uppercase adding to New password box
    And  Assert password strength level2

  @TC_Valid_007
  Scenario :
  There should be at least 1 digit and see the level  chart
  change accordingly

    And   To enter the New Password to New password box
    And   To enter the Password with more one digit adding to New password box
    And   Assert password strength level2

  @TC_Valid_011
  Scenario : There should be at least 7 chars for a stronger password

    And    To enter the New Password to New password box
    And   To enter the valid Password has least 7 chars to New password box
    And   Assert password strength level5
