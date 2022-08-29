



@API_US019
Feature: Api_US019 - Create, edit or delete Staff by just Admin and Validate with API


  @ApiUS019_
  Scenario: TC010203 - API ile hasta bilgilerini doğrulama


    Given  Api Personel icin beklenen verileri girin
    Then   Api istegi sonlandirir ve kayit icin yanit alir
    And    Api, kayit icin API kayitlarini dogrular