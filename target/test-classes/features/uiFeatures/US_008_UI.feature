@US_008
Feature: US_008 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

  @US_008_TC_001
  Scenario Outline:US_008_TC_001 "New password confirmation" onaylanabilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "<currentPassword>" mevcut sifresini girer
    And ofe New password kismina "<newPassword>" yeni sifresini girer
    And ofe New password confirmation kismina yeni "<newPassword2>" sifresini tekrar girer
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Password changed! uyarisinin goruldugunu onaylar
    And ofe Sayfayi kapatir

    Examples:
      | currentPassword | newPassword | newPassword2 |
      | hastakaan1      | Hastakaan1  | Hastakaan1   |
      | Hastakaan1      | hastakaan1  | hastakaan1   |


  @US_008_TC_002
  Scenario: US_008_TC_002 Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:"
  seviyesinin değiştiği görülebilmelidir

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "hastakaan1" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "Hastakaan" yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir


  @US_008_TC_003
  Scenario: US_008_TC_003 Şifre en az 1 büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "hastakaan1" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "Hastakaan" yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir


  @US_008_TC_004
  Scenario: US_008_TC_004 Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "hastakaan1" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastakaan2" yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir


  @US_008_TC_005
  Scenario: US_008_TC_005 Şifre en az 1 özel karakter içermeli ve"Password strength:" seviyesinin değiştiği görülebilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "hastakaan1" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastakaan." yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir


  @US_008_TC_006
  Scenario: US_008_TC_006 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "hastakaan1" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastaK1" yeni sifresini girer
    And ofe kullanici password strength seviyesinin daha guclu oldugunu onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir


  @US_008_TC_007
  Scenario: US_008_TC_007 Eski şifre kullanılmamalıdır.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini girer
    And ofe Kullanici password kısmına "hastakaan1" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastakaan1" eski sifresini girer
    And ofe New password confirmation kismina eski "hastakaan1" sifresini tekrar girer
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Password changed! uyarisinin gorulmedigini onaylar
    And ofe Sayfayi kapatir








