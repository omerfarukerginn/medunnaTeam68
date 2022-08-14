
@DB_007
Feature: Kullanici hasta olarak DB ile randevulari dogrulayabilmeli

  Scenario Outline: Eb Kullanici DB ile randevu bilgilerini almali ve dogrulamali
    Given Eb Kullanici database ile baglanti kurar
    And Eb Kullanici query tanimlar
    And Eb Kullanici randevu bilgilerine ulasir ve kaydeder
    Then Eb Kullanici DB ile randevu bilgilerini "<patientId>", "<Name>","<start_date>" ile dogrular

    Examples:
    |patientId|Name|start_date|
    |159071   |hastaMahmut|2022-08-14 00:00:00|
