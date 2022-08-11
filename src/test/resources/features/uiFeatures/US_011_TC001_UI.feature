@US_011
Feature:US_011 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli


  Background:Ortak adimlar

    Given Kullanici anasayfaya gider
    When Doktor Account-menu butonuna tiklar
    Then Doktor sign in butonuna tiklar
    And Doktor gecerli bir kullanici adı ve sifre girer
    And Doktor ikinci sign in butonuna tiklar
    And Doktor MYPAGES butonuna tiklar
    And Doktor My Appointments butonuna tıklar



  Scenario: Kullanici "Create a New Appointment or Edit " islemlerini yapabilmelidir.
    And Doktor Edit butonuna tiklar.
    And Doktor hastanin Status alanini belirler
    And Doktor hastanin Anemnesis bilgilerini doldurur
    And Doktor hastanin Treatment  bilgilerini doldurur
    And Doktor hastanin Diagnosis bilgilerini doldurur
    And Doktor hastanin Prescription bilgilerini doldurur
    And Doktor hastanin Description bilgilerini doldurur
    And Doktor save butonuna tiklar
    And Doktor "The Appointment is updated with identifier"mesajini gorur.
    Then Sayfayi kapatir.

  Scenario:Bir randevu güncellendiğinde; kullanıcı (doktor), hastanın aşağıdaki bilgilerini görmelidir.
  "id, start and end date, Status, physician and patient"
    And Doktor hastanin id bilgisini gorunur oldugunu test eder
    And Doktor hastanin start and end date bilgisinin gorunur oldugunu test eder gorur
    And Doktor hastanin status bilgisinin gorunur oldugunu test eder
    And Doktor hastanin physician bilgisinin gorunur oldugunu test  eder
    And Doktor hastanin patient bilgisinin gorunur oldugunu test  eder
    Then Sayfayi kapatir

  Scenario:Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarini doldurmak zorundadir.
    And  Doktor Edit i tiklar
    And Doktor "Anamnesis,Treatment ve Diagnosis" alanlarini bosaltir
    And Doktor save butonuna tiklar
    And Doktor Anemnasis alani icin "This field is required" uyarisi verdigini dogrular
    And Doktor Treatment alani icin "This field is required" uyarisi verdigini dogrular
    And Doktor Diagnosis alani icin "This field is required" uyarisi verdigini dogrular
    Then Sayfayi kapatir


  Scenario:"prescription ve description" alanlarini doldurmak isteğe bağlı olmalıdır.
    And Doktor Edit i tiklar
    And Doktor "Prescription ve Description" alanlarini bosaltir
    And Doktor save butonuna tiklar
    And Doktor Prescription alani icin"This field is required" uyarisi vermedigini dogrular
    And Doktor Description  alani icin "This field is required" uyarisi vermedigini dogrular
    Then Sayfayi kapatir

  Scenario: "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmeli.
    And Doktor Edit i tiklar
    And Doktor Statusu Pending olarak secer
    And Doktor Statusu Completed olarak secer
    And Doktor Statusu Cancelled olarak secer
    And Doktor save butonuna tiklar
    And Doktor "The Appointment is updated with identifier"mesajini gorur.
    Then Sayfayi kapatir





