@US_005 @SmokeTest
Feature:US_005 Hastalar (patients), hastahaneden randevu (Appointment) olusturabilmelidir.

  @US_005_TC_001
  Scenario: TC_001 Kullanicinin herhangi bir karakter iceren "First Name" yazmasi gerekir
            ve bos birakilamaz.
    Given Kullanici ilgili test sayfasina gider
    And   Make an appointment butonuna tiklanir
    Then  First Name kutusuna tiklanir
    And   Herhangi bir karakter iceren first name gonderilir
    And   2 saniye beklenir
    And   su Sayfa kapatilir
  @US_005_TC_002
  Scenario:TC_002 Kullanici SSN numarasi girmeli (kayıtlı SSN) bos birakilamaz.
    Given Kullanici ilgili test sayfasina gider
    And  Make an appointment butonuna tiklanir
    Then SSN kutusuna tiklanir
    And SSN kutusuna kayitli SSN numarasi gonderilir
    And 2 saniye beklenir
    And su Sayfa kapatilir
  @US_005_TC_003
  Scenario:TC_003 Kullanici, herhangi bir karakter iceren "Last Name" yazmasi gerekir, bos birakilamaz.
    Given Kullanici ilgili test sayfasina gider
    And  Make an appointment butonuna tiklanir
    Then Last Name kutusuna tiklanir
    And Last Name kutusuna soyisim gonderilir
    And 2 saniye beklenir
    And su Sayfa kapatilir
  @US_005_TC_004
  Scenario:TC_004 Kullanici "." ve "@" iceren e-mail adresi girmeli, bos birakilamaz.
    Given Kullanici ilgili test sayfasina gider
    And Make an appointment butonuna tiklanir
    Then Email kutusuna tiklanir
    And Email kutusuna gecerli e-mail adresi gonderilir
    And 2 saniye beklenir
    And su Sayfa kapatilir
  @US_005_TC_005
  Scenario:TC_005 Kullanici, 3. ve 6. rakamdan sonra - olan 10 rakamli telefon numarasini girmeli,
           bos birakilamaz.
    Given Kullanici ilgili test sayfasina gider
    And Make an appointment butonuna tiklanir
    Then Phone kutusuna tiklanir
    And Phone kutusuna gecerli telefon numarasi gonderilir
    And 2 saniye beklenir
    And su Sayfa kapatilir
  @US_005_TC_006
  Scenario:TC_006 Kullanici randevu alip kaydolabilir.
    Given Kullanici ilgili test sayfasina gider
    And Make an appointment butonuna tiklanir
    Then Herhangi bir karakter iceren first name gonderilir
    And  Last Name kutusuna soyisim gonderilir
    And  SSN kutusuna kayitli SSN numarasi gonderilir
    And  Email kutusuna gecerli e-mail adresi gonderilir
    And  Phone kutusuna gecerli telefon numarasi gonderilir
    And  Appointment DateTime kutusuna randevu tarihi gonderilir
    And 2 saniye beklenir
    And Send an Appointment Request butonuna tiklanir
    And su Sayfa kapatilir
  @US_005_TC_007
  Scenario:TC_007 Kullanici randevu alip kaydoldugunda, uygulamada oturum acabilir.
    Given Kullanici ilgili test sayfasina gider
    And  Giris butonuna tiklanir
    Then Birinci register butonuna tiklanir
    And  SSN kutusuna kayitli SSN numarasi gonderilir
    And  Herhangi bir karakter iceren first name gonderilir
    And  Last Name kutusuna soyisim gonderilir
    And  Username kutusuna gecerli username gonderilir
    And  Email kutusuna gecerli e-mail adresi gonderilir
    And  Yeni sifre girilir
    And  Yeni sifre tekrar girilir
    And Ikinci register butonuna tiklanir
    And su Sayfa kapatilir
  @US_005_TC_008
  Scenario:TC_008 Kullanici randevu alip kaydoldugunda,uygulamada oturum acabilir ve profilini gorebilir.
    Given Kullanici ilgili test sayfasina gider
    And  Giris butonuna tiklanir
    Then Birinci sign in butonuna tiklanir
    And  Username kutusuna gecerli username gonderilir
    And  Gecerli sifre girilir
    And  Ikinci sign in butonuna tiklanir
    And  MY PAGES PATIENT butonuna tiklanir
    And  My Appointments butonuna tiklanir
    And  Alinan randevunun gorunurlugu test edilir
    And  su Sayfa kapatilir
  @US_005_TC_009
  Scenario:TC_009 Kullanici negatif durumlari test eder.
    Given Kullanici ilgili test sayfasina gider
    And  Make an appointment butonuna tiklanir
    Then First name kutusuna tiklanir, bos birakilirsa Your Firstname is required. yazisinin ciktigi dogrulanir
    And  Last name kutusuna tiklanir, bos birakilirsa Your Lastname is required. yazisinin ciktigi dogrulanir
    And  SSN kutusuna tiklanir, bos birakilirsa Your SSN is required. yazisinin ciktigi dogrulanir
    And  Email kutusuna tiklanir, bos birakilirsa Your email is required. yazisinin ciktigi dogrulanir
    And  Phone kutusuna tiklanir, bos birakilirsa Phone number is required. yazisinin ciktigi dogrulanir
    And  su Sayfa kapatilir


