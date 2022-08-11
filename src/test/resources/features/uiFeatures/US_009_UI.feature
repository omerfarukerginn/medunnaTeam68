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

  @US_009_TC_002
  Scenario Outline: TC_002 Kullanıcı bütün hasta bilgilerini düzenleyebilmelidir.
    And MY PAGES sekmesine tiklar
    And Search Patient secenegini secer
    And Patient SSN kutusuna "<SSN>" girer
    And Edit butonuna tiklar
    And Staff hasta bilgilerinde duzenleme yapar
    And Save butonuna tiklar
    And Dogrulama gozlemlenir

    Examples:
      | SSN         |
      | 668-83-4231 |






