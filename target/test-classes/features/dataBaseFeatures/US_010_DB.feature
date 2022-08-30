
@DB_010
Feature:US_010 Kullanici doktor olarak DB ile randevulari dogrulamali
  Scenario:Kullanici DB ile randevu bilgilerini almali ve dorulamali
    Given Kullanici database ile baglanti kurar
    And Kullanici query tanimlar
    And Kullanici randevu bilgilerine ulasir ve kaydeder
    Then Kullanici DB ile randevu bilgilerini "<patientId>", "<start_date>","<end_date>","<status>" dogrular