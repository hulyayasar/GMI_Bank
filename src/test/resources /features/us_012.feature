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
  Scenario: TC1202_Employee should see all the information through "View" button and can edit from View Page
    Given User clicks on View button on a customer.
    And User clicks on Back button.
    And User clicks on View button on a customer.
    And User clicks on Edit button.

  @Tc1203
  Scenario: TC1203_Employee should be able to edit customer info from Edit Page
    Given User clicks on Edit button on a customer
    And User changes the FirstName
    And User changes the LastName
    And User changes the Email
    And User changes the MobilePhoneNumber
    And User changes the ZipCode
    And User changes the Address
    And User clicks on Save Button
    Then verifies the success message







