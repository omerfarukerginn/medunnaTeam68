package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.LoginPage;
import pages.PatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_028_UI_StepDefinition {

    AdminPage adminPage = new AdminPage();
    PatientPage patient = new PatientPage();

    @Given("Kullanici Items&Titles butonunu tiklar ve Country secer")
    public void kullaniciItemsTitlesButonunuTiklarVeCountrySecer() {
        Driver.waitAndClick(adminPage.itemsTitlesButonu);
        ReusableMethods.waitFor(3);
        adminPage.countryButonu.click();
    }

    @Given("Kullanici Create a new Country butonunu tiklar")
    public void kullanici_create_a_new_country_butonunu_tiklar() {
        adminPage.createCountryButonu.click();

    }
    @Then("Kullanici gecerli ulke ismini yazar")
    public void kullanici_gecerli_ulke_ismini_yazar() {
        adminPage.createCountryNameButonu.sendKeys("YeniDunya");

    }
    @Then("Kullanici tarih ve saat girer.")
    public void kullanici_tarih_ve_saat_girer() {
        adminPage.tarihSaatButonu.sendKeys("22.08.20220001:20");

    }
    @Then("Kullanici Save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {
        adminPage.saveButonu.sendKeys(Keys.ENTER);


    }
    @Given("Kullanici Items&Titles butonunu tiklar")
    public void kullaniciItemsTitlesButonunuTiklar() {

    }
    @Given("Kullanici State City butonunu secer")
    public void kullanici_state_city_butonunu_secer() {

    }
    @Given("Kullanici Create a new State City butonunu tiklar")
    public void kullanici_create_a_new_state_city_butonunu_tiklar() {

    }
    @Given("Kullanici gecerli eyalet sehir ismini yazar")
    public void kullanici_gecerli_eyalet_sehir_ismini_yazar() {

    }
    @Then("Kullanici gecerli ulke ismini secer")
    public void kullanici_gecerli_ulke_ismini_secer() {

    }
    @Given("Kullanici sectigi ulkenin delete butonuna tiklar")
    public void kullanici_sectigi_ulkenin_delete_butonuna_tiklar() {

    }
    @Given("Kullanici Confirm delete operation ekranini gorur ve delete i tiklar")
    public void kullanici_confirm_delete_operation_ekranini_gorur_ve_delete_i_tiklar() {

    }



}
