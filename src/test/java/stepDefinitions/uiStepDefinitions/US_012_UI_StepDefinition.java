package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;


public class US_012_UI_StepDefinition {

    DoctorPage drPage = new DoctorPage();
    Actions actions = new Actions(Driver.getDriver());


    List<WebElement> testList = new ArrayList<WebElement>();

    @Given("Doktor Medunna ana sayfasina gider")
    public void doktor_medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }

    @Then("Doktor humain giris butonuna basar ve sign in'i tiklar")
    public void doktor_humain_giris_butonuna_basar_ve_sign_in_i_tiklar() {
        drPage.humanButton.click();
        drPage.singInButtonu.click();
    }

    @Then("Doktor gecerli username ve password girer")
    public void doktor_gecerli_username_ve_password_girer() {
        drPage.userName.sendKeys(ConfigReader.getProperty("doktorUserName"));
        drPage.password.sendKeys(ConfigReader.getProperty("doktorPassword"));
    }

    @Then("Doktor basarili giris yapar ve Welcome to Medunna yazisini gorur")
    public void doktor_basarili_giris_yapar_ve_welcome_to_medunna_yazisini_gorur() {
        drPage.girisSonrasiSingIn.click();
        Assert.assertTrue(drPage.welcomeToMedunnaYazisi.isDisplayed());
    }

    @Then("Doktor MY PAGES butonuna tiklar")
    public void doktor_my_pages_butonuna_tiklar() {
        drPage.myPagesButton.click();
    }

    @Then("DoktorMy Appointments butonuna tıklar")
    public void doktor_my_appointments_butonuna_tıklar() {
        drPage.myAppointmentsButton.click();
    }

    @Then("Doktor Edit butonuna tiklar")
    public void doktor_edit_butonuna_tiklar() {
        drPage.hastaBilalEditButonu.click();
    }

    @Then("Request A Test butonuna tiklar")
    public void request_a_test_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        drPage.requestATestButonu.click();
    }

    @Given("Glucose, urea, creatinine, Sodium, Potassium,Total protein, Albumin, Hemoglobin testlerini gorebilmeli")
    public void SutunundakiGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinTestleriniGorebilmeli() {

        ReusableMethods.waitFor(5);

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
        System.out.println(sutundakiTumTestlerListesi);

        for (int i = 0; i < istenenTestIsimleri.size(); i++) {
            Assert.assertTrue(sutundakiTumTestlerListesi.contains(istenenTestIsimleri.get(i)));

        }

    }







        //if(tabloTestListesi.contains(ReusableMethods.getElementsText(Driver.getDriver().findElements(By.xpath("//tr//td[2][" +istenenTestIsimleri+ "]"))));

        //if (ReusableMethods.hooverByJS(tabloTestListesi.contains(Driver.getDriver().findElements(By.xpath("//tr//td[2][" +istenenTestIsimleri+ "]"))));
       // System.out.println("istenen baslik bulundu");

    }






       /* List<WebElement> istenenTestIsimleri= new ArrayList<>();
        istenenTestIsimleri.add("Sodium");
        istenenTestIsimleri.add("glucose");
        istenenTestIsimleri.add("Urea");
        istenenTestIsimleri.add("Creatinine");
        istenenTestIsimleri.add("Potassium-");
        istenenTestIsimleri.add("Total Protein-");
        istenenTestIsimleri.add("Albumin");
        istenenTestIsimleri.add("Hemoglobin");

        //for (int i = 0; i < drPage.testIsimListesi.size(); i++) {
            ReusableMethods.hooverByJS(istenenTestIsimleri.contains(drPage.testIsimListesi.get(i)));
                //Assert.assertTrue(istenenTestIsimleri.contains(drPage.testIsimListesi.get(i).getText()));


               // drPage.testSecmeButonuListesi.get(i).isSelected();
                //ReusableMethods.hooverByJS(drPage.testSecmeButonuListesi.get(i));
            }
        }
    }
   // @Then("Save butonuna tiklar")
   // public void save_butonuna_tiklar() {
   //     ReusableMethods.hooverByJS(drPage.saveButonu);
    //    Assert.assertTrue(drPage.kayitSonrasiGorunurluk.isEnabled());

*/


