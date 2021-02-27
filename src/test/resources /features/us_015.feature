@US015
Feature: System should allow user to manage their account

  Background:
    Given user navigate the url
    And click Sing in button
    And provide valid username and password
    Then click for  Sing in button
    And User clicks on My Operations field

  @TC_01
  Scenario: user enters gmibank homepage then reaches customers accounts

    Then click on Transfer money
    Then verify user have at least 2 accounts
    And User quits

  @TC_02
  Scenario: US_015TC_03User(customer) can transfer money with valid cridentials


    Then click on Transfer money
    Then clicks on from gives account to transfer
    Then clicks on to choose the account to transfer
    Then Clicks on balance and gives amount to transfer
    Then clicks on description "4th transfer"
    Then clicks on make a transfer
    And User quits

  @TC_03
  Scenario: US_015TC_05User(customer) can view transaction

    Then click on My Accounts
    Then click on view transaction
    And User quits
