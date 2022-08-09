package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.openqa.selenium.Keys.TAB;

public class US_004_UI_StepDefinition {

    LoginPage us004 = new LoginPage();


    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("Kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        us004.loginPageMenuButton.click();
    }

    @Then("Kullanici Sing in secenegini secer")
    public void kullanici_sing_in_secenegini_secer() {
        us004.loginPageSingInMenuButton.click();
    }

    @Then("Kullanici username kutusuna gecerli bir username bilgilerini girer")
    public void kullanici_username_kutusuna_gecerli_bir_username_bilgilerini_girer() {
        us004.loginPageSingInUserNameKutusu.sendKeys(ConfigReader.getProperty("AdminUserName"));
    }

    @Then("Kullanici password kutusuna gecerli password bilgilerini girer")
    public void kullanici_password_kutusuna_gecerli_password_bilgilerini_girer() {
        us004.loginPageSingInPasswordKutusu.sendKeys(ConfigReader.getProperty("AdminPassword"));
    }

    @Then("Kullanici Sign in butonuna tiklar.")
    public void kullanici_sign_in_butonuna_tiklar() {
        us004.loginPageSingInSingInButton.click();
    }

    @Then("Kullanici kayit ismini gorur")
    public void kullanici_kayit_ismini_gorur()  {
        Assert.assertTrue(us004.loginPageMenuButton.isDisplayed());
        //Assert.assertTrue(us004.loginPageMenuButton.getText().equals("team68"));
        //Assert.assertTrue(us004.loginPageSingInUserNameKutusu.getText().contains("team68"));
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("Kullanici Beni Hatirla secenegini secebilmeli")
    public void kullaniciBeniHatirlaSeceneginiSecebilmeli() {
        if (us004.loginPageRememberMeCheckbox.isSelected()){
            us004.loginPageRememberMeCheckbox.click();
        }
    }

    @And("Kullanici Did you forget your password? secenegine tiklar")
    public void kullaniciDidYouForgetYourPasswordSecenegineTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(us004.loginPageSingInUserNameKutusu)
                .sendKeys(TAB).sendKeys(TAB).sendKeys(TAB).sendKeys(Keys.ENTER)
                .perform();
        //us004.loginPageForgetPasswordLink.click();
    }

    @And("Kullanici sifre sifirlama sayfasini gorur")
    public void kullaniciSifreSifirlamaSayfasiniGorur() {
        Assert.assertTrue(us004.loginPageResetPasswordPage.isDisplayed());
    }

    @And("Kullanici You don't have an account yet? Register a new account secenegine tiklar")
    public void kullaniciYouDonTHaveAnAccountYetRegisterANewAccountSecenegineTiklar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(us004.loginPageSingInUserNameKutusu)
                .sendKeys(TAB).sendKeys(TAB).sendKeys(TAB).sendKeys(TAB).sendKeys(Keys.ENTER)
                .perform();
    }

    @And("Kullanici Registration sayfasini gorur")
    public void kullaniciRegistrationSayfasiniGorur() {
        Assert.assertTrue(us004.loginPageRegistrationPage.isDisplayed());
    }

    @And("Kullanici Cancel secenegine tiklar")
    public void kullaniciCancelSecenegineTiklar() {
        us004.loginPageCancelButton.click();
    }


    @Then("Kullanici ana sayfayi gorur")
    public void kullaniciAnaSayfayiGorur() {
        String expectedUrl = "https://www.medunna.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @And("Kullanici Cancel secenegini gorur")
    public void kullaniciCancelSeceneginiGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us004.loginPageCancelButton.isDisplayed());
    }
}
