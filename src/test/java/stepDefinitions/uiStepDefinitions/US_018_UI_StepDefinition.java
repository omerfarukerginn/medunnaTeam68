package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
       //ReusableMethods.waitForVisibility(us018.physicianSekmesi,2);
       //us018.physicianSekmesi.click();
        Driver.waitAndClick(us018.itemsTitlessButonu);
        Driver.waitAndClick(us018.physicianSekmesi);
    }
    @Then("mnk Admin sayfayi kapatir")
    public void mnk_admin_sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @And("mnk Admin tum doktorlarin ilk sayfasini gorur")
    public void mnkAdminTumDoktorlarinIlkSayfasiniGorur() {
        Assert.assertTrue(us018.physicianBaslik.isDisplayed());
        //List<WebElement>tablosu = us018.physicianTablosu;
        //Assert.assertTrue(tablosu.);
    }
}
