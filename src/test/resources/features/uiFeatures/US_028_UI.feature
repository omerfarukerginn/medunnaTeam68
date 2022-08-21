@US_028
Feature:Admin olarak; Country oluşturabilmeli / Okumayabilmeli ve Silebilmeli

  Background:Ortak adimlar
    Given Kullanici Medunna sayfasina gider
    And Kullanici humain giris butonuna basar ve Sing In butonunu tiklar
    And Kullanici gecerli username ve password girer
    And Kullanici basarili giris yapar ve Welcome to Medunna yazisini gorur
    And Kullanici Items&Titles butonunu tiklar

  @US_028_TC_001
  Scenario:Kullanıcı yeni bir ülke oluşturabilmeli
    Given Kullanici Items&Titles butonunu tiklar
    And Kullanici Country butonunu secer
    And Kullanici Create a new Country butonunu tiklar
    Then Kullanici gecerli ulke ismini yazar
    And Kullanici tarih ve saat girer.
    And Kullanici Save butonunu tiklar
    And Kullanici sayfayi kapatir

  @US_028_TC_002
  Scenario:Kullanıcı, ülkeye göre ilgili eyaletler veya şehirler oluşturabilmeli
    Given Kullanici Items&Titles butonunu tiklar
    And Kullanici State City butonunu secer
    And Kullanici Create a new State City butonunu tiklar
    And Kullanici gecerli eyalet sehir ismini yazar
    Then Kullanici tarih ve saat girer.
    And Kullanici gecerli ulke ismini secer
    And Kullanici Save butonunu tiklar
    And Kullanici sayfayi kapatir


  @US_028_TC_003
  Scenario:Kullanıcı ülkeleri silebilmeli
    Given Kullanici Country butonunu secer
    And Kullanici sectigi ulkenin delete butonuna tiklar
    And Kullanici Confirm delete operation ekranini gorur ve delete i tiklar
    And Kullanici sayfayi kapatir