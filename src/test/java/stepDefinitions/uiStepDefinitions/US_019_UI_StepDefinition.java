package stepDefinitions.uiStepDefinitions;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import utilities.Driver;
public class US_019_UI_StepDefinition {


    AdminPage us019 = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());



    }

    @And("Kullanici gecerli bir Username ve Password girer")
    public void kullaniciGecerliBirUsernameVePasswordGirer() {
        us019.userrName.sendKeys(ConfigReader.getProperty("AdminUserName"));
        us019.passwordd.sendKeys(ConfigReader.getProperty("AdminPassword"));
        ReusableMethods.waitFor(3);

    }

    @And("Kullanici Sing In sekmesini tiklar")
    public void kullaniciSingInSekmesiniTiklar() {
       us019.girisSonrasiSingInn.click();
    }


    @And("Kullanici Items&Titles sekmesini tiklar")
    public void kullaniciItemsTitlesSekmesiniTiklar() {

        us019.itemsTitlesButon.click();
      //  us019.itemsTitlesButon.click();

    }

    @And("Kullanici Staff sekmesini tiklar")
    public void kullaniciStaffSekmesiniTiklar() {

        us019.staffButon.click();
    }

    @And("Kullanici +Create a new Staff butonunu tiklar")
    public void kullaniciCreateANewStaffButonunuTiklar() {
        us019.CreateANewButonu.click();
    }

    @And("Kullanici Use Search kutucugunu isaretler")
    public void kullaniciUseSearchKutucugunuIsaretler() {
        us019.userSearchBox.click();
    }

    @And("Kullanici SSN kutusuna kayitli Staff SNN numarasi girer")
    public void kullaniciSSNKutusunaKayitliStaffSNNNumarasiGirer() {
        
    }

    @And("Kullanici Search User butonunu tiklar")
    public void kullaniciSearchUserButonunuTiklar() {
        
    }

    @And("Kullanici aranan staff in adini yazdirir")
    public void kullaniciArananStaffInAdiniYazdirir() {
        
    }

    @And("Kulanici Sayfayi kapatir")
    public void kulaniciSayfayiKapatir() {

    }

    @And("Kullanici Phone Adress Description Country State City kutularini doldurur")
    public void kullaniciPhoneAdressDescriptionCountryStateCityKutulariniDoldurur() {
    }

    @And("Kullanici SAVE butonunu tiklar")
    public void kullaniciSAVEButonunuTiklar() {

    }

    @And("Kullanici Kayitli kisi listesinden kayitli bir Staff'in View Butonunu tiklar")
    public void kullaniciKayitliKisiListesindenKayitliBirStaffInViewButonunuTiklar() {

    }


    @And("Kullanici Phone kutusunda degisiklik yapar")
    public void kullaniciPhoneKutusundaDegisiklikYapar() {

    }

    @And("Kullanici Adress kutusunda degisiklik yapar")
    public void kullaniciAdressKutusundaDegisiklikYapar() {

    }

    @And("Kullanici Description kutusunda degisiklik yapar")
    public void kullaniciDescriptionKutusundaDegisiklikYapar() {

    }

    @And("Kullanici Country kutusunda degisiklik yapar")
    public void kullaniciCountryKutusundaDegisiklikYapar() {


    }

    @And("Kullanici StateCity kutusunda degisiklik yapar")
    public void kullaniciStateCityKutusundaDegisiklikYapar() {
    }

    @And("Kullanici Adress kutusunu siler")
    public void kullaniciAdressKutusunuSiler() {

    }

    @And("Kullanici Description kutusunu siler")
    public void kullaniciDescriptionKutusunuSiler() {
    }
}

