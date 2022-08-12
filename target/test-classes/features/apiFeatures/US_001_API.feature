@US01_API
Feature: US_001 API
  @US001_TC013
  Scenario:US001_TC013
    When  kullanici gecerli bir endpointle kayit bilgilerini almali
    And kullanici yetkili bir get endpointle kayitli kullanici bilgilerini almali
    And kullanici Authorization almali ve bearer token kullanmali
    And kullanici content-type olarak Json kullanmali
    And Kullanici alinan end pointleri deserilasyon yapmali
    And Kullanici alinan kayitlari validate etmeli

  @US001_TC014
  Scenario:US001_TC014
    When kullanici gecerli bir endpointle kayitli kisiler olusturur
    Then kullanici kayitli kisileri dogrular
