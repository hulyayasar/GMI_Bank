@us_012
Feature: An Employee can manage Customer
  Background:  User goes to the home page and navigates to the manage customer link
    Given User goes to the home page and log in
    Then User clicks on My Operations field
    Then User clicks on Manage Customers field
  @Tc1201
  Scenario: TC1201_Employee should see all the information related to the customers.
    Given User checks the First Name
    And User checks the Last Name
    And User checks the Middle Initial
    And User checks the Email
    And User checks the Mobile Phone Number
    And User checks the Phone Number
    And User checks the Address
    And User checks the Create Date

  @Tc1202
  Scenario: TC1202_Employee should edit all the information related to the customers.
    Given User edits the First Name




