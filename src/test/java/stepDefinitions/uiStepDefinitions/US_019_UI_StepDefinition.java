package stepDefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.Arrays;
import java.util.List;



public class US_019_UI_StepDefinition {


    AdminPage us019 = new AdminPage();
    Actions action = new Actions(Driver.getDriver());
    static String staffNewID;





    @Given("Hesap Menusu isaretine tiklayin ve Register dugmesine tiklayin")
    public void hesapMenusuIsaretineTiklayinVeRegisterDugmesineTiklayin() {
        Driver.waitAndClick(us019.humanButton,2);
        Driver.wait(1);
        Driver.waitAndClick(us019.accountRegisterButton);
        Driver.wait(1);


    }


    @And("Yeni bir kullanici icin tum bilgileri dolduru tiklatin {string},{string},{string},{string},{string},{string},{string}")
    public void yeniBirKullaniciIcinTumBilgileriDolduruTiklatin(String ssn, String firstname, String lastname, String username, String email, String newpassword, String confirmpassword) {

        Driver.wait(1);
        //Driver.clickWithJS(locator.registrationSsn);
        us019.registrationSsn.sendKeys(ssn);
        Driver.wait(1);
        Driver.clickWithJS(us019.registrationFirstname);
        us019.registrationFirstname.sendKeys(firstname);
        //Driver.wait(1);
        us019.registrationLastname.sendKeys(lastname);
        Driver.wait(1);
        us019.registrationUsername.sendKeys(username);
        Driver.wait(1);
        us019.registrationEmail.sendKeys(email);
        Driver.wait(1);
        us019.registrationNewPassword.sendKeys(newpassword);
        Driver.wait(1);
        us019.registrationConfirmPassword.sendKeys(confirmpassword);
        Driver.wait(1);


    }


    @And("Kullanici Items&Titles sekmesini tiklar")
    public void kullaniciItemsTitlesSekmesiniTiklar() {
        ReusableMethods.waitFor(2);

        us019.itemsTitlesButon.click();

    }

    @And("Kullanici Staff sekmesini tiklar")
    public void kullaniciStaffSekmesiniTiklar() {
        ReusableMethods.waitFor(2);
        us019.staffButon.click();
    }

    @And("Kullanici +Create a new Staff butonunu tiklar")
    public void kullaniciCreateANewStaffButonunuTiklar() {
        ReusableMethods.waitFor(2);
        us019.CreateANewButonu.click();
    }

    @And("Kullanici Use Search kutucugunu isaretler")
    public void kullaniciUseSearchKutucugunuIsaretler() {
        ReusableMethods.waitFor(2);
        us019.userSearchBox.click();
    }

    @And("Kullanici SSN kutusuna kayitli Staff SNN numarasi girer")
    public void kullaniciSSNKutusunaKayitliStaffSNNNumarasiGirer() {
        ReusableMethods.waitFor(2);

        us019.SSNBox.sendKeys(ConfigReader.getProperty("staffSSN"));
        ReusableMethods.waitFor(3);
    }

    @And("Kullanici Search User butonunu tiklar")
    public void kullaniciSearchUserButonunuTiklar() {
        us019.SearchUserButton.click();

        ReusableMethods.waitFor(6);
    }

