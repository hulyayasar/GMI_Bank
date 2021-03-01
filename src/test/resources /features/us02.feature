@theLastBugBenders
  Feature:System should not allow anyone to register with invalid credentials
    seeing the message "If you want to sign in, you can try the default
    accounts:- Administrator (login="admin" and password="admin")
    - User (login="user" and password="user").

  Background: User in the registration page
    Given user is on registration page
    @TC0001
    Scenario Outline: Any field on the registration page should not be left blank
      And check did user write SSN number using "<SSN>" verify
      When check did user write firstname "<firstname>" verify
      And check did user write surname "<lastname>" verify
      Then check did user write address "<address>" verify
      And check did user write mobilephone "<mobilephone>" verify
      Then check did user write username "<username>" and verify
      And check did user write email "<email>" and verify
      Then check did user write New_password "<New_password>" and verify
      And check did user write New_password_confirmation "<New_password_confirmation>" and verify
      Examples: send data
        |SSN         |firstname|lastname  |address                          |mobilephone  |username          |email        |New_password|New_password_confirmation|
        ||Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|12345                  |12345                    |
#        |123-45-6789||Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|12345                  |12345                    |
#        |123-45-6789|Ayse      ||123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|12345                  |12345                    |
#        |123-45-6789|Ayse      |Yilmaz    ||123-123-4444 |Thebestusername123|xyz@gmail.com|12345                  |12345                    |
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 ||Thebestusername123|xyz@gmail.com|12345                  |12345                    |
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 ||xyz@gmail.com|12345                  |12345                    |
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123||12345                  |12345                    |
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com||12345                    |
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|12345                    ||

    @TC0002
      Scenario Outline: "SSN number cannot be of any chars nor spec chars except "-"
        And user cannot write chars other than - for SSN number "<SSN>"
        When user writes firstname "<firstname>"
        And user writes surname "<lastname>"
        Then user writes address "<address>"
        And user writes mobilephone "<mobilephone>"
        Then user writes username "<username>"
        And user writes email "<email>"
        Examples: send data
          |SSN         |firstname|lastname  |address                          |mobilephone  |username          |email        |
          |ssnNumber2#|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|
#          |ssn!123@def|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|
#          |123_45_6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|
#          |123*45*6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.com|

    @TC0003
    Scenario Outline: "Mobilephone number cannot be of any chars nor spec chars except "-"
      And user writes SSN number using "<SSN>"
      When user writes firstname "<firstname>"
      And user writes surname "<lastname>"
      Then user writes address "<address>"
      And user cannot write chars other than - for mobilephone "<mobilephone>"
      Then user writes username "<username>"
      And user writes email "<email>"
      Examples: send data
        |SSN         |firstname|lastname  |address                          |mobilephone  |username          |email        |
        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123_123_4444 |Thebestusername123|xyz@gmail.com|
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-abc-4444 |Thebestusername123|xyz@gmail.com|
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4%&b |Thebestusername123|xyz@gmail.com|
#        |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |#@s-123-4444 |Thebestusername123|xyz@gmail.com|

    @TC0004
      Scenario Outline: "Email id cannot be created without "@" sign and "." extensions
        And user writes SSN number using "<SSN>"
        When user writes firstname "<firstname>"
        And user writes surname "<lastname>"
        Then user writes address "<address>"
        And user writes mobilephone "<mobilephone>"
        Then user writes username "<username>"
        And user cannot write email without @ and . extensions "<email>"

        Examples: send data
          |SSN         |firstname|lastname  |address                          |mobilephone  |username          |email        |
          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmailcom|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyzgmail.com|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyzgmailcom|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|@gmail.com|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gmail.|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@.com|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyzgmailcom|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|x.yz@gmailcom|
#          |123-45-6789|Ayse      |Yilmaz    |123 Main Street Anycity FL 32104 |123-123-4444 |Thebestusername123|xyz@gma@il.com|





