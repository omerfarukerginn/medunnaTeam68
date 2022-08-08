@US_010

Feature: Doktor (Physician) randevuları


  Scenario: Kullanıcı, Dr olarak randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir

    Given Kullanıci ana sayfaya gider
    And Kullanıcı sign in butonuna basar
    And Kullanıcı Dr olarak username kutusuna gecerli bir username bilgilerini girer
    And Kullanıcı Dr olarak password kutusuna gecerli password bilgilerini girer
    And Kullanıcı, sağ altta bulunan Sign in düğmesine tıklamalıdır
    And Kullanici Dr olarak My Pages butonuna tıklar.
    And Kullanici Dr olarak My Appointments  butonuna tıklar.
    Then Kullanici Dr olarak Randevuları gorur
    And Sayfayi kapatir

    Scenario: Kullanıcı "patient id, start date, end date, status" bilgilerini görebilmeli

      Given Kullanıci ana sayfaya gider
      And Kullanıcı sign in butonuna basar
      And Kullanıcı Dr olarak username kutusuna gecerli bir username bilgilerini girer
      And Kullanıcı Dr olarak password kutusuna gecerli password bilgilerini girer
      And Kullanıcı, sağ altta bulunan Sign in düğmesine tıklamalıdır
      And Kullanici Dr olarak My Pages butonuna tıklar.
      And Kullanici Dr olarak My Appointments  butonuna tıklar.
      Then Kullanici Dr olarak Randevuları gorur
      Then Kullanıcı Dr olarak patient id, start date, end date, status bilgilerini gorur
      And Sayfayi kapatir












