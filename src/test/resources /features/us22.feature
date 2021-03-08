@us22
  Feature: System should allow to read states using api end point "https://www.gmibank.com/api/tp-states"
    Scenario Outline: Tc01 User reads all states
      Given send the request get the response using the end point "https://www.gmibank.com/api/tp-states"
      And converting response body JSON Data to JAVA Object
      Then user validates data for all states "<ExpectedStates>"

      Examples:
      |ExpectedStates|
      |Manisa|