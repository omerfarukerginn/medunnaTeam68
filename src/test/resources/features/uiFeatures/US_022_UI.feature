@US_022
Feature:US_022 Hasta Test sonuçları (Staff)

  Background:Ortak adimlar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici staff mahmut olarak giris yapar
    And mnk Staff My Pages bolumunu secer
    And mnk Staff Search patient sekmesini secer

  Scenario:TC_001 Kullanici (Staff) hastanin SSN Id ile arama yapabilir.

    And mnk Staff SSN arama kutusuna kayitli SSN girer
    And mnk Staff arama sonuc sayfasini gorur
    And mnk Admin sayfayi kapatir

  Scenario:TC_002 Kullanici (Staff) test sonuclarini gorebilmelidir.

    And mnk Staff Show Appointments kutuusna tiklar
    And mnk Staff Show Test kutusuna tiklar
    And mnk Staff View Results kutusuna tiklar
    And mnk Staff View Results sayfasini gorur
    And mnk Admin sayfayi kapatir

  Scenario:TC_003 Kullanici (Staff) ID, Date, Result, description, Created date, … gibi sonuc bilgilerini gorebilmeli ve guncelleyebilmelidir.

    And mnk Staff Show Appointments kutuusna tiklar
    And mnk Staff Show Test kutusuna tiklar
    And mnk Staff View Results kutusuna tiklar
    And mnk Staff View Results sayfasini gorur
    And mnk Staff Edit kutusuna tiklar
    And mnk Staff Test Result lari gorur ve gunceller
    And mnk Admin sayfayi kapatir












