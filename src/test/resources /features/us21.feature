@us21
Feature: us21 System should allow to read all countries info using api end point
  "https://www.gmibank.com/api/tp-countries"

  Scenario: TC2101 query of all countries
    Given Get request from api "https://www.gmibank.com/api/tp-countries" should turn a response
    And json message is de-serializied by the system
@TC2601
  Scenario: TC2601 update a country
    Given  User sends put request id with the name "Freedom" at the URI "https://www.gmibank.com/api/tp-countries"


