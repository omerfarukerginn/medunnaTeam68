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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

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
        LocalDateTime tarihSaat = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY" );
        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("hh:mm a");
        adminPage.tarihSaatButonu.sendKeys(formatter.format(tarihSaat), formatterSaat.format(tarihSaat));
        //tarih saat

    }
    @Then("Kullanici Save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {
        adminPage.saveButonu.sendKeys(Keys.ENTER);


    }
    @Given("Kullanici Items&Titles butonunu tiklar")
    public void kullaniciItemsTitlesButonunuTiklar() {
        Driver.waitAndClick(adminPage.itemsTitlesButonu);
        ReusableMethods.waitFor(1);
    }
    @Given("Kullanici State City butonunu secer")
    public void kullanici_state_city_butonunu_secer() {
        adminPage.stateCityButonu.click();
        ReusableMethods.waitFor(1);
    }
    @Given("Kullanici Create a new State City butonunu tiklar")
    public void kullanici_create_a_new_state_city_butonunu_tiklar() {
        adminPage.createStateCityButonu.click();
        ReusableMethods.waitFor(1);

    }
    @Given("Kullanici gecerli eyalet sehir ismini yazar")
    public void kullanici_gecerli_eyalet_sehir_ismini_yazar() {
        adminPage.createStateCityNameButonu.sendKeys("Guzelyali");
        ReusableMethods.waitFor(1);

    }
    @Then("Kullanici gecerli ulke ismini secer")
    public void kullanici_gecerli_ulke_ismini_secer() {
        Driver.selectAnItemFromDropdown(adminPage.stateCitySecmeButonu,"YeniDunya");
        //WebElement dDM = adminPage.stateCitySecmeButonu;
        //Select select = new Select(dDM);
        //ReusableMethods.waitFor(3);
        //select.selectByVisibleText("YeniDunya");

    }
    @Given("Kullanici sectigi ulkenin delete butonuna tiklar")
    public void kullanici_sectigi_ulkenin_delete_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        List<String> silinmekIstenenUlkeIsmi= new ArrayList<>();
        silinmekIstenenUlkeIsmi.add("YeniDunya");

        List<String> sutundakiTumUlkeler = new ArrayList<>();
        for (WebElement each:adminPage.tumUlkeIsimleri
        ) {
            sutundakiTumUlkeler.add(each.getText());

        }
        System.out.println(sutundakiTumUlkeler);
        ReusableMethods.waitFor(5);

        for (int i = 0; i < silinmekIstenenUlkeIsmi.size(); i++) {
            Assert.assertTrue(sutundakiTumUlkeler.remove(silinmekIstenenUlkeIsmi.get(i)));

        }

    }
    @Given("Kullanici Confirm delete operation ekranini gorur ve delete i tiklar")
    public void kullanici_confirm_delete_operation_ekranini_gorur_ve_delete_i_tiklar() {



    }


    @And("Kullanici sayfayi kapatirr")
    public void kullaniciSayfayiKapatirr() {
    }
}
