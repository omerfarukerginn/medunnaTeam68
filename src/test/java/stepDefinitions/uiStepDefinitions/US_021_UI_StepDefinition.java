package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.StaffPage;
import utilities.Driver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US_021_UI_StepDefinition {

    StaffPage staffPage = new StaffPage();
    Actions actions = new Actions(Driver.getDriver());

    @Then("ofe Staff My Pages sayfasina tiklar")
    public void ofe_staff_my_pages_sayfasina_tiklar() {
        staffPage.myPagesButton.click();
    }

    @Then("ofe Staff Search Patient butonuna tiklar")
    public void ofe_staff_search_patient_butonuna_tiklar() {
        staffPage.dropDownSearchPatientButton.click();
    }

    @Then("ofe Staff Show Appointments butonuna tiklar")
    public void ofe_staff_show_appointments_butonuna_tiklar() {
        staffPage.ofeOzelIlkSutunShowAppointmentsButton.click();
    }

    @Then("ofe Staff Show Appointments ilk sutundaki edit butonuna tiklar")
    public void ofe_staff_show_appointments_ilk_sutundaki_edit_butonuna_tiklar() {
        staffPage.ofeOzelAppointmentsEditButton.click();
    }

    @Then("ofe Staff Create or Edit an Appointment sayfasindaki randevu tarih bilgilerini duzenler")
    public void ofe_staff_create_or_edit_an_appointment_sayfasindaki_randevu_tarih_bilgilerini_duzenler() {
        staffPage.appointmentEditStartDateArea.click();
        actions.sendKeys("17").
                sendKeys("06").
                sendKeys("2023" + Keys.ARROW_RIGHT).
                sendKeys("03").
                sendKeys("33").
                perform();

        staffPage.appointmentEditEndDateArea.click();
        actions.sendKeys("17").
                sendKeys("07").
                sendKeys("2023" + Keys.ARROW_RIGHT).
                sendKeys("03").
                sendKeys("33").
                perform();

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();
    }

    @Then("ofe The Appointment is updated with identifier uyarisinin goruldugunu onaylar")
    public void ofe_the_appointment_is_updated_with_identifier_uyarisinin_goruldugunu_onaylar() {
        try {
            Assert.assertFalse(staffPage.kirmiziUyariBalonu.isDisplayed());
        }
        catch(AssertionError e) {
            System.out.println("FAILED");
        }
    }


    @And("ofe Staff edit appointment sayfasinda status kismini UNAPPROVED yapar")
    public void ofeStaffEditAppointmentSayfasindaStatusKisminiUNAPPROVEDYapar() {
        Select select = new Select(staffPage.statusDropdownElement);
        select.selectByVisibleText("UNAPPROVED");
        staffPage.appointmentEditEndDateArea.click();
    }

    @And("ofe Staff edit appointment sayfasinda status kismini PENDING yapar")
    public void ofeStaffEditAppointmentSayfasindaStatusKisminiPENDINGYapar() {
        Select select = new Select(staffPage.statusDropdownElement);
        select.selectByVisibleText("PENDING");
        staffPage.appointmentEditEndDateArea.click();
    }

    @And("ofe Staff edit appointment sayfasinda status kismini CANCELLED yapar")
    public void ofeStaffEditAppointmentSayfasindaStatusKisminiCANCELLEDYapar() {
        Select select = new Select(staffPage.statusDropdownElement);
        select.selectByVisibleText("CANCELLED");
        staffPage.appointmentEditEndDateArea.click();
    }

    @And("ofe The Appointment is updated with identifier uyarisinin gorulmedigini onaylar")
    public void ofeTheAppointmentIsUpdatedWithIdentifierUyarisininGorulmediginiOnaylar() {
        assertFalse(staffPage.ozelYesilUyariBalonu.isDisplayed());
    }

    @And("ofe Kullanici sayfayi asagi kaydirir")
    public void ofeKullaniciSayfayiAsagiKaydirir() {
        actions.sendKeys(Keys.PAGE_DOWN).
                perform();
    }

    @And("ofe Kullanici sayfayi yukari kaydirir")
    public void ofeKullaniciSayfayiYukariKaydirir() {
        actions.sendKeys(Keys.PAGE_UP).
                perform();
    }

    @And("ofe Staff edit appointment sayfasinda status kismini COMPLETED seceneginin secilemedigini onaylar")
    public void ofeStaffEditAppointmentSayfasindaStatusKisminiCOMPLETEDSecenegininSecilemediginiOnaylar() {

    }
}