    @And("Kullanici staf in adini dogrular")
    public void kullaniciStafInAdiniDogrular() {

        ReusableMethods.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us019.SnnIleStaffAramaOnayi).perform();
        Assert.assertTrue(us019.SnnIleStaffAramaOnayi.isDisplayed());
    }

    @Then("Kullanici Sayfayi kapatir")
    public void kulaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
    @And("Kullanici Staff edit butonunu tiklar")
    public void kullaniciStaffEditButonunuTiklar() {

        us019.StaffEditButton.click();
    }

    @And("Kullanici Phone Adress Description Country State City kutularini doldurur")
    public void kullaniciPhoneAdressDescriptionCountryStateCityKutulariniDoldurur() {
        ReusableMethods.waitFor(2);
        us019.Phone.clear();
        us019.Phone.sendKeys("5307624235");
        ReusableMethods.waitFor(2);
        Driver.selectAnItemFromDropdown(us019.Gender, "MALE");
        ReusableMethods.waitFor(2);
        Driver.selectAnItemFromDropdown(us019.BloodGroup, "B+");

        us019.Adress.clear();
        us019.Adress.sendKeys("Gecmis Sokak no 56 Turkiye");
        ReusableMethods.waitFor(2);
        us019.Description.clear();
        us019.Description.sendKeys("geldi ditti ");

        ReusableMethods.waitFor(2);
        Driver.selectAnItemFromDropdown(us019.Country, "USA");
        ReusableMethods.waitFor(2);
        Driver.selectAnItemFromDropdown(us019.StateCity, "California");
        us019.SaveButton.click();

    }
    @And("Kullanici kaydedildigini onaylar")
    public void kullaniciKaydedildiginiOnaylar() {
     ReusableMethods.waitFor(3);
        Actions actionss = new Actions(Driver.getDriver());
        actionss.moveToElement(us019.StaffBilgilerinKaydedilmeOnayi).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us019.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
        ReusableMethods.waitFor(3);
    }


    @And("Kullanici Kayitli kisi listesinden kayitli bir Staff'in View Butonunu tiklar")
    public void kullaniciKayitliKisiListesindenKayitliBirStaffInViewButonunuTiklar() {

        us019.ViewButton.click();

        ReusableMethods.waitFor(4);

        Assert.assertTrue(us019.staffGorunurluk.isDisplayed());
         ReusableMethods.waitFor(4);



     //   us019.AdministorViewdButton.click();

        ReusableMethods.waitFor(4);


    }


    @And("Kullanici Phone kutusunda degisiklik yapar")
    public void kullaniciPhoneKutusundaDegisiklikYapar() {

        ReusableMethods.waitFor(2);
        us019.Phone.clear();
        us019.Phone.sendKeys("5300000000");
    }

    @And("Kullanici Adress kutusunda degisiklik yapar")
    public void kullaniciAdressKutusundaDegisiklikYapar() {

        ReusableMethods.waitFor(2);
        us019.Adress.clear();
        us019.Adress.sendKeys("Gelecek Sokak no 56 Turkiye");
    }

    @And("Kullanici Description kutusunda degisiklik yapar")
    public void kullaniciDescriptionKutusundaDegisiklikYapar() {
        ReusableMethods.waitFor(1);
        us019.Description.clear();
        us019.Description.sendKeys(" sacma ");
    }

    @And("Kullanici Country kutusunda degisiklik yapar")
    public void kullaniciCountryKutusundaDegisiklikYapar() {
        ReusableMethods.waitFor(2);
        Driver.selectAnItemFromDropdown(us019.Country, "USA");

    }

    @And("Kullanici StateCity kutusunda degisiklik yapar")
    public void kullaniciStateCityKutusundaDegisiklikYapar() {
        ReusableMethods.waitFor(2);
        Driver.selectAnItemFromDropdown(us019.StateCity, "California");
    }


    @And("Kullanici Save butonu tiklar ve dogrular")
    public void kullaniciSaveButonuTiklarVeDogrular() {
        us019.SaveButton2.click();
      ReusableMethods.waitFor(1);
      //  Assert.assertTrue(us019.StaffBilgilerinDegistirilmeOnayi.isDisplayed());


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us019.StaffBilgilerinKaydedilmeOnayi).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us019.StaffBilgilerinKaydedilmeOnayi.isDisplayed());
        ReusableMethods.waitFor(3);

    }

    @And("Kullanici Staffi bulur ve Staff Sayfasindan delete dugmesini tiklar")
    public void kullaniciStaffiBulurVeStaffSayfasindanDeleteDugmesiniTiklar() {

        Driver.wait(1);
        us019.staffCeratedDate.click();
        Driver.wait(1);
      action.moveToElement(us019.staffDeleteButton);
        Driver.wait(1);
        us019.staffDeleteButton.click();
        Driver.wait(1);
        us019.deleteButtonFromAlert.click();
        Driver.wait(1);
       String deletedToast=us019.deletedToastContainer.getText();
        System.out.println("locator.deletedToastContainer.getText() = "+deletedToast);
        Assert.assertTrue(deletedToast.contains("deleted"));

        List<String> deletedToastList= Arrays.asList(us019.deletedToastContainer.getText().split("\\s"));
        System.out.println("deletedToastList = " + deletedToastList);
        System.out.println("idkeep " + staffNewID+"  deleted staff id  " +deletedToastList.get(6));
       // Assert.assertEquals(staffNewID,deletedToastList.get(6));
        Driver.wait(1);

    /*    Driver.wait(1);
        us019.KayitliStaffSayfasi.click();
        Driver.wait(1);
        us019.AdministorDeletedButton.click();
*/

    }


    @And("Kullanici Administor sekmesini tiklar")
    public void kullaniciAdministorSekmesiniTiklar() {
        Driver.wait(1);
        us019.administration.click();

    }

    @And("Kullanici Usermanament sekmesini tiklar")
    public void kullaniciUsermanamentSekmesiniTiklar() {

        Driver.wait(1);
        us019.userManagement.click();


    }

    @And("Kullanici Kayitli kisi listesinden kayitli bir Staff'in Edit Butonunu tiklar")
    public void kullaniciKayitliKisiListesindenKayitliBirStaffInEditButonunuTiklar() {

        Driver.wait(1);
        us019.staffEditButton.click();

    }
}

