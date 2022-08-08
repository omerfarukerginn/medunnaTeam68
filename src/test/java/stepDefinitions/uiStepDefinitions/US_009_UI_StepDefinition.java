package stepDefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_009_UI_StepDefinition {

    StaffPage staffPage = new StaffPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));}

    @Then("Insan figurune tiklar")
    public void insan_figurune_tiklar() {staffPage.insanFiguru.click();}

    @Then("Sign in secenegini secer")
    public void sign_in_secenegini_secer() {staffPage.ilkSingin.click();}

    @Then("Staff olarak username ve password girer")
    public void staff_olarak_username_ve_password_girer() {
    staffPage.loginUsernameTextBox.sendKeys(ConfigReader.getProperty("staffUserName"));
    staffPage.loginPasswordTextBox.sendKeys(ConfigReader.getProperty("staffPassword"));}

    @Then("Sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {staffPage.singinButton.click();}

    @And("MY PAGES sekmesine tiklar")
    public void myPAGESSekmesineTiklar() {staffPage.myPagesButton.click();}

    @Then("Search Patient secenegini secer")
    public void search_patient_secenegini_secer() { staffPage.dropDownSearchPatientButton.click();}

    @Then("Patients yazisi ile listenin gorunurlugunu test eder")
    public void patients_yazisi_ile_listenin_gorunurlugunu_test_eder() {
        Assert.assertTrue(staffPage.patientsYaziElementi.isDisplayed());}

    @And("Patient SSN kutusuna {string} girer")
    public void patientSSNKutusunaGirer(String ssn) {staffPage.patientSsnSearchTextBox.sendKeys(ssn);}

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        staffPage.editButton.click();}

    @And("Staff hasta bilgilerinde duzenleme yapar")
    public void staffHastaBilgilerindeDuzenlemeYapar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        staffPage.firstNameTextBox.clear();
        staffPage.firstNameTextBox.sendKeys(faker.name().firstName());
        staffPage.lastNameTextBox.sendKeys(faker.name().lastName());
        staffPage.birthDateTextBox.sendKeys((CharSequence) faker.date().birthday());












    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        
    }

    @And("Dogrulama gozlemlenir")
    public void dogrulamaGozlemlenir() {
    }
}
