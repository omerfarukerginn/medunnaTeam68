@US_008
  Feature: US_008 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

    @US_008_TC_001
    Scenario:US_008_TC_001 "New password confirmation" onaylanabilmelidir.

    Given ofe Kullanici test sayfasina gider

    And ofe Kullanici Sign in butonuna tiklar

    And ofe Kullanici bilgileri ile giris yapar

    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar

    And ofe Acilan dropdown sekmesinden Password butonuna tiklar

    And ofe Acilan sayfadaki Current password kismina mevcut sifresini girer

    And ofe New password kismina yeni sifresini girer

    And ofe New password confirmation kismina yeni sifresini tekrar girer

    And ofe The password and its confirmation do not match! uyarisi gorulmedigini onaylar

    And ofe Save butonuna tiklar

    And ofe Password changed! uyarisinin goruldugunu onaylar

    And ofe Sayfayi kapatir












