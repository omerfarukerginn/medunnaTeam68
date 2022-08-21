Feature: Medunna login

  Scenario: Kullanici giris yapar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giriş yapar
    Then Kullanici staff mahmut olarak giriş yapar
    Then Kullanici doktor mahmut olarak giriş yapar
    Then Kullanici hasta mahmut olarak giris yapar