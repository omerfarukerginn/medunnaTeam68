@Api09
Feature: US_009_ApiTest

  Scenario: Kullanici, API kullanarak hasta bilgilerini dogrular
    Given Kullanici set the Base Url
    And Send the GET request and get the response
    And Set the expected data
    Then Make validation