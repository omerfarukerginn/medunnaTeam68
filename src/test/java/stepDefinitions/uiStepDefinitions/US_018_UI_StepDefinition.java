package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_018_UI_StepDefinition {


    AdminPage us018 = new AdminPage();

    @Given("mnk Admin {string} anasayfasina gider")
    public void mnkAdminAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("mnk Admin login menusunu secer")
    public void mnk_admin_login_menusunu_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("mnk Admin Sing in islemini secer")
    public void mnk_admin_sing_in_islemini_secer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("mnk Admin username kutusuna admin ismini girer")
    public void mnk_admin_username_kutusuna_admin_ismini_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("mnk Admin password kutusuna admin sifresini girer")
    public void mnk_admin_password_kutusuna_admin_sifresini_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("mnk Admin Sing in butonuna tiklar")
    public void mnk_admin_sing_in_butonuna_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("mnk Admin items&Titles bolumunu secer Physician sekmesini tiklar")
    public void mnkAdminItemsTitlesBolumunuSecerPhysicianSekmesiniTiklar() {

    }


    @Then("mnk Admin tum doktorlarin ilk sayfasini gorur")
    public void mnk_admin_tum_doktorlarin_ilk_sayfasini_gorur() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("mnk Admin sayfayi kapatir")
    public void mnk_admin_sayfayi_kapatir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
