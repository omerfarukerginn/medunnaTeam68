package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_014_UI_StepDefinition {

    DoctorPage us014 = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıci Ana Sayfaya gider")
    public void kullanıci_Ana_Sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }

    @Given("Kullanıcı Sign In butonuna basar")
    public void kullanıcı_Sign_In_butonuna_basar() {
        us014.humanButton.click();
        us014.singInButtonu.click();
    }

    @Given("Kullanıcı Username kutusuna gecerli bir username bilgilerini girer")
    public void kullanıcı_Username_kutusuna_gecerli_bir_username_bilgilerini_girer() {
        us014.userName.sendKeys("doktorMahmut");
    }

    @Given("Kullanıcı Password kutusuna gecerli Password bilgilerini girer")
    public void kullanıcı_Password_kutusuna_gecerli_Password_bilgilerini_girer() {
        us014.password.sendKeys("doktorMahmut8");

    }


    @And("Kullanıcı, sağ altta bulunan Sign In düğmesine tıklamalıdır")
    public void kullanıcıSağAlttaBulunanSignInDüğmesineTıklamalıdır() {
        ReusableMethods.waitFor(3);
        us014.girisSonrasiSingIn.sendKeys(Keys.ENTER);


    }

    @And("Kullanici Sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
