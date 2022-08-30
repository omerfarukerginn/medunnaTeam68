@Api_015
Feature: US_015_ApiTest

  Scenario: API kullanarak hasta bilgilerini dogrular
    Given Admin set the Base Url
    And Admin Send the GET request and get the response
    And Admin Set the expected data
    Then Admin Make validation