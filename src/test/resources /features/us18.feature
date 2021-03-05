@us18
Feature: An Admin can manage Customer
  Background:  User goes to the home page and navigates to the manage customer link
    #Given User goes to the home page and log in
    Given user navigate the url
    And click Sing in button
    And enter admin valid credentials
    And click for  Sing in button
    And User clicks on My Operations field
    And User clicks on Manage Customers field

  @Tc1801
  Scenario: TC1801_Admin should see all the information related to the customers.
    Given User checks the First Name
    And User checks the Last Name
    And User checks the Middle Initial
    And User checks the Email
    And User checks the Mobile Phone Number
    And User checks the Phone Number
    And User checks the Address
    And User checks the Create Date
    And User quits

  @Tc1802
  Scenario: TC1802_Admin should see all the information through "View" button and can edit from View Page
    Given User clicks on View button on a customer.
#    And User clicks on Back button.
#    And User clicks on View button on a customer.
    And User clicks on Edit button.
    And User quits

  @Tc1803
  Scenario: TC1803_Admin should be able to edit customer info from Edit Page
    Given User clicks on Edit button on a customer
    And User changes the FirstName
    And User changes the LastName
    And User changes the Email
    And User changes the MobilePhoneNumber
    And User changes the ZipCode
    And User changes the Address
    And User clicks on Save Button
    Then verifies the success message
    And User quits

  @Tc1804
  Scenario: TC1804_Admin should be able to delete customer
    Given User clicks on Delete button on a customer.
    And User clicks on Cancel button.
    And User clicks on Delete button on a customer.
    And User confirms the deletion.
    And User quits









