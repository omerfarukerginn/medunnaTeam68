@US_018
Feature:US_018 Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  Background: Ortak adimlar
    Given mnk Admin "medunna_url" anasayfasina gider
    Then mnk Admin login menusunu secer
    And mnk Admin Sing in islemini secer
    And mnk Admin username kutusuna admin ismini girer
    And mnk Admin password kutusuna admin sifresini girer
    And mnk Admin Sing in butonuna tiklar
    And mnk Admin items&Titles bolumunu secer Physician sekmesini tiklar


  Scenario: TC_001 Admin, doktorlarin bilgilerini gorebilmelidir.
    And mnk Admin tum doktorlarin ilk sayfasini gorur
    And mnk Admin sayfayi kapatir


