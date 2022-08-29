@US_015
Feature: Admin tarafindan hasta olusturma ve duzenleme

  Background:Ortak adimlar
    Given Kullanici ana sayfaya gider
    Then Kullanici admin olarak giris yapar
    Then Admin Items&Titles sekmesini tiklar

  @US_015_TC_001 @smokeTest
  Scenario: Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
    Given Admin Patient secenegini secer
    And Admin Create a new Patient butonuna tiklar
    Then Admin hasta bilgilerini girer
    Then Admin save butonuna basar
    And Hasta olusturuldu mesajini gorur
    And Sayfayi kapatir

  @US_015_TC_002
  Scenario: Yönetici hasta bilgilerini gorebilir.
    Given Admin Patient secenegini secer
    And Admin view butonuna basar
    Then Hasta bilgilerinin gorunurlugunu dogrular
    And Sayfayi kapatir

  @US_015_TC_003
  Scenario: Hasta bilgilerinde edit yapilabilmesi
    Given Admin Patient secenegini secer
    And Admin edit butonuna basar
    Then Hasta bilgilerinde degisiklik yapar
    And Edit sonrasi Save butonuna basar
    And Guncelleme yapildi yazisinin gorunurlugunu test eder
    And Sayfayi kapatir

  @US_015_TC_004
  Scenario: Hastaya doktoru sadece Admin atayabilir
    Given Admin Appointments secenegini secer
    And Admin Appointment edit butonuna basar
    Then Herhangi bir doktor atamasi yapar
    And Appointment sonrasi Save butonuna basar
    And Appointment Guncelleme yapildi yazisinin gorunurlugunu test eder
    And Sayfayi kapatir

  @US_015_TC_005 @bug
  Scenario: "State", "US state" olmali ve bos birakilmamali
    Given Admin Patient secenegini secer
    And Admin Create a new Patient butonuna tiklar
    Then Admin hasta bilgilerini girer, State kismini bos birakir
    Then Admin save butonuna basar
    And Hasta olusturuldu mesaji gorulmemeli
    And Sayfayi kapatir

  @US_015_TC_006 @bug
  Scenario: Yönetici herhangi bir hastayı silebilir
    Given Admin Patient secenegini secer
    And Admin Delete butonuna basar
    And Delete Confirm butonuna basar
    Then Delete basarili yazisinin gorunurlugunu test eder
    And Sayfayi kapatir

