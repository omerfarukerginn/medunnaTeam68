@US_023
Feature: Fatura (Staff) olusturma ve assert etme

  Background: Ortak adimlar
    Given Kullanici ana sayfaya gider
    Then Kullanici staff mahmut olarak giris yapar
    And staff my pages menusunu tiklar
    And staff search patient buttonunu tiklar
    And staff arama kutusuna SSN ile hastayi arar
    And staff show appointment buttonunu tiklar


  Scenario: Kullanıcı (Staff) fatura olusturabilmeli ve olusturdugu faturanin icerigini test edebilmeli
    Given staff hastanin durumunun completede veya cancelled oldugunu dogrular
    And staff payment invoice buttonunu tiklar
    Then staf muayene ucreti, test urun fiyatlari, bilgilerini goruntuleyebilir
    And staff hasta icin create inovoice tiklayarak fatura olusturur
    And staff olusturdugu faturayi kaydeder
    Then staff basari ile kaydedildi msj i dogrular
   And Sayfayi kapatir

  Scenario: Kullanici olusturdgu faturayi kontrol edebilmeli
    Given staff payment invoice buttonunu tiklar
    And staff showw Invoice butonuna tiklar
    Then staf fatura sayfasini dogrular
    And Sayfayi kapatir






















