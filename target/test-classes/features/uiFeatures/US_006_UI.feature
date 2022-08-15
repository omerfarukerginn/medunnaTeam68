@US_006
Feature:US_006 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.


  Background:Ortak adimlar
    Given Kullanıci ana sayfaya gider
    And Kullanıcı sign in butonuna basar
    And Kullanıcı username kutusuna gecerli bir username bilgilerini girer
    And Kullanıcı password kutusuna gecerli password bilgilerini girer
    And Kullanıcı, sağ altta bulunan Sign in düğmesine tıklamalıdır


  Scenario: Kullanıcı, bilgiler için Kullanıcı ayarları sayfasina gider
    Then Kullanici adi ile sayfaya giris yaptigini gorur
    And Sayfayi kapatir


  Scenario: Kullanıcı bilgileri "firstname, lastname, email " girerken doldurulan kullanıcı bilgileri olmalıdır.
    And Kullanıcı, bilgiler için Kullanıcı ayarları sayfasini gider
    Then Sayfa için kullanıcı ayarları Ad, Soyadı ve E-posta seçeneklerini gorur
    And Sayfayi kapatir

  Scenario: Positive scenario
    And Kullanıcı, bilgiler için Kullanıcı ayarları sayfasini gider
    And Kullanici first name guncellenebilir olmali
    And Kullanici last name guncellenebilir olmali
    And Kullanici E-mail guncellenebilir olmali
    And Kullanici save tusuna basar
    Then Sol ustte cikan mesajla yeni bilgilerin kaydedildiginini kontrol eder
    And Sayfayi kapatir

  Scenario: Negative scenario-1
    And Kullanıcı, bilgiler için Kullanıcı ayarları sayfasini gider
    And Kullanici first name kisimi bos birakir
    Then Kullanıcı, bos first name girerken first name gereklidir metin mesajını görmeli
    And Kullanici last name kisimi bos birakir
    Then  Kullanıcı, boslast name girerken last name gereklidir metin mesajını görmeli
    And Kullanici E-mail kisimi bos birakir
    Then Kullanıcı, bos E-Mail girerken E-Mail gereklidir metin mesajını görmeli
    And Sayfayi kapatir



  Scenario Outline: :Negative scenario-2
    And Kullanıcı, bilgiler için Kullanıcı ayarları sayfasini gider
    And Kullanici first name guncellenebilir olmali
    And Kullanici last name guncellenebilir olmali
    And Kullanici gecersiz bir E-mail girmeli "<email>"
    Then Kullanıcı, E-Mail girerken gecersiz E-Mail  metin mesajını görmeli
    And Sayfayi kapatir

    Examples:
      | email      |
      | memoli       |
      | memo@gmail |
      | memo.com   |