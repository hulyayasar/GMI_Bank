@us003
Feature: "Registration page should restrict password usage to a secure and high level passcode"
  Background: User in the registration page
    Given user is on registration page
    And user writes SSN number using "123-45-6789"
    When user writes firstname "Ayse"
    And user writes surname "Yilmaz"
    Then user writes address "123 Main Street Anycity FL 32104"
    And user writes mobilephone "123-123-4444"
    Then user writes username "Thebestusername123"
    And user writes email "xyz@gmail.com"

    Scenario Outline: when user writes the password with same category there should be just one level
      And user writes the password  "<password>"
      And verify the chart has just one level
      And user should enter same password for confirmation "<confirmation_password>"
      And verify the confirmation password

      Examples: send data
        |password|confirmation_password|
        |aaaaaaa   |aaaaaaa               |
        |AAAAAAA   |AAAAAAA               |
        |1111111   |1111111               |
        |*******   |*******               |

        |######    |######                |



       # |######### |#########             |
        #|##############|##############    |
        #|###################|###################|
        #|#####################        |#####################                   |

   #|@@@@@@@@@                    |@@@@@@@@@                               |
        #|@@@@@@@@@@@@@@               |@@@@@@@@@@@@@@                          |
        #|@@@@@@@@@@@@@@@@@@@          |@@@@@@@@@@@@@@@@@@@                     |
        #|@@@@@@@@@@@@@@@@@@@@@        |@@@@@@@@@@@@@@@@@@@@@                   |

   #     |\\\\\\\\\                    |\\\\\\\\\                               |
   #     |\\\\\\\\\\\\\\               |\\\\\\\\\\\\\\                          |
   #     |\\\\\\\\\\\\\\\\\\           |\\\\\\\\\\\\\\\\\\                      |
    #    |\\\\\\\\\\\\\\\\\\\\         |\\\\\\\\\\\\\\\\\\\\                    |



  Scenario Outline: "There should be at least 1 lowercase char or 1 uppercase char or 1 number or i special char
      for stronger password and see the level chart change by 2 accordingly"
        And user writes the password  "<password>"
        And verify the chart has changed one level and the level is two
        And user should enter same password for confirmation "<confirmation_password>"
        And verify the confirmation password

        Examples: send data
          |password|confirmation_password|
         # |AAAAAAa   |AAAAAAa               |
          |111111a   |111111a               |
          |******a   |******a               |
          |111111A   |111111A               |
          |******A   |******A               |
          |******1   |******1               |


          #bugs
          #|######a    |######a               |
          #|@@@@@@@@@A |@@@@@@@@@A            |
          #|\\\\\\\\\\\\\\\\\\\\1 |\\\\\\\\\\\\\\\\\\\\1            |


  Scenario Outline: "There should be at least 2 of the 1 lowercase char or 1 uppercase char or 1 number or i special char for stronger password and
  see the level chart change by 4 accordingly"
    And user writes the password  "<password>"
    And verify the chart has changed one level and the level is four
    And user should enter same password for confirmation "<confirmation_password>"
    And verify the confirmation password

    Examples: send data
      |password|confirmation_password|
      |AAAAAa1   |AAAAAa1               |
      |AAAAAa*   |AAAAAa*               |
      |AAAAA*1   |AAAAA*1              |
      |11111a*   |11111a*              |

    #bugs
      #|#####Aa    |#####Aa               |
      #|@@@@@@@@1A |@@@@@@@@1A            |
      #|\\\\\\\\\\\\\\\\\\\A1 |\\\\\\\\\\\\\\\\\\\A1            |


  Scenario Outline: "There should all of the catagories  lowercase char and uppercase char and  number and  special char
  for stronger password and see the level chart change by 5 accordingly"
    And user writes the password  "<password>"
    And verify the chart has changed one level and the level is five
    And user should enter same password for confirmation "<confirmation_password>"
    And verify the confirmation password

    Examples: send data
      |password|confirmation_password|
      |A.AAAa1   |A.AAAa1               |
      |A#AAAa1   |A#AAAa1               |
      |A@AAAa1   |A@AAAa1               |
      |A^AAAa1   |A^AAAa1               |

      #bugs
      #|#####Aa1    |#####Aa1               |
      #|@@@@@@@@1Aa |@@@@@@@@1Aa            |
      #|\\\\\\\\\\\\\\\\\\\A1a |\\\\\\\\\\\\\\\\\\\A1a            |


















