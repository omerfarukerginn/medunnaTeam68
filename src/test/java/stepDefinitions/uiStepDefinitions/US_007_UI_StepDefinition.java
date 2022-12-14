package stepDefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_007_UI_StepDefinition {


    Faker faker = new Faker();
    LoginPage logIn = new LoginPage();
    SoftAssert softAssert = new SoftAssert();
    PatientPage patient = new PatientPage();
    String date;

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

        ReusableMethods.hooverByJS(logIn.loginPageSingInMenuButton);
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
        patient.myPagesPatientButtonEb.click();

    }

    @Then("Eb Kullanici Make An Appointment sekmesine tiklar")
    public void eb_kullanici_make_an_appointment_sekmesine_tiklar() {

        patient.makeAnAppointmentSection.click();
    }

    @Then("Eb Kullanici FirstName bolumune ismini girer")
    public void eb_kullanici_first_name_bolumune_ismini_girer() {
        patient.firstNameKutusu.clear();
        //String firstName=faker.name().firstName();
        patient.firstNameKutusu.sendKeys(ConfigReader.getProperty("hastaFirstName"));
    }

    @Then("Eb Kullanici LastName bolumune soy ismini girer")
    public void eb_kullanici_last_name_bolumune_soy_ismini_girer() {
        patient.lastNameKutusu.clear();
        //String lastName=faker.name().lastName();
        patient.lastNameKutusu.sendKeys(ConfigReader.getProperty("hastaLastName"));
    }

    @Then("Eb Kullanici SSN bolumune gecerli bir SSN girer")
    public void eb_kullanici_ssn_bolumune_gecerli_bir_ssn_girer() {
        patient.ssnKutusu.clear();
        //String ssnNumber=faker.idNumber().ssnValid();
        patient.ssnKutusu.sendKeys(ConfigReader.getProperty("hastaSSN"));
    }

    @Then("Eb Kullanici email bolumune email girer")
    public void eb_kullanici_email_bolumune_email_girer() {
        patient.emailKutusu.clear();
        //String email=faker.internet().emailAddress();
        patient.emailKutusu.sendKeys(ConfigReader.getProperty("hastaEmail"));
    }

    @Then("Eb Kullanici Phone bolumune gecerli bir tel nosu girer")
    public void eb_kullanici_phone_bolumune_gecerli_bir_tel_nosu_girer() {
        patient.phoneKutusu.clear();
        String phoneNumber = "076-958-0050";
        patient.phoneKutusu.sendKeys(phoneNumber);
    }

    @Then("Eb Kullanici date bolumunde guncel bir tarih secer")
    public void eb_kullanici_date_bolumunde_guncel_bir_tarih_secer() {

        /*
        Date = "12.12.2022";
        Driver.waitAndSendText(aP.AppointmentDateTimeTextBox, Date);
         */
        patient.appointmentDateSection.sendKeys("30.08.2022");
    }

    @Then("Eb Kullanici date bolumunde gelecek tarihli bir gun secer")
    public void eb_kullanici_date_bolumunde_gelecek_tarihli_bir_gun_secer() {
        patient.appointmentDateSection.sendKeys("01.09.2022");
    }


    @Then("Eb Kullanici Send an Appointment Request butonuna tiklar")
    public void eb_kullanici_send_an_appointment_request_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.hooverByJS(patient.sendAnAppointmentRequestButton);

    }

    @Then("Eb Kullanici Randevu tarihi olusturuldugunu kontrol eder \\(Appoinment registration saved yazisi gorunur olmali)")
    public void eb_kullanici_randevu_tarihi_olusturuldugunu_kontrol_eder_appoinment_registration_saved_yazisi_gorunur_olmali() {
        ReusableMethods.waitForVisibility(patient.appointmentRegistrationSavedText, 3);
        Assert.assertTrue(patient.appointmentRegistrationSavedText.isDisplayed());
    }

    @Then("Eb Kullanici MyAppointment secenegini secer")
    public void eb_kullanici_my_appointment_secenegini_secer() {

        patient.myAppointments.click();
    }

    @Then("Eb Kullanici tarihin formatini dogrular")
    public void eb_kullanici_tarihin_formatini_dogrular() {

        Actions action = new Actions(Driver.getDriver());

        for (int i = 0; i < 3; i++) {
            action.sendKeys(Keys.PAGE_DOWN);
        }

        String guncelDate = "30/08/22";
        String gelecekDate = "01/09/22";

        List<String> gecerlitarihlerinListesi = new ArrayList<>();

        for (int i = 0; i < patient.gecerliTarihlerListesi.size(); i++) {
            gecerlitarihlerinListesi.add(patient.gecerliTarihlerListesi.get(i).getText().substring(0, 8));
            ReusableMethods.waitFor(1);
            System.out.println(gecerlitarihlerinListesi.get(i));

        }
        Assert.assertTrue(gecerlitarihlerinListesi.contains(guncelDate));
        Assert.assertTrue(gecerlitarihlerinListesi.contains(gelecekDate));
    }

    @Then("Eb Kullanici date bolumunde gecmis tarih secer")
    public void eb_kullanici_date_bolumunde_gecmis_tarih_secer() {

        patient.appointmentDateSection.sendKeys("08.06.2022");
    }

    @Then("Eb Kullanici gecmis tarihten gun secemedigini dogrular")
    public void eb_kullanici_gecmis_tarihten_gun_secemedigini_dogrular() {
        Assert.assertTrue(patient.appointmentDateCanNotBePaseDate.isDisplayed());

    }

}
