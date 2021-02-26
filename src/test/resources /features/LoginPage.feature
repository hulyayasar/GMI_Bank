@login
Feature: Login page

  @login01
  Scenario: User enter credentials
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    And  click for  Sing in button
    Then verify log in the personal page
    And User quits


  @login02
    Scenario: User input valid credentials after that click Cancel button
      Given user navigate the url
      And click Sing in button
      And enter valid credentials
      Then click cencel button
      And User quits






