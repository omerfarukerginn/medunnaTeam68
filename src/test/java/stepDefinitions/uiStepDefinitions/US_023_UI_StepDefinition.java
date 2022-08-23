package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.StaffPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class US_023_UI_StepDefinition {
    StaffPage stf23 = new StaffPage();

    @Given("staff my pages menusunu tiklar")
    public void staff_my_pages_menusunu_tiklar() {
        ReusableMethods.waitForVisibility(stf23.myPagesButton, 3).click();

    }

    @Given("staff search patient buttonunu tiklar")
    public void staff_search_patient_buttonunu_tiklar() {
        Driver.waitAndClick(stf23.dropDownSearchPatientButton);

    }

    @And("staff arama kutusuna SSN ile hastayi arar")
    public void staffAramaKutusunaSSNIleHastayiArar() {
        stf23.patientSsnSearchTextBox.sendKeys("333-45-5566", Keys.ENTER);
    }

    @Given("staff show appointment buttonunu tiklar")
    public void staff_show_appointment_buttonunu_tiklar() {
        stf23.showAppointmentButton.click();
    }

    @Given("staff hastanin durumunun completede veya cancelled oldugunu dogrular")
    public void staff_hastanin_durumunun_completede_veya_cancelled_oldugunu_dogrular() {

        if (stf23.statusCheckButton.getText().equalsIgnoreCase("Cancelled") ||
                stf23.statusCheckButton.getText().equalsIgnoreCase("completede")) {
            Assert.assertTrue(stf23.statusCheckButton.isDisplayed());
        }


    }


    @Given("staff payment invoice buttonunu tiklar")
    public void staff_payment_invoice_buttonunu_tiklar() {
        ReusableMethods.waitForVisibility(stf23.paymentInvoiceButton, 2).click();

    }

    @Then("staf muayene ucreti, test urun fiyatlari, bilgilerini goruntuleyebilir")
    public void staf_muayene_ucreti_test_urun_fiyatlari_bilgilerini_goruntuleyebilir() {
        Assert.assertTrue(stf23.examFreeButton.isDisplayed());
        Assert.assertTrue(stf23.testItemFreeButton.isDisplayed());

        /*
        Random rnd = new Random();
        int rand1 = rnd.nextInt(21);

        for (int i = 0; i < stf23.random.size(); i++) {
            ReusableMethods.hooverByJS(adminPage.viewButonu.get(rand1));

        }
         */
    }

    @Then("staff hasta icin create inovoice tiklayarak fatura olusturur")
    public void staff_hasta_icin_create_inovoice_tiklayarak_fatura_olusturur() {
        stf23.createInvoiceButton.sendKeys(Keys.ENTER);

    }

    @Then("staff olusturdugu faturayi kaydeder")
    public void staff_olusturdugu_faturayi_kaydeder() {
       ReusableMethods.waitFor(2);
        stf23.saveAFButton.sendKeys(Keys.ENTER);

    }

    @Then("staff basari ile kaydedildi msj i dogrular")
    public void staff_basari_ile_kaydedildi_msj_i_dogrular() {
        Assert.assertTrue(Driver.waitForVisibility(stf23.invoiceSuccessMessage, 5).isDisplayed());


    }

    @And("staff showw Invoice butonuna tiklar")
    public void staffShowwInvoiceButonunaTiklar() {
        stf23.showInvoiceButton.sendKeys(Keys.ENTER);
    }

    @Then("staf fatura sayfasini dogrular")
    public void staf_fatura_sayfasini_dogrular() {
Assert.assertTrue(stf23.invoiceDogrulama.isDisplayed());

    }


}