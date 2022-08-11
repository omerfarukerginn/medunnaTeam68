@US_007
Feature: US_007_TC_001 Kullanıcı geçerli tarih girmelidir ve randevusunu gormelidir.

  Background: Eb Kullanici hasta bolumunde randevu sayfasina gider
    Given Eb Kullanici/hasta Medunna adresine gider
    When Eb Kullanici Account Menu ikonuna tiklar
    Then Eb Kullanici Sign In sekmesine tiklar
    And Eb Kullanici username bolumune UserName yazar
    And Eb Kullanici Password kismina Password girer
    And Eb Kullanici Sign in butonuna tiklar
    And Eb Kullanici MyPages sekmesine tiklar

  @TEST_MED-140
  Scenario: Eb Kullanici guncel veya gelelcekten bir tarih secer
    And Eb Kullanici Make An Appointment sekmesine tiklar
    And Eb Kullanici FirstName bolumune ismini girer
    And Eb Kullanici LastName bolumune soy ismini girer
    And Eb Kullanici SSN bolumune gecerli bir SSN girer
    And Eb Kullanici email bolumune email girer
    And Eb Kullanici Phone bolumune gecerli bir tel nosu girer
    And Eb Kullanici date bolumunde guncel veya gelecekten bir tarih secer
    And Eb Kullanici "Send an Appointment Request" butonuna tıklar
    And Eb Kullanici Randevu tarihi olusturuldugunu kontrol eder ("Appoinment registration saved" yazısı görünür olmalı)
    Then Kullanici sayfayi kapatir

  @TEST_MED-141
  Scenario: Eb Kullanici tarih formatini dogrular
    And Eb Kullanici MyAppointment secenegini secer
    And Eb Kullanici tarih'in gun/ay/yil seklinde oldugunu dogrular
    Then Kullanici sayfayi kapatir


  @TEST_MED-142
  Scenario: Eb Kullanici gecmis tarihli bir gun secer
    And Eb Kullanici Make An Appointment sekmesine tiklar
    And Eb Kullanici FirstName bolumune ismini girer
    And Eb Kullanici LastName bolumune soy ismini girer
    And Eb Kullanici SSN bolumune gecerli bir SSN girer
    And Eb Kullanici email bolumune email girer
    And Eb Kullanici Phone bolumune gecerli bir tel nosu girer
    And Eb Kullanici date bolumunde gecmis tarih secer
    And Eb Kullanici gecmis tarihten gun secemedigini dogrular
    Then Kullanici sayfayi kapatir
