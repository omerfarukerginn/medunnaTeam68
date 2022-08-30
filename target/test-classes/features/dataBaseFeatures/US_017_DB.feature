@DB_US_017
Feature: TestItems DB Test

  @US017_TC007
  Scenario: DB ile dogrulayin
    Given SU Kullanici database ile baglanti kurar
    And SU Admin query tanimlar
    And SU Admin testItems bilgilerine ulasir ve kaydeder
    And SU Admin DB ile testItems bilgilerini dogrular