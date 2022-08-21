@US_019




Feature:US_019 Admin olarak;
  Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme

  Background: Ortak kullanim
    Given Kullanici Medunna  Adresine erisebilmeli
    And Kullanici Account  butonu tiklar
    And Kullanici Sign In registration sekmesine tiklar
    And Kullanici gecerli bir Username ve Password girer
    And Kullanici Sing In sekmesini tiklar
    And Kullanici Items&Titles sekmesini tiklar
    And Kullanici Staff sekmesini tiklar
    And Kullanici +Create a new Staff butonunu tiklar
    And Kullanici Use Search kutucugunu isaretler
    And Kullanici SSN kutusuna kayitli Staff SNN numarasi girer
    And Kullanici Search User butonunu tiklar
    And Kullanici Phone Adress Description Country State City kutularini doldurur
    And Kullanici SAVE butonunu tiklar


  @US019_TC001
  Scenario: Admin SSN kullanarak; kayıtlı kişiler arasında Staff arayabilir.

    And Kullanici aranan staff in adini yazdirir
    And Kulanici Sayfayi kapatir


  @US019_TC002
  Scenario:Tüm bilgileri doldurulmalıdır

    And Kullanici SAVE butonunu tiklar
    And Kulanici Sayfayi kapatir


  @US019_TC003
  Scenario:Admin kayıtlı kişilerden bir kullanıcı seçebilir.

    And Kullanici Kayitli kisi listesinden kayitli bir Staff'in View Butonunu tiklar
    And Kulanici Sayfayi kapatir


  @US019_TC004
  Scenario:Admin kullanıcı bilgilerini düzenleyebilir.

    And Kullanici Phone kutusunda degisiklik yapar
    And Kullanici Adress kutusunda degisiklik yapar
    And Kullanici Description kutusunda degisiklik yapar
    And Kullanici Country kutusunda degisiklik yapar
    And Kullanici StateCity kutusunda degisiklik yapar
    And Kulanici Sayfayi kapatir


  @US019_TC005
  Scenario:Admin kullanıcı bilgilerini silebilir.


  And Kullanici Adress kutusunu siler
  And Kullanici Description kutusunu siler
    And Kulanici Sayfayi kapatir








