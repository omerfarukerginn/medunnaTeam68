@US_004
Feature: US_004 Giris sayfasi yalnızca gecerli kimlik bilgileriyle erisilebilir olmalidir.

  Background: ortak adimlar
    Given Kullanici ana sayfaya gider
    Then Kullanici login butonuna tiklar
    And Kullanici Sing in secenegini secer

  Scenario: TC_001 Giris yapmak icin basari mesajini dogrulayan, gecerli bir kullanici adi ve sifre olmalidir.

  And Kullanici username kutusuna gecerli bir username bilgilerini girer
  And Kullanici password kutusuna gecerli password bilgilerini girer
  And Kullanici Sign in butonuna tiklar.
  And Kullanici kayit ismini gorur
  And Kullanici sayfayi kapatir

  Scenario: TC_002 Kullanicinin mevcut kimlik bilgilerini her zaman kullanabilecegi bir beni hatirla secenegi olmalidir

  And Kullanici username kutusuna gecerli bir username bilgilerini girer
  And Kullanici password kutusuna gecerli password bilgilerini girer
  And Kullanici Beni Hatirla secenegini secebilmeli
  And Kullanici Sign in butonuna tiklar.
  And Kullanici sayfayi kapatir

  Scenario: TC_003 Eger sifre unutulursa diye Did you forget your password? secenegi olmali

  And Kullanici Did you forget your password? secenegine tiklar
  And Kullanici sifre sifirlama sayfasini gorur
  And Kullanici sayfayi kapatir

  Scenario: TC_004 You don't have an account yet? Register a new account secenegi olmali

  And Kullanici You don't have an account yet? Register a new account secenegine tiklar
  And Kullanici Registration sayfasini gorur
  And Kullanici sayfayi kapatir

  Scenario: TC_005 Cancel secenegi olmali

  And Kullanici Cancel secenegini gorur
  And Kullanici sayfayi kapatir