@Api_015
Feature: US_015_ApiTest

  Scenario: API kullanarak hasta bilgilerini dogrular
    Given Admin set the Base Url
    And Send the GET request and get the response
    And Set the expected data
    Then Make validation