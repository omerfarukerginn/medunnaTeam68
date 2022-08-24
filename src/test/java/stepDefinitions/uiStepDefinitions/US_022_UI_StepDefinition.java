package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_022_UI_StepDefinition {

    StaffPage us022 = new StaffPage();


    @Then("mnk Staff My Pages bolumunu secer")
    public void mnk_staff_my_pages_bolumunu_secer() {
        ReusableMethods.waitFor(3);
        Driver.waitAndClick(us022.myPagesButton);

    }

    @And("mnk Staff Search patient sekmesini secer")
    public void mnkStaffSearchPatientSekmesiniSecer() {
        ReusableMethods.waitFor(3);
        us022.dropDownSearchPatientButton.click();

    }

    @And("mnk Staff SSN arama kutusuna kayitli SSN girer")
    public void mnkStaffSSNAramaKutusunaKayitliSSNGirer() {
        ReusableMethods.waitFor(3);
        us022.patientSsnSearchTextBox.sendKeys(ConfigReader.getProperty("yeniHastaSSN"));
    }

    @And("mnk Staff arama sonuc sayfasini gorur")
    public void mnkStaffAramaSonucSayfasiniGorur() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us022.hastaSsnOnayi.isDisplayed());

    }

    @And("mnk Staff Show Appointments kutuusna tiklar")
    public void mnkStaffShowAppointmentsKutuusnaTiklar() {
        ReusableMethods.waitFor(3);
        us022.showAppointButonu.click();
    }

    @And("mnk Staff Show Test kutusuna tiklar")
    public void mnkStaffShowTestKutusunaTiklar() {
        ReusableMethods.waitFor(3);
        us022.showTestButonu.click();
    }

    @And("mnk Staff View Results kutusuna tiklar")
    public void mnkStaffViewResultsKutusunaTiklar() {
        ReusableMethods.waitFor(3);
        us022.viewResultsButonu.click();
    }

    @And("mnk Staff View Results sayfasini gorur")
    public void mnkStaffViewResultsSayfasiniGorur() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us022.testResultBaslikYazisi.isDisplayed());
    }

    @And("mnk Staff Edit kutusuna tiklar")
    public void mnkStaffEditKutusunaTiklar() {
        ReusableMethods.waitFor(3);
        us022.resultEditButonu.click();
    }

    @And("mnk Staff Test Result lari gorur ve gunceller")
    public void mnkStaffTestResultLariGorurVeGunceller() {
        ReusableMethods.waitFor(3);
    Assert.assertTrue(us022.resultEditId.isDisplayed());
    Assert.assertTrue(us022.resultEditDate.isDisplayed());
        ReusableMethods.waitFor(3);
    us022.resultEditResultKutusu.sendKeys("pozitive");
    us022.resultEditDescriptionKutusu.sendKeys("yatili");
        ReusableMethods.waitFor(3);
    Assert.assertTrue(us022.resultEditCreatesDate.isDisplayed());
    Assert.assertTrue(us022.resultEditTest.isDisplayed());

    }
}
