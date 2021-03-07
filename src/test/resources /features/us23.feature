Feature: System should allow to read all Applicants using api end point
  @Applicants

  Scenario: User reads all applicants
    Given User goes to the end point "https://www.gmibank.com/api/tp-account-registrations"
    And User is deserializing all data to Java
    And User reads all registrants data