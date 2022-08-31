@US_019




Feature:US_019 Admin olarak;
  Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme

  Background: Ortak kullanim
    Given Kullanici ilgili test sayfasina gider



  @US019_TC0001
  Scenario Outline: Yeni bir kullanici icin tum bilgiler

  Given Hesap Menusu isaretine tiklayin ve Register dugmesine tiklayin
    And Yeni bir kullanici icin tum bilgileri dolduru tiklatin "<stssn>","<stfirstname>","<stlastname>","<stusername>","<stemail>","<stnewpassword>","<stpasswordconfirm>"

    Examples:
     | stssn       | stfirstname | stlastname   | stusername     | stemail                  | stnewpassword | stpasswordconfirm |
     | 456-67-0967 | staff       | neleroluyor | staffAligelmez | stfneleroluyor@gmail.com | 227785.o      | 227785.o          |

  @US019_TC001

  Scenario: Admin SSN kullanarak; kayıtlı kişiler arasında Staff arayabilir.

    Then Kullanici admin olarak giris yapar
    And Kullanici Items&Titles sekmesini tiklar
    And Kullanici Staff sekmesini tiklar
    And Kullanici +Create a new Staff butonunu tiklar
    And Kullanici Use Search kutucugunu isaretler
    And Kullanici SSN kutusuna kayitli Staff SNN numarasi girer
    And Kullanici Search User butonunu tiklar
    And Kullanici staf in adini dogrular
    Then Kullanici Sayfayi kapatir

  @US019_TC002
  Scenario:Tüm bilgileri doldurulmalıdır

    Then Kullanici admin olarak giris yapar
    And Kullanici Items&Titles sekmesini tiklar
    And Kullanici Staff sekmesini tiklar
    And Kullanici +Create a new Staff butonunu tiklar
    And Kullanici Use Search kutucugunu isaretler
    And Kullanici SSN kutusuna kayitli Staff SNN numarasi girer
    And Kullanici Search User butonunu tiklar
    And Kullanici Phone Adress Description Country State City kutularini doldurur
    And Kullanici kaydedildigini onaylar
    Then Kullanici Sayfayi kapatir


  @US019_TC003
  Scenario:Admin kayıtlı kişilerden bir kullanıcı seçebilir.

    Then Kullanici admin olarak giris yapar
    And Kullanici Items&Titles sekmesini tiklar
    And Kullanici Staff sekmesini tiklar
    And Kullanici Kayitli kisi listesinden kayitli bir Staff'in View Butonunu tiklar
    Then Kullanici Sayfayi kapatir


  @US019_TC004
  Scenario:Admin kullanıcı bilgilerini düzenleyebilir.

    Then Kullanici admin olarak giris yapar
    And Kullanici Items&Titles sekmesini tiklar
    And Kullanici Staff sekmesini tiklar

    And Kullanici Kayitli kisi listesinden kayitli bir Staff'in Edit Butonunu tiklar
    And Kullanici Phone kutusunda degisiklik yapar
    And Kullanici Adress kutusunda degisiklik yapar
    And Kullanici Description kutusunda degisiklik yapar
    And Kullanici Country kutusunda degisiklik yapar
    And Kullanici StateCity kutusunda degisiklik yapar
    And Kullanici Save butonu tiklar ve dogrular
    Then Kullanici Sayfayi kapatir


  @US019_TC005
  Scenario:Admin kullanıcı bilgilerini silebilir.
   When Kullanici admin olarak giris yapar
    And Kullanici Items&Titles sekmesini tiklar
    And Kullanici Staff sekmesini tiklar
    And Kullanici Staffi bulur ve Staff Sayfasindan delete dugmesini tiklar
    Then Kullanici Sayfayi kapatir








