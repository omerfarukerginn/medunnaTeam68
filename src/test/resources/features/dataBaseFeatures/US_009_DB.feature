@DB_009

Feature: US_009_DbTest


  Scenario: Kullanici DB kullanarak hasta bilgilerini dogrular

    Given user connects to database
    When user gets the "*" from "patient" table with the "ID" of "159071"
    Then the "first_name" of the person should be "hastaMahmut"
    And close the database connection
