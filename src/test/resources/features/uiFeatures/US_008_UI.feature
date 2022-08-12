@US_008
  Feature: US_008 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

    @US_008_TC_001
    Scenario Outline:US_008_TC_001 "New password confirmation" onaylanabilmelidir.

    Given ofe Kullanici test sayfasina gider

    And ofe Kullanici Sign in butonuna tiklar

    And ofe Kullanici bilgileri ile giris yapar

    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar

    And ofe Acilan dropdown sekmesinden Password butonuna tiklar

    And ofe Acilan sayfadaki Current password kismina "<currentPassword>" mevcut sifresini girer

    And ofe New password kismina "<newPassword>" yeni sifresini girer

    And ofe New password confirmation kismina yeni "<newPassword2>" sifresini tekrar girer

    And ofe Save butonuna tiklar

    And ofe Password changed! uyarisinin goruldugunu onaylar

    And ofe Sayfayi kapatir

      Examples:
      |currentPassword|newPassword|newPassword2|
      |hastakaan1     |Hastakaan1 |Hastakaan1  |
      |Hastakaan1     |hastakaan1 |hastakaan1  |













