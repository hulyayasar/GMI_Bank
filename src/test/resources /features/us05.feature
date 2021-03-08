@theLastBugBenders
Feature: Login page should not be accessible with invalid credentials
  Background: User is on the main page
    Given User is on the main page
    And click on person sign
    And click on sign in option

    @TC_0001
    Scenario Outline: TC_0001_User cannot login with invalid username validating the error message
      When user enters the username "<username>"
      When user enters the password "<password>"
      And click on the submit button
      Then verify the error message contains "Failed"

      Examples: invalid username and valid password
      |username|password|
      |hey     |team35GmiBankProject|
#      |hello   |thebestemployee     |
#      |hi      |theUser             |
#      |name    |theCustomer         |

  @TC_0002
  Scenario Outline: TC_0002_User cannot login with invalid username validating the error message
    When user enters the password "<password>"
    And click on the submit button
    Then verify the error message contains "Failed"
    Then verify the error message empty contains "Username"

    Examples: invalid username and valid password
      |password|
      |team35GmiBankProject|
#      |thebestemployee     |
#      |theUser             |
#      |theCustomer         |

  @TC_0003
  Scenario Outline: TC_0003_User cannot login with invalid password validating the error message
    When user enters the username "<username>"
    When user enters the password "<password>"
    And click on the submit button
    Then verify the error message contains "Failed"

    Examples: invalid username and valid password
      |username|password|
      |team35GmiBankProject|hey     |
#      |thebestemployee     |hello   |
#      |theUser             |hi      |
#      |theCustomer         |name    |


  @TC_0004
  Scenario Outline: TC_0004_User cannot login with invalid password validating the error message
    When user enters the username "<username>"
    And click on the submit button
    Then verify the error message contains "Failed"
    Then verify the error message empty contains "Password"

    Examples: invalid username and valid password
      |username|
      |team35GmiBankProject|
#      |thebestemployee     |
#      |theUser             |
#      |theCustomer         |


  @TC_0005
  Scenario Outline: TC_0005_User cannot login with invalid username and password validating the error message
    When user enters the username "<username>"
    When user enters the password "<password>"
    And click on the submit button
    Then verify the error message contains "Failed"

    Examples: invalid username and valid password
      |username|password|
      |hey   |hey   |
#      |hello |hello |
#      |hi    |hi    |
#      |name  |name  |

#  @TC_0006
#  Scenario Outline: TC_0006_User cannot login with invalid username and password validating the error message
#    When user enters the username "<username>"
#    When user enters the password "<password>"
#    And click on the submit button
#    Then verify the error message contains "Failed"
#    Then verify the error message empty contains "Username"
#    Then verify the error message empty contains second "Password"
#
#    Examples: invalid username and valid password
#     |username|password|
#     |||

#  @TC_0007
#  Scenario Outline: TC_0007_User with invalid credentials should be given an option to reset their password
#    When user enters the username "<username>"
#    When user enters the password "<password>"
#    And click on the submit button
#    And verify the error message contains "Failed"
#    And click on the reset option
#    Then verify the resetPassword title is "Reset your password"
#
#    Examples: invalid username and valid password
#      |username|password|
#      |hey   |hey   |

  @TC_0008
  Scenario Outline: TC_0008_User with invalid credentials should be given an option to reset their password
    When user enters the username "<username>"
    When user enters the password "<password>"
    And click on the submit button
    And verify the error message contains "Failed"
    And click on the register a new account option
    Then verify the RegisterANewAccount title is "Registration"

    Examples: invalid username and valid password
      |username|password|
      |hey   |hey   |
















