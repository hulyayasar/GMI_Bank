@database
  Feature:"All users' info should be retrieved by database and validated"
    Background: Connection with DB
      Given User creates a conneciton with db using "jdbc:postgresql://157.230.48.97:5432/gmibank_db" , "techprodb_user" and "Techpro_@126""
    Scenario Outline: Read data using column name
      Given user provides the query as "<query>" and "<columnName>"
      Then user validates all db data
      Examples:
        |query  |columnName|
        |select * from tp_customer|ssn|

@db1
    Scenario Outline: Read data using column name
      Given user provides the query as the other "<query>" and "<columnName>"
      Then user validates all country
      Examples:
        |query  |columnName|
        |select * from tp_country|name|