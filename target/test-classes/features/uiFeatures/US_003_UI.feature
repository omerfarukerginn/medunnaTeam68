@US_003
Feature: Kullanici "Password strength" seviyeleri görülebilmelidir.


  Background:
    Given Kullanici Medunna anasayfasina gider
    When Kullanici Account Menu bolumune tiklar
    Then Kullanici registration sekmesine tiklar

  @US_003_TC_001,TC_002,TC_003,TC_005
  Scenario Outline: Kullanici en az 7 karakterli icerisinde en az 1 kucuk harf, 1 rakam, 1 ozel karakter olan sifreleri
  girer

    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunu dogrular "<strength>"
    And Kullanici sayfayi kapatir

    Examples: test data
      | password   | strength |
      | ebraydT    | 2        |
      | 345678a    | 2        |
      | AYDHTMk    | 2        |
      | ebrayd1    | 2        |
      | ebrayd?    | 2        |
      | ebrayd@    | 2        |
      | ebraydxm!2 | 4        |
      | ebrkB2!    | 5        |
      | ebrkB2@    | 5        |


  @US_003_TC_004 @Bug
  Scenario Outline: Kullanici guclu bir sifre girer ancak ucuncu asama cikmaz
    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici sifrede ucuncu asamanin gelmedigini gorur "<strength>"
    And Kullanici sayfayi kapatir

    Examples: password data
      | password | strength |
      | ebrayd!  | 3        |

  @US_003_TC_006_NegativeTest
  Scenario Outline: TC_001 Kullanici kucuk harflerden olusan en az 7 karakterli bir sifre girer
    And Kullanici New Password kisminda yeni "<password>" girer
    And Kullanici parolanin gucunun degismedigini "<strength>"
    And Kullanici sayfayi kapatir
    Examples: password data
      | password  | strength |
      | ebraydnys | 1        |


