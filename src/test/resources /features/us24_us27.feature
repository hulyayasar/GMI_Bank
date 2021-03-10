@us24_us27
Feature: read, create, update and delete all states

  Background: read all states
    Given user sets states to response using "https://www.gmibank.com/api/tp-states"
    And user deserializes all states to pojo

  Scenario: create state
    Given user creates a new state using "https://www.gmibank.com/api/tp-states"


  Scenario Outline: delete states
    #Given user deletes the created state
    And user provides api end point to delete states using "<endPoint>" and its extension "<id>"

    Examples: all states
      |endPoint|id|
      |https://www.gmibank.com/api/tp-states|/27501|