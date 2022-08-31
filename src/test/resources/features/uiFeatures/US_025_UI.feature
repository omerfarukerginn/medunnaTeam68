@US_025
Feature: Kullanici hasta portalindan randevu alabilmeli

  Background: Kullanici hasta ilgili portala giris yapar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici hasta mahmut olarak giris yapar

  Scenario: Kullanici hasta gerekli bilgileri girer
    And Eb Kullanici FirstName bolumune ismini girer
    And Eb Kullanici LastName bolumune soy ismini girer
    And Eb Kullanici SSN bolumune gecerli bir SSN girer
    And Eb Kullanici email bolumune email girer
    And Eb Kullanici Phone bolumune gecerli bir tel nosu girer
    And Eb Kullanici date bolumunde guncel bir tarih secer
    And Eb Kullanici Send an Appointment Request butonuna tiklar
    And Eb Kullanici Randevu tarihi olusturuldugunu kontrol eder (Appoinment registration saved yazisi gorunur olmali)
    Then Kullanici sayfayi kapatir

  Scenario: Kullanici hasta gerekli bilgileri girer
    And Eb Kullanici FirstName bolumune ismini girer
    And Eb Kullanici LastName bolumune soy ismini girer
    And Eb Kullanici SSN bolumune gecerli bir SSN girer
    And Eb Kullanici email bolumune email girer
    And Eb Kullanici Phone bolumune gecerli bir tel nosu girer
    And Eb Kullanici date bolumunde gecmis tarih secer
    And Eb Kullanici gecmis tarihten gun secemedigini dogrular
    Then Kullanici sayfayi kapatir

  Scenario: Kullanıcı hasta tarih formatının istenen sekilde oldugunu dogrular
    And Eb Kullanici MyPages sekmesine tiklar
    And Eb Kullanici MyAppointment secenegini secer
    And Eb Kullanici tarihin formatini dogrular
    Then Kullanici sayfayi kapatir