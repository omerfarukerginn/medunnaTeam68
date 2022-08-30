package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        us018.createPhysicianSsnKutusu.sendKeys(ConfigReader.getProperty("doktorSSN"));
    }

    @And("mnk Admin Use Search kutusunu secer")
    public void mnkAdminUseSearchKutusunuSecer() {
        ReusableMethods.waitFor(2);
        if (us018.createPhysicianCheckbox.isSelected()){
            us018.createPhysicianCheckbox.click();
        }
        
    }

    @And("mnk Admin Search User butonuna tiklar")
    public void mnkAdminSearchUserButonunaTiklar() {
        ReusableMethods.waitFor(2);
        us018.createPhysicianSearch.click();
        
    }

    @Then("mnk Admin onay kutusunu gorur")
    public void mnk_admin_onay_kutusunu_gorur() {
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us018.createPhysicianOnayKutusu).perform();
        Assert.assertTrue(us018.createPhysicianOnayKutusu.isDisplayed());

    }

    @Then("mnk Admin kayitli kisinin Edit butonuna tiklar")
    public void mnk_admin_kayitli_kisinin_edit_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
    us018.physicianEdit.click();
    }

    @And("mnk Admin kayitli kisilerin id sini gorur")
    public void mnkAdminKayitliKisilerinIdSiniGorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us018.physicianEditIdKutusu.isDisplayed());
    }

    @Then("mnk Admin kayitli kisinin First Name i degistirir")
    public void mnk_admin_kayitli_kisinin_first_name_i_degistirir() {
        ReusableMethods.waitFor(2);
        us018.physicianEditFirstNameKutusu.clear();
        us018.physicianEditFirstNameKutusu.sendKeys(ConfigReader.getProperty("drfname"));
    }
    @Then("mnk Admin kayitli kisinin Last Name i degistirir")
    public void mnk_admin_kayitli_kisinin_last_name_i_degistirir() {
        ReusableMethods.waitFor(2);
        us018.physicianEditLastNameKutusu.clear();
        us018.physicianEditLastNameKutusu.sendKeys(ConfigReader.getProperty("drlname"));
    }
    @Then("mnk Admin kayitli kisinin Birth Date i degistirir")
    public void mnk_admin_kayitli_kisinin_birth_date_i_degistirir() {
        ReusableMethods.waitFor(2);

        us018.physicianEditBirthDateKutusu.sendKeys(ConfigReader.getProperty("drbdate"));
    }
    @Then("mnk Admin Save butonuna tiklar")
    public void mnk_admin_save_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        us018.physicianEditSaveButonu.sendKeys(Keys.ENTER);
    }

    @And("mnk Admin kayitli kisinin uzmanligini secer")
    public void mnkAdminKayitliKisininUzmanliginiSecer() {
        ReusableMethods.waitFor(2);
        Select objSelect = new Select(us018.physicianEditSpeKutusu);
        objSelect.selectByVisibleText("Urology");

    }

    @And("mnk Admin kayitli kisinin Profil resmini secer")
    public void mnkAdminKayitliKisininProfilResminiSecer() {
        ReusableMethods.waitFor(2);
        String path = "C:\\Users\\Test\\Desktop\\Screenshot_1.png";
        us018.physicianEditDossyaSecButonu.sendKeys(path);
    }

         @And("mnk Admin image onay kutusunu gorur")
         public void mnkAdminImageOnayKutusunuGorur() {

             ReusableMethods.waitFor(3);
             Actions actionss = new Actions(Driver.getDriver());
             actionss.moveToElement(us018.StaffBilgilerinKaydedilmeOnayi).perform();
             ReusableMethods.waitFor(1);
             Assert.assertTrue(us018.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
             ReusableMethods.waitFor(3);
             //Assert.assertTrue(Driver.waitForVisibility(us018.physicianEditImageOnayi,5).isDisplayed());
         }

    @Then("mnk Admin kayitli kisinin Exam fee lini degistirir")
    public void mnk_admin_kayitli_kisinin_exam_fee_lini_degistirir() {
        ReusableMethods.waitFor(2);
        us018.physicianEditFeeKutusu.clear();
        us018.physicianEditFeeKutusu.sendKeys("10");

    }

    @And("mnk Admin kayitli kisinin user ini secer")
    public void mnkAdminKayitliKisininUserIniSecer() {
        //us018.physicianEditUserKutusu.clear();
        //us018.physicianEditUserKutusu.sendKeys(ConfigReader.getProperty("druser"));
       //ReusableMethods.waitFor(2);
       //Select objSelect = new Select(us018.physicianEditUserKutusu);
       //objSelect.selectByVisibleText("team68:125-98-6788");
        Driver.waitAndClick(us018.physicianEditUserKutusu);
        ReusableMethods.waitFor(3);
        us018.physicianEditUserKutusu.sendKeys("physician-test3:635-27-6354");
        //Assert.assertTrue(us018.physicianEditUserKutusu.getText().contains("physician-test3:635-27-6354"));
    }


    @And("mnk Admin kayitli kisinin Delete butonuna tiklar")
    public void mnkAdminKayitliKisininDeleteButonunaTiklar() {
        ReusableMethods.waitFor(2);
    us018.physicianDeleteButonu_1.click();
    ReusableMethods.waitFor(2);
        //Driver.getDriver().switchTo().alert().accept();
        //ReusableMethods.waitFor(5);
        //Actions actions = new Actions(Driver.getDriver());
        //ReusableMethods.waitFor(5);
        //actions.moveToElement(us018.physicianEditImageOnayi).perform();
        //ReusableMethods.waitFor(5);
        //Assert.assertTrue(us018.physicianEditImageOnayi.isDisplayed());


        ReusableMethods.waitFor(2);
        us018.physicianDeleteButonu_2.sendKeys(Keys.ENTER);
    }

    @And("mnk Admin yeni bilgilerin onay kutusunu gorur")
    public void mnkAdminYeniBilgilerinOnayKutusunuGorur() {
        ReusableMethods.waitFor(3);
        Actions actionss = new Actions(Driver.getDriver());
        actionss.moveToElement(us018.StaffBilgilerinKaydedilmeOnayi).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us018.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @And("mnk Admin uzmanlik bilgisi onay kutusunu gorur")
    public void mnkAdminUzmanlikBilgisiOnayKutusunuGorur() {
        ReusableMethods.waitFor(3);
        Actions actionss = new Actions(Driver.getDriver());
        actionss.moveToElement(us018.StaffBilgilerinKaydedilmeOnayi).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us018.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @And("mnk Admin yeni muayene ucreti onay kutusunu gorur")
    public void mnkAdminYeniMuayeneUcretiOnayKutusunuGorur() {
        ReusableMethods.waitFor(3);
        Actions actionss = new Actions(Driver.getDriver());
        actionss.moveToElement(us018.StaffBilgilerinKaydedilmeOnayi).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us018.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
        ReusableMethods.waitFor(3);
    }

    @And("mnk Admin doktor seceme onay kutusunu gorur")
    public void mnkAdminDoktorSecemeOnayKutusunuGorur() {
        ReusableMethods.waitFor(3);
        Actions actionss = new Actions(Driver.getDriver());
        actionss.moveToElement(us018.StaffBilgilerinKaydedilmeOnayi).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us018.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
        ReusableMethods.waitFor(3);
    }
}
