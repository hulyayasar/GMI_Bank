@createNewCustomer
Feature: User can create a new customer
  Scenario Outline: Create a New Customer
    Given user navigate the url
    And click Sing in button
    And enter valid credentials
    Then click for  Sing in button
    And User clicks on My Operations field
    And User clicks on Manage Customers field
    And user clicks createNewCustomer
    When user enters firstname "<firstname>"
    When user enters surname "<lastname>"
    When user enters middleinitial "<middleinitial>"
    When user enters email "<email>"
    When user enters mobilephone "<mobilephone>"
    When user enters phonenumber "<phonenumber>"
    When user enters zipcode "<zipcode>"
    When user enters address "<address>"
    When user enters city "<city>"
    When user enters SSN number using "<SSN>"
    When user enters country "<country>"
    When user enters state "<state>"
    When user enters Create Date for present without am-pm
    When user selects an user
    When user selects an account
    And user click check box

    Examples: send data
      |firstname|lastname  |middleinitial|email                   |mobilephone  |phonenumber|zipcode|address            |city    |SSN         |country|state  |
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      ||Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    ||H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    ||Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            ||114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com||157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  ||1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  ||Av. Santa Fe 3456  |Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   ||Orlando |432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  ||432-71-9074|USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando ||USA    |Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074||Florida|
      |Dondu    |Durmaz    |H            |Durmazdondu_35@gmail.com|114-326-5626  |157-600-6231  |1209   |Av. Santa Fe 3456  |Orlando |432-71-9074|USA    ||




