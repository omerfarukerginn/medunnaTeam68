package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPageStepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("Kullanici ilgili test sayfasina gider")
    public void kullaniciIlgiliTestSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("Kullanici admin olarak giriş yapar")
    public void kullaniciAdminOlarakGirişYapar() {
        loginPage.loginPageMenuButton.click();
        loginPage.loginPageSingInMenuButton.click();
        loginPage.loginPageSingInUserNameKutusu.sendKeys("team68");
        loginPage.loginPageSingInPasswordKutusu.sendKeys("HealthTeam68!");
        loginPage.loginPageSingInSingInButton.click();
    }

    @Then("Kullanici staff mahmut olarak giriş yapar")
    public void kullaniciStaffMahmutOlarakGirişYapar() {
        loginPage.loginPageMenuButton.click();
        loginPage.loginPageSingInMenuButton.click();
        loginPage.loginPageSingInUserNameKutusu.sendKeys("staffMahmut");
        loginPage.loginPageSingInPasswordKutusu.sendKeys("staffMahmut8");
        loginPage.loginPageSingInSingInButton.click();
    }

    @Then("Kullanici doktor mahmut olarak giriş yapar")
    public void kullaniciDoktorMahmutOlarakGirişYapar() {
        loginPage.loginPageMenuButton.click();
        loginPage.loginPageSingInMenuButton.click();
        loginPage.loginPageSingInUserNameKutusu.sendKeys("doktorMahmut");
        loginPage.loginPageSingInPasswordKutusu.sendKeys("doktorMahmut8");
        loginPage.loginPageSingInSingInButton.click();
    }

    @Then("Kullanici hasta mahmut olarak giris yapar")
    public void kullaniciHastaMahmutOlarakGirisYapar() {
        loginPage.loginPageMenuButton.click();
        loginPage.loginPageSingInMenuButton.click();
        loginPage.loginPageSingInUserNameKutusu.sendKeys("hastaMahmut");
        loginPage.loginPageSingInPasswordKutusu.sendKeys("hastaMahmut8");
        loginPage.loginPageSingInSingInButton.click();
    }
}
