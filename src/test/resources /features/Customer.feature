Feature: Validate customer info
  @US20_TC01
  Scenario: Read all customers
    Given user go to api end point "https://www.gmibank.com/api/tp-customers"
    And read all customer and set create pojo classes
    Then validates the data

