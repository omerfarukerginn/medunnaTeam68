package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SettingsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_006_UI_StepDefinition {

    SettingsPage us006 = new SettingsPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıci ana sayfaya gider")
    public void kullanıci_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

    }

    @Given("Kullanıcı sign in butonuna basar")
    public void kullanıcı_sign_in_butonuna_basar() {
        us006.loginButtonu.click();
        us006.singinButtonu.click();
    }

    @Given("Kullanıcı username kutusuna gecerli bir username bilgilerini girer")
    public void kullanıcı_username_kutusuna_gecerli_bir_username_bilgilerini_girer() {
        us006.userName.sendKeys("drAkif");
    }

    @Given("Kullanıcı password kutusuna gecerli password bilgilerini girer")
    public void kullanıcı_password_kutusuna_gecerli_password_bilgilerini_girer() {
        us006.password.sendKeys("227785Nc.");

    }

    @Given("Kullanıcı, sağ altta bulunan Sign in düğmesine tıklamalıdır")
    public void kullanıcı_sağ_altta_bulunan_sign_in_düğmesine_tıklamalıdır() {
        ReusableMethods.waitFor(3);
        us006.girisSonrasiSingin.sendKeys(Keys.ENTER);
    }

    @Then("Kullanici adi ile sayfaya giris yaptigini gorur")
    public void kullanici_adi_ile_sayfaya_giris_yaptigini_gorur() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us006.kullaniciGiris.isDisplayed());

    }

    @And("Kullanıcı, bilgiler için Kullanıcı ayarları sayfasini gider")
    public void kullanıcıBilgilerIçinKullanıcıAyarlarıSayfasiniGider() {
        ReusableMethods.waitFor(3);
        us006.kullaniciGiris.click();
        us006.settings.click();

    }

    @Then("Sayfa için kullanıcı ayarları Ad, Soyadı ve E-posta seçeneklerini gorur")
    public void sayfaIçinKullanıcıAyarlarıAdSoyadıVeEPostaSeçenekleriniGorur() {

        Assert.assertTrue(us006.firstName.isDisplayed());
        Assert.assertTrue(us006.lastName.isDisplayed());
        Assert.assertTrue(us006.email.isDisplayed());
    }

    @Given("Kullanici first name guncellenebilir olmali")
    public void kullanici_first_name_guncellenebilir_olmali() {
        us006.firstNameKutusu.clear();
        us006.firstNameKutusu.sendKeys("cengiz");
    }

    @Given("Kullanici last name guncellenebilir olmali")
    public void kullanici_last_name_guncellenebilir_olmali() {
        us006.lastNameKutusu.clear();
        us006.lastNameKutusu.sendKeys("bey");
    }

    @Given("Kullanici E-mail guncellenebilir olmali")
    public void kullanici_e_mail_guncellenebilir_olmali() {
        us006.emailKutusu.clear();
        us006.emailKutusu.sendKeys("drcengiz@gmail.com");
    }

    @Given("Kullanici save tusuna basar")
    public void kullanici_save_tusuna_basar() {
        us006.saveButonu.click();
    }

    @Then("Sol ustte cikan mesajla yeni bilgilerin kaydedildiginini kontrol eder")
    public void sol_ustte_cikan_mesajla_yeni_bilgilerin_kaydedildiginini_kontrol_eder() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(us006.settingSaved, 3).isDisplayed());

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Given("Kullanici first name kisimi bos birakir")
    public void kullanici_first_name_kisimi_bos_birakir() {
        us006.firstNameKutusu.clear();
        us006.firstNameKutusu.sendKeys(" ");
        actions.sendKeys(Keys.TAB).build().perform();

    }

    @Then("Kullanıcı, bos first name girerken first name gereklidir metin mesajını görmeli")
    public void kullanıcı_bos_first_name_girerken_first_name_gereklidir_metin_mesajını_görmeli() {
        Assert.assertTrue(us006.firstNameBosUyari.isDisplayed());

    }

    @Then("Kullanici last name kisimi bos birakir")
    public void kullanici_last_name_kisimi_bos_birakir() {
        us006.lastNameKutusu.clear();
        us006.lastNameKutusu.sendKeys(" ");
        actions.sendKeys(Keys.TAB).build().perform();

    }

    @Then("Kullanıcı, boslast name girerken last name gereklidir metin mesajını görmeli")
    public void kullanıcı_boslast_name_girerken_last_name_gereklidir_metin_mesajını_görmeli() {
        Assert.assertTrue(us006.lastNameBosUyari.isDisplayed());
    }

    @Then("Kullanici E-mail kisimi bos birakir")
    public void kullanici_e_mail_kisimi_bos_birakir() {
        us006.emailKutusu.clear();
        us006.emailKutusu.sendKeys(" ");
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Then("Kullanıcı, bos E-Mail girerken E-Mail gereklidir metin mesajını görmeli")
    public void kullanıcı_bos_e_mail_girerken_e_mail_gereklidir_metin_mesajını_görmeli() {
        Assert.assertTrue(us006.emailBosUYari.isDisplayed());
    }


    @Then("Kullanıcı, E-Mail girerken gecersiz E-Mail  metin mesajını görmeli")
    public void kullanıcı_e_mail_girerken_gecersiz_e_mail_metin_mesajını_görmeli() {

        Assert.assertTrue(us006.gecersizEmailUYari.isDisplayed());
    }


    @And("Kullanici gecersiz bir E-mail girmeli {string}")
    public void kullaniciGecersizBirEMailGirmeli(String email) {
        us006.emailKutusu.clear();
        us006.emailKutusu.sendKeys(email);
    }
}
