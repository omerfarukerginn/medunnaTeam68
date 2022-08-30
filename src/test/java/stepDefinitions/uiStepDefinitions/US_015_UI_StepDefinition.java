package stepDefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_015_UI_StepDefinition {

    AdminPage adminPage = new AdminPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    Select select;
    SoftAssert softAssert = new SoftAssert();

    @Then("Admin Items&Titles sekmesini tiklar")
    public void admin_items_titles_sekmesini_tiklar() {
        adminPage.itemsTitlesButonu.click();
    }

    @Given("Admin Patient secenegini secer")
    public void admin_patient_secenegini_secer() {
        adminPage.patientButonuDDMenu.click();
    }

    @Given("Admin Create a new Patient butonuna tiklar")
    public void admin_create_a_new_patient_butonuna_tiklar() {
        adminPage.createNewPatientButton.click();
    }

    @Then("Admin hasta bilgilerini girer")
    public void admin_hasta_bilgilerini_girer() {
        adminPage.patientFirstNameBox.sendKeys(faker.name().firstName());
        adminPage.patientLastNameBox.sendKeys(faker.name().lastName());
        adminPage.patientBirthDateBox.sendKeys("00" + faker.date().birthday().getTime());
        adminPage.patientEmailBox.sendKeys(faker.internet().emailAddress());
        adminPage.patientPhoneBox.sendKeys(faker.phoneNumber().subscriberNumber(10));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        select = new Select(adminPage.patientGenderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(adminPage.patientBloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        adminPage.patientAdressBox.sendKeys(faker.address().streetAddress());
        adminPage.patientDescriptionBox.sendKeys(faker.lorem().word());
        select = new Select(adminPage.patientUserBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(adminPage.patientCountryBox);
        select.selectByVisibleText("USA");
        select = new Select(adminPage.patientStateBox);
        ReusableMethods.waitForVisibility(adminPage.patientStateBox, 5);
        select.selectByVisibleText("California");
    }

    @Then("Admin save butonuna basar")
    public void admin_save_butonuna_basar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        adminPage.patientSaveButton.submit();
    }

    @Then("Hasta olusturuldu mesajini gorur")
    public void hasta_olusturuldu_mesajini_gorur() {
        Assert.assertTrue(ReusableMethods.waitForVisibility(adminPage.patientSaveBasariliYazisi, 5).isDisplayed());
    }

    @And("Admin view butonuna basar")
    public void adminViewButonunaBasar() {
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        adminPage.patientViewButton.click();
    }

    @Then("Hasta bilgilerinin gorunurlugunu dogrular")
    public void hastaBilgilerininGorunurlugunuDogrular() {
        softAssert.assertTrue(adminPage.patientViewSSN.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewFirstName.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewLastName.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewBirthDate.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewPhone.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewGender.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewBloodGroup.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewAdress.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewDescription.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewCreatedDate.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewUser.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewCountry.isDisplayed());
        softAssert.assertTrue(adminPage.patientViewStateCity.isDisplayed());
    }

    @And("Admin edit butonuna basar")
    public void adminEditButonunaBasar() {
        adminPage.patientEditButton.click();
    }

    @Then("Hasta bilgilerinde degisiklik yapar")
    public void hastaBilgilerindeDegisiklikYapar() {
        adminPage.patientEditFirstNameBox.clear();
        adminPage.patientEditFirstNameBox.sendKeys(faker.name().firstName());
        adminPage.patientEditLastNameBox.clear();
        adminPage.patientEditLastNameBox.sendKeys(faker.name().lastName());
        adminPage.patientEditBirthDateBox.clear();
        adminPage.patientEditBirthDateBox.sendKeys("00" + faker.date().birthday().getTime());
        adminPage.patientEditEmailBox.clear();
        adminPage.patientEditEmailBox.sendKeys(faker.internet().emailAddress());
        adminPage.patientEditPhoneBox.clear();
        adminPage.patientEditPhoneBox.sendKeys(faker.phoneNumber().subscriberNumber(10));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        select = new Select(adminPage.patientEditGenderBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        select = new Select(adminPage.patientEditBloodGroupBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
        adminPage.patientEditAdressBox.clear();
        adminPage.patientEditAdressBox.sendKeys(faker.address().streetAddress());
        adminPage.patientEditDescriptionBox.clear();
        adminPage.patientEditDescriptionBox.sendKeys(faker.lorem().word());
        select = new Select(adminPage.patientEditUserBox);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @And("Edit sonrasi Save butonuna basar")
    public void editSonrasiSaveButonunaBasar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        adminPage.patientEditSaveButton.submit();
    }

    @And("Guncelleme yapildi yazisinin gorunurlugunu test eder")
    public void guncellemeYapildiYazisininGorunurlugunuTestEder() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(ReusableMethods.waitForVisibility(adminPage.patientEditBasariliYazisi, 5).isDisplayed());
    }

    @Given("Admin Appointments secenegini secer")
    public void admin_appointments_secenegini_secer() {
        adminPage.appointmentDDMButton.click();
    }

    @Given("Admin Appointment edit butonuna basar")
    public void admin_appointment_edit_butonuna_basar() {
        actions.sendKeys(Keys.ARROW_RIGHT);
        adminPage.appointmentEditButton.click();
    }

    @Then("Herhangi bir doktor atamasi yapar")
    public void herhangi_bir_doktor_atamasi_yapar() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        select = new Select(adminPage.appointmentDoktorAtamaDDM);
        Thread.sleep(3000);
        ReusableMethods.selectRandomTextFromDropdown(select);
    }

    @Then("Appointment sonrasi Save butonuna basar")
    public void appointment_sonrasi_save_butonuna_basar() {
        adminPage.appointmentSaveButton.submit();
    }

    @Then("Appointment Guncelleme yapildi yazisinin gorunurlugunu test eder")
    public void appointment_guncelleme_yapildi_yazisinin_gorunurlugunu_test_eder() {
        softAssert.assertTrue(adminPage.appointmentDoktorAtamasiBasariliYazisi.isDisplayed(), "Doktor atamasi yapilamadi");

    }

}
