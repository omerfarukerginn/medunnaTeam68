
@DB_US_016
Feature: US_016_Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)

  Scenario: TC_014 Admin DB ile oda bilgilerini doğrulayabilmeli

    Given Admin DB ile baglanti kurar
    And  Admin Room Query tanimlar
    And  Admin Room bilgilerine ulasir ve kaydeder
    And Admin DB ile Room  bilgilerini dogrular
