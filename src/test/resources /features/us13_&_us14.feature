@US_0013_0014
Feature:User story 0013 & 0014

  @TC_1301
  Scenario: TC_1301_Description is required
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description ""
    When user enters balance "111"
    Then verify the description required message

  @TC_1302
  Scenario: TC_1302_Balance is required
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters balance ""
    When user enters description "aksoy gmi"
    Then verify the balance required message

  @TC_1303
  Scenario Outline: TC_1303_Account types
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "111"
    When user selects account type "<account types>"
    Then verify the account type is selected as "<account types>"
    Examples: This is used to pass account types
      |account types |
      |CHECKING      |
      |SAVING        |
      |CREDIT_CARD   |
      |INVESTING     |

  @TC_1304
  Scenario Outline: TC_1304_Account status types
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "111"
    When user selects account status type "<account status types>"
    Then verify the account status type is selected as "<account status types>"
    Examples: This is used to pass account types
      |account status types |
      |ACTIVE               |
      |SUESPENDED           |
      |CLOSED               |

  @TC_1305
  Scenario: TC_1305_Select an employee
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user selects account employee
    Then verify account employee is selected

  @TC_1401
  Scenario: TC_1401_a_Past create date
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "700"
    When user selects account type "SAVING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for past
    Then verify the date for past

  @TC_1401
  Scenario: TC_1401_b_Future create date
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "800"
    When user selects account type "INVESTING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for future
    Then verify the date for future

  @TC_1402
  Scenario: TC_1402_Closed date
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "900"
    When user selects account type "CHECKING"
    When user selects account status type "CLOSED"
    When user enters Create Date for present
    When user enters Closed Date earlier than Create Date
    Then verify the Closed Date

  @TC_1403
  Scenario: TC_1403_Date format
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "aksoy gmi"
    When user enters balance "600"
    When user selects account type "CHECKING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for present
    Then verify the present date

  @TC_1404
  Scenario: TC_1404_Choose an account
    Given user is on the GMI Bank home page
    And user signs in with valid credentials
    When user clicks on My Operations
    When user clicks on Manage Account
    When user clicks on Create a new Account
    When user enters description "captain85"
    When user enters balance "750"
    When user selects account type "CHECKING"
    When user selects account status type "ACTIVE"
    When user enters Create Date for present
    When user clicks on the save button
    Then user selects last created account