package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014_UI_StepDefinition {

    DoctorPage us014 = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());

    /*  @Given("Kullanıci Ana Sayfaya gider")
    public void kullanıci_Ana_Sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }

    @Given("Kullanıcı Sign In butonuna basar")
    public void kullanıcı_Sign_In_butonuna_basar() {
        us014.humanButton.click();
        us014.singInButtonu.click();
    }

    @Given("Kullanıcı Username kutusuna gecerli bir username bilgilerini girer")
    public void kullanıcı_Username_kutusuna_gecerli_bir_username_bilgilerini_girer() {
        us014.userName.sendKeys(ConfigReader.getProperty("doktorUserName"));
    }

    @Given("Kullanıcı Password kutusuna gecerli Password bilgilerini girer")
    public void kullanıcı_Password_kutusuna_gecerli_Password_bilgilerini_girer() {
        us014.password.sendKeys(ConfigReader.getProperty("doktorPassword"));

    }


    @And("Kullanıcı, sağ altta bulunan Sign In düğmesine tıklamalıdır")
    public void kullanıcıSağAlttaBulunanSignInDüğmesineTıklamalıdır() {
        ReusableMethods.waitFor(3);
        us014.girisSonrasiSingIn.click();

    }*/




    @Given("Kullanici Medunna  adresine erisebilmeli")
    public void kullaniciMedunnaAdresineErisebilmeli() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @And("Kullanici account  butonu tiklar")
    public void kullaniciAccountButonuTiklar() {
        us014.humanButton.click();
        us014.singInButtonu.click();
    }

    @And("Kullanici registration sekmesine tiklar")
    public void kullaniciRegistrationSekmesineTiklar() {

    }

    @And("Kullanici gecerli bir username ve password girer")
    public void kullaniciGecerliBirUsernameVePasswordGirer() {
        us014.userName.sendKeys(ConfigReader.getProperty("doktorUserName"));
        us014.password.sendKeys(ConfigReader.getProperty("doktorPassword"));
        ReusableMethods.waitFor(3);
        us014.girisSonrasiSingIn.click();
    }

    @And("Kullanici My pages sekmesini tiklar")
    public void kullaniciMyPagesSekmesiniTiklar() {
        us014.myPagesButton.click();
    }

    @And("Kullanici My Inpatients secenegini tiklar")
    public void kullaniciMyInpatientsSeceneginiTiklar() {
       us014.myInpatientsButton.click();

    }

    @And("Kullanici Hasta sayfasında olduğunu doğrular")
    public void kullaniciHastaSayfasındaOlduğunuDoğrular() {
        Assert.assertTrue(us014.inPatientsText.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici  hasta bilgilerini görüntüler")
    public void kullaniciHastaBilgileriniGörüntüler() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us014.inPatientsID.isDisplayed());
        Assert.assertTrue(us014.inPatientsStartDate.isDisplayed());
        Assert.assertTrue(us014.inPatientsEndDate.isDisplayed());
        Assert.assertTrue(us014.inPatientsStatus.isDisplayed());
        Assert.assertTrue(us014.inPatientsDescription.isDisplayed());
        Assert.assertTrue(us014.inPatientsCreatedDate.isDisplayed());
        Assert.assertTrue(us014.inPatientsRoom.isDisplayed());
        Assert.assertTrue(us014.inPatientsAppointment.isDisplayed());
        Assert.assertTrue(us014.inPatientsPatient.isDisplayed());


    }
    @And("Kullanici inPatients sayfasinda güncellenmesi istenen hastanin edit butonu tiklar")
    public void kullaniciInPatientsSayfasindaGüncellenmesiIstenenHastaninEditButonuTiklar() {
        ReusableMethods.clickWithTimeOut(us014.inPatientsEditButton2,3);
        ReusableMethods.waitFor(3);
    }


    @And("Kullanici in patient creat or edt page oldugunu kontrol eder")
    public void kullaniciInPatientCreatOrEdtPageOldugunuKontrolEder() {
        String expectedResult="Create or edit a In Patient";
        String actualResult= us014.inPatientEditPageText.getText();
       ReusableMethods.waitFor(5);
        Assert.assertEquals(expectedResult,actualResult);

    }

    @And("Kullanici başlangıç tarihi bölümünü güncelleyebilir")
    public void kullaniciBaşlangıçTarihiBölümünüGüncelleyebilir() {
        Assert.assertFalse( us014.editInPatientStartDate.isSelected());
    }
    @And("Kullanici  bitiş tarihi bölümünü güncelleyebilir")
    public void kullaniciBitişTarihiBölümünüGüncelleyebilir() {
        Assert.assertFalse(us014.editInPatientEndDate.isSelected());
    }

    @And("Kullanici açıklama bölümünü güncelleyebilir")
    public void kullaniciAçıklamaBölümünüGüncelleyebilir() {
       ReusableMethods.clickWithTimeOut(us014.editInPatientDescription,3);
        us014.editInPatientDescription.clear();
        us014.editInPatientDescription.sendKeys("halsizlik söz konusu");
    }

    @And("Kullanici oluşturulan tarih bölümünü güncelleyebilir")
    public void kullaniciOluşturulanTarihBölümünüGüncelleyebilir() {
        us014.editInPatientCreatedDate.clear();
        us014.editInPatientCreatedDate.sendKeys("05092333001112");
    }
    @And("Kullanici randevu bölümünü güncelleyebilir")
    public void kullaniciRandevuBölümünüGüncelleyebilir() {
        Assert.assertFalse(us014.editInPatientAppointment.isSelected());

    }
    @Then("Kullanici save butonunu tiklar")
    public void kullaniciSaveButonunuTiklar() {
        ReusableMethods.waitFor(4);
        us014.editInPatientSaveButton.click();

    }

    @And("Kullanici yatarak tedavi durumunu güncelleyebilmelidir")
    public void kullaniciYatarakTedaviDurumunuGüncelleyebilmelidir() {
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown,"UNAPPROVED");
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown,"STAYING");
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown,"DISCHARGED");
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown,"CANCELLED");
    }

    @And("Doktor yatarak tedavi odasını güncelleyebilmelidir")
    public void doktorYatarakTedaviOdasınıGüncelleyebilmelidir() {
        Driver.selectAnItemFromDropdown(us014.editInPatientRoomDropDown,"3626:DAYCARE FULL-UNAVAILABLE");
        Driver.selectAnItemFromDropdown(us014.editInPatientRoomDropDown,"2042:TWIN FULL-UNAVAILABLE");
        Driver.selectAnItemFromDropdown(us014.editInPatientRoomDropDown,"151:DELUXE FULL-UNAVAILABLE");

    }






   /* @Then("Kullanici ekrana cikan mesaji doğrulamalıdır")
    public void kullaniciEkranaCikanMesajiDoğrulamalıdır() {
        Assert.assertTrue(us014.editInPatientEkranaCikanMesaj.isDisplayed());
    }*/

    /* @And("Kullanici Sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
*/


}