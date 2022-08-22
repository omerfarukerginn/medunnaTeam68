package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DoctorPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_013_UI_StepDefinition {

    DoctorPage drPage = new DoctorPage();
    @Given("Doktor Glucose, urea, creatinine, Sodium, Potassium,Total protein, Albumin, Hemoglobin testlerini secer")
    public void doktor_glucose_urea_creatinine_sodium_potassium_total_protein_albumin_hemoglobin_testlerini_secer() {

        List<String> istenenTestIsimleri= new ArrayList<>();
        istenenTestIsimleri.add("Sodium");
        istenenTestIsimleri.add("glucose");
        istenenTestIsimleri.add("Urea");
        istenenTestIsimleri.add("Creatinine");
        istenenTestIsimleri.add("Potassium-");
        istenenTestIsimleri.add("Total Protein-");
        istenenTestIsimleri.add("Albumin");
        istenenTestIsimleri.add("Hemoglobin");

        List<String> sutundakiTumTestlerListesi = new ArrayList<>();
        for (WebElement each:drPage.testIsimListesi
        ) {
            sutundakiTumTestlerListesi.add(each.getText());

        }

        for (int i = 0; i <istenenTestIsimleri.size() ; i++) {
            sutundakiTumTestlerListesi.contains(istenenTestIsimleri.get(i));
            ReusableMethods.hooverByJS(drPage.testSecmeButonuListesi.get(i));
        }

        }

    @And("Doktor Save butonuna tiklar")
    public void doktorSaveButonunaTiklar() {
        ReusableMethods.waitFor(3);
        drPage.saveButonu.sendKeys(Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    @Given("Show Test Results butonuna tiklar")
    public void show_test_results_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        drPage.showTestResultsButonu.click();
    }
    @Given("View Results butonunu tiklar.")
    public void view_results_butonunu_tiklar() {
        ReusableMethods.waitFor(3);
        drPage.viewResultsButonu.click();
    }
    @Given("Doktor  id, name, default max value, default min value, test, description and the date bilgilerini gorur.")
    public void doktor_id_name_default_max_value_default_min_value_test_description_and_the_date_bilgilerini_gorur() {
        Assert.assertTrue(drPage.idGorunurluk.isDisplayed());
        Assert.assertTrue(drPage.nameGorunurluk.isDisplayed());
        Assert.assertTrue(drPage.defaultMinValueGorunurluk.isDisplayed());
        Assert.assertTrue(drPage.defaultMaxValueGorunurluk.isDisplayed());
        Assert.assertTrue(drPage.testGorunurluk.isDisplayed());
        Assert.assertTrue(drPage.descriptionGorunurluk.isDisplayed());
        Assert.assertTrue(drPage.dateGorunurluk.isDisplayed());
    }
    @Given("Request Inpatient butonuna tiklar")
    public void request_inpatient_butonuna_tiklar() {
        drPage.requestInPatientButonu.click();
    }

}
