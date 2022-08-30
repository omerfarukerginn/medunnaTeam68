@US_016   #calistirmadan once delete endpiont id degistir
Feature: US_016 Validate rooms with API

  Scenario: TC_016_001 Validate all rooms with API creating
    Given Admin set path params for room creation
    And Admin enters expected data for room creation
    And Admin sends request and receives response for room creation
    And Admin save all API information for room creation
    And Admin verify API records for room creation

    @TC_016_002
  Scenario: TC_016_002 Validate all rooms with API reading(get)
    Given Admin set path params for room read
    And Admin enters expected data for room read
    And Admin sends request and receives response for room read
    And Admin save all API information for room read
    And Admin verify API records for room read

      @TC_016_003
  Scenario: TC_016_003 Validate all rooms with API updating
    Given Admin set path params for room update
    And Admin enters expected data for room update
    And Admin sends request and receives response for room update
    And Admin save all API information for room update
    And Admin verify API records for room update

  @TC_016_004
  Scenario: TC_016_004 Validate all rooms with API deleting
    Given Admin set path params for room delete
    And Admin sends request and receives response for room delete
    And Admin verify API records for room delete