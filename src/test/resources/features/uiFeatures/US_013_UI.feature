@US_013

Feature: Physician (Doktor) "Test Results" işlemleri yapabilmeli
  (My Appointments / Edit / Test Results)

  @Background: Ortak kullanim
    Given Doktor Medunna ana sayfasina gider
    And Doktor humain giris butonuna basar ve sign in'i tiklar
    And Doktor gecerli username ve password girer
    And Doktor basarili giris yapar ve Welcome to Medunna yazisini gorur
    Then Doktor MY PAGES butonuna tiklar
    And DoktorMy Appointments butonuna tıklar
    And Doktor Edit butonuna tiklar

  @US_013_TC_001
  Scenario: Physician (Doktor) "Test Results" işlemleri yapabilmeli

     Request A Test butonuna tiklar
    And Doktor Glucose, urea, creatinine, Sodium, Potassium,Total protein, Albumin, Hemoglobin testlerini secer
    And Save butonuna tiklar
    And Show Test Results butonuna tiklar
    And View Results butonunu tiklar
    And Doktor  id, name, default max value, default min value, test, description and the date bilgilerini gorur


  @US_013_TC_002
  Scenario: Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli

    Given Request Inpatient butonuna tiklar

