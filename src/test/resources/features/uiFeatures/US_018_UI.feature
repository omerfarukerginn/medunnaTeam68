@US_018
Feature:US_018 Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  Background: Ortak adimlar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And mnk Admin items&Titles bolumunu secer Physician sekmesini tiklar


  Scenario: TC_001 Admin, doktorlarin bilgilerini gorebilmelidir.

    And mnk Admin tum doktorlarin ilk sayfasini gorur
    And mnk Admin sayfayi kapatir

  Scenario: TC_002 Admin, SSN kimligine gore kayıtlı bir kisiyi secebilir , arayabilir.

    And mnk Admin Create a new Physician butonuna tiklar
    And mnk Admin SSN kutusuna kayitli bir SSN girer
    And mnk Admin Use Search kutusunu secer
    And mnk Admin Search User butonuna tiklar
    And mnk Admin onay kutusunu gorunur
    And mnk Admin sayfayi kapatir

  Scenario: TC_003 Admin, Doktorların bilgilerini "Edit Butonu" üzerinden düzenleyebilir.

    And mnk Admin kayitli kisinin Edit butonuna tiklar
    And mnk Admin kayitli kisilerin ID sini gorur
    And mnk Admin sayfayi kapatir

  Scenario: TC_004 Kisilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.

    And mnk Admin kayitli kisinin Edit butonuna tiklar
    And mnk Admin kayitli kisinin First Name i degistirir
    And mnk Admin kayitli kisinin Last Name i degistirir
    And mnk Admin kayitli kisinin Birth Date i degistirir
    And mnk Admin Save butonuna tiklar
    And mnk Admin onay kutusunu gorur
    And mnk Admin sayfayi kapatir

  Scenario: TC_005 Admin Doktor icin bir uzmanlık alanı secebilmeli.

    And mnk Admin kayitli kisinin Edit butonuna tiklar
    And mnk Admin kayitli kisinin uzmanligini secer
    And mnk Admin Save butonuna tiklar
    And mnk Admin onay kutusunu gorur
    And mnk Admin sayfayi kapatir

  Scenario: TC_006 Admin, doktorun profil resmini saglayabilir.

    And mnk Admin kayitli kisinin Edit butonuna tiklar
    And mnk Admin kayitli kisinin Profil resmini secer
    And mnk Admin Save butonuna tiklar
    And mnk Admin onay kutusunu gorur
    And mnk Admin sayfayi kapatir

  Scenario: TC_007 Admin, doktorun Muayene ucretini girebilmelidir. (Exam fee)

    And mnk Admin kayitli kisinin Edit butonuna tiklar
    And mnk Admin kayitli kisinin Exam fee lini degistirir
    And mnk Admin Save butonuna tiklar
    And mnk Admin onay kutusunu gorur
    And mnk Admin sayfayi kapatir

  Scenario: TC_008 Admin mevcut kullanıcılar arasından doktoru secmelidir.

    And mnk Admin kayitli kisinin Edit butonuna tiklar
    And mnk Admin kayitli kisinin user ini secer
    And mnk Admin Save butonuna tiklar
    And mnk Admin onay kutusunu gorur
    And mnk Admin sayfayi kapatir

  Scenario:TC_009 Admin mevcut doktorları silebilir.

    And mnk Admin kayitli kisinin Delete butonuna tiklar
    And mnk Admin onay kutusunu gorur

    And mnk BUG
    And mnk Admin sayfayi kapatir



