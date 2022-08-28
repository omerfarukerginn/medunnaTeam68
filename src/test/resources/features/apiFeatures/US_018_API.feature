@api018
Feature: US_018 Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil
    Scenario Outline:TC_08 Api kullanarak doktorlari dogrulayin

      Given Admin set Medunna base url "<id>"
      And Admin send the GET request and GET the response
      And Admin deserialize data json to java
      And Admin saves the physicians data to correspondent files
      Then Admin validates expected data with API "<createdBy>", "<gender>","<bloodGroup>","<phone>"
      Examples:
        | id    | createdBy     | phone      | gender | bloodGroup |  |
        | 10502 | anonymousUser | 5896589863 | MALE   | Apositive  |  |
        | 10511 | wadelakin     | 5355557575 | OTHER  | Apositive  |  |