package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import pages.PasswordPage;
import pages.SettingsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_008_UI_StepDefinition {
    LoginPage loginPage = new LoginPage();
    PasswordPage passwordPage = new PasswordPage();
    SettingsPage settingsPage = new SettingsPage();
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

    @Given("ofe Kullanici bilgileri ile giris yapar")
    public void ofe_kullanici_bilgileri_ile_giris_yapar() {
        loginPage.loginPageSingInUserNameKutusu.sendKeys("hastakaan1");
        loginPage.loginPageSingInPasswordKutusu.sendKeys("hastakaan1");
        loginPage.loginPageSingInSingInButton.click();
    }

    @Given("ofe Kullanici sayfanin sag ust tarafinda bulunan ismine tiklar")
    public void ofe_kullanici_sayfanin_sag_ust_tarafinda_bulunan_ismine_tiklar() {
        settingsPage.loginButtonu.click();
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

    }


    @And("ofe Sayfayi kapatir")
    public void ofeSayfayiKapatir() {
    }



}
