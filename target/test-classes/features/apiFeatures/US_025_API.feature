@api25 @E2E
Feature: Appointment Api Test


  Scenario: Appointment Api Testing

    Given Eb user set path params
    Given Eb user enter expected data FirstName LastName SSN Email Phone Date
    And Eb user send request and get response
    Then Eb user save api data to file
    And Eb user verify  api data