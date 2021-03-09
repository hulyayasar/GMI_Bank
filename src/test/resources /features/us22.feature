@us22
  Feature: System should allow to read states using api end point "https://www.gmibank.com/api/tp-states"
    Background:
      Given send the request get the response using the end point "https://www.gmibank.com/api/tp-states"

    Scenario Outline: Tc01 User reads all states with Scenario Outline
      And converting response body JSON Data to JAVA Object
      Then assert the states which are given as an example "<ExpectedStates>"

      Examples:
      |ExpectedStates|
      |Manisa|
      |Koblenz|

    Scenario: Tc02 User reads all states with file
     And converting response body JSON Data to JAVA Object
      And assert the states which are given as a file


    Scenario: Tc03 User reads all states with pojo classes
      Then create the actual state list with using pojo classes
      And generate the expected data
      Then assert the expected data with actual data
