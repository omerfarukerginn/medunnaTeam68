@US_010

Feature: Doktor (Physician) randevuları


  Scenario: Kullanıcı, Dr olarak randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir

    Given Kullanici dr ana sayfaya gider
    And Kullanici sign in butonuna basar
    And Kullanici Dr olarak username kutusuna gecerli bir username bilgilerini girer
    And Kullanici Dr olarak password kutusuna gecerli password bilgilerini girer
    And Kullanici, sag altta bulunan Sign in dugmesine tiklamalidir
    And Kullanici Dr olarak My Pages butonuna tiklar
    And Kullanici Dr olarak My Appointments  butonuna tiklar
    Then Kullanici Dr olarak Randevulari gorur
    Then kullanici 3 sn bekler
    And Sayfayi kapatir

    Scenario: Kullanıcı "patient id, start date, end date, status" bilgilerini görebilmeli

      Given Kullanici dr ana sayfaya gider
      And Kullanici sign in butonuna basar
      And Kullanici Dr olarak username kutusuna gecerli bir username bilgilerini girer
      And Kullanici Dr olarak password kutusuna gecerli password bilgilerini girer
      And Kullanici, sag altta bulunan Sign in dugmesine tiklamalidir
      And Kullanici Dr olarak My Pages butonuna tiklar
      And Kullanici Dr olarak My Appointments  butonuna tiklar
      Then Kullanici Dr olarak Randevulari gorur
      Then Kullanici Dr olarak patient id, start date, end date, status bilgilerini gorur
      Then kullanici 3 sn bekler
      And Sayfayi kapatir












