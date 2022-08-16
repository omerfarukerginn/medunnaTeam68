P@US01_API
Feature: US_001 API
  @US001_TC013
  Scenario:US001_TC013
    When  kullanici gecerli bir endpointle kayit bilgilerini almali
    And kullanci status code 200 almali
    And kullanici deserilizasyon yapmali
    Then kullanci alinan bütün kayitlari dogrulamali



  @US001_TC014,US_002_TC03,08
  Scenario:US001_TC014
    When kullanici gecerli bir endpointle kayitli kisiler olusturur
    Then kullanici kayitli kisileri dogrular

