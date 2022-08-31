@DB_US_027
Feature: TestItems DB Test

  @US027_TC006
  Scenario: DB ile dogrulayin
    Given ofe Kullanici database ile baglanti kurar
    And ofe Admin query tanimlar
    And ofe Admin messages bilgilerine ulasir ve kaydeder
    And ofe Admin DB ile messages bilgilerini dogrular