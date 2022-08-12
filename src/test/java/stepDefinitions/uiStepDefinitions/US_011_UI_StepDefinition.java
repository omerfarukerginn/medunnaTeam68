package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import pages.DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_011_UI_StepDefinition {

    DoctorPage us_011 = new DoctorPage();

    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }

    @When("Doktor Account-menu butonuna tiklar")
    public void doktor_account_menu_butonuna_tiklar() {

    }

    @Then("Doktor sign in butonuna tiklar")
    public void doktor_sign_in_butonuna_tiklar() {

    }

    @Then("Doktor gecerli bir kullanici adi ve sifre girer")
    public void doktor_gecerli_bir_kullanici_adi_ve_sifre_girer() {

    }

    @Then("Doktor ikinci sign in butonuna tiklar")
    public void doktor_ikinci_sign_in_butonuna_tiklar() {

    }

    @Then("Doktor MYPAGES butonuna tiklar")
    public void doktor_mypages_butonuna_tiklar() {

    }

    @Then("Doktor My Appointments butonuna tiklar")
    public void doktor_my_appointments_butonuna_tiklar() {

    }

    @Then("Sayfayi kapatir.")
    public void sayfayi_kapatir() {

    }

    @Then("Doktor Edit butonuna tiklar.")
    public void doktor_edit_butonuna_tiklar() {

    }

    @Then("Doktor hastanin Status alanini belirler")
    public void doktor_hastanin_status_alanini_belirler() {

    }

    @Then("Doktor hastanin Anemnesis bilgilerini doldurur")
    public void doktor_hastanin_anemnesis_bilgilerini_doldurur() {

    }

    @Then("Doktor hastanin Treatment  bilgilerini doldurur")
    public void doktor_hastanin_treatment_bilgilerini_doldurur() {

    }

    @Then("Doktor hastanin Diagnosis bilgilerini doldurur")
    public void doktor_hastanin_diagnosis_bilgilerini_doldurur() {

    }

    @Then("Doktor hastanin Prescription bilgilerini doldurur")
    public void doktor_hastanin_prescription_bilgilerini_doldurur() {

    }

    @Then("Doktor hastanin Description bilgilerini doldurur")
    public void doktor_hastanin_description_bilgilerini_doldurur() {

    }

    @Then("Doktor save butonuna tiklar")
    public void doktor_save_butonuna_tiklar() {

    }

    @Then("Doktor \"The Appointment is updated with identifier\"mesajini gorur.")
    public void doktor_the_appointment_is_updated_with_identifier_mesajini_gorur() {

    }


}