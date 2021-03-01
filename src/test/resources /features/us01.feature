@theLastBugBenders
  Feature: User can register on GMI Bank

    Scenario Outline: Register
      Given user is on registration page
      And user writes SSN number using "<SSN>"
      When user writes firstname "<firstname>"
      And user writes surname "<lastname>"
      Then user writes address "<address>"
      And user writes mobilephone "<mobilephone>"
      Then user writes username "<username>"
      And user writes email "<email>"




      Examples: send data
        |SSN         |firstname|lastname  |address                          |mobilephone  |username          |email        |
        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|



