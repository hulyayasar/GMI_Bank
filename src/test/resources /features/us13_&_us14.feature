@US_0013_0014
Feature:An Employee can manage Account

  Background: User goes to the home page and navigates to the manage account link
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    Then click for  Sing in button
    Then user clicks on My Operations
    Then user clicks on Manage Account

  @TC_1301
  Scenario: TC_1301_Description is required
    When user clicks on Create a new Account
    When user enters description ""
    When user enters balance "111"
    Then verify the description required message
    And User quits

  @TC_1302
  Scenario: TC_1302_Balance is required
    When user clicks on Create a new Account
    When user enters balance ""
    When user enters description "aksoy gmi"
    Then verify the balance required message
    And User quits

  @TC_1303
  Scenario Outline: TC_1303_Account types
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "111"
    When user selects account type "<account types>"
    Then verify the account type is selected as "<account types>"
    And User quits
    Examples: This is used to pass account types
      |account types |
      |CHECKING      |
      |SAVING        |
      |CREDIT_CARD   |
      |INVESTING     |

  @TC_1304
  Scenario Outline: TC_1304_Account status types
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "111"
    When user selects account status type "<account status types>"
    Then verify the account status type is selected as "<account status types>"
    And User quits
    Examples: This is used to pass account types
      |account status types |
      |ACTIVE               |
      |SUESPENDED           |
      |CLOSED               |



  @TC_1401
  Scenario: TC_1401_a_Past create date
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "700"
    When user selects account type "SAVING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for past
    Then verify the date for past
    And User quits

  @TC_1401
  Scenario: TC_1401_b_Future create date
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "800"
    When user selects account type "INVESTING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for future
    Then verify the date for future
    And User quits

  @TC_1402
  Scenario: TC_1402_Closed date
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "900"
    When user selects account type "CHECKING"
    When user selects account status type "CLOSED"
    When user enters Create Date for present
    When user enters Closed Date earlier than Create Date
    Then verify the Closed Date
    And User quits

  @TC_1403
  Scenario: TC_1403_Date format
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "600"
    When user selects account type "CHECKING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for present
    Then verify the present date
    And User quits

  @TC_1404
  Scenario: TC_1404_Choose an account
    When user clicks on Create a new Account
    When user enters description "captain85"
    When user enters balance "750"
    When user selects account type "CHECKING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for present
    When user clicks on the save button
    Then user selects last created account
    And User quits

  @TC_1305
  Scenario: TC_1305_Select an employee
    When user clicks on Create a new Account
    When user selects account employee
    Then verify account employee is selected
    And User quits