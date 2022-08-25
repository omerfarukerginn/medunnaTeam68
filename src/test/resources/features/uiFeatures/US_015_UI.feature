@US_015
Feature: Admin tarafindan hasta olusturma ve duzenleme

  Background:Ortak adimlar
    Given Kullanici ana sayfaya gider
    Then Kullanici admin olarak giris yapar
    Then Admin Items&Titles sekmesini tiklar


  Scenario: Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
    Given Admin Patient secenegini secer
    And Admin Create a new Patient butonuna tiklar
    Then Admin hasta bilgilerini girer
    Then Admin save butonuna basar
    And Hasta olusturuldu mesajini gorur
    And Sayfayi kapatir

  Scenario: Yönetici hasta bilgilerini gorebilir.
    Given Admin Patient secenegini secer
    And Admin view butonuna basar
    Then Hasta bilgilerinin gorunurlugunu dogrular
    And Sayfayi kapatir