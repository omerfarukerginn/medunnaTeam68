@US_008
Feature: US_008 Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir.

  @US_008_TC_001
  Scenario Outline:US_008_TC_001 "New password confirmation" onaylanabilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kismina "<currentPassword>" girer
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
      | userName    | currentPassword | newPassword  | newPassword2 |
      | hastakaan1  | hastakaan1      | Hastakaan1   | Hastakaan1   |
      | hastakaan1  | Hastakaan1      | hastakaan1   | hastakaan1   |
      | doktorkamil | doktorkamil1    | Doktorkamil1 | Doktorkamil1 |
      | doktorkamil | Doktorkamil1    | doktorkamil1 | doktorkamil1 |
      | staffnecmi  | staffnecmi1     | Staffnecmi1  | Staffnecmi1  |
      | staffnecmi  | Staffnecmi1     | staffnecmi1  | staffnecmi1  |


  @US_008_TC_002
  Scenario Outline: US_008_TC_002 Daha guclu sifre icin en az 1 kucuk harf olmali ve "Password strength:"
  seviyesinin degistigi gorulebilmelidir

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "Hastakaan" yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | hastakaan1  | hastakaan1      |
      | doktorkamil | doktorkamil1    |
      | staffnecmi  | staffnecmi1     |


  @US_008_TC_003
  Scenario Outline: US_008_TC_003 Sifre en az 1 buyuk harf icermeli ve "Password strength:" seviyesinin degistiği gorulebilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "Hastakaan" yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | hastakaan1  | hastakaan1      |
      | doktorkamil | doktorkamil1    |
      | staffnecmi  | staffnecmi1     |


  @US_008_TC_004
  Scenario Outline: US_008_TC_004 Sifre en az 1 rakam icermeli ve "Password strength:" seviyesinin degistigi gorulebilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastakaan2" yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | hastakaan1  | hastakaan1      |
      | doktorkamil | doktorkamil1    |
      | staffnecmi  | staffnecmi1     |

  @US_008_TC_005
  Scenario Outline: US_008_TC_005 Sifre en az 1 ozel karakter icermeli ve"Password strength:" seviyesinin degistigi gorulebilmelidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastakaan." yeni sifresini girer
    And ofe kullanici password strength seviyesini degistirdigini onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | hastakaan1  | hastakaan1      |
      | doktorkamil | doktorkamil1    |
      | staffnecmi  | staffnecmi1     |

  @US_008_TC_006
  Scenario Outline: US_008_TC_006 Guclu bir parola icin sifre en az 7 karakterden olusmalidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "hastakaan1" mevcut sifresini girer
    And ofe New password kismina "hastaK1" yeni sifresini girer
    And ofe kullanici password strength seviyesinin daha guclu oldugunu onaylar
    And kullanici 2 sn bekler
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | hastakaan1  | hastakaan1      |
      | doktorkamil | doktorkamil1    |
      | staffnecmi  | staffnecmi1     |

  @US_008_TC_007 @US_008_TC_007_Test01
  Scenario Outline: US_008_TC_007_Test01 Eski sifre kullanilmamalidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "<currentPassword>" mevcut sifresini girer
    And ofe New password kismina "<currentPassword>" eski sifresini girer
    And ofe New password confirmation kismina eski "<currentPassword>" sifresini tekrar girer
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Password changed! uyarisinin gorulmedigini onaylar
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | hastakaan1  | hastakaan1      |


  @US_008_TC_007 @US_008_TC_007_Test02
  Scenario Outline: US_008_TC_007_Test02 Eski sifre kullanilmamalidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "<currentPassword>" mevcut sifresini girer
    And ofe New password kismina "<currentPassword>" eski sifresini girer
    And ofe New password confirmation kismina eski "<currentPassword>" sifresini tekrar girer
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Password changed! uyarisinin gorulmedigini onaylar
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | doktorkamil | doktorkamil1    |


  @US_008_TC_007 @US_008_TC_007_Test03
  Scenario Outline: US_008_TC_007_Test03 Eski sifre kullanilmamalidir.

    Given ofe Kullanici test sayfasina gider
    And ofe Kullanici Sign in butonuna tiklar
    And ofe Kullanici kullanici ismini "<userName>" girer
    And ofe Kullanici password kısmına "<currentPassword>" girer
    And ofe Kullanici giris yapmak icin sign in butonuna tiklar
    And ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar
    And ofe Acilan dropdown sekmesinden Password butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Acilan sayfadaki Current password kismina "<currentPassword>" mevcut sifresini girer
    And ofe New password kismina "<currentPassword>" eski sifresini girer
    And ofe New password confirmation kismina eski "<currentPassword>" sifresini tekrar girer
    And ofe Save butonuna tiklar
    And kullanici 2 sn bekler
    And ofe Password changed! uyarisinin gorulmedigini onaylar
    And ofe Sayfayi kapatir

    Examples:
      | userName    | currentPassword |
      | staffnecmi  | staffnecmi1     |







