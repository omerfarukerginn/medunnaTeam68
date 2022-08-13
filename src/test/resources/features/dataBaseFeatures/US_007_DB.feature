
@DB_007
Feature: Kullanici hasta olarak DB ile randevulari dogrulayabilmeli
  Scenario: Eb Kullanici DB ile randevu bilgilerini almali ve dorulamali
    Given Eb Kullanici database ile baglanti kurar
    And Eb Kullanici query tanimlar
    And Eb Kullanici randevu bilgilerine ulasir ve kaydeder
    Then Eb Kullanici DB ile randevu bilgilerini "<patientId>", "<start_date>","<end_date>","<status>" dogrular