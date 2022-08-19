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


    @Given("Kullanici dr ana sayfaya gider")
    public void kullaniciDrAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @And("Kullanici sign in butonuna basar")
    public void kullaniciSignInButonunaBasar() {
        us006.loginButtonu.click();
        us006.singinButtonu.click();

    }

    @And("Kullanici dr username kutusuna gecerli bir username bilgilerini girer")
    public void kullaniciDrUsernameKutusunaGecerliBirUsernameBilgileriniGirer() {
        us006.userName.sendKeys("drAkif");
    }

    @And("Kullanici dr password kutusuna gecerli password bilgilerini girer")
    public void kullaniciDrPasswordKutusunaGecerliPasswordBilgileriniGirer() {
        us006.password.sendKeys("227785Nc.");
    }

    @And("Kullanici, sag altta bulunan Sign in dugmesine tiklamalidir")
    public void kullaniciSagAlttaBulunanSignInDugmesineTiklamalidir() {
        ReusableMethods.waitFor(3);
        us006.girisSonrasiSingin.sendKeys(Keys.ENTER);
    }

    @Then("Kullanici adi ile sayfaya giris yaptigini gorur")
    public void kullanici_adi_ile_sayfaya_giris_yaptigini_gorur() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us006.kullaniciGiris.isDisplayed());

    }



    @And("Kullanici, bilgiler icin Kullanici ayarlari sayfasina gider")
    public void kullaniciBilgilerIcinKullaniciAyarlariSayfasinaGider() {
        ReusableMethods.waitFor(3);
        us006.kullaniciGiris.click();
        us006.settings.click();


    }

    @Then("Sayfa icin kullanici ayarlari Ad, soayadi ve E-posta secenekleri gorur")
    public void sayfaIcinKullaniciAyarlariAdSoayadiVeEPostaSecenekleriGorur() {
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

    @Then("Sol ustte cikan mesajla yeni bilgilerin kaydedildigini kontrol eder")
    public void solUstteCikanMesajlaYeniBilgilerinKaydedildiginiKontrolEder() {

        Assert.assertTrue(ReusableMethods.waitForVisibility(us006.settingSaved, 3).isDisplayed());

    }


    @Given("Kullanici first name kisimi bos birakir")
    public void kullanici_first_name_kisimi_bos_birakir() {
        us006.firstNameKutusu.clear();
        us006.firstNameKutusu.sendKeys(" ");
        actions.sendKeys(Keys.TAB).build().perform();

    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("Kullanici, bos first name girerken first name gereklidir metin mesajini gormeli")
    public void kullaniciBosFirstNameGirerkenFirstNameGereklidirMetinMesajiniGormeli() {
        Assert.assertTrue(us006.firstNameBosUyari.isDisplayed());

    }


    @Then("Kullanici last name kisimi bos birakir")
    public void kullanici_last_name_kisimi_bos_birakir() {
        us006.lastNameKutusu.clear();
        us006.lastNameKutusu.sendKeys(" ");
        actions.sendKeys(Keys.TAB).build().perform();

    }

    @Then("Kullanici, bos last name girerken last name gereklidir metin mesajini gormeli")
    public void kullaniciBosLastNameGirerkenLastNameGereklidirMetinMesajiniGormeli() {
        Assert.assertTrue(us006.lastNameBosUyari.isDisplayed());
    }

    @Then("Kullanici E-mail kisimi bos birakir")
    public void kullanici_e_mail_kisimi_bos_birakir() {
        us006.emailKutusu.clear();
        us006.emailKutusu.sendKeys(" ");
        actions.sendKeys(Keys.TAB).build().perform();
    }

    @Then("Kullanici, bos E-Mail girerken E-Mail gereklidir metin mesajini gormeli")
    public void kullaniciBosEMailGirerkenEMailGereklidirMetinMesajiniGormeli() {
        Assert.assertTrue(us006.emailBosUYari.isDisplayed());
    }


    @Then("Kullanici, E-Mail girerken gecersiz E-Mail  metin mesajini gormeli")
    public void kullaniciEMailGirerkenGecersizEMailMetinMesajiniGormeli() {
        Assert.assertTrue(us006.gecersizEmailUYari.isDisplayed());
    }


    @And("Kullanici gecersiz bir E-mail girmeli {string}")
    public void kullaniciGecersizBirEMailGirmeli(String email) {
        us006.emailKutusu.clear();
        us006.emailKutusu.sendKeys(email);
    }


}
