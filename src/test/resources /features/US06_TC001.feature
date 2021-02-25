@TC001 @FRY
Feature: US006
  Scenario Outline:TC001 User Info Being Populated When Navigating User Info
  Given User goes to "url"
  And  User clicks people image
  And  User clicks main page sign in button
  And  User enters username "<Username>"
  And  User enters password "<Password>"
  And  User clicks sign in button
  Then User clicks profile image
  And  User clicks User Info
  And  User verifies firstname
  And  User verifies lastname
  And  User verifes email
  And  User verifies language
    Examples:
      |Username  |Password|
      |team35GmiBankProject |team35GmiBankProject|

  @TC002 @FRY
  Scenario Outline:There Should be  Two Language Avaible Eng and Tur
    Given User goes to "url"
    And  User clicks people image
    And  User clicks main page sign in button
    And  User enters username "<Username>"
    And  User enters password "<Password>"
    And  User clicks sign in button
    Then User clicks profile image
    And  User clicks User Info
    And  User change language
    And  User clicks save button
    And  User verifies settings are changing

    Examples:
      |Username  |Password|
      |team35GmiBankProject |team35GmiBankProject|


  @TC004-TC007 @FRY
  Scenario Outline:User should be changing all data
    Given User goes to "url"
    And  User clicks people image
    And  User clicks main page sign in button
    And  User enters username "<Username>"
    And  User enters password "<Password>"
    And  User clicks sign in button
    Then User clicks profile image
    And  User clicks User Info
    And  User change firstname
    And  User clear firstname
    And  User change lastname
    And  User clear lastname
    And  User change email
    And  User clear first extension
    And  User clear  second extension
    And  User change language
    And  User clicks save button
    And  User change firstname
    And  User clear firstname
    And  User change lastname
    And  User clear lastname
    And  User change email
    And  User clear first extension
    And  User clear  second extension

    Examples:
      |Username  |Password|
      |team35GmiBankProject |team35GmiBankProject|














