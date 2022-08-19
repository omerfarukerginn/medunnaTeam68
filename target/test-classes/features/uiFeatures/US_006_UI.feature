@US_006
Feature:US_006 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.


  Background:Ortak adimlar
    Given Kullanici dr ana sayfaya gider
    And Kullanici sign in butonuna basar
    And Kullanici dr username kutusuna gecerli bir username bilgilerini girer
    And Kullanici dr password kutusuna gecerli password bilgilerini girer
    And Kullanici, sag altta bulunan Sign in dugmesine tiklamalidir


  Scenario: Kullanici, bilgiler için kullanici ayarlari sayfasina gider
    Then Kullanici adi ile sayfaya giris yaptigini gorur
    And Sayfayi kapatir


  Scenario: Kullanici bilgileri "firstname, lastname, email " girerken doldurulan kullanici bilgileri olmalıdır
    And Kullanici, bilgiler icin Kullanici ayarlari sayfasina gider
    Then Sayfa icin kullanici ayarlari Ad, soayadi ve E-posta secenekleri gorur
    And Sayfayi kapatir

  Scenario: Positive scenario
    And Kullanici, bilgiler icin Kullanici ayarlari sayfasina gider
    And Kullanici first name guncellenebilir olmali
    And Kullanici last name guncellenebilir olmali
    And Kullanici E-mail guncellenebilir olmali
    And Kullanici save tusuna basar
    Then Sol ustte cikan mesajla yeni bilgilerin kaydedildigini kontrol eder
    And Sayfayi kapatir

  Scenario: Negative scenario-1
    And Kullanici, bilgiler icin Kullanici ayarlari sayfasina gider
    And Kullanici first name kisimi bos birakir
    Then Kullanici, bos first name girerken first name gereklidir metin mesajini gormeli
    And Kullanici last name kisimi bos birakir
    Then  Kullanici, bos last name girerken last name gereklidir metin mesajini gormeli
    And Kullanici E-mail kisimi bos birakir
    Then Kullanici, bos E-Mail girerken E-Mail gereklidir metin mesajini gormeli
    And Sayfayi kapatir


  Scenario Outline: :Negative scenario-2
    And Kullanici, bilgiler icin Kullanici ayarlari sayfasina gider
    And Kullanici first name guncellenebilir olmali
    And Kullanici last name guncellenebilir olmali
    And Kullanici gecersiz bir E-mail girmeli "<email>"
    Then Kullanici, E-Mail girerken gecersiz E-Mail  metin mesajini gormeli
    And Sayfayi kapatir

    Examples:
      | email      |
      | memoli     |
      | memo@gmail |
      | memo.com   |