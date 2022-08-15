@US_009

Feature: US009 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.

  Background:
    Given Kullanici "medunna_url" adresine gider
    Then Insan figurune tiklar
    And Sign in secenegini secer
    And Staff olarak username ve password girer
    Then Sign in butonuna tiklar

  @US_009_TC_001
  Scenario: TC_001 Staff "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
    And MY PAGES sekmesine tiklar
    And Search Patient secenegini secer
    Then Patients yazisi ile listenin gorunurlugunu test eder
<<<<<<< HEAD
=======
    Then Sayfayi kapatir
>>>>>>> refs/remotes/origin/main

  @US_009_TC_002
  Scenario Outline: TC_002 Kullanıcı bütün hasta bilgilerini düzenleyebilmelidir.
    And MY PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patient SSN kutusuna "<SSN>" girer
    And Edit butonuna tiklar
    And Staff hasta bilgilerinde duzenleme yapar
    And Save butonuna tiklar
    And Dogrulama gozlemlenir
<<<<<<< HEAD

=======
    Then Sayfayi kapatir
    Examples:
      | SSN         |
      | 668-83-4231 |

  @US_009_TC_003
    Scenario Outline: TC_03 Staff hastanin tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
      And MY PAGES sekmesine tiklar
      And Search Patient secenegini secer
      And Patient SSN kutusuna "<SSN>" girer
      And Edit butonuna tiklar
      And Hasta bilgilerinin dolduruldugunu dogrular
      Then Sayfayi kapatir
      Examples:
        | SSN         |
        | 668-83-4231 |

  @US_009_TC_004
  Scenario Outline: TC_04 Staff, hastaları SSN kimliklerine göre arayabilir.
    And MY PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patient SSN kutusuna "<SSN>" girer
    Then Kullanici ilgili hastanin goruldugunu test eder
    Then Sayfayi kapatir
    Examples:
      | SSN         |
      | 668-83-4231 |

  @US_009_TC_005
  Scenario Outline: TC_05 Staff hastaları silememeli.
    And MY PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patient SSN kutusuna "<SSN>" girer
    And Edit butonuna tiklar
    Then Hasta id'sinin silinemedigini test eder
    Then Sayfayi kapatir
>>>>>>> refs/remotes/origin/main
    Examples:
      | SSN         |
      | 668-83-4231 |

<<<<<<< HEAD
=======
  @US_009_TC_006 @Bug
  Scenario Outline: TC_06 Staff hasta bilgilerini silebilmeli
    And MY PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patient SSN kutusuna "<SSN>" girer
    And Edit butonuna tiklar
    Then Herhangi bir hasta bilgisini silebildigini test eder
    Then Sayfayi kapatir

    Examples:
      | SSN         |
      | 134-56-8697 |






>>>>>>> refs/remotes/origin/main





