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
import pages.DoctorPage;
import pages.SettingsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_011_UI_StepDefinition {
    DoctorPage us011 = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("Doktor Account-menu butonuna tiklar")
    public void doktor_account_menu_butonuna_tiklar() {
        us011.humanButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Doktor sign in butonuna tiklar")
    public void doktor_sign_in_butonuna_tiklar() {
       us011.singInButtonu.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Doktor gecerli bir kullanici adı ve sifre girer")
    public void doktor_gecerli_bir_kullanici_adı_ve_sifre_girer() {
        us011.userName.sendKeys(ConfigReader.getProperty("doktorUserName"));
        ReusableMethods.waitFor(2);
        us011.password.sendKeys(ConfigReader.getProperty("doktorPassword"));
        ReusableMethods.waitFor(2);

    }

    @Then("Doktor ikinci sign in butonuna tiklar")
    public void doktor_ikinci_sign_in_butonuna_tiklar() {
        us011.girisSonrasiSingIn.click();

    }


    @Then("Doktor MY PAGES butonuna tiklar")
    public void doktor_my_pages_butonuna_tiklar() {
        us011.myPagesButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("DoktorMy Appointments butonuna tıklar")
    public void doktor_my_appointments_butonuna_tıklar() {
        us011.myAppointmentsButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Doktor Edit butonuna tiklar")
    public void doktor_edit_butonuna_tiklar() {
        us011.editButton.click();
        ReusableMethods.waitFor(2);

    }
    @Then("Doktor hastanin Status alanini belirler")
    public void doktor_hastanin_status_alanini_belirler() {
        us011.statusButton.sendKeys("PENDING");
        ReusableMethods.waitFor(2);


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