@US_028_DB
Feature: Kullanici admin olarak DataBase ile ulkeleri dogrulayabilmeli.

  @US_028_DB_001
  Scenario: Kullanici DB ile ulkeleri bilgilerini dogrular
    Given zll Kullanici DB ile baglanti kurar
    And  zll Kullanici Query tanimlar
    And  zll Kullanici ulke bilgilerine ulasir ve kaydeder
    And zll Kullanici DB ile ulke bilgilerini dogrular

  @US_028_DB_002
  Scenario: Kullanici DB ile sehir bilgilerini dogrular
    Given zll Kullanici DB ile baglanti kurar
    And  zll Kullanici sehir icin Query tanimlar
    And  zll Kullanici sehir bilgilerine ulasir ve kaydeder
    And zll Kullanici DB ile sehir bilgilerini dogrular
