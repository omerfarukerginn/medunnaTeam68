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
    Then Kullanici Hasta sayfasında oldugunu dogrular
    And Kullanici  hasta bilgilerini goruntuler
    And Kullanici inPatients sayfasinda guncellenmesi istenen hastanin edit butonu tiklar
    And Kullanici in patient creat or edt page oldugunu kontrol eder



  @US014_TC001
  Scenario:Doktor hasta bilgilerini goruntuluyebilmeli


    And Kullanici baslangıc tarihi bolumunu guncelleyebilir
    And Kullanici  bitis tarihi bolumunu guncelleyebilir
    And Kullanici acıklama bolumunu guncelleyebilir
    And Kullanici olusturulan tarih bolumunu guncelleyebilir
    And Kullanici randevu bölümünü guncelleyebilir
    And Kullanici save butonunu tiklar
    And Sayfayi kapatir


  @US014_TC002
  Scenario:Status doktor tarafından "UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED" olarak güncellenebilmeli


    And Kullanici yatarak tedavi durumunu guncelleyebilmelidir
    And Sayfayi kapatir



  @US014_TC003
  Scenario:Doktor rezerve edilmis odayı guncelleyebilmeli


    And Doktor yatarak tedavi odasını guncelleyebilmelidir
    And Sayfayi kapatir