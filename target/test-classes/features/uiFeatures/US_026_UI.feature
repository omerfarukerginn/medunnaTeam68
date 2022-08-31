@US_026
Feature:Iletisim Mesaji(Contact messages)

  Background:Ortak adimlar
    Given Kullanici ilgili test sayfasina gider

  @US026_TC001
  Scenario: Herhangi bir kullanici bilgi almak icin Contact portal uzerinden istek gonderebilmeli.
    Then Kullanici contact butonuna tiklar
    And Kullanici name, email, subject ve message kisimlarini doldurur
    And Kullanici send butonuna tiklar
    And Kullanici Your message has been received yazisinin gorunurlugunu test eder

  @US026_TC002
  Scenario: Kullanici Name, Email, Subject, Message bolumlerine data girebilmeli ve mesajini gonderebilmeli
    Given Kullanici hasta mahmut olarak giris yapar
    And 2 saniye beklenir
    And Hasta contact butonuna  tiklar
    And Hasta name, email, subject ve message kisimlarini doldurur
    And Hasta send butonuna tiklar
    And Hasta Your message has been received yazisinin gorunurlugunu test eder
    And su Sayfa kapatilir

  @US026_TC003
  Scenario: Kullanici Name, Email, Subject, Message bolumlerine data girebilmeli ve mesajini gonderebilmeli
    Then Kullanici doktor mahmut olarak giris yapar
    And 2 saniye beklenir
    And Doktor contact butonuna  tiklar
    And Doktor name, email, subject ve message kisimlarini doldurur
    And Doktor send butonuna tiklar
    And Doktor Your message has been received yazisinin gorunurlugunu test eder
    And su Sayfa kapatilir

  @US026_TC004
  Scenario: Kullanici Name, Email, Subject, Message bolumlerine data girebilmeli ve mesajini gonderebilmeli
    Then Kullanici staff mahmut olarak giris yapar
    And 2 saniye beklenir
    And Staff contact butonuna  tiklar
    And Staff name, email, subject ve message kisimlarini doldurur
    And Staff send butonuna tiklar
    And Staff Your message has been received yazisinin gorunurlugunu test eder
    And su Sayfa kapatilir

  @US026_TC005
  Scenario: Kullanici Name, Email, Subject, Message bolumlerine data girebilmeli ve mesajini gonderebilmeli
    Then Kullanici admin olarak giris yapar
    And 2 saniye beklenir
    And Admin contact butonuna  tiklar
    And Admin name, email, subject ve message kisimlarini doldurur
    And Admin send butonuna tiklar
    And Admin Your message has been received yazisinin gorunurlugunu test eder
    And su Sayfa kapatilir









