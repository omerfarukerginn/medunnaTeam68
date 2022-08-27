@api018
  Feature: US_018 Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

    Scenario: TC_08 Api kullanarak doktorlari dogrulayin

      Given set the Base url
      And send the Get Request and get the Response
      And Set the Expected Data
      Then make Validation
