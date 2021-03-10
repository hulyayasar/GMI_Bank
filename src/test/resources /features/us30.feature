@US_30

Feature: US_30 All users (user, employee, manager or admin) should be printed as a pdf file
    Scenario: You should have all users' info as Name, last name and role on a pdf document
        Given send a GET request to REST API end point "https://www.gmibank.com/api/users"
        And HTTP Status Code should be 200 and contentType should be JSON
        Then all users' info as Name, last name and role should had on a pdf document