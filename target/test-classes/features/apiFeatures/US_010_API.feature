@api10
Feature:US010_ApiTest

  Scenario Outline:doktor randevu listesini api'de görebilmeli

    Given Doctor set Medunna base url "<id>"
    And Doctor send the GET request and GET the response
    And Doctor deserialize data json to java
    And Doctor saves the appointment data to correspondent files
    Then Doctor validates expected data with API "<patientID>", "<startDate>","<endDate>","<status>"
    Examples:
      | id     | patientID | startDate            | endDate              | status    |
      | 160060 | 160153    | 2022-08-05T00:00:00Z | 2022-08-05T01:00:00Z | COMPLETED |
      | 163784 | 159071    | 2022-08-07T00:00:00Z | 2022-08-07T01:00:00Z | PENDING   |









