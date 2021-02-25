@TC_01
Feature: System should allow user to manage their account

  Scenario: user enters gmibank homepage then reaches customers accounts
    Given user enters gmibank homepage
    Then user clicks userEntry icon
    Then user clicks signIn link
    Then user enters  username
    Then user enters password
    Then user clicks signIn button
    Then user clicks myOperations
    Then click on My Accounts
    Then verify user have at least 2 accounts

  @TC_02
  Scenario: US_015TC_03User(customer) can transfer money with valid cridentials
    Given user enters gmibank homepage
    Then user clicks userEntry icon
    Then user clicks signIn link
    Then user enters  username
    Then user enters password
    Then user clicks signIn button
    And user clicks myOperations
    Then click on My Accounts
    Then click on Transfer money
    Then clicks on from gives account to transfer
    Then clicks on to choose the account to transfer
    Then Clicks on balance and gives amount to transfer
    Then clicks on description "4th transfer"
    Then clicks on make a transfer
  @TC_03
  Scenario: US_015TC_05User(customer) can view transaction
    Given user enters gmibank homepage
    Then user clicks userEntry icon
    Then user clicks signIn link
    Then user enters  username
    Then user enters password
    Then user clicks signIn button
    And user clicks myOperations
    Then click on My Accounts
    Then click on view transaction
