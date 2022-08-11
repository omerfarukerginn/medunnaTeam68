package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.PasswordPage;
import utilities.Driver;

public class US_008_UI_StepDefinition {
    LoginPage loginPage = new LoginPage();
    PasswordPage passwordPage = new PasswordPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("ofe Kullanici test sayfasina gider")
    public void ofeKullaniciTestSayfasinaGider() {
        Driver.getDriver().get("https://medunna.com/");
    }

    @Given("ofe Kullanici Sign in butonuna tiklar")
    public void ofe_kullanici_sign_in_butonuna_tiklar() {
        loginPage.loginPageMenuButton.click();
        loginPage.loginPageSingInMenuButton.click();
    }

    @And("ofe Kullanici kullanici ismini girer")
    public void ofeKullaniciKullaniciIsminiGirer() {
        loginPage.loginPageSingInUserNameKutusu.sendKeys("hastakaan1");
    }

    @And("ofe Kullanici password kısmına {string} girer")
    public void ofeKullaniciPasswordKısmınaGirer(String currentPassword) {
        loginPage.loginPageSingInPasswordKutusu.sendKeys(currentPassword);
    }

    @And("ofe Kullanici giris yapmak icin sign in butonuna tiklar")
    public void ofeKullaniciGirisYapmakIcinSignInButonunaTiklar() {
        loginPage.loginPageSingInSingInButton.click();
    }

    @Given("ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar")
    public void ofe_kullanici_sayfanin_sag_ust_tarafinda_bulunan_ismine_tiklar() {
        passwordPage.homePageDropdown.click();
    }

    @Given("ofe Acilan dropdown sekmesinden Password butonuna tiklar")
    public void ofe_acilan_dropdown_sekmesinden_password_butonuna_tiklar() {
        passwordPage.homePagePasswordButton.click();
    }

    @And("ofe Acilan sayfadaki Current password kismina {string} mevcut sifresini girer")
    public void ofeAcilanSayfadakiCurrentPasswordKisminaMevcutSifresiniGirer(String currentPassword) {
        passwordPage.currentPasswordTextArea.sendKeys(currentPassword);
    }

    @And("ofe New password kismina {string} yeni sifresini girer")
    public void ofeNewPasswordKisminaYeniSifresiniGirer(String newPassword) {
        passwordPage.newPasswordTextArea.sendKeys(newPassword);
    }

    @And("ofe New password confirmation kismina yeni {string} sifresini tekrar girer")
    public void ofeNewPasswordConfirmationKisminaYeniSifresiniTekrarGirer(String newPassword2) {
        passwordPage.confirmPasswordTextArea.sendKeys(newPassword2);
    }


    @Given("ofe Save butonuna tiklar")
    public void ofe_save_butonuna_tiklar() {
        passwordPage.passwordPageSaveButton.click();
    }

    @And("ofe Password changed! uyarisinin goruldugunu onaylar")
    public void ofePasswordChangedUyarisininGoruldugunuOnaylar() {
        Assert.assertTrue(passwordPage.passwordChangedAlert.isDisplayed());
    }


    @And("ofe Sayfayi kapatir")
    public void ofeSayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("ofe kullanici password strength seviyesini degistirdigini onaylar")
    public void ofeKullaniciPasswordStrengthSeviyesiniDegistirdiginiOnaylar() {
        Assert.assertTrue(passwordPage.passwordStrengthLevel2.isDisplayed());
    }

    @And("ofe kullanici password strength seviyesinin daha guclu oldugunu onaylar")
    public void ofeKullaniciPasswordStrengthSeviyesininDahaGucluOldugunuOnaylar() {
        Assert.assertTrue(passwordPage.getPasswordStrengthLevel4.isDisplayed());
    }

    @And("ofe New password kismina {string} eski sifresini girer")
    public void ofeNewPasswordKisminaEskiSifresiniGirer(String oldPassword) {
        passwordPage.newPasswordTextArea.sendKeys(oldPassword);
    }

    @And("ofe New password confirmation kismina eski {string} sifresini tekrar girer")
    public void ofeNewPasswordConfirmationKisminaEskiSifresiniTekrarGirer(String oldPassword2) {
        passwordPage.confirmPasswordTextArea.sendKeys(oldPassword2);

    }

    @And("ofe Password changed! uyarisinin gorulmedigini onaylar")
    public void ofePasswordChangedUyarisininGorulmediginiOnaylar() {
        Assert.assertFalse(passwordPage.passwordChangedAlert.isDisplayed());
    }
}
