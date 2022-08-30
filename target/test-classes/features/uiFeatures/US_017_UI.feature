@US_017
Feature:US_017 Test items(oge) olustur/Guncelle/Sil

  Background:Ortak adimlar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And Items&Titles sekmesine tiklanir
    And Test Item secilir

  @US017_TC001
  Scenario:TC_001 Admin yeni test ogeleri olusturabilir
  Then Create a New Test Item butonuna tiklanir
  And Name,Description,Price,Default Min. Value,Default Max. Value,Created Date kisimlari doldurulur
  And Save butonuna tiklanir
  And Kullanici dogrulama yazisinin gorunurlugunu test eder
  And su Sayfa kapatilir

  @US017_TC002
  Scenario:TC_002 Admin,test items; Name, Description, price Default min value, Default max value ve
  created date (Gun/Ay/Yil) olusturabilir ve guncelleyebilir.
  Then Edit butonuna tiklanir
  And Name,Description,Price,Default Min. Value,Default Max. Value,Created Date kisimlari guncellenir
  And Save butonuna tekrar tiklanir
  And Kullanici dogrulama yazisinin gorunurlugunu test eder
  And su Sayfa kapatilir


  @US017_TC003
  Scenario:TC_003 Admin test ogelerini goruntuleyebilir.
  Then View butonuna tiklanir
  And Test ogelerinin goruntulendigi dogrulanir
  And su Sayfa kapatilir

  @US017_TC004
  Scenario:TC_004 Admin test ogelerini silebilir.
  Then Delete butonuna tiklanir
  And Kullanici dogrulama yazisinin gorunurlugunu test eder
  And su Sayfa kapatilir
