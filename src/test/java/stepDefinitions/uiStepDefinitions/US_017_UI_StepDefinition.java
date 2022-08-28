package stepDefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_017_UI_StepDefinition {

    AdminPage us017 = new AdminPage();
    Faker faker= new Faker();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Items&Titles sekmesine tiklanir")
    public void items_titles_sekmesine_tiklanir() {
        ReusableMethods.waitForClickablility(us017.itemsTitlesButonu, 20);
        us017.itemsTitlesButonu.click();

    }
    @Then("Test Item secilir")
    public void test_item_secilir() {
        ReusableMethods.waitForClickablility(us017.testItemButton, 20);
        us017.testItemButton.click();

    }
    @Then("Create a New Test Item butonuna tiklanir")
    public void create_a_new_test_item_butonuna_tiklanir() {
        ReusableMethods.waitForClickablility(us017.createANewTestItemButton, 20);
        us017.createANewTestItemButton.click();

    }
    @And("Name,Description,Price,Default Min. Value,Default Max. Value,Created Date kisimlari doldurulur")
    public void nameDescriptionPriceDefaultMinValueDefaultMaxValueCreatedDateKisimlariDoldurulur() {
        ReusableMethods.waitForVisibility(us017.testItemNameBox,20);
        actions.click(us017.testItemNameBox)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("description1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("price1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("defaultMinValue1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("defaultMaxValue1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("createdDate1"),Keys.ENTER)
                .perform();
    }

    @Then("Save butonuna tiklanir")
    public void save_butonuna_tiklanir() {
        ReusableMethods.waitForClickablility(us017.testItemSaveButton, 20);
        us017.testItemSaveButton.click();

    }
    @And("Kullanici dogrulama yazisinin gorunurlugunu test eder")
    public void kullaniciANewTestItemIsCreatedWithIdentifierYazisininGorunurlugunuTestEder() {
        ReusableMethods.waitForVisibility(us017.onayYazisiCreate,20);
        Assert.assertTrue(us017.onayYazisiCreate.isDisplayed());
    }
    @Then("Edit butonuna tiklanir")
    public void edit_butonuna_tiklanir() {
        // actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        // ReusableMethods.waitForClickablility(us017.sayfaGecme49, 20);
        // us017.sayfaGecme49.click();
        //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        // ReusableMethods.waitForClickablility(us017.testItemId, 20);
        //us017.testItemId.click();
        //ReusableMethods.waitForClickablility(us017.testItemEditButton, 20);
        //us017.testItemEditButton.click();
        ReusableMethods.waitFor(1);
        List<String> guncellenecekTestItem = new ArrayList<>();
        guncellenecekTestItem.add("232887");

        List<String> sutundakiTumTestItems = new ArrayList<>();
        for (WebElement each : us017.tumTestItemId
        ) {
            sutundakiTumTestItems.add(each.getText());

        }
        System.out.println(sutundakiTumTestItems);
        ReusableMethods.waitFor(5);

        for (int i = 0; i < guncellenecekTestItem.size(); i++) {
            sutundakiTumTestItems.contains(guncellenecekTestItem.get(i));
             ReusableMethods.hooverByJS(us017.testItemEditButton.get(i));

        }

    }
    @And("Name,Description,Price,Default Min. Value,Default Max. Value,Created Date kisimlari guncellenir")
    public void nameDescriptionPriceDefaultMinValueDefaultMaxValueCreatedDateKisimlariGuncellenir() {
        ReusableMethods.waitForVisibility(us017.testItemNameBox,20);
        actions.click(us017.testItemNameBox)
                .sendKeys("kullanici1")
                .sendKeys(Keys.TAB)
                .sendKeys("description1")
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("price1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("defaultMinValue1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("defaultMaxValue1"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("createdDate1"),Keys.ENTER)
                .perform();
    }

    @Then("Save butonuna tekrar tiklanir")
    public void save_butonuna_tekrar_tiklanir() {
       // ReusableMethods.waitForClickablility(us017.testItemSaveButton2, 20);
        //us017.testItemSaveButton2.click();
        ReusableMethods.hooverByJS(us017.testItemSaveButton2);


      }
    @Then("View butonuna tiklanir")
    public void view_butonuna_tiklanir() {
        ReusableMethods.waitFor(1);
        List<String> guncellenecekTestItem = new ArrayList<>();
        guncellenecekTestItem.add("232887");

        List<String> sutundakiTumTestItems = new ArrayList<>();
        for (WebElement each : us017.tumTestItemId
        ) {
            sutundakiTumTestItems.add(each.getText());

        }
        System.out.println(sutundakiTumTestItems);
        ReusableMethods.waitFor(5);

        for (int i = 0; i < guncellenecekTestItem.size(); i++) {
            sutundakiTumTestItems.contains(guncellenecekTestItem.get(i));
            ReusableMethods.hooverByJS(us017.testItemViewButton.get(i));

        }

    }
    @Then("Test ogelerinin goruntulendigi dogrulanir")
    public void test_ogelerinin_goruntulendigi_dogrulanir() {
        Assert.assertTrue(us017.testItemsName.isDisplayed());
        Assert.assertTrue(us017.testItemsDescription.isDisplayed());
        Assert.assertTrue(us017.testItemsPrice.isDisplayed());
        Assert.assertTrue(us017.testItemsDefaultMnValue.isDisplayed());
        Assert.assertTrue(us017.testItemsDefaultMxValue.isDisplayed());
        Assert.assertTrue(us017.testItemsCreatedDate.isDisplayed());


    }

    @Then("Delete butonuna tiklanir")
    public void delete_butonuna_tiklanir() {
        ReusableMethods.waitFor(1);
        List<String> silinecekTestItem = new ArrayList<>();
        silinecekTestItem.add("232887");

        List<String> sutundakiTumTestItems = new ArrayList<>();
        for (WebElement each : us017.tumTestItemId
        ) {
            sutundakiTumTestItems.add(each.getText());

        }
        System.out.println(sutundakiTumTestItems);
        ReusableMethods.waitFor(5);

        for (int i = 0; i < silinecekTestItem.size(); i++) {
            sutundakiTumTestItems.contains(silinecekTestItem.get(i));
            ReusableMethods.hooverByJS(us017.testItemsDeleteButton);
            ReusableMethods.hooverByJS(us017.testItemsDeleteButton2);


        }

    }




}
