@API_028
Feature: US_028_APITest

  Scenario: Kullanici, API kullanarak ulkeleri dogrular
    Given zll Kullanici set the Base Url
    And zll Send the GET request and get the response
    And zll Set the expected data
    Then zll Make validation