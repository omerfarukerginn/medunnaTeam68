@DB_009

Feature: US_009_DbTest


  Scenario: Kullanici DB kullanarak hasta bilgilerini dogrular

    Given user connects to database
    When user gets the "*" from "patient" table with the "ID" of "159071"
    Then the "first_name" of the person should be "hastaMahmut"
    Then the "last_name" of the person should be "hastaMahmut"
    Then the "phone" of the person should be "333-333-4444"
    Then the "adress" of the person should be "Istiklal caddesi"
    Then the "email" of the person should be "hastamahmut@gmail.com"
    And close the database connection
