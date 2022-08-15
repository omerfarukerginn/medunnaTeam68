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
      us_011.anamnesisKutusu.sendKeys("Diabet");

   }

   @Then("Doktor hastanin Treatment  bilgilerini doldurur")
   public void doktor_hastanin_treatment_bilgilerini_doldurur() {
      us_011.treatmentKutusu.sendKeys("Ilac tedavisi");

   }

   @Then("Doktor hastanin Diagnosis bilgilerini doldurur")
   public void doktor_hastanin_diagnosis_bilgilerini_doldurur() {
      us_011.diagnosisKutusu.sendKeys("verem etti bizi ");

   }

   @Then("Doktor hastanin Prescription bilgilerini doldurur")
   public void doktor_hastanin_prescription_bilgilerini_doldurur() {
      us_011.prescriptionKutusu.sendKeys("gunde 3 kez ilac alinacak");


   }

   @Then("Doktor hastanin Description bilgilerini doldurur")
   public void doktor_hastanin_description_bilgilerini_doldurur() {
      us_011.descriptionKutusu.sendKeys("bol spor yap");

   }

   @Then("Doktor save butonuna tiklar")
   public void doktor_save_butonuna_tiklar() {
      ReusableMethods.waitFor(2);
      us_011.saveButton.sendKeys(Keys.ENTER);

   }

   @Then("Doktor \"The Appointment is updated with identifier\"mesajini gorur.")
   public void doktor_the_appointment_is_updated_with_identifier_mesajini_gorur() {
    Driver.getDriver().switchTo().alert().accept();
    String expectedResult="The Appointment is updated with identifier";
    String actualResult=us_011.appointmentBasariliYazisi.getText();
    Assert.assertEquals(expectedResult,actualResult);

   }

   @Then("Sayfayi kapatir.")
   public void sayfayi_kapatir() {
      Driver.closeDriver();

   }
}