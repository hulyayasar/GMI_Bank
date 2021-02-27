@gmibankpasswordsegment

Feature:US_Story08 Password segment on Homepage should be editable

  Background:User signs in
    Given user navigate the url
    And click Sing in button
    And   Enter username
    And   Enter password
    Then click for  Sing in button

  @TC_Valid_0801
  Scenario: The old password should not be used
    Given  Click to account menu
    And   Click to password segment button
    Then  Verifies there is old password password
  @TC_Valid_0803
  Scenario Outline: New password should have at least 1 "<value1>" to change password strength color of chart color
    Given Click to account menu
    And   Click to password segment button
    Then  Enter new passwords "<validPassword1>" and verifies that  should be at least one "<value1>"
    Examples:
      |validPassword1                         |value1       |
      |NewPasswordAllLowercase                |ashleyy123   |
  @TC_Valid_0805
  Scenario Outline:New password should have at least 1 "<value2>" to change password strength color of chart color
    Given Click to account menu
    And   Click to password segment button
    Then  Enter new passwords "<validPassword2>" and verifies that  should be at least one "<value2>"
    Examples:
      |validPassword2                         |value2       |
      |NewPasswordWithOneUpperCase            |Ashleyy1234  |
  @TC_Valid_0807
  Scenario Outline:New password should have at least 1 "<value3>" to change password strength color of chart color
    Given Click to account menu
    And   Click to password segment button
    Then  Enter new passwords "<validPassword3>" and verifies that  should be at least one "<value3>"
    Examples:
      |validPassword3                         |value3       |
      |NewPasswordWithMoreOneDigit            |Ashleyy12    |
  @TC_Valid_0809
  Scenario Outline:New password should have at least 1 "<value4>" to change password strength color of chart color
    Given Click to account menu
    And   Click to password segment button
    Then  Enter new passwords "<validPassword4>" and verifies that  should be at least one "<value4>"
    Examples:
      |validPassword4                         |value4       |
      |NewPasswordWithMoreSpecialChar         |Ashleyy12$   |
  @TC_Valid_0811
  Scenario:New password should be confirmed
    Given Click to account menu
    And   Click to password segment button
    Then  Verifies new valid password confirmation
