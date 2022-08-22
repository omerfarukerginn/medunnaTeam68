Feature: Medunna login

  Scenario: Kullanici giris yapar
    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    Then Kullanici staff mahmut olarak giris yapar
    Then Kullanici doktor mahmut olarak giris yapar
    Then Kullanici hasta mahmut olarak giris yapar