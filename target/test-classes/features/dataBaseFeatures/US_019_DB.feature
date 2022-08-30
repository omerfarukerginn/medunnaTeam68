
  @DB_US_019
    Feature: Kullanici admin olarak DataBase ile Staff dogrulayabilmeli.

      Scenario: Kullanici DB ile Staff bilgilerini dogrular

        Given Kullanici DB ile baglanti kurar
        And  Kullanici Query tanimlar
        And  Kullanici Staff bilgilerine ulasir ve kaydeder
        And Kullanici DB ile Staff bilgilerini dogrular
