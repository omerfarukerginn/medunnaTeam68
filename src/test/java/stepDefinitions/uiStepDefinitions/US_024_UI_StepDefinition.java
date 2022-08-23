package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.PatientPage;
import pages.SettingsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_024_UI_StepDefinition {
    SettingsPage stg24 = new SettingsPage();
    PatientPage ptnt24 = new PatientPage();

    @Given("Kullanici hasta olarak giris yapar")
    public void kullanici_hasta_olarak_giris_yapar() {
        stg24.userName.sendKeys(ConfigReader.getProperty("us_24hastaUserName"));
        stg24.password.sendKeys(ConfigReader.getProperty("us_24hastaPassword"));
        stg24.girisSonrasiSingin.click();
    }

    @And("hasta my pages buttonunu tiklar")
    public void hastaMyPagesButtonunuTiklar() {
        ReusableMethods.waitFor(2);
        ptnt24.myPagesPatienAFButton.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @Given("hasta my appointment buttonunu tiklar")
    public void hasta_my_appointment_buttonunu_tiklar() {

        Driver.waitAndClick(ptnt24.myAppointmensAFbutton);
        ReusableMethods.waitFor(2);
    }

    @Given("hasta show tests butonuna tiklar")
    public void hasta_show_tests_butonuna_tiklar() {
        ptnt24.showTestButton.click();

    }

    @Given("hasta view results tests butonuna tiklar")
    public void hasta_view_results_tests_butonuna_tiklar() {
        ptnt24.viewResultsButton.click();
    }

    @Then("hasta id name default min value default max value date description bolumlerini gorur")
    public void hastaIdNameDefaultMinValueDefaultMaxValueDateDescriptionBolumleriniGorur() {
        Assert.assertTrue(ptnt24.idSekmesi.isDisplayed());
        Assert.assertTrue(ptnt24.nameSekmesi.isDisplayed());
        Assert.assertTrue(ptnt24.defaultMinValueSekmesi.isDisplayed());
        Assert.assertTrue(ptnt24.defaultMaxValueSekmesi.isDisplayed());
        Assert.assertTrue(ptnt24.dateSekmesi.isDisplayed());
        Assert.assertTrue(ptnt24.descriptionSekmesi.isDisplayed());
    }


    @Given("hasta show inivoice butonuna tiklar")
    public void hastaShowInivoiceButonunaTiklar() {
        ptnt24.showInivoiceButton.click();
    }

    @Given("hasta fatura bilgilerini goruntuler")
    public void hastaFaturaBilgileriniGoruntuler() {
        org.testng.Assert.assertTrue(ptnt24.faturaBilgileri.isDisplayed());
    }


}
