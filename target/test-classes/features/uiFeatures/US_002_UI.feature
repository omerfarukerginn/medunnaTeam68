@US02_UI @SmokeTest
Feature: US_002 registerpage
  Background:
Given Kullanıci medunna anasayfasina gider
And kullanici registration sayfasina gider(navigate)
  @US002_TC001
  Scenario Outline: US002_TC001
    When kullanci User Username kutusuna tiklamali ve herhangi bir karakter iceren (username) adi girer"<Username>"
    Then Kullanici Your username is required mesajini görmemeli
    Examples: Data text username
      |Username|
      |ab.|
      |kjef|
      |@   |
      |1267|
      |masnb.7|
  @US002_TC002
  Scenario:US002_TC002
         Given kullanci gecerli bir ssn numaraasi girer "123-99-2323"
         And kullanci gecerli bir first name girer "bayramx"
         And kullanci gecerli bir last name girer "hzl"
         And kullanci username bos birakir
         And kullanci bir pasword girer "byRm!12"
         And kullanci girilen passwordu dogrular "byRm!12"
         When kullanici register tusuna basar
         Then kullanci your username is required mesaji alir

  @US002_TC04
  Scenario Outline:US002_TC004
    And Kullanici email kutusunu tiklamali ve gecerli bir email girmeli "<email>"
    Then Kullanici Kullanici " The field is invalid" mesaji görmemeli
    Examples: Data mail
      |email|
      |bay@g.k|
      |bayr@com.tr|
  @US002_TC005
  Scenario Outline:US002_TC005
    And Kullanici email kutusunu tiklamali ve “@“ kullanarak ANCAK “.“ kullanmadan  email girmeli "<email>"
    Then Kullanici Kullanici " The field is invalid" mesaji görmeli
    Examples: Data mail
      |email|
      |bay@msn|
      |bayr@com|
  @US002_TC006
  Scenario Outline:S002_TC006
    And Kullanici email kutusunu tiklamali ve “.“ isareti kullandiktan sonra “@“ ile devam ederk mail adresi yazmali  email girmeli "<email>"
    Then Kullanici Kullanici The field is invalid mesaji görmemeli
    Examples: Data mail
      |email|
      |bay.hiz@msn|
      |bayr.hak@comtnsa|

