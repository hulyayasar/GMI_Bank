@US26
Feature: US26 System should allow to update countries using api end point
  "https://www.gmibank.com/api/tp-countries"


  Scenario Outline: Update country
    Given US26 System should allow to update countries using api end point "https://www.gmibank.com/api/tp-countries" "<name>" and its extension "<id>"
    Then validate updated country
    Examples:
      |name | id |
      |Freedom| 22321|