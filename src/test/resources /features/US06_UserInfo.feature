@TC001
Feature: US006
  Scenario:TC001 User Info Being Populated When Navigating User Info
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    Then click for  Sing in button
    Then User clicks profile image
    And  User clicks User Info
    And  User verifies firstname
    And  User verifies lastname
    And  User verifes email
    And  User verifies language


  @TC002
  Scenario:There Should be  Two Language Avaible Eng and Tur
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    Then click for  Sing in button
    Then User clicks profile image
    And  User clicks User Info
    And  User change language
    And  User clicks save button
    And  User verifies settings are changing



  @TCEmail
  Scenario:User should be changing all data
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    Then click for  Sing in button
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















