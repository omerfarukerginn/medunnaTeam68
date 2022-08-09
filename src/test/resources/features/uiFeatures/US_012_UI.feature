@US_012
Feature: US_012 Doctor test isteyebilmeli


  Scenario: TC_001 Doktor test isteyebilmeli "Request A Test"

    Given Doktor Medunna ana sayfasina gider
    Then Doktor humain giris butonuna basar ve sign in'i tiklar
    And Doktor gecerli username ve password girer
    And Doktor basarili giris yapar ve Welcome to Medunna yazisini gorur
    Then Doktor MY PAGES butonuna tiklar
    And DoktorMy Appointments butonuna tıklar
    And Doktor Edit butonuna tiklar
    And Request A Test butonuna tiklar
    Given Glucose, urea, creatinine, Sodium, Potassium,Total protein, Albumin, Hemoglobin testlerini gorebilmeli

