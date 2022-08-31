@US01_UI @SmokeTest
Feature: US_001 registerpage
  Background:
    Given Kullanici medunna anasayfasina gider
    And kullanici registration sayfasina gider(navigate)
  @US001_TC001
  Scenario Outline: US001_TC001
    Given kullanici ssn kutusunu tiklar ve  kullanci gecerli snn numaralarini girer "<SSN>"
    Then Kullanici uyari mesaji gormemeli "<message>"
    Examples: Data text SSN
      |SSN|message|
      |123-34-4567||
      |906-12-5436||
      |867-11-2348||
      |123-34-4567||
      |806-12-5436||
      |867-11-2348||
  @US001_TC002,3
  Scenario Outline:US001_TC002,US001_TC003
    Given kullanici ssn kutusunu tiklar ve  ucuncu ve besinci haneden sonra herahngi bir isaret KOYMADAN DOKUZ haneli snn numaralarini girer "<SSN>"
    Given kullanici ssn kutusunu tiklar ve  ucuncu ve besinci haneden sonra gerekli isareti koyduktundan sonra sekiz ve on haneli ssn girer "<SSN>"
    Then Kullanici Your SSN is invalid mesajini gormeli
    Examples: Data text SSN
      |SSN||SSN          |
      |123344567||123-34-472|
      |906125436||111-11-111|
      |867112348||906-12-536|
      |123344567||867-11-23486|
      |906125436||123-34-78998|
      |867112348||123-34-471|
  @US001_TC003
  Scenario:US001_TC004
    When kullanci ssn kutusunu bos birakmali
    Then kullanci your ssn is invalid mesaji almali
  @US001_TC005

  Scenario Outline: US001_TC005

    Given kullanici herhangi bir karakter iceren ve bos birakilmayan gecerli bir first name girmelidir"<First Name>"
    Then Kullanici uyari mesaji gormemeli
    Examples: Data text Fisrt Name
    |First Name|
    |bayram|
    |ahmet|
    |charlotte|
    |damaris  |
  @US001_TC006,7

  Scenario Outline: US001_TC006,US001_TC007

    Given kullanici herhangi bir karakter iceren ve basta bos birakilan bir first name girmelidir "<FirstName>"
    Given kullanci herhangi bir karakter iceren ve ilkharf yazildiktan ve son harf yazilmadan once herhangi bir yerde bosluk birakarak first name girmelidir"<First Name>"
    Then Kullanici your firstname is required uyari mesajini gormeli
    Examples: Data text First Name
      |FirstName|First Name|
      | bayram|              ak if         |
      | ahmet|               meh met        |
      | charlotte|           ti na      |
      | damaris  |           charlott e |

  @US001_TC008
  Scenario: US001_TC008
    When  kullanici first name kutusunu bos birakmali
    Then kullanci first name is required mesajini almali

  @US001_TC009,10,11
  Scenario Outline: US001_TC009,US001_TC010,US001_TC011
   Given kullanici hrhangi bir karakter iceren ancak BASTA bosluk birakarak bir last name girer "<LastName>"
    Given kullanici hrhangi bir karakter iceren ancak ORTADA bosluk birakarak bir last name girer "<Last Name>"
    Then  kullanci your last name is required mesajini gormeli
    Examples:

      |LastName|Last Name|
      | heuser|  heu ser|
      | Heus34er| H eus34er|
      | heser1!| heser1 !|
      | jkl981| jkl 981|
  @US001_TC012
  Scenario Outline: US001_TC012

    Given kullanici herhangi bir karakter iceren ve bos birakilmayan gecerli bir last name girmelidir"<Last Name>"
    Then Kullanici your last name is required mesaji gormemeli
    Examples: Data text Last Name
      |Last Name|
      |heuser|
      |Heus34er|
      |heser1!|
      |jkl981|