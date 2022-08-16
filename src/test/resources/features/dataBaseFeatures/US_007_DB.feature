
@DB_007
Feature: Eb Kullanici hasta olarak DB ile randevulari dogrulayabilmeli

  Scenario: Eb Kullanici DB ile randevu bilgilerini almali ve dogrulamali
    Given Eb Kullanici database ile baglanti kurar
    And Eb Kullanici query tanimlar
    And Eb Kullanici randevu bilgilerine ulasir ve kaydeder
    And Eb Kullanici DB ile randevu bilgilerini dogrular

