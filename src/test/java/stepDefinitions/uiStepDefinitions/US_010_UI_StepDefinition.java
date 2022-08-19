package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DoctorPage;
import utilities.ConfigReader;

public class US_010_UI_StepDefinition {

    DoctorPage drPage = new DoctorPage();

    @Given("Kullanici Dr olarak username kutusuna gecerli bir username bilgilerini girer")
    public void Kullanici_dr_olarak_username_kutusuna_gecerli_bir_username_bilgilerini_girer() {
        drPage.userName.sendKeys(ConfigReader.getProperty("doktorUserName"));
    }

    @Given("Kullanici Dr olarak password kutusuna gecerli password bilgilerini girer")
    public void Kullanici_dr_olarak_password_kutusuna_gecerli_password_bilgilerini_girer() {
        drPage.password.sendKeys(ConfigReader.getProperty("doktorPassword"));
    }

    @Given("Kullanici Dr olarak My Pages butonuna tiklar")
    public void kullanici_dr_olarak_my_pages_butonuna_tiklar() {
        drPage.myPagesButton.click();
    }

    @Given("Kullanici Dr olarak My Appointments  butonuna tiklar")
    public void kullanici_dr_olarak_my_appointments_butonuna_tiklar() {
        drPage.myAppointmentsButton.click();
    }

    @Then("Kullanici Dr olarak Randevulari gorur")
    public void kullanici_dr_olarak_randevulari_gorur() {
        Assert.assertTrue(drPage.appointmentsPage.isDisplayed());
    }
    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {

    }

    @Then("Kullanici Dr olarak patient id, start date, end date, status bilgilerini gorur")
    public void kullaniciDrOlarakPatientIdStartDateEndDateStatusBilgileriniGorur() {
        Assert.assertTrue(drPage.idButton.isDisplayed());
        Assert.assertTrue(drPage.startDateTimeButton.isDisplayed());
        Assert.assertTrue(drPage.endDateTimeButton.isDisplayed());
        Assert.assertTrue(drPage.statusButton.isDisplayed());

    }


}
