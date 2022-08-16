@US_005
Feature:US_005 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  @US_005_TC_001
  Scenario: TC_001 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir
            ve boş bırakılamaz.
    Given medunna.com sayfasina gidilir
    And   'Make an appointment' butonuna tiklanir
    Then  'First Name' kutusuna tiklanir
    And   Herhangi bir karakter içeren first name gonderilir
    And   2 saniye beklenir
    And   (su)Sayfa kapatilir
  @US_005_TC_002
  Scenario:TC_002 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Given medunna.com sayfasina gidilir
    And 'Make an appointment' butonuna tiklanir
    Then 'SSN' kutusuna tiklanir
    And SSN kutusuna kayitli SSN numarasi gonderilir
    And 2 saniye beklenir
    And (su)Sayfa kapatilir
  @US_005_TC_003
  Scenario:TC_003 Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.
    Given medunna.com sayfasina gidilir
    And 'Make an appointment' butonuna tiklanir
    Then 'Last Name' kutusuna tiklanir
    And Last Name kutusuna soyisim gonderilir
    And 2 saniye beklenir
    And (su)Sayfa kapatilir
  @US_005_TC_004
  Scenario:TC_004 Kullanıcı "." ve "@" içeren e-mail adresi girmeli, boş bırakılamaz.
    Given medunna.com sayfasina gidilir
    And 'Make an appointment' butonuna tiklanir
    Then 'Email' kutusuna tiklanir
    And Email kutusuna gecerli e-mail adresi gonderilir
    And 2 saniye beklenir
    And (su)Sayfa kapatilir
  @US_005_TC_005
  Scenario:TC_005 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girmeli,
           boş bırakılamaz.
    Given medunna.com sayfasina gidilir
    And 'Make an appointment' butonuna tiklanir
    Then 'Phone' kutusuna tiklanir
    And Phone kutusuna gecerli telefon numarası gonderilir
    And 2 saniye beklenir
    And (su)Sayfa kapatilir
  @US_005_TC_006
  Scenario:TC_006 Kullanıcı randevu alıp kaydolabilir.
    Given medunna.com sayfasina gidilir
    And 'Make an appointment' butonuna tiklanir
    Then Herhangi bir karakter içeren first name gonderilir
    And  Last Name kutusuna soyisim gonderilir
    And  SSN kutusuna kayitli SSN numarasi gonderilir
    And  Email kutusuna gecerli e-mail adresi gonderilir
    And  Phone kutusuna gecerli telefon numarası gonderilir
    And  Appointment DateTime kutusuna randevu tarihi gonderilir
    And 2 saniye beklenir
    And 'Send an Appointment Request' butonuna tiklanir
    And (su)Sayfa kapatilir
  @US_005_TC_007
  Scenario:TC_007 Kullanıcı randevu alıp kaydolduğunda, uygulamada oturum açabilir.
    Given medunna.com sayfasina gidilir
    And  Giris butonuna tiklanir
    Then Birinci register butonuna tiklanir
    And  SSN kutusuna kayitli SSN numarasi gonderilir
    And  Herhangi bir karakter içeren first name gonderilir
    And  Last Name kutusuna soyisim gonderilir
    And  Username kutusuna gecerli username gonderilir
    And  Email kutusuna gecerli e-mail adresi gonderilir
    And  Yeni sifre girilir
    And  Yeni sifre tekrar girilir
    And Ikinci register butonuna tiklanir
    And (su)Sayfa kapatilir
  @US_005_TC_008
  Scenario:TC_008 Kullanıcı randevu alıp kaydolduğunda,uygulamada oturum açabilir ve profilini gorebilir.
    Given medunna.com sayfasina gidilir
    And  Giris butonuna tiklanir
    Then Birinci sign in butonuna tiklanir
    And  Username kutusuna gecerli username gonderilir
    And  Gecerli sifre girilir
    And  Ikinci sign in butonuna tiklanir
    And  MY PAGES(PATIENT) butonuna tiklanir
    And  My Appointments butonuna tiklanir
    And  Alinan randevunun gorunurlugu test edilir
    And  (su)Sayfa kapatilir
  @US_005_TC_009
  Scenario:TC_009 Kullanıcı negatif durumlari test eder.
    Given medunna.com sayfasina gidilir
    And  'Make an appointment' butonuna tiklanir
    Then First name kutusuna tiklanir, bos birakilirsa Your Firstname is required yazisinin ciktigi dogrulanir
    And  Last name kutusuna tiklanir, bos birakilirsa Your Lastname is required yazisinin ciktigi dogrulanir
    And  SSN kutusuna tiklanir, bos birakilirsa Your SSN is required yazisinin ciktigi dogrulanir
    And  Email kutusuna tiklanir, bos birakilirsa Your email is required yazisinin ciktigi dogrulanir
    And  Phone kutusuna tiklanir, bos birakilirsa Phone number is required yazisinin ciktigi dogrulanir
    And  (su)Sayfa kapatilir


