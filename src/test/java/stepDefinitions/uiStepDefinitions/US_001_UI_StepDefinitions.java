
package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.asserts.SoftAssert;
import pages.DoctorPage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_001_UI_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    SoftAssert softAssert = new SoftAssert();
    DoctorPage dr = new DoctorPage();

    @Given("Kullanici medunna anasayfasina gider")
    public void kullanici_medunna_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Given("kullanici registration sayfasina gider\\(navigate)")
    public void kullanici_registration_sayfasina_gider_navigate() {

        dr.humanButton.click();
        registerPage.homePageRegisterButton.click();
        System.out.println("ne olacak böyle");

        loginPage.loginPageMenuButton.click();
        registerPage.homeRegisterButton.click();


    }

    @Given("kullanici ssn kutusunu tiklar ve  kullanci gecerli snn numaralarini girer {string}")
    public void kullanici_ssn_kutusunu_tiklar_ve_kullanci_gecerli_snn_numaralarini_girer(String string) {
        registerPage.ssnRegisterPage.click();
        registerPage.ssnRegisterPage.sendKeys(string);
    }

    @Then("Kullanici uyari mesaji gormemeli {string}")
    public void kullanici_uyari_mesaji_gormemeli(String string) {
        boolean flag = true;

        try {
            registerPage.invalidFirstNameMessageRegisterPage.isDisplayed();
        } catch (Exception e) {
            flag = false;
        }
        softAssert.assertFalse(flag);
        softAssert.assertAll();
    }

    @Given("kullanici ssn kutusunu tiklar ve  ucuncu ve besinci haneden sonra herahngi bir isaret KOYMADAN DOKUZ haneli snn numaralarini girer {string}")
    public void kullanici_ssn_kutusunu_tiklar_ve_ucuncu_ve_besinci_haneden_sonra_herahngi_bir_isaret_koymadan_dokuz_haneli_snn_numaralarini_girer(String string) {
        registerPage.ssnRegisterPage.sendKeys(string);
        registerPage.firstNameRegisterPage.click();
    }

    @Given("kullanici ssn kutusunu tiklar ve  ucuncu ve besinci haneden sonra gerekli isareti koyduktundan sonra sekiz ve on haneli ssn girer {string}")
    public void kullanici_ssn_kutusunu_tiklar_ve_ucuncu_ve_besinci_haneden_sonra_gerekli_isareti_koyduktundan_sonra_sekiz_ve_on_haneli_ssn_girer(String string) {
        registerPage.ssnRegisterPage.sendKeys(string);
        registerPage.firstNameRegisterPage.click();
    }

    @Then("Kullanici Your SSN is invalid mesajini gormeli")
    public void kullaniciYourSSNIsInvalidMesajiniGormeli() {
        String actualMessages = registerPage.invalidSsnMessageRegisterPage.getText();
        softAssert.assertEquals(actualMessages, "Your SSN is invalid");
        softAssert.assertAll();
    }


    @When("kullanci ssn kutusunu bos birakmali")
    public void kullanciSsnKutusunuBosBirakmali() {
        registerPage.ssnRegisterPage.sendKeys("");

    }

    @Then("kullanci your ssn is invalid mesaji almali")
    public void kullanciYourSsnIsInvalidMesajiAlmali() {
        boolean flag = false;
        try {
            if (!(registerPage.invalidSsnMessageRegisterPage.isDisplayed())) {
                System.out.println("users should have seen Your ssn is Invalid");
            }

        } catch (Exception e) {
            flag = true;
        }
        softAssert.assertFalse(flag);
        softAssert.assertAll();
    }

    @Given("kullanici herhangi bir karakter iceren ve bos birakilmayan gecerli bir first name girmelidir{string}")
    public void kullaniciHerhangiBirKarakterIcerenVeBosBirakilmayanGecerliBirFirstNameGirmelidir(String firstname) {
        registerPage.firstNameRegisterPage.click();
        registerPage.firstNameRegisterPage.sendKeys(firstname);
    }

    @Then("Kullanici uyari mesaji gormemeli")
    public void kullaniciUyariMesajiGormemeli() {
        boolean flag = true;
        try {
            registerPage.invalidFirstNameMessageRegisterPage.isDisplayed();
        } catch (Exception e) {
            flag = false;
        }

        softAssert.assertFalse(flag);
        softAssert.assertAll();
    }


    @Given("kullanci herhangi bir karakter iceren ve ilkharf yazildiktan ve son harf yazilmadan once herhangi bir yerde bosluk birakarak first name girmelidir{string}")
    public void kullanciHerhangiBirKarakterIcerenVeIlkharfYazildiktanVeSonHarfYazilmadanOnceHerhangiBirYerdeBoslukBirakarakFirstNameGirmelidir(String firstname) {
        registerPage.firstNameRegisterPage.sendKeys(firstname);
    }

    @Given("kullanici herhangi bir karakter iceren ve basta bos birakilan bir first name girmelidir {string}")
    public void kullaniciHerhangiBirKarakterIcerenVeBastaBosBirakilanBirFirstNameGirmelidir(String firstname) {
        registerPage.firstNameRegisterPage.sendKeys(firstname);

    }


    @Then("Kullanici your firstname is required uyari mesajini gormeli")
    public void kullaniciYourFirstnameIsRequiredUyariMesajiniGormeli() {
        registerPage.lastNameRegisterPage.click();
        softAssert.assertTrue(registerPage.invalidFirstNameMessageRegisterPage.isDisplayed());
        softAssert.assertAll();
    }

    @When("kullanici first name kutusunu bos birakmali")
    public void kullaniciFirstNameKutusunuBosBirakmali() {
        registerPage.firstNameRegisterPage.sendKeys("");

    }

    @Then("kullanci first name is required mesajini almali")
    public void kullanciFirstNameIsRequiredMesajiniAlmali() {
        boolean flag = true;
        try {
            if (!(registerPage.firstNameRegisterPage.isDisplayed())) {
                System.out.println("users should have seen first name is required");
            }

        } catch (Exception e) {
            flag = false;
        }
        softAssert.assertFalse(flag);
        softAssert.assertAll();
    }

    @Given("kullanici herhangi bir karakter iceren ve bos birakilmayan gecerli bir last name girmelidir{string}")
    public void kullaniciHerhangiBirKarakterIcerenVeBosBirakilmayanGecerliBirLastNameGirmelidir(String lastname) {
        registerPage.lastNameRegisterPage.sendKeys(lastname);

    }

    @Then("Kullanici your last name is required mesaji gormemeli")
    public void kullaniciYourLastNameIsRequiredMesajiGormemeli() {
        boolean flag = true;

        try {
            registerPage.invalidLastNameMessageRegisterPage.isDisplayed();
            System.out.println("user shoud not see any message");
        } catch (Exception e) {
            flag = false;
        }
        softAssert.assertFalse(flag);
        softAssert.assertAll();

    }

    @Given("kullanici hrhangi bir karakter iceren ancak BASTA bosluk birakarak bir last name girer {string}")
    public void kullaniciHrhangiBirKarakterIcerenAncakBASTABoslukBirakarakBirLastNameGirer(String lastname) {
        registerPage.lastNameRegisterPage.sendKeys(lastname);
    }

    @Given("kullanici hrhangi bir karakter iceren ancak ORTADA bosluk birakarak bir last name girer {string}")
    public void kullaniciHrhangiBirKarakterIcerenAncakORTADABoslukBirakarakBirLastNameGirer(String last_name) {
        registerPage.lastNameRegisterPage.sendKeys(last_name);
    }

    @Then("kullanci your last name is required mesajini gormeli")
    public void kullanciYourLastNameIsRequiredMesajiniGormeli() {
        registerPage.userNameRegisterPage.click();
        softAssert.assertTrue(registerPage.invalidLastNameMessageRegisterPage.isDisplayed());
        softAssert.assertAll();
    }
}


