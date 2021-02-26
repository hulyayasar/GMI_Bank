@US_009
Feature: reach to customer info
  Scenario: user enters gmibank homepage then reaches create new costomers link
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    Then click for  Sing in button
    And User clicks on My Operations field
    And User clicks on Manage Customers field
    And user clicks createNewCustomer
    Then user enters ssn "888-22-4444"
    Then clicks on searchBox
    And User quits
