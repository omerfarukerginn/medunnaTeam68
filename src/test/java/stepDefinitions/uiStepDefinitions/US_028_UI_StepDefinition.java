package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_028_UI_StepDefinition {

    AdminPage adminPage = new AdminPage();

    @Given("Kullanici Medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @Given("Kullanici humain giris butonuna basar ve Sing In butonunu tiklar")
    public void kullanici_humain_giris_butonuna_basar_ve_sing_in_butonunu_tiklar() {
        adminPage.humanButton.click();
        adminPage.singInButtonu.click();
    }
    @Given("Kullanici gecerli username ve password girer")
    public void kullanici_gecerli_username_ve_password_girer() {
        adminPage.userName.sendKeys(ConfigReader.getProperty("AdminUserName"));
        adminPage.password.sendKeys(ConfigReader.getProperty("AdminPassword"));

    }
    @Given("Kullanici basarili giris yapar ve Welcome to Medunna yazisini gorur")
    public void kullanici_basarili_giris_yapar_ve_welcome_to_medunna_yazisini_gorur() {
        adminPage.girisSonrasiSingIn.click();
        Assert.assertTrue(adminPage.welcomeToMedunnaYazisi.isDisplayed());

    }
    @Given("Kullanici Items&Titles butonunu tiklar")
    public void kullanici_items_titles_butonunu_tiklar() {


    }
    @Given("Kullanici Country butonunu secer")
    public void kullanici_country_butonunu_secer() {
        ReusableMethods.waitFor(3);
        WebElement dropDownMenu = Driver.getDriver().findElement(By.xpath("//*[text()='Items&Titles']"));

        Select select = new Select(dropDownMenu);
        select.selectByVisibleText("Country");


    }
    @Given("Kullanici Create a new Country butonunu tiklar")
    public void kullanici_create_a_new_country_butonunu_tiklar() {


    }
    @Then("Kullanici gecerli ulke ismini yazar")
    public void kullanici_gecerli_ulke_ismini_yazar() {
        adminPage.createCountryNameButonu.sendKeys("YeniDunya");

    }
    @Then("Kullanici tarih ve saat girer.")
    public void kullanici_tarih_ve_saat_girer() {
        adminPage.tarihSaatButonu.sendKeys("21.08.2022 13:14");

    }
    @Then("Kullanici Save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {
        adminPage.saveButonu.click();
        // github beni bitirdi

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
