package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011_UI_StepDefinition {
    DoctorPage us_011 =new DoctorPage();
    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }

    @When("Doktor Account-menu butonuna tiklar")
    public void doktor_account_menu_butonuna_tiklar() {
        us_011.humanButton.click();

    }

    @Then("Doktor sign in butonuna tiklar")
    public void doktor_sign_in_butonuna_tiklar() {
        us_011.singInButtonu.click();
    }

    @Then("Doktor gecerli bir kullanici adı ve sifre girer")
    public void doktor_gecerli_bir_kullanici_adi_ve_sifre_girer() {
        us_011.userName.sendKeys(ConfigReader.getProperty("doktorUserName"));
        us_011.password.sendKeys(ConfigReader.getProperty("doktorPassword"));

    }

    @Then("Doktor ikinci sign in butonuna tiklar")
    public void doktor_ikinci_sign_in_butonuna_tiklar() {
        us_011.girisSonrasiSingIn.click();

    }

    @Then("Doktor MYPAGES butonuna tiklar")
    public void doktor_mypages_butonuna_tiklar() {
        us_011.myPagesButton.click();

    }

    @Then("Doktor My Appointments butonuna tıklar")
    public void doktor_my_appointments_butonuna_tiklar() {
        us_011.myAppointmentsButton.click();

    }



    @Then("Doktor Edit butonuna tiklar.")
    public void doktor_edit_butonuna_tiklar() {
        us_011.editButton.click();

    }

    @Then("Doktor hastanin Status alanini belirler")
    public void doktor_hastanin_status_alanini_belirler() {
        // Select select=new Select(us_011.statusButton);
        // select.selectByVisibleText("PENDING");
        Driver.selectAnItemFromDropdown(us_011.statusButton, "PENDING");
        ReusableMethods.waitFor(2);

    }

    @Then("Doktor hastanin Anemnesis bilgilerini doldurur")
    public void doktor_hastanin_anemnesis_bilgilerini_doldurur() {
        us_011.anamnesisKutusu.sendKeys("kanser");

    }

    @Then("Doktor hastanin Treatment  bilgilerini doldurur")
    public void doktor_hastanin_treatment_bilgilerini_doldurur() {
        us_011.treatmentKutusu.sendKeys("Kemo");

    }

    @Then("Doktor hastanin Diagnosis bilgilerini doldurur")
    public void doktor_hastanin_diagnosis_bilgilerini_doldurur() {
        us_011.diagnosisKutusu.sendKeys("caresiz ");

    }

    @Then("Doktor hastanin Prescription bilgilerini doldurur")
    public void doktor_hastanin_prescription_bilgilerini_doldurur() {
        us_011.prescriptionKutusu.sendKeys("son gunlerini iyi yasasin");


    }

    @Then("Doktor hastanin Description bilgilerini doldurur")
    public void doktor_hastanin_description_bilgilerini_doldurur() {
        us_011.descriptionKutusu.sendKeys("bol dua et");

    }

    @Then("Doktor save butonuna tiklar")
    public void doktor_save_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        us_011.saveButton.sendKeys(Keys.ENTER);

    }

    @Then("Doktor \"The Appointment is updated with identifier\"mesajini gorur.")
    public void doktor_the_appointment_is_updated_with_identifier_mesajini_gorur() {

        // String expectedResult="The Appointment is updated with identifier";
        //  String actualResult=us_011.appointmentBasariliYazisi.getText();
        Assert.assertTrue(us_011.appointmentBasariliYazisi.isDisplayed());

    }

    @Then("Sayfayi kapatir.")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("Doktor hastanin id bilgisini gorunur oldugunu test eder")
    public void doktor_hastanin_id_bilgisini_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(us_011.idButton.isDisplayed());

    }

    @Then("Doktor hastanin start and end date bilgisinin gorunur oldugunu test eder gorur")
    public void doktor_hastanin_start_and_end_date_bilgisinin_gorunur_oldugunu_test_eder_gorur() {
        Assert.assertTrue(us_011.startDateTimeButton.isDisplayed());


    }

    @Then("Doktor hastanin status bilgisinin gorunur oldugunu test eder")
    public void doktor_hastanin_status_bilgisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(us_011.ikinicStatusBolumu.isDisplayed());

    }

    @Then("Doktor hastanin physician bilgisinin gorunur oldugunu test  eder")
    public void doktor_hastanin_physician_bilgisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(us_011.physicanBolumu.isDisplayed());

    }

    @Then("Doktor hastanin patient bilgisinin gorunur oldugunu test  eder")
    public void doktor_hastanin_patient_bilgisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(us_011.patientBolumu.isDisplayed());

    }


    @Then("Doktor Edit i tiklar")
    public void doktor_edit_i_tiklar() {
        ReusableMethods.hooverByJS( us_011.hastaBilalEditButonu);



    }


    @Then("Doktor Anemnasis alani icin {string} uyarisi verdigini dogrular")
    public void doktor_anemnasis_alani_icin_uyarisi_verdigini_dogrular(String string) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_011.amensisUyariYazisi.isDisplayed());


    }

    @Then("Doktor Treatment alani icin {string} uyarisi verdigini dogrular")
    public void doktor_treatment_alani_icin_uyarisi_verdigini_dogrular(String string) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_011.treatmentUyariYazisi.isDisplayed());

    }

    @Then("Doktor Diagnosis alani icin {string} uyarisi verdigini dogrular")
    public void doktor_diagnosis_alani_icin_uyarisi_verdigini_dogrular(String string) {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_011.diagnosisUyariYazisi.isDisplayed());

    }

    @And("Doktor Statusu Pending olarak secer")
    public void doktorStatusuPendingOlarakSecer() {
        Driver.selectAnItemFromDropdown(us_011.statusButton,"PENDING");
    }


    @And("Doktor Statusu Completed olarak secer")
    public void doktorStatusuCompletedOlarakSecer() {
        Driver.selectAnItemFromDropdown(us_011.statusButton,"COMPLETED");

    }

    @And("Doktor Statusu Cancelled olarak secer")
    public void doktorStatusuCancelledOlarakSecer() {
        Driver.selectAnItemFromDropdown(us_011.statusButton,"CANCELLED");

    }


    @And("Doktor Prescription alani icin -This field is required- uyarisi vermedigini dogrular")
    public void doktorPrescriptionAlaniIcinThisFieldIsRequiredUyarisiVermediginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertFalse(us_011.zorunluAlanUyariYazisi.isDisplayed());
    }

    @And("Doktor Description  alani icin -This field is required- uyarisi vermedigini dogrular")
    public void doktorDescriptionAlaniIcinThisFieldIsRequiredUyarisiVermediginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertFalse(us_011.zorunluAlanUyariYazisi.isDisplayed());
    }

/*
   @Then("Doktor \"The Appointment is updated with identifier\"mesajini gorur.")
   public void doktor_the_appointment_is_updated_with_identifier_mesajini_gorur() {
    Driver.getDriver().switchTo().alert().accept();
    String expectedResult="The Appointment is updated with identifier";
    String actualResult=us_011.appointmentBasariliYazisi.getText();
    Assert.assertEquals(expectedResult,actualResult);
    }*/


    @And("Doktor -Anamnesis,Treatment ve Diagnosis- alanlarini bosaltir")
    public void doktorAnamnesisTreatmentVeDiagnosisAlanlariniBosaltir() {
        ReusableMethods.hooverByJS(us_011.anamnesisKutusu);
        us_011.anamnesisKutusu.clear();
        us_011.treatmentKutusu.clear();
        us_011.diagnosisKutusu.clear();
    }


  /* @Then("Sayfayi kapatir.")
   public void sayfayi_kapatir() {

            Driver.closeDriver();

        }*/

    @And("Doktor -Prescription ve Description- alanlarini bosaltir")
    public void doktorPrescriptionVeDescriptionAlanlariniBosaltir() {
        us_011.prescriptionKutusu.clear();
        us_011.descriptionKutusu.clear();
    }
}