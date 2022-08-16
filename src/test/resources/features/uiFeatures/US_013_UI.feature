@US_013
Feature:Physician(Doktor) Test Results islemleri yapabilmeli

  Background:Ortak adimlar
    Given Doktor Medunna ana sayfasina gider
    And Doktor humain giris butonuna basar ve sign in'i tiklar
    And Doktor gecerli username ve password girer
    And Doktor basarili giris yapar ve Welcome to Medunna yazisini gorur
    Then Doktor MY PAGES butonuna tiklar
    And DoktorMy Appointments butonuna tıklar
    And Doktor Edit butonuna tiklar

  @US_013_TC_001
  Scenario:Physician (Doktor) "Test Results" işlemleri yapabilmeli
    Given Request A Test butonuna tiklar
    And Doktor Glucose, urea, creatinine, Sodium, Potassium,Total protein, Albumin, Hemoglobin testlerini secer
    And Doktor Save butonuna tiklar
    And Show Test Results butonuna tiklar
    And View Results butonunu tiklar.
    And Doktor  id, name, default max value, default min value, test, description and the date bilgilerini gorur.
    And ofe Sayfayi kapatir

  @US_013_TC_002
  Scenario:Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli
    Given Request Inpatient butonuna tiklar
    And ofe Sayfayi kapatir
