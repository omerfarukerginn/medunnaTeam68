@US_021
Feature:US_021 Staff hastalar icin randevuları gorur

  Background: Ortak adimlar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici staff mahmut olarak giris yapar
    And ofe Staff My Pages sayfasina tiklar
    And ofe Staff Search Patient butonuna tiklar
    And ofe Staff Show Appointments butonuna tiklar
    And ofe Staff Show Appointments ilk sutundaki edit butonuna tiklar

  @US_021_TC_001
  Scenario:US_021_TC_01_Staff sadece randevulari guncelleyebilir.

    And ofe Staff Create or Edit an Appointment sayfasindaki randevu tarih bilgilerini duzenler
    And kullanici 2 sn bekler
    And ofe Save butonuna tiklar
    And kullanici 3 sn bekler
    And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And ofe Sayfayi kapatir


  @US_021_TC_002_01
  Scenario:US_021_TC_02_01_Staff hasta durumunu (status) "UNAPPROVED" yapabilmeli.

    And ofe Staff edit appointment sayfasinda status kismini UNAPPROVED yapar
    And kullanici 4 sn bekler
    And ofe Kullanici sayfayi asagi kaydirir
    And kullanici 2 sn bekler
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And ofe Sayfayi kapatir


  @US_021_TC_002_02
  Scenario:US_021_TC_02_02_Staff hasta durumunu (status) "PENDING" yapabilmeli.

    And ofe Staff edit appointment sayfasinda status kismini PENDING yapar
    And ofe Kullanici sayfayi asagi kaydirir
    And kullanici 2 sn bekler
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And ofe Sayfayi kapatir


  @US_021_TC_002_03
  Scenario:US_021_TC_02_03_Staff hasta durumunu (status) "CANCELLED" yapabilmeli.

    And ofe Staff edit appointment sayfasinda status kismini CANCELLED yapar
    And kullanici 4 sn bekler
    And ofe Kullanici sayfayi asagi kaydirir
    And kullanici 2 sn bekler
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And ofe Sayfayi kapatir


  @US_021_TC_002_04
  Scenario:US_021_TC_02_04_Staff hasta durumunu (status) "COMPLETED" yapamamali.

    And kullanici 2 sn bekler
    And ofe Staff edit appointment sayfasinda status kismini COMPLETED seceneginin secilemedigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir

  @US_021_TC_003
  Scenario:US_021_TC_03_"Staff ""Anamnesis (Hastalik Gecmisi), Treatment ( Tedavi) veya Diagnosis(Teshis)"" kisimlarina girmemeli."

    And ofe Staff Anamnesis,Treatment,Diagnosis kisimlarini doldurur
    And kullanici 2 sn bekler
    And ofe Kullanici sayfayi asagi kaydirir
    And kullanici 2 sn bekler
    And ofe Save butonuna tiklar
    And kullanici 4 sn bekler
    And ofe The Appointment is updated with identifier uyarisinin gorulmedigini onaylar
    And ofe Sayfayi kapatir

  @US_021_TC_004
  Scenario:US_021_TC_04_Hasta icin gerekli doktoru secebilmeli ve randevuyu olusturmali.

    And kullanici 2 sn bekler
    And ofe Kullanici sayfayi asagi kaydirir
    And kullanici 2 sn bekler
    And ofe Staff bir doktor secer
    And kullanici 5 sn bekler
    And ofe Kullanici sayfayi asagi kaydirir
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
    And ofe Sayfayi kapatir