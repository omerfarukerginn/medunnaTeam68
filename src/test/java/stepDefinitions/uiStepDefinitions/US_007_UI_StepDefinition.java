package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_007_UI_StepDefinition {


    LoginPage logIn = new LoginPage();
    SoftAssert softAssert = new SoftAssert();
    PatientPage patient = new PatientPage();

    @Given("Eb Kullanici Medunna adresine gider")
    public void eb_kullanici_medunna_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @When("Eb Kullanici Account Menu ikonuna tiklar")
    public void eb_kullanici_account_menu_ikonuna_tiklar() {
        logIn.loginPageMenuButton.click();

    }

    @Then("Eb Kullanici Sign in sekmesine tiklar")
    public void eb_kullanici_sign_in_sekmesine_tiklar() {

        logIn.loginPageSingInMenuButton.click();
    }

    @Then("Eb Kullanici username bolumune UserName yazar")
    public void eb_kullanici_username_bolumune_user_name_yazar() {
        logIn.loginPageSingInUserNameKutusu.sendKeys(ConfigReader.getProperty("hastaUserName"));
    }

    @Then("Eb Kullanici Password kismina Password girer")
    public void eb_kullanici_password_kismina_password_girer() {
        logIn.loginPageSingInPasswordKutusu.sendKeys(ConfigReader.getProperty("hastaPassword"));
    }

    @Then("Eb Kullanici Sign in butonuna tiklar")
    public void eb_kullanici_sign_in_butonuna_tiklar() {

        logIn.loginPageSingInSingInButton.click();
    }

    @Then("Eb Kullanici MyPages sekmesine tiklar")
    public void eb_kullanici_my_pages_sekmesine_tiklar() {
        patient.myPagesPatientButton.click();

    }

    @Then("Eb Kullanici Make An Appointment sekmesine tiklar")
    public void eb_kullanici_make_an_appointment_sekmesine_tiklar() {

        patient.makeAnAppointmentButton.click();
    }

    @Then("Eb Kullanici FirstName bolumune ismini girer")
    public void eb_kullanici_first_name_bolumune_ismini_girer() {
        patient.firstNameKutusu.sendKeys("Pam");
    }

    @Then("Eb Kullanici LastName bolumune soy ismini girer")
    public void eb_kullanici_last_name_bolumune_soy_ismini_girer() {

        patient.lastNameKutusu.sendKeys("Jim");
    }

    @Then("Eb Kullanici SSN bolumune gecerli bir SSN girer")
    public void eb_kullanici_ssn_bolumune_gecerli_bir_ssn_girer() {

        patient.ssnKutusu.sendKeys("234-67-750");
    }

    @Then("Eb Kullanici email bolumune email girer")
    public void eb_kullanici_email_bolumune_email_girer() {

        patient.emailKutusu.sendKeys("pamjim@gmail.com");
    }

    @Then("Eb Kullanici Phone bolumune gecerli bir tel nosu girer")
    public void eb_kullanici_phone_bolumune_gecerli_bir_tel_nosu_girer() {

        patient.phoneKutusu.sendKeys("76-958-0057");
    }

    @Then("Eb Kullanici date bolumunde guncel veya gelecekten bir tarih secer")
    public void eb_kullanici_date_bolumunde_guncel_veya_gelecekten_bir_tarih_secer() {

        patient.appoDateTimeKutusu.sendKeys("12/08/2022");
    }

    @Then("Eb Kullanici Send an Appointment Request butonuna tiklar")
    public void eb_kullanici_send_an_appointment_request_butonuna_tiklar() {
        patient.sendAnAppoRequestButton.click();
    }

    @Then("Eb Kullanici Randevu tarihi olusturuldugunu kontrol eder \\(Appoinment registration saved yazisi gorunur olmali)")
    public void eb_kullanici_randevu_tarihi_olusturuldugunu_kontrol_eder_appoinment_registration_saved_yazisi_gorunur_olmali() {

    }

    @Then("Eb Kullanici MyAppointment secenegini secer")
    public void eb_kullanici_my_appointment_secenegini_secer() {

        patient.myAppointmentsButton.click();
    }

    @Then("Eb Kullanici tarihin {string} seklinde oldugunu dogrular")
    public void eb_kullanici_tarihin_seklinde_oldugunu_dogrular(String string) {


    }

    @Then("Eb Kullanici date bolumunde gecmis tarih secer")
    public void eb_kullanici_date_bolumunde_gecmis_tarih_secer() {

        patient.appoDateTimeKutusu.sendKeys("05/08/2022");
    }

    @Then("Eb Kullanici gecmis tarihten gun secemedigini dogrular")
    public void eb_kullanici_gecmis_tarihten_gun_secemedigini_dogrular() {


    }

}
