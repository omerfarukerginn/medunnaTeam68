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

import java.io.File;
import java.io.IOException;

import static org.testng.reporters.jq.BasePanel.C;

public class US_014_UI_StepDefinition {

    DoctorPage us014 = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());



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
        ReusableMethods.clickWithTimeOut(us014.inPatientsEditButton2, 3);
        ReusableMethods.waitFor(3);
    }


    @And("Kullanici in patient creat or edt page oldugunu kontrol eder")
    public void kullaniciInPatientCreatOrEdtPageOldugunuKontrolEder() {
        String expectedResult = "Create or edit a In Patient";
        String actualResult = us014.inPatientEditPageText.getText();
        ReusableMethods.waitFor(5);
        Assert.assertEquals(expectedResult, actualResult);
    }




    @And("Kullanici baslangıc tarihi bölümünü güncelleyebilir")
    public void kullaniciBaslangıcTarihiBölümünüGüncelleyebilir() {
        Assert.assertFalse(us014.editInPatientStartDate.isSelected());
    }

    @And("Kullanici  bitiş tarihi bölümünü güncelleyebilir")
    public void kullaniciBitişTarihiBölümünüGüncelleyebilir() {
        Assert.assertFalse(us014.editInPatientEndDate.isSelected());
    }

    @And("Kullanici açıklama bölümünü güncelleyebilir")
    public void kullaniciAçıklamaBölümünüGüncelleyebilir() {
        ReusableMethods.clickWithTimeOut(us014.editInPatientDescription, 3);
        us014.editInPatientDescription.clear();
        us014.editInPatientDescription.sendKeys("halsiz");
    }

    @And("Kullanici oluşturulan tarih bölümünü güncelleyebilir")
    public void kullaniciOluşturulanTarihBölümünüGüncelleyebilir() {
        us014.editInPatientCreatedDate.clear();
        us014.editInPatientCreatedDate.sendKeys("05092333001112");
    }

    @And("Kullanici randevu bölümünü güncelleyebilir")
    public void kullaniciRandevuBölümünüGüncelleyebilir()  {
        Assert.assertFalse(us014.editInPatientAppointment.isSelected());
    }



    @Then("Kullanici save butonunu tiklar")
    public void kullaniciSaveButonunuTiklar() {
        ReusableMethods.waitFor(4);
        us014.editInPatientSaveButton.sendKeys(Keys.ENTER);
    }



    @And("Kullanici yatarak tedavi durumunu güncelleyebilmelidir")
    public void kullaniciYatarakTedaviDurumunuGüncelleyebilmelidir() {
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown, "UNAPPROVED");
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown, "STAYING");
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown, "DISCHARGED");
        Driver.selectAnItemFromDropdown(us014.editInPatientStatusDropDown, "CANCELLED");
    }

    @And("Doktor yatarak tedavi odasını güncelleyebilmelidir")
    public void doktorYatarakTedaviOdasınıGüncelleyebilmelidir() {
        Driver.selectAnItemFromDropdown(us014.editInPatientRoomDropDown, "2979009:SUITE FULL-UNAVAILABLE");
        Driver.selectAnItemFromDropdown(us014.editInPatientRoomDropDown, "2042:TWIN FULL-UNAVAILABLE");
        Driver.selectAnItemFromDropdown(us014.editInPatientRoomDropDown, "117:DELUXE FULL-UNAVAILABLE");
    }
}
