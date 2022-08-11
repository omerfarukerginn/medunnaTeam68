@api10
Feature: US010_ApiTest

  Scenario Outline : doktor randevu listesini api'de görebilmeli

    When Doctor set Medunna base url
    And Doctor send the GET request and GET the response
    And Doctor deserialize data json to java
    And Doctor saves the appointment data to correspondent files
    Then Doctor validates expected data with API "<patientId>", "<startDate>","<endDate>","<status>"
    And Sayfayi kapatir
    Examples:
      | patientId | startDate            | endDate              | status  |
      | 167139    | 2022-08-09T00:00:00Z | 2022-08-09T01:00:00Z | PENDING |
      | 163784    | 2022-08-07T00:00:00Z | 2022-08-07T01:00:00Z | PENDING |
      | 160060    | 2022-08-05T00:00:00Z | 2022-08-05T01:00:00Z | PENDING |




