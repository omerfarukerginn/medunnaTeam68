@US_024
Feature: Hasta kendi raporlarini gorebilmeli

  Background:Ortak adimlar
    Given Kullanici ana sayfaya gider
    And Kullanici sign in butonuna basar
    And Kullanici hasta olarak giris yapar
    And hasta my pages buttonunu tiklar
    Then kullanici 2 sn bekler
    And hasta my appointment buttonunu tiklar


  Scenario:Hasta hesabına girdiğinde test sonuçlarını görebilmelidir
    Given hasta show tests butonuna tiklar
    Then kullanici 2 sn bekler
    And hasta view results tests butonuna tiklar
    Then hasta id name default min value default max value date description bolumlerini gorur
    And Sayfayi kapatir

  Scenario:Hasta hesabına girdiğinde faturasini görebilmelidir
    Given hasta show inivoice butonuna tiklar
    Given  hasta fatura bilgilerini goruntuler
    And Sayfayi kapatir