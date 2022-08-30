@US_027
Feature:US_027_Messages by Admin Validate with API and DB

  Background:Ortak adimlar

    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And ofe admin item&titles sekmesini acar
    And ofe admin messages butonuna tiklar

    @US_027_TC_01
    Scenario:US_027_TC_01_Admin, mesaj portalina gidebilir ve tum mesajlari, yazarlarini ve e-postalarini goruntuleyebilir.

      And ofe admin messages sayfasindaki ilk view butonuna tiklar
      And ofe admin name, email, message kisimlarinin goruldugunu onaylar
      And kullanici 1 sn bekler
      And ofe Sayfayi kapatir

    @US_027_TC_02
    Scenario:US_027_TC_02_Admin, mesajlari olusturabilir.

      And ofe admin create a new message butonuna tiklar
      And ofe admin yeni mesaj icin ilgili alanlari doldurur
      And kullanici 4 sn bekler
      And ofe Save butonuna tiklar
      And kullanici 2 sn bekler
      And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
      And ofe Sayfayi kapatir

    @US_027_TC_03
    Scenario:US_027_TC_03_Admin, mesajlari guncelleyebilir.

      And ofe admin messages sayfasindaki ilk edit butonuna tiklar
      And ofe admin yeni mesaj icin ilgili alanlari doldurur
      And kullanici 4 sn bekler
      And ofe Save butonuna tiklar
      And kullanici 2 sn bekler
      And ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar
      And ofe Sayfayi kapatir

    @US_027_TC_04
    Scenario: US_027_TC_04_Admin, mesajlari silebilir.

      And ofe admin messages sayfasindaki ilk delete butonuna tiklar
      And kullanici 3 sn bekler
      And ofe admin acilan popup da delete butonunun tiklanabilir oldugunu onaylar
      And ofe Sayfayi kapatir



