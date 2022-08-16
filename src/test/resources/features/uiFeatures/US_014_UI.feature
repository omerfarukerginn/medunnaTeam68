@US_014

Feature:US_014 Physician (Doctor) "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli
  (My Appointments / View / Edit Impatients)

  Background: Ortak kullanim
    Given Kullanici Medunna  adresine erisebilmeli
    And Kullanici account  butonu tiklar
    And Kullanici registration sekmesine tiklar
    And Kullanici gecerli bir username ve password girer
    And Kullanici My pages sekmesini tiklar
    And Kullanici My Inpatients secenegini tiklar
    Then Kullanici Hasta sayfasında olduğunu doğrular
    And Kullanici  hasta bilgilerini görüntüler
    And Kullanici inPatients sayfasinda güncellenmesi istenen hastanin edit butonu tiklar
    And Kullanici in patient creat or edt page oldugunu kontrol eder



  @US014_TC001
  Scenario:Doktor hasta bilgilerini görüntülüyebilmeli


    And Kullanici baslangıc tarihi bölümünü güncelleyebilir
    And Kullanici  bitiş tarihi bölümünü güncelleyebilir
    And Kullanici açıklama bölümünü güncelleyebilir
    And Kullanici oluşturulan tarih bölümünü güncelleyebilir
    And Kullanici randevu bölümünü güncelleyebilir
    And Kullanici save butonunu tiklar
    And Sayfayi kapatir


  @US014_TC002
  Scenario:Status doktor tarafından "UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED" olarak güncellenebilmeli


    And Kullanici yatarak tedavi durumunu güncelleyebilmelidir
    And Sayfayi kapatir



  @US014_TC003
  Scenario:Doktor rezerve edilmiş odayı güncelleyebilmeli


    And Doktor yatarak tedavi odasını güncelleyebilmelidir
    And Sayfayi kapatir