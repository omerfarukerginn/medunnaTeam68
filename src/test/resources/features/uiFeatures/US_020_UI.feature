@US_020
Feature: Admin; "User management" menusunden, kullnici Active eder ve gerekli rolleri olusturur.


  Background: Giris yapmak icin ortak adimlar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And Kullanici User management butonuna tiklar

    @TC001
  Scenario: Admin, kayitli kisilerin "firstname, lastname, email... Gibi bilgilerini gorebilmeli.
    And Kullanici View butonuna tiklar
    And Kullanici First name, lastname, email,language, created by seceneklerinin  gorundugunu dogrular
    And Kullanici sayfayi kapatir

   Scenario:Admin kullanicilari aktive edebilir ve rollerini "ADMIN, USER, PATIENT, STAFF ve PHYSICIAN" olarak atayabilir.
     And Kullanici Edit butonuna tiklar
     And Kullanici  kayitli kisiyi active eder
     And Kullanici kayitli kisiyi Admin olarak secer
     And Kullanici sayfayi kapatir