@US_018
Feature:US_018 Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  Background: Ortak adimlar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And mnk Admin items&Titles bolumunu secer Physician sekmesini tiklar


  Scenario: TC_001 Admin, doktorlarin bilgilerini gorebilmelidir.

    And mnk Admin tum doktorlarin ilk sayfasini gorur
    And mnk Admin sayfayi kapatir


