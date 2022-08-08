@US_003
Feature: Kullanici "Password strength" seviyeleri görülebilmelidir.


  Background:
    Given Kullanici Medunna anasayfasina gider
    When Kullanici Account Menu bolumune tiklar
    Then Kullanici registration sekmesine tiklar

  @US_003_TC_001,TC_002,TC_003,TC_004,TC_005 @Bug
  Scenario Outline: Kullanici en az 7 karakterli icerisinde en az 1 kucuk harf, 1 rakam, 1 ozel karakter olan sifreleri
                    girer

    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunu dogrular "<strength>"
    And Kullanici sayfayi kapatir

    Examples: test data
      | password   | strength |
      | qwertyU    | 2        |
      | 123456a    | 2        |
      | ASDFGHq    | 2        |
      | asdfgh1    | 2        |
      | zxcvbn?    | 2        |
      | zxcvbn@    | 2        |
      | asdhgsag?1 | 4        |
      | asdfA1?    | 5        |
      | asdfA1@    | 5        |

    @US_003_TC_001_NegativeTest
    Scenario Outline: TC_001 Kullanici en az 7 karakterli olan sifrenin butun karakterlerini kucuk harf girer
      And Kullanici New Password kisminda yeni "<password>" girer
      And Kullanici parolanin gucunun degismedigini "<strength>"
      And Kullanici sayfayi kapatir
      Examples: password data
        | password   | strength |
        | asdfgkdjs  | 1        |






