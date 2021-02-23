# new feature
# Tags: optional


  @gmibankpasswordlevel

  Feature:
  US_Story08 Password segment on Homepage should be editable

  Background:
    Given Go to given URL
    When  User login
    And   Click Account Menu
    And   Select Password button
    And   See Password Edit Form

  @TC_001
  Scenario Outline: The old password should not be used

    And   Enter the "<Current Password>"
    And   Enter a "<New Password>"
    And   Verify fifth level bar is displayed
    Examples:
      | Current Password | New Password            |
      | CurrentPassword  | NewPasswordAllLowerCase |

  @TC_Valid_03
  Scenario Outline: There should be at least 1 Uppercase char for stronger password and see
  the level chart change accordingly

    And   Enter the "<Current Password>"
    And   Enter a "<New Password>" with at least ONE upper case char
    And   Verify second level bar is displayed
    Examples:
      | Current Password | New Password                |
      | CurrentPassword  | NewPasswordWithOneUpperCase |

  @TC_004
  Scenario Outline: There should be at least 1 lower case char for stronger password and see
  the level chart change accordingly

    And   Enter the "<Current Password>"
    And   Enter a "<New Password>" with at least ONE lower case char
    And   Verify second level bar is displayed
    Examples:
      | Current Password | New Password                |
      | CurrentPassword  | NewPasswordWithOneUpperCase |

  @TC_005
  Scenario Outline:
  There should be at least 1 digit
  and see the level  chart
  change accordingly

    And   Enter the "<Current Password>"
    And   Enter a "<New Password>" with at least ONE digit
    And   Verify second level bar is displayed
    Examples:
      | Current Password | New Password         |
      | CurrentPassword  | NewPasswordWithDigit |

  @TC_006
  Scenario Outline: There should be at least 7 chars for a stronger password

    And   Enter the "<Current Password>"
    And   Enter a "<New Password>" with at least seven character long
    And   Verify fifth level bar is displayed
    Examples:
      | Current Password | New Password              |
      | CurrentPassword  |NewPasswordWithSpecialChar |

  @TC_002     @BUG
  Scenario Outline: The old password should not be used

    And   Enter the "<Current Password>"
    And   Enter the  "<Old Password>" as new password
    And   Enter the "<Current Password Again>" in Confirmation box
    And   Click the save button
    Then  Verify "Old Password can not be used" message is displayed
    Examples:
      | Current Password         | Old Password    | Current Password Again  |
      |  NewPasswordAllLowerCase | CurrentPassword | NewPasswordAllLowerCase |
