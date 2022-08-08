package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class US_003_StepDefinition {

    RegisterPage register=new RegisterPage();

    @Given("Kullanici Medunna anasayfasina gider")
    public void kullanici_medunna_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @When("Kullanici Account Menu bolumune tiklar")
    public void kullanici_account_menu_bolumune_tiklar() {
        register.accountMenu.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici registration sekmesine tiklar")
    public void kullanici_registration_sekmesine_tiklar() {
        register.accountMenuRegisterButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici New Password kisminda yeni {string} girer")
    public void kullanici_new_password_kisminda_yeni_girer(String password) {
        register.newPasswordSec.sendKeys(password);
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici parolanin gucunu dogrular {string}")
    public void kullanici_parolanin_gucunu_dogrular(String strength) {
        if (2==Integer.parseInt(strength)){
            Assert.assertTrue(register.passwordIkinciRenk.isDisplayed());
        }else if (4==Integer.parseInt(strength)){
            Assert.assertTrue(register.passwordDorduncuRenk.isDisplayed());
        }else if (5==Integer.parseInt(strength)){
            Assert.assertTrue(register.passwordBesinciRenk.isDisplayed());
        }

    }


    @Then("Kullanici parolanin gucunun degismedigini {string}")
    public void kullanici_parolanin_gucunun_degismedigini(String strength) {
        if (1==Integer.parseInt(strength)){
            Assert.assertTrue(register.passwordIlkRenk.isDisplayed());
        }
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }


}
