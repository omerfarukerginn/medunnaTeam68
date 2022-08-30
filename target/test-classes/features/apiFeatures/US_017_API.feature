@Api_US_017
Feature:TestItems Api Test

  @US017_TC005
  Scenario: US017_TC005 all test items api testing
    Given su Admin set path params for test items
    And su Admin enters expected data for test items
    And su Admin sends request and get response for test items
    And su Admin save all API information for test items
    And su Admin verify API for test items

  @US017_TC006
  Scenario: US017_TC006 create test items using api
    Given su Admin set path params for test item creation
    And su Admin enters expected data for test item creation
    And su Admin sends request and get response for test item creation
    And su Admin save all API information for test item creation
    And su Admin verify API for test item creation
