@US_17

Feature:US_Story17 System should allow the Admin to manage users
  Background:Admin signs in
    Given user navigate the url
    And   click Sing in button
    And   Enter adminUsername
    And   Enter adminPassword
    Then  click for  Sing in button
    Then  click Administration Menu

  @TC_1701
  Scenario: Admin can activate a role as user
    Given Check Profiles as ROLE_USER
    Then  admin activate method
    Then  User quits

  @TC_1702
  Scenario: Admin can activate a role as employee
    Given check Profiles as ROLE_EMPLOYEE
    Then  admin activate method
    Then  User quits

  @TC_1703
  Scenario: Admin can activate a role as manager
    Given Check Profiles as ROLE_MANAGER
    Then admin activate method
    Then  User quits

  @TC_1704
  Scenario: Admin can activate a role as admin
    Given Check Profiles as ROLE_ADMIN
    Then admin activate method
    Then  User quits

  @TC_1705
  Scenario: Admin can view all user info
    And admin clicks on view button "ROLE_USER"
    Then admin assert all information
    Then  User quits

  @TC_1706
  Scenario: Admin can edit all user info
    Given admin clicks on edit button "ROLE_USER"
    Then admin change all user info
    Then  User quits

  @TC_1707
  Scenario: Admin can delete all user info
    Given User clicks on Delete button on a user.
    And User clicks on Cancel button.
    And User clicks on Delete button on a user.
    And User confirms the deletes.
    Then Admin deletes user
    And User quits

  @TC_1708
  Scenario: Admin can view all admin info
    And admin clicks on view button "ROLE_ADMIN"
    Then admin assert all information
    Then  User quits

  @TC_1709
  Scenario: Admin can edit all user info
    Given admin clicks on edit button "ROLE_ADMIN"
    Then admin change all user info
    Then  User quits

  @TC_1710
  Scenario: Admin can delete all admin info
    Given User clicks on Delete button on a user.
    And User clicks on Cancel button.
    And User clicks on Delete button on a user.
    And User confirms the deletes.
    Then Admin deletes user
    And User quits

  @TC_1711
  Scenario: Admin can view all admin info
    And admin clicks on view button "ROLE_MANAGER"
    Then admin assert all information
    Then  User quits

  @TC_1712
  Scenario: Admin can edit all user info
    Given admin clicks on edit button "ROLE_MANAGER"
    Then admin change all user info
    Then  User quits

  @TC_1713
  Scenario: Admin can delete all manager info
    Given User clicks on Delete button on a user.
    And User clicks on Cancel button.
    And User clicks on Delete button on a user.
    And User confirms the deletes.
    Then Admin deletes user
    And User quits

  @TC_1714
  Scenario: Admin can view all admin info
    And admin clicks on view button "ROLE_EMPLOYEE"
    Then admin assert all information
    Then  User quits

  @TC_1715
  Scenario: Admin can edit all user info
    Given admin clicks on edit button "ROLE_EMPLOYEE"
    Then admin change all user info
    Then  User quits

  @TC_1716
  Scenario: Admin can delete all admin info
    Given User clicks on Delete button on a user.
    And User clicks on Cancel button.
