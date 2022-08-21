@US_020
Feature: Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini gorebilmeli.

  Background: Kullanilacak ortak adimlar
    Given Eb Kullanici Medunna adresine gider
    When Eb Kullanici Account Menu ikonuna tiklar
    Then Eb Kullanici Sign in sekmesine tiklar
    And Eb Kullanici username bolumune UserName yazar
    And Eb Kullanici Password kismina Password girer
    And Eb Kullanici Sign in butonuna tiklar
    And Kullanici User management butonuna tiklar

  Scenario:
    And Kullanici View butonuna tiklar
    And Kullanici First name, lastname, email,language, created by seceneklerinin  gorundugunu dogrular
    And Kullanici sayfayi kapatir
