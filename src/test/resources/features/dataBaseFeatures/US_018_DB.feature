@db018
  Feature: US_018 Admin olarak; Yeni Physicians Oluştur / Güncelle / Görüntüle ve Sil

    Scenario: TC_018 DP kullanarak doktorları doğrulayın.

      Given Kullanici Db ile baglanti kurar
      And Admin Query tanimlar
      And Admin Physician bilgilerine ulasir ve kaydeder
      And Admin Db ile Physician bilgilerini dogrular