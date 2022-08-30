@Set
Feature: DB ile Set etme

  Scenario Outline: DB ile yeni staff olusturma

    Given Kullanici DB ile baglanti kurar
    And  Kullanici Query tanimlar
    Then Staff id degeri "<id>" olan kaydin Email bilgisini "<created_by>" yapar
    And Kullanici DB ile Staff bilgilerini dogrular
    Examples:
      | id     | created_by |
      | 159437 | sizOldniz  |