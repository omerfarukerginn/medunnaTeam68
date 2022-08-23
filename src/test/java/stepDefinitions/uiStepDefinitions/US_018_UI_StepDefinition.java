package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_018_UI_StepDefinition {


    AdminPage us018 = new AdminPage();


    @And("mnk Admin items&Titles bolumunu secer Physician sekmesini tiklar")
    public void mnkAdminItemsTitlesBolumunuSecerPhysicianSekmesiniTiklar() {
       // WebElement dropDownMenu = Driver.getDriver().findElement(By.xpath("//*[text()='Items&Titles']"));
       // Select select = new Select(dropDownMenu);
       // select.selectByVisibleText("Country");
       // Select objSelect = new Select(us018.physicianSekmesi);
       // objSelect.selectByVisibleText("Physician");
       //ReusableMethods.waitForVisibility(us018.itemsTitlessButonu,2);
       //us018.itemsTitlessButonu.click();
       //us018.physicianSekmesi.click();
        //Driver.waitAndClick(us018.itemsTitlessButonu);
        //Driver.waitAndClick(us018.physicianSekmesi);
        //ReusableMethods.waitFor(3);
        //us018.physicianSekmesi.click();
        Driver.waitAndClick(us018.itemsTitlesButonu);
        ReusableMethods.waitFor(3);
        us018.physicianSekmesi.click();
    }
    @Then("mnk Admin sayfayi kapatir")
    public void mnk_admin_sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @And("mnk Admin tum doktorlarin ilk sayfasini gorur")
    public void mnkAdminTumDoktorlarinIlkSayfasiniGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us018.physicianBaslik.isDisplayed());
        //List<WebElement>tablosu = us018.physicianTablosu;
        //Assert.assertTrue(tablosu.);
    }

    @And("mnk Admin Create a new Physician butonuna tiklar")
    public void mnkAdminCreateANewPhysicianButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us018.createPhysicianButonu.click();
        
    }

    @And("mnk Admin SSN kutusuna kayitli bir SSN girer")
    public void mnkAdminSSNKutusunaKayitliBirSSNGirer() {
        ReusableMethods.waitFor(2);
        us018.createSsnKutusu.sendKeys(ConfigReader.getProperty("doktorSSN"));
    }

    @And("mnk Admin Use Search kutusunu secer")
    public void mnkAdminUseSearchKutusunuSecer() {
        ReusableMethods.waitFor(2);
        if (us018.createCheckbox.isSelected()){
            us018.createCheckbox.click();
        }
        
    }

    @And("mnk Admin Search User butonuna tiklar")
    public void mnkAdminSearchUserButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us018.createSearch.click();
        
    }

    @And("mnk Admin onay kutusunu gorunur")
    public void mnkAdminOnayKutusunuGorunur() {
        ReusableMethods.waitFor(2);
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(us018.createOnayKutusu).perform();
    Assert.assertTrue(us018.createOnayKutusu.isDisplayed());

    }

    @Then("mnk Admin kayitli kisinin Edit butonuna tiklar")
    public void mnk_admin_kayitli_kisinin_edit_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
    us018.physicianEdit.click();
    }

    @And("mnk Admin kayitli kisilerin id sini gorur")
    public void mnkAdminKayitliKisilerinIdSiniGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us018.physicianIdKutusu.isDisplayed());
    }
}
