@US21
Feature: US21 System should allow to read all countries info using api end point
  "https://www.gmibank.com/api/tp-countries"

  @TC2101
  Scenario: TC2101 query of all countries
    Given Get request from api "https://www.gmibank.com/api/tp-countries" should turn a response
    And json message is deserialized by the system
  @TC2102
  Scenario: TC2102 query of specific country by name
    Given Get request from api "https://www.gmibank.com/api/tp-countries" should turn a response
    And json message is deserialized by the system
    And get the information of 10th country
    Then verify the name of the 10th country is "Himalaya"

  @TC2103
  Scenario: TC2103 query of specific country by id
    Given Get request from api "https://www.gmibank.com/api/tp-countries" should turn a response
    And json message is deserialized by the system
    And get the information of the country with "22321" id


