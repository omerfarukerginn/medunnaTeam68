@API_028
Feature: US_028_APITest

  @API_028_001
  Scenario: Kullanici, API kullanarak ulkeleri dogrular
    Given zll Kullanici set the Base Url
    And zll Send the GET request and get the response
    And zll Set the expected data
    Then zll Make validation

  @API_028_002
  Scenario: Kullanici, API kullanarak ulkeleri gunceller
    Given Kullanici, ulke guncellemesi icin beklenen verileri girer
    And Kullanici, ulke guncellemesi icin istek gonderir ve yanit alir
    And Kullanici, ulke guncellemesi icin tum API bilgilerini kaydeder
    Then Kullanici, ulke guncellemesi icin API kayitlarini dogrular

  @API_028_003
  Scenario: Kullanici, API kullanarak sehirleri dogrular
    Given Kullanici Base Url i olusturur
    And Kullanici post istegini gonderir ve yanitini alir
    Then Kullanici APi kayitlarini dogrular




