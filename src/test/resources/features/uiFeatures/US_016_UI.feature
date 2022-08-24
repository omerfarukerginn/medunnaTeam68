@US_016
Feature:US_016_Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)


  Background:Ortak adimlar

    Given Kullanici ilgili test sayfasina gider
    Then Kullanici admin olarak giris yapar
    And Admin  Items&Titles butonuna tiklar ve ardindan Room butonuna tiklar

  @US_016_TC_001
  Scenario:US_016_TC_001 Admin, yatan hastalar için yeni oda oluşturabilir.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Typi'ni TWIN,DELUXE,PREMIUM_DELUXE,SUIT ve DAYCARE olarak secebilir
    And Admin  Price kutusuna fiyat bilgisi girer
    Then Admin  Save butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur
    And Sayfayi kapatir

  @Us_016_TC_002
  Scenario:US_016_TC_002 Oda oluşturulurken "Room Number" mutlaka olmalı, "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Typi'ni TWIN,DELUXE,PREMIUM_DELUXE,SUIT ve DAYCARE olarak secebilir
    And Admin  Price kutusuna fiyat bilgisi girer
    And Admin  Room Number kutusunu bos birakir
    Then Admin  Save butonuna tiklar
    Then Admin This field is required uyari yazisini gorur
    And Sayfayi kapatir


  @US_016_TC_003_1
  Scenario:US_016_TC_003 Oda için "Status" ayarlanabilir olmalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Price kutusuna fiyat bilgisi girer
    And Admin  Status butonuna tiklar
    Then Admin  Save butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur
    And Admin islem yaptigi son sayfanin okuna tiklar
    And Admin status'un Full olarak belirlendigini gorur
    And Sayfayi kapatir

  @US_016_TC_003_2
  Scenario:US_016_TC_003 Oda için "Status" ayarlanabilir olmalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Price kutusuna fiyat bilgisi girer
    Then Admin  Save butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur
    And Admin islem yaptigi son sayfanin okuna tiklar
    And Admin  Status'un Available olarak belirlendigini gorur
    And Sayfayi kapatir

  @US_016_TC_004
  Scenario:US016_TC_004 Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    Then Admin  Save butonuna tiklar
    And Admin  This field is required uyari yazisini gorur.
    And Sayfayi kapatir

  @US_016_TC005_01
  Scenario:US_016_TC_005 "Description" isteğe bağlı olarak doldurulmalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Price kutusuna fiyat bilgisi girer
    And Admin  Description kutusuna bilgi girer
    Then Admin  Save butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur
    And Sayfayi kapatir

  @US_016_TC005_02
  Scenario:US_016_TC_005 "Description" isteğe bağlı olarak doldurulmalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Price kutusuna fiyat bilgisi girer
    And Admin  Description kutusunu bos birakir
    Then Admin  Save butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur
    And Sayfayi kapatir


  @US_016_TC006
  Scenario: US_016_TC_006 "Created Date" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Price kutusuna fiyat bilgisi girer
    And Admin Created Data bolumune Gun Ay Yil  olarak gecmis bir tarih girer
    Then Admin  Save butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur
    And Sayfayi kapatir


    @US_016_TC007
  Scenario: US_016_TC_007 Admin aynı tür odaları görebilir.
    And Admin Room Type bolumune tiklar
    Then Admin Room Type olarak ayni secilen odalari gorebilir
      And Sayfayi kapatir

  @US_016_TC008
Scenario:US_016_TC_008_Admin mevcut odaları düzenleyebilir ve güncelleyebilir.

   Scenario:US_016_TC_013 Odalar Admin tarafından silinebilir.
    And Admin  Delete tusuna basar
    And Confirm Delete Operation uyarisini gorur
    Then Admin ikinci  Delete butonuna tiklar
    And Admin islemin basarili oldugunu gosteren yesil mesaj kutusunu gorur

