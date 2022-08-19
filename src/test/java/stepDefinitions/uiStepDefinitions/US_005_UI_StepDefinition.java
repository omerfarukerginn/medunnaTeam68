package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_005_UI_StepDefinition {

    PatientPage us005 = new PatientPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("medunna.com sayfasina gidilir")
    public void medunna_com_sayfasina_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @Given("'Make an appointment' butonuna tiklanir")
    public void make_an_appointmentbutonuna_tiklanir() {
        us005.makeAnAppointmentButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("'First Name' kutusuna tiklanir")
    public void first_name_kutusuna_tiklanir() {
        us005.firstNameKutusu.click();
    }
    @Then("Herhangi bir karakter içeren first name gonderilir")
    public void herhangi_bir_karakter_içeren_first_name_gonderilir() {
        us005.firstNameKutusu.sendKeys("hastaMahmut");
    }
    @Then("2 saniye beklenir")
    public void saniye_beklenir() {
        ReusableMethods.waitFor(2);
    }

    @Then("'SSN' kutusuna tiklanir")
    public void SSN_kutusuna_tiklanir() {
        us005.ssnKutusu.click();

    }
    @Then("SSN kutusuna kayitli SSN numarasi gonderilir")
    public void ssn_kutusuna_kayitli_ssn_numarasi_gonderilir() {
        us005.ssnKutusu.sendKeys("134-56-8697");
    }

    @Then("'Last Name' kutusuna tiklanir")
    public void last_name_kutusuna_tiklanir() {
        us005.lastNameKutusu.click();
    }
    @Then("Last Name kutusuna soyisim gonderilir")
    public void last_name_kutusuna_soyisim_gonderilir() {
        us005.lastNameKutusu.sendKeys("hastaMahmut");

    }

    @Then("'Email' kutusuna tiklanir")
    public void email_kutusuna_tiklanir() {
        us005.emailKutusu.click();
    }
    @Then("Email kutusuna gecerli e-mail adresi gonderilir")
    public void email_kutusuna_ve_içeren_e_mail_adresi_gonderilir() {
        us005.emailKutusu.sendKeys("hastaMahmut@gmail.com");

    }

    @Then("'Phone' kutusuna tiklanir")
    public void phone_kutusuna_tiklanir() {
        us005.phoneKutusu.click();
    }
    @Then("Phone kutusuna gecerli telefon numarası gonderilir")
    public void phone_kutusuna_ve_rakamdan_sonra_olan_rakamlı_telefon_numarası_gonderilir() {
        us005.phoneKutusu.sendKeys("123-456-7891");
    }

    @Then("Appointment DateTime kutusuna randevu tarihi gonderilir")
    public void appointment_date_time_kutusuna_randevu_tarihi_gonderilir() {
        us005.appoDateTimeKutusu.click();
        us005.appoDateTimeKutusu.sendKeys("18.08.2022");

    }

    @Then("'Send an Appointment Request' butonuna tiklanir")
    public void send_an_appointment_request_butonuna_tiklanir() {
        us005.sendAnAppoRequestButton.click();
    }

    @Given("Giris butonuna tiklanir")
    public void giris_butonuna_tiklanir() {
        actions.click(us005.girisButton).perform();

    }
    @Then("Birinci register butonuna tiklanir")
    public void birinci_register_butonuna_tiklanir() {
        us005.birinciRegisterButton.click();
        ReusableMethods.waitFor(2);



    }

    @Then("Username kutusuna gecerli username gonderilir")
    public void username_kutusuna_gecerli_username_gonderilir() {
        us005.userNameKutusu.click();
        us005.userNameKutusu.sendKeys("hastaMahmut");

    }
    @Then("Yeni sifre girilir")
    public void yeni_sifre_girilir() {
        us005.newPasswordKutusu.submit();
        us005.newPasswordKutusu.sendKeys("hastaMahmut8");
        ReusableMethods.waitFor(2);
    }
    @Then("Yeni sifre tekrar girilir")
    public void yeni_sifre_tekrar_girilir() {
        us005.newPasswordConfirmKutusu.submit();
        us005.newPasswordConfirmKutusu.sendKeys("hastaMahmut8");
        ReusableMethods.waitFor(2);

    }
    @Then("Ikinci register butonuna tiklanir")
    public void ikinci_register_butonuna_tiklanir() {
        us005.ikinciRegisterButton.submit();
        ReusableMethods.waitFor(2);


    }

    @Then("Birinci sign in butonuna tiklanir")
    public void birinci_sign_in_butonuna_tiklanir() {
        us005.birinciSigninButton.click();
    }
    @Then("Gecerli sifre girilir")
    public void gecerli_sifre_girilir() {
        us005.signinPasswordKutusu.click();
        us005.signinPasswordKutusu.sendKeys("hastaMahmut8");

    }
    @Then("Ikinci sign in butonuna tiklanir")
    public void ikinci_sign_in_butonuna_tiklanir() {
        us005.ikinciSigninButton.click();

    }
    @Then("MY PAGES\\(PATIENT) butonuna tiklanir")
    public void my_pages_patient_butonuna_tiklanir() {
        us005.myPagesPatientButton.click();

    }
    @Then("My Appointments butonuna tiklanir")
    public void my_appointments_butonuna_tiklanir() {
        us005.myAppointmentsButton.click();

    }
    @Then("Alinan randevunun gorunurlugu test edilir")
    public void alinan_randevunun_gorunurlugu_test_edilir() {
        Assert.assertTrue(us005.id.isDisplayed());
    }


    @And("\\(su)Sayfa kapatilir")
    public void suSayfaKapatilir() {
        Driver.closeDriver();
    }

    @Then("First name kutusuna tiklanir, bos birakilirsa Your Firstname is required. yazisinin ciktigi dogrulanir")
    public void firstNameKutusunaTiklanirBosBirakilirsaYourFirstnameIsRequiredYazisininCiktigiDogrulanir() {
        actions.click(us005.firstNameKutusu).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
    }

    @And("Last name kutusuna tiklanir, bos birakilirsa Your Lastname is required. yazisinin ciktigi dogrulanir")
    public void lastNameKutusunaTiklanirBosBirakilirsaYourLastnameIsRequiredYazisininCiktigiDogrulanir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us005.bosFirstNameMesaji.isDisplayed());
        
    }

    @And("SSN kutusuna tiklanir, bos birakilirsa Your SSN is required. yazisinin ciktigi dogrulanir")
    public void ssnKutusunaTiklanirBosBirakilirsaYourSSNIsRequiredYazisininCiktigiDogrulanir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us005.bosLastNameMesaji.isDisplayed());
        
    }

    @And("Email kutusuna tiklanir, bos birakilirsa Your email is required. yazisinin ciktigi dogrulanir")
    public void emailKutusunaTiklanirBosBirakilirsaYourEmailIsRequiredYazisininCiktigiDogrulanir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us005.bosSSNMesaji.isDisplayed());


    }

    @And("Phone kutusuna tiklanir, bos birakilirsa Phone number is required. yazisinin ciktigi dogrulanir")
    public void phoneKutusunaTiklanirBosBirakilirsaPhoneNumberIsRequiredYazisininCiktigiDogrulanir() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us005.bosEmailMesaji.isDisplayed());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Assert.assertTrue(us005.bosPhoneMesaji.isDisplayed());


    }
}
