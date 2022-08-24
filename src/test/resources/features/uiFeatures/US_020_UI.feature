@US_020
Feature: Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini gorebilmeli.


  Scenario:
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And Kullanici User management butonuna tiklar
    And Kullanici View butonuna tiklar
    And Kullanici First name, lastname, email,language, created by seceneklerinin  gorundugunu dogrular
    And Kullanici sayfayi kapatir
