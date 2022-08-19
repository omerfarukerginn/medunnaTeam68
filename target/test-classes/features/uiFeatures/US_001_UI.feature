@US01_UI
Feature: US_001 registerpage
  Background:
    Given Kullanıci medunna anasayfasina gider
    And kullanici registration sayfasina gider(navigate)
<<<<<<< HEAD
  @US001_TC001
=======
<<<<<<< HEAD
  @US001_TC001
=======
<<<<<<< HEAD
  @US001_TC001
=======
  @US001_TC001 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main
  Scenario Outline: US001_TC001
    Given kullanici ssn kutusunu tiklar ve  kullanci gecerli snn numaralarini girer "<SSN>"
    Then Kullanici uyari mesaji görmemeli "<message>"
    Examples: Data text SSN
      |SSN|message|
      |123-34-4567||
      |906-12-5436||
      |867-11-2348||
      |123-34-4567||
      |806-12-5436||
      |867-11-2348||
<<<<<<< HEAD
  @US001_TC002,3
=======
<<<<<<< HEAD
  @US001_TC002,3
=======
<<<<<<< HEAD
  @US001_TC002,3
=======
  @US001_TC002,3 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main
  Scenario Outline:US001_TC002,US001_TC003
    Given kullanici ssn kutusunu tiklar ve  ucuncu ve besinci haneden sonra herahngi bir isaret KOYMADAN DOKUZ haneli snn numaralarini girer "<SSN>"
    Given kullanici ssn kutusunu tiklar ve  ucuncu ve besinci haneden sonra gerekli isareti koyduktundan sonra sekiz ve on haneli ssn girer "<SSN>"
    Then Kullanici Your SSN is invalid mesajini görmeli
    Examples: Data text SSN
      |SSN||SSN          |
      |123344567||123-34-472|
      |906125436||111-11-111|
      |867112348||906-12-536|
      |123344567||867-11-23486|
      |906125436||123-34-78998|
      |867112348||123-34-471|
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> main
>>>>>>> main
  @US001_TC003
  Scenario:US001_TC004
    When kullanci ssn kutusunu bos birakmali
    Then kullanci your ssn is invalid mesaji almali
  @US001_TC005
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
  @US001_TC003 @SmokeTest
  Scenario:US001_TC004
    When kullanci ssn kutusunu bos birakmali
    Then kullanci your ssn is invalid mesaji almali
  @US001_TC005 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main

  Scenario Outline: US001_TC005

    Given kullanici herhangi bir karakter iceren ve bos birakilmayan gecerli bir first name girmelidir"<First Name>"
    Then Kullanici uyari mesaji görmemeli
    Examples: Data text Fisrt Name
    |First Name|
    |bayram|
    |ahmet|
    |charlotte|
    |damaris  |
<<<<<<< HEAD
  @US001_TC006,7
=======
<<<<<<< HEAD
  @US001_TC006,7
=======
<<<<<<< HEAD
  @US001_TC006,7
=======
  @US001_TC006,7 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main

  Scenario Outline: US001_TC006,US001_TC007

    Given kullanici herhangi bir karakter iceren ve basta bos birakilan bir first name girmelidir "<FirstName>"
    Given kullanci herhangi bir karakter iceren ve ilkharf yazildiktan ve son harf yazilmadan önce herhangi bir yerde bosluk birakarak first name girmelidir"<First Name>"
    Then Kullanici your firstname is required uyari mesajini görmeli
    Examples: Data text First Name
      |FirstName|First Name|
      | bayram|              ak if         |
      | ahmet|               meh met        |
      | charlotte|           ti na      |
      | damaris  |           charlott e |

<<<<<<< HEAD
  @US001_TC008
=======
<<<<<<< HEAD
  @US001_TC008
=======
<<<<<<< HEAD
  @US001_TC008
=======
  @US001_TC008 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main
  Scenario: US001_TC008
    When  kullanici first name kutusunu bos birakmali
    Then kullanci first name is required mesajini almali

<<<<<<< HEAD
  @US001_TC009,10,11
=======
<<<<<<< HEAD
  @US001_TC009,10,11
=======
<<<<<<< HEAD
  @US001_TC009,10,11
=======
  @US001_TC009,10,11 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main
  Scenario Outline: US001_TC009,US001_TC010,US001_TC011
   Given kullanici hrhangi bir karakter iceren ancak BASTA bosluk birakarak bir last name girer "<LastName>"
    Given kullanici hrhangi bir karakter iceren ancak ORTADA bosluk birakarak bir last name girer "<Last Name>"
    Then  kullanci your last name is required mesajini görmeli
    Examples:

      |LastName|Last Name|
      | heuser|  heu ser|
      | Heus34er| H eus34er|
      | heser1!| heser1 !|
      | jkl981| jkl 981|
<<<<<<< HEAD
  @US001_TC012
=======
<<<<<<< HEAD
  @US001_TC012
=======
<<<<<<< HEAD
  @US001_TC012
=======
  @US001_TC012 @SmokeTest
>>>>>>> main
>>>>>>> main
>>>>>>> main
  Scenario Outline: US001_TC012

    Given kullanici herhangi bir karakter iceren ve bos birakilmayan gecerli bir last name girmelidir"<Last Name>"
    Then Kullanici your last name is required mesaji görmemeli
    Examples: Data text Last Name
      |Last Name|
      |heuser|
      |Heus34er|
      |heser1!|
      |jkl981|