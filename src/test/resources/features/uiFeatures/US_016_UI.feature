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
    And Admin  A new Room is created with identifier mesajinin oldugu kutuyu  gorur.

  @Us_016_TC_002
  Scenario:US_016_TC_002 Oda oluşturulurken "Room Number" mutlaka olmalı, "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Room Number bolumune daha once kullanilmis bir sayi girdiginde uyari yazisi gorundugunu test eder
    And Admin  Typi'nin TWIN,DELUXE,PREMIUM_DELUXE,SUIT ve DAYCARE olarak secilebildigini gorur


  @US_016_TC_003
  Scenario:US_016_TC_003 Oda için "Status" ayarlanabilir olmalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    Then Admin   price kutusuna fiyat bilgisini girer
    And Admin  Status butonuna tiklar
    Then Admin  Save butonuna tiklar
    And And Admin  A new Room is created with identifier mesajinin oldugu kutuyu  gorur.
    And Admin  Status'un Full olarak belirlendigini gorur
    And Admin  Status butonunu bos birakir
    Then Admin  Save butonuna tiklar
    And Admin  Status'un Available olarak belirlendigini gorur


  Scenario:US016_TC_004 Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    Then Admin price kutusuna fiyat bilgisini girer
    Then Admin  Save butonuna tiklar
    And Admin  A new Room is created with identifier mesajinin oldugu kutuyu gorur.
    Then Admin price kutusunu bos birakir
    Then Admin  Save butonuna tiklar
    And Admin  This field is required uyari yazisini gorur.


  Scenario:US_016_TC_005 "Description" isteğe bağlı olarak doldurulmalı.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin  Description kutusuna bilgi girer
    Then Admin  Save butonuna tiklar
    And Admin  A new Room is created with identifier mesajinin oldugu kutuyu gorur.
    And Admin  Description kutusunu bos birakir
    Then Admin  Save butonuna tiklar
    And Admin  A new Room is created with identifier  mesajinin oldugu kutuyu  gorur.


  Scenario: US_016_TC_006 "Created Date" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli.
    And Admin  Create a new Room butonuna tiklar
    And Admin  Room Number bolumunu doldurur ve unique olmalidir
    And Admin Created Data" bolumune Gun/Ay/Yil  olarak gecmis bir tarih girer
    Then Admin Save butonuna tiklar
    And Admin A Room is updated..  mesajinin oldugu kutuyu gorur.

  Scenario: US_016_TC_007 Admin aynı tür odaları görebilir.
    And Admin olusturdugu odayi goruntuleyebilir
    And Admin  Edit butonuna tiklar ve bilgileri gunceller ya da degistirir


  Scenario:US_016_TC_013 Odalar Admin tarafından silinebilir.
    And Admin olusturdugu odayi goruntuleyebilir
    And Admin  Delete tusuna basar
    And Confirm Delete Operation uyarisini gorur
    Then Admin ikinci  Delete butonuna tiklar
    Then Admin  A Room is deleted... yazan kutuyu gorur