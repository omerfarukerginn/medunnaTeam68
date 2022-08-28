@US_028_DB_001
Feature: Kullanici admin olarak DataBase ile ulkeleri dogrulayabilmeli.

  Scenario: Kullanici DB ile ulkeleri bilgilerini dogrular

    Given zll Kullanici DB ile baglanti kurar
    And  zll Kullanici Query tanimlar
    And  zll Kullanici ulke bilgilerine ulasir ve kaydeder
    And zll Kullanici DB ile ulke bilgilerini dogrular